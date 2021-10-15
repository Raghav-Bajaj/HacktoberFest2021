# This proram will help the users to take screenshots

# Import libraries
import pyscreenshot
import time

# Function which will allow us to take screenshot
def get_screenshot():
    # Time delay will allow the user to change to the desired window
    time.sleep(3)
    # Command to take screenshot
    image = pyscreenshot.grab()
    # Command to show the screenshot to the user
    image.show()

# Function call
get_screenshot()