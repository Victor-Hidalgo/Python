from selenium import webdriver
from selenium.webdriver.chrome.service import Service
from selenium.webdriver.common.by import By
from selenium.webdriver.common.keys import Keys
from selenium.webdriver.support.ui import WebDriverWait
from selenium.webdriver.support import expected_conditions as EC
import time

url = 'https://www.google.com/'       
s = Service(r"C:\Program Files (x86)\chromedriver.exe")

driver = webdriver.Chrome(service=s)
driver.get(url)
print(driver.title)


search = driver.find_element(By.ID, "APjFqb")
search.send_keys("test")
search.send_keys(Keys.RETURN)

try:
    main = WebDriverWait(driver, 10).until(
        EC.presence_of_element_located((By.ID, "main"))
    )
    
    spans = main.find_elements(By.TAG_NAME, "a")
    for span in spans:
        header = span.find_element(By.CLASS_NAME, "LC20lb MBeuO DKV0Md")
        print(header.text)

finally:
    driver.quit()

#print(driver.page_source)
