$(document).ready(function(){
    $('[data-toggle="popover"]').popover(); 
});

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

