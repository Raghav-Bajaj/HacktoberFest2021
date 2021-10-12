from django.urls import path
from . import views

urlpatterns = [
    path('', views.IndexView.as_view(), name='index'),
    path('personalprojectapi', views.PersonalProjectView.as_view(), name='personalprojectApi'),
    path('personalworkapi',views.PersonalWorkView.as_view(), name='personalworkApi')
]