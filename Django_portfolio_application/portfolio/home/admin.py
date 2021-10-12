from django.contrib import admin
from .models import PersonalWork, PersonalProject

# Register your models here.
class PersonalWorkAdmin(admin.ModelAdmin):
    list_display = (
        'id',
        'title',
        'about',
        'your_experience',
        'website',
        'image'
    )

class PersonalProjectAdmin(admin.ModelAdmin):
    list_display = (
        'id',
        'title',
        'description',
        'gitHublink',
        'image'
    )

admin.site.register(PersonalWork, PersonalWorkAdmin)
admin.site.register(PersonalProject, PersonalProjectAdmin)