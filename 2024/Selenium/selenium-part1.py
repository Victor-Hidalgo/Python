from selenium import webdriver
from selenium.webdriver.chrome.service import Service
#from selenium.webdriver.common.by import By

url = 'https://www.techwithtim.net/' 
        
s = Service(r"C:\Program Files (x86)\chromedriver.exe")

driver = webdriver.Chrome(service=s)
driver.get(url)
print(driver.title)
driver.quit()
