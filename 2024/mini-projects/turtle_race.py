def get_number_of_turtles():
    racers = 0

    while True:
        racers = input("Enter the number of turtles (2-10): ")
        if racers.isdigit():
            racers = int(racers)
        else:
            print("Input is not numeric... Try Again!")
            continue

        if 2 <= racers <= 10:
            return racers
        else:
            print("Number not in range 2-10. Try Again")
            
racers = get_number_of_turtles()
print(racers)