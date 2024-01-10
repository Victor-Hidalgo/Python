from selenium import webdriver
from selenium.webdriver.common.keys import Keys
from selenium.webdriver.chrome.service import Service
from selenium.webdriver.common.by import By
from selenium.webdriver.support.ui import WebDriverWait
from selenium.webdriver.support import expected_conditions as EC
import time

url = 'https://www.techwithtim.net/'
s = Service(r"C:\Program Files (x86)\chromedriver.exe")

driver = webdriver.Chrome(service=s)
driver.get(url)

link = driver.find_element(By.LINK_TEXT, "Tutorials")
link.click()

try:

    element = WebDriverWait(driver, 10).until(
        EC.presence_of_element_located((By.LINK_TEXT, "Gear"))
    )
    element.click()
    #element.clear() for search bar

    element = WebDriverWait(driver, 10).until(
        EC.presence_of_element_located((By.LINK_TEXT, "ProgrammingExpert"))
    )
    element.click()

    driver.back()
    driver.back()
    driver.back()
    driver.forward()
    driver.forward()
except:
    driver.quit()

#From basic to advanced. Learn python programming.

#time.sleep(3)