from django.shortcuts import render
from django.views.generic import TemplateView, ListView
from .models import PersonalWork, PersonalProject
from rest_framework.generics import ListAPIView
from .serializers import PersonalProjectSerializers, PersonalWorkSerializers



# Create your views here

class IndexView(ListView):
    template_name = 'home/index.html'
    def get(self, request):
        work = PersonalWork.objects.all()
        projects = PersonalProject.objects.all()
        args = {
            'text': 'textop',
            'works': work,
            'projects': projects
        }
        return render(request, self.template_name, args)

class PersonalProjectView(ListAPIView):
    serializer_class = PersonalProjectSerializers
    def get_queryset(self):
        querylist = PersonalProject.objects.all()
        project_id = self.request.query_params.get('project_id', None)
        if project_id:
            return querylist.filter(id=project_id)
        else:
            return querylist

class PersonalWorkView(ListAPIView):
    serializer_class = PersonalWorkSerializers
    def get_queryset(self):
        querylist = PersonalWork.objects.all()
        work_id = self.request.query_params.get('work_id', None)
        if work_id:
            return querylist.filter(id=work_id)
        else:
            return querylist