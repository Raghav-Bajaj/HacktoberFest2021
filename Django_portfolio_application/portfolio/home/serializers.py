from rest_framework import serializers
from .models import PersonalProject, PersonalWork

class PersonalProjectSerializers(serializers.ModelSerializer):
    class Meta:
        model = PersonalProject
        fields = (
            'id',
            'title',
            'description',
            'gitHublink',
            'image'
        )

class PersonalWorkSerializers(serializers.ModelSerializer):
    class Meta:
        model = PersonalWork
        fields = (
            'id',
            'title',
            'about',
            'your_experience',
            'website',
            'image'
        )