/*Popover from Bootstrap*/
$(document).ready(function(){
    $('[data-toggle="popover"]').popover(); 
});

/*Function to take values from edit profile form and display them,
    by replacing content of profile-div*/
function updateProfile() {
    var username =  document.getElementById("username").value;
    var name =  document.getElementById("name").value;
    var business =  document.getElementById("business").value;
    var website =  document.getElementById("website").value;
    var about =  document.getElementById("about").value;
    var craft_1 = document.getElementById("craft1").checked;
    var craft_2 = document.getElementById("craft2").checked;
    var craft_3 = document.getElementById("craft3").checked;
    var craft_4 = document.getElementById("craft4").checked;
     
    document.getElementById("profile-div").innerHTML = "Username:" + username + "<br />Full Name:"+ name + "<br />Business:" + 
            business + "<br />Website:"+ website + "<br/> Crafts: <br/> Jewelry Making:"+ craft_1 + "<br />Wood Work:"+ craft_2 +
            "<br />Paper Craft: " + craft_3 + "<br />Embroidery: " +craft_4 + "<br />About:"+ about;
}

/*fuction to append event table based on input from user*/
function addEvent() {
    var date =  document.getElementById("date").value;
    var name =  document.getElementById("name").value;
    var venue =  document.getElementById("venue").value;
    var cityState =  document.getElementById("cityState").value;
   
    
        $(".table").append($('<tr>')
                  .append("<td>" + date+ "</td>")
                  .append("<td>" + name + "</td>")
                  .append("<td>" + venue+ "</td>")
                  .append("<td>" + cityState + "</td>")
            );
     
    
}

/*This was adapted from something I found on stackoverflow.com*/
$(document).ready(function(){
  $(".search").keyup(function(){
        _this = this;
        // Shows only matchin table rows
        $.each($(".table tbody tr"), function() {
            if($(this).text().toLowerCase().indexOf($(_this).val().toLowerCase()) === -1)
               $(this).hide();
            else
               $(this).show();                
        });
    }); 
 });


/*working towards XML Get*/

var xhr = createXHR();
xhr.onreadystatechange = function(){
    if (xhr.readyState === 4) {
        if (xhr.status === 200) {
            alert(xhr.responseText);
        }else{
            alert('Error code' + xhr.status);
        }
        }
    };
    xhr.open('GET', '/schema.xml', true);
    xhr.send(null);   
    
function onSuccess(xhr){
    var dom = xhr.responseXML;
    showUser(
            dom.getElementsByTagName('firstname')[0].data,
            dom.getElementsByTagName('lastname')[0].data);
        };

/*w3c's version*/
displayUser(0);

function displayUser(i) {
    var xmlhttp = new XMLHttpRequest();
    xmlhttp.onreadystatechange = function() {
        if (xmlhttp.readyState === 4 && xmlhttp.status === 200) {
            myFunction(xmlhttp, i);
        }
    };
    xmlhttp.open("GET", "schema.xml", true);
    xmlhttp.send();
}

function myFunction(xml, i) {
    var xmlDoc = xml.responseXML; 
    x = xmlDoc.getElementsByTagName("user");
    document.getElementById("profile-div").innerHTML =
    "Name: " +
    x[i].getElementsByTagName("firstname");
}



