# Import the gTTS module for text  
# to speech conversion  
from gtts import gTTS  
  
# This module is imported so that we can  
# play the converted audio  
  
from playsound import playsound  
  
# It is a text value that we want to convert to audio  
text_val = 'All the best for your exam.'  
  
# Here are converting in English Language  
language = 'en'  
  
# Passing the text and language to the engine,  
# here we have assign slow=False. Which denotes  
# the module that the transformed audio should  
# have a high speed  
obj = gTTS(text=text_val, lang=language, slow=False)  
  
#Here we are saving the transformed audio in a mp3 file named  
# exam.mp3  
obj.save("exam.mp3")  
  
# Play the exam.mp3 file  
playsound("exam.mp3")  
