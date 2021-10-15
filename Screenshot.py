# Program to take screenshot

# Import libraries
import pyscreenshot
import time

# Function which will allow us to take screenshot
def get_screenshot():
    # Time delay will allow the user to shift to the desired screen
    time.sleep(3)
    # Allows the user to take screenshot
    image = pyscreenshot.grab()
    # Display the screenshot
    image.show()

# Function call
get_screenshot()