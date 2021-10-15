import re #Using the regular expression
def Lookforurl(string):
    
    regex = r"(?i)\b((?:https?://|www\d{0,3}[.]|[a-z0-9.\-]+[.]
     [a-z]{2,4}/)(?:[^\s()<>]+|\(([^\s()<>]+|(\([^\s()<>]+\)))*\))
    +(?:\(([^\s()<>]+|(\([^\s()<>]+\)))*\)
    |[^\s`!()\[\]{};:'\".,<>?«»""'']))" #Regex checks
    #using findall() and passing input
    url = re.findall(regex,string)
    #returning the list containing url
    return [x[0] for x in url] 
    
string = 'Hacktoberfest is presented by https://hacktoberfest.digitalocean.com/'
print("Urls: ", Lookforurl(string)) #prints the returned list