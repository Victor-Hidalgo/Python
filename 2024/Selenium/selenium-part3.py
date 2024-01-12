from selenium import webdriver
from selenium.webdriver.chrome.service import Service
from selenium.webdriver.common.by import By
from selenium.webdriver.common.keys import Keys
from selenium.webdriver.support.ui import WebDriverWait
from selenium.webdriver.support import expected_conditions as EC
from selenium.webdriver.common.action_chains import ActionChains
import time

url = 'https://orteil.dashnet.org/cookieclicker/'       
s = Service(r"C:\Program Files (x86)\chromedriver.exe")

driver = webdriver.Chrome(service=s)
driver.get(url)
time.sleep(3)

language = driver.find_element(By.ID, "langSelect-EN")
language.click()

time.sleep(3)
#driver.implicitly_wait(5)

cookie = driver.find_element(By.ID, "bigCookie")
cookie_count = driver.find_element(By.ID, "cookies")
items = [driver.find_element(By.ID, "productPrice" + str(i)) for i in range(1, -1, -1)]

#defining actions outside the loop below triggers the action only once.

for i in range(5000):
    actions = ActionChains(driver)
    actions.click(cookie)
    actions.perform()
    count = int(cookie_count.text.split(" ")[0])

    for item in items:
        value = int(item.text)

        if value <= count:
            upgrade_actions = ActionChains(driver)
            upgrade_actions.move_to_element(item)
            upgrade_actions.click()
            upgrade_actions.perform()
