from pytube import YouTube
url = input("Enter YouTube video url: ")
# Example url: https://www.youtube.com/watch?v=x2sjEj8TClM&t=
yt = YouTube(url)
video = yt.streams.filter(file_extension='mp4').order_by('resolution').desc()
try:
    video.first().download()
    print("Download complete for: ", yt.title)
except Exception as e:
    print("Download failed due to: ", e)
  
