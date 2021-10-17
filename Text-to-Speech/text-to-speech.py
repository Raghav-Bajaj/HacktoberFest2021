# Import the required libraries
from gtts import gTTS   
from playsound import playsound

# Ask user for text input
myText = input("Say Something...")

# Convert the input text into audio
obj = gTTS(text=myText, lang='en', slow=False)

# Save the converted audio
obj.save("audio.mp3")

# Play the saved audio file
playsound("audio.mp3") 