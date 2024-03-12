import os, shutil, logging
import time, schedule
import sys

def log_operations(log_file):
    logging.basicConfig(filename = log_file, level = logging.INFO, format = '%(asctime)s - %(message)s\n')

def check_for_deletions(source_folder, replica_folder):
    for root, directories, files in os.walk(replica_folder):
        source_root = os.path.join(source_folder, os.path.relpath(root, replica_folder))

        for file in files:
            replica_path = os.path.join(root, file)
            source_path = os.path.join(source_root, file)

            if not os.path.exists(source_path):
                os.remove(replica_path)
                logging.info(f"Deleted: {replica_path}")
                print("\nDeleted", replica_path)

        for directory in directories:
            replica_path = os.path.join(root, directory)
            source_path = os.path.join(source_root, directory)

            if not os.path.exists(source_path):
                shutil.rmtree(replica_path)
                logging.info(f"Deleted: {replica_path}")
                print("\nDeleted", replica_path)

def synchronize_folders(source_folder, replica_folder):
    if not os.path.exists(source_folder):
        print("The source folder does not exist at the specified path")
        quit()
    
    if not os.path.exists(replica_folder):
        print("The replica folder does not exist at the specified path")
        quit()
    
    for root, directories, files in os.walk(source_folder):
        replica_root = os.path.join(replica_folder, os.path.relpath(root, source_folder))

        if not os.path.exists(replica_root):
            os.makedirs(replica_root)

        for file in files:
            source_path = os.path.join(root, file)
            replica_path = os.path.join(replica_root, file)

            if not os.path.exists(replica_path):
                shutil.copy2(source_path, replica_path)
                logging.info(f"Copied: {source_path} to {replica_path}")
                print("\nCopied: " + source_path + " to " + replica_path)

            if os.path.getmtime(source_path) != os.path.getmtime(replica_path):
                shutil.copy2(source_path, replica_path)
                logging.info(f"Updated: {source_path} in {replica_path}")
                print("\nUpdated: " + source_path + " in " + replica_path)

    check_for_deletions(source_folder, replica_folder)

    logging.info("Synchronization complete.")
    print("\nSynchronization complete.")

source_folder = input("Please enter the path to the source folder: ")
replica_folder = input("Please enter the path to the replica folder: ")
log_file = input("Please enter the path to the log file: ")

log_operations(log_file)

try:
    time_interval = input("Type a number for synchronization interval in seconds: ")

    if time_interval.isdigit():
        time_interval = int(time_interval)

        if time_interval == 0:
            print("Please type a number larger than 0 next time.")
            quit()
    else:
        print("Please type a positive integer next time.")
        quit()

    schedule.every(time_interval).seconds.do(lambda: synchronize_folders(source_folder, replica_folder))

    while True:
        schedule.run_pending()
        time.sleep(1)

except KeyboardInterrupt:
    print("\nStopping synchronization...")
    sys.exit(0)