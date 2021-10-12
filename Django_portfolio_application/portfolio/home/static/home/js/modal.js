var modal1 = document.getElementById("myModal1");
var modal2 = document.getElementById("myModal2");


var btn = document.getElementById("myBtn");

var span1 = document.getElementsByClassName("close")[0];
var span2 = document.getElementsByClassName("close")[1];

var doc_container = document.getElementById("doc_container");

span1.onclick = function() {
  modal1.style.display = "none";
  doc_container.style.filter = "none";
}
span2.onclick = function() {
  modal2.style.display = "none";
  doc_container.style.filter = "none";
}

window.onclick = function(event) {
  if (event.target == modal1) {
    modal1.style.display = "none";
    doc_container.style.filter = "none";
  }
  if (event.target == modal2) {
    modal2.style.display = "none";
    doc_container.style.filter = "none";
  }
}

var send_data = {}

function ProjectsApi(id) {
    send_data['project_id'] = id;
    if (send_data == null) {
        console.log('No data passed');
    }
    $.ajax({
        method: 'GET',
        url: '/personalprojectapi',
        data: send_data,
        success: function(result) {
            console.log(result);
            modal1.style.display = "block";
            if (result[0].image == null) {
              project = "<div class='container projectDetails'><div class='projectTitle'><h1>"+ result[0].title +"</h1></div><br>" +
              "<div class='projectlink'><a href='" + result[0].gitHublink + "' target='_blank'> GitHub Link for this Project <i class='fa fa-github'></i></a></div><br>"+
              "<div class='projectDescription'>" + result[0].description + "</div><br>"+
              "</div>"
            }
            else {
              project = "<div class='container projectDetails'><div class='projectTitle'><h1>"+ result[0].title +"</h1></div><br>" +
              "<div class='projectlink'><a href='" + result[0].gitHublink + "' target='_blank'> GitHub Link for this Project <i class='fa fa-github'></i></a></div><br>"+
              "<div class='projectDescription'>" + result[0].description + "</div><br>"+
              "<div class='projectImages'><img src='" + result[0].image + "'></div>"+
              "</div>"
            }
            $("#modalspace1").html(project);
            doc_container.style.filter = "blur(10px)";
        },
        error: function(response) {
            console.log("An error occured");
            console.log(response);
        }
    })
}

function WorksApi(id) {
  send_data['work_id'] = id;
  if (send_data == null) {
      console.log('No data passed');
  }
  $.ajax({
      method: 'GET',
      url: '/personalworkapi',
      data: send_data,
      success: function(result) {
          console.log(result);
          modal2.style.display = "block";
          if (result[0].image == null) {
            project = "<div class='container projectDetails'><div class='projectTitle'><h2>"+ result[0].title +"</h2></div><br>" +
            "<div class='projectlink'>Website - <a href='" + result[0].website + "' target='_blank'>"+ result[0].website + "</a></div><br>"+
            "<div class='projectDescription'>About " + result[0].title + " - " + result[0].about + "</div><br>"+
            "<div class='yourWork'>My responsibilities - " + result[0].your_work + "</div><br>"+
            "</div>"
          }
          else {
            project = "<div class='container projectDetails'><div class='projectTitle'><img style='width:3rem; display: inline-block;' src='" + result[0].image + "'><h2 style='display: inline-block; padding-left:23px;'>"+ result[0].title +"</h2></div><br>" +
            "<div class='projectlink'><a href='" + result[0].website + "' target='_blank'>"+ result[0].website + "</a></div><br>"+
            "<div class='projectDescription'><b>About</b> - " + result[0].about + "</div><br>"+
            "<div class='yourWork'><b>My responsibilities</b> - " + result[0].your_experience + "</div><br>"+
            "</div>"
          }
          $("#modalspace2").html(project);
          doc_container.style.filter = "blur(10px)";
      },
      error: function(response) {
          console.log("An error occured");
          console.log(response);
      }
  })
}