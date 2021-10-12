from django.db import models

# Create your models here.
class PersonalWork(models.Model):
    id = models.AutoField(primary_key=True)
    title = models.CharField(max_length=100, default='', blank=False)
    about = models.TextField(max_length=1000, default='', blank=True)
    your_experience = models.TextField(max_length=5000, default='', blank=False)
    website = models.URLField(default='', blank=True)
    image = models.ImageField(upload_to='company_image', blank=False)

    def __str__(self):
        return self.title

class PersonalProject(models.Model):
    id = models.AutoField(primary_key=True)
    title = models.CharField(max_length=100, default='', blank=False)
    description = models.TextField(max_length=10000, default='', blank=True)
    gitHublink = models.URLField(default='', blank=True)
    image = models.ImageField(upload_to='project_image', blank=True)

    def __str__(self):
        return self.title