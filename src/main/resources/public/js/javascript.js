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


//the following fuctions are for the XML GET command for events
function loadXMLDoc() {
  var xmlhttp = new XMLHttpRequest();
  xmlhttp.onreadystatechange = function() {
    if (xmlhttp.readyState === 4 && xmlhttp.status === 200) {
      myFunction(xmlhttp);
          }
          
    else if (ActiveXObject("Microsoft.XMLDOM")) {
        xmlhttp = new ActiveXObject("Microsoft.XMLDOM");
        xmlhttp.async = false;
        xmlhttp.load("xml/cd.xml");
        myFunction(xmlhttp);
    }
   
  };
  xmlhttp.open("GET", "xml/cd.xml", true);
  xmlhttp.send();
};
function myFunction(xml) {
  var i;
  var xmlDoc = xml.responseXML;
  var table="<tr><th>Event</th><th>Date</th><th>Description</th></tr>";
  var x = xmlDoc.getElementsByTagName("event");
  for (i = 0; i <x.length; i++) { 
    table += "<tr><td>" +
    x[i].getElementsByTagName("eventname")[0].childNodes[0].nodeValue +
    "</td><td>" +
    x[i].getElementsByTagName("date")[0].childNodes[0].nodeValue +
    "</td><td>"+
    x[i].getElementsByTagName("description")[0].childNodes[0].nodeValue +
    "</td></tr>";
  }
  document.getElementById("events").innerHTML = table;
}

function loadJSON(){
            var data_file = "json/users.json";
            var http_request = new XMLHttpRequest();
            try{
               // Opera 8.0+, Firefox, Chrome, Safari
               http_request = new XMLHttpRequest();
            }catch (e){
               // Internet Explorer Browsers
               try{
                  http_request = new ActiveXObject("Msxml2.XMLHTTP");
					
               }catch (e) {
				
                  try{
                     http_request = new ActiveXObject("Microsoft.XMLHTTP");
                  }catch (e){
                     // Something went wrong
                     alert("Your browser broke!");
                     return false;
                  }
					
               }
            }
			
            http_request.onreadystatechange = function(){
			
               if (http_request.readyState == 4  ){
                  // Javascript function JSON.parse to parse JSON data
                  var jsonObj = JSON.parse(http_request.responseText);

                  // jsonObj variable now contains the data structure and can
                  // be accessed as jsonObj.name and jsonObj.country.
		 document.getElementById("username").innerHTML = "Username: " + jsonObj.username;
                 document.getElementById("fullname").innerHTML = "Name: " + jsonObj.fullname;
                 document.getElementById("bizname").innerHTML = "Business Name: " + jsonObj.bizname;
		 document.getElementById("website").innerHTML = "Website: " + jsonObj.website;
		 document.getElementById("craft").innerHTML = "Craft: " + jsonObj.craft;
		 document.getElementById("about").innerHTML = "About: " + jsonObj.about;
                  
               }
            }
			
            http_request.open("GET", data_file, true);
            http_request.send();
         }



