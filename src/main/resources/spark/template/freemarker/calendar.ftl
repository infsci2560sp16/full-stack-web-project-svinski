<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
   <!-- Bootstrap CSS -->
    <link href="stylesheets/bootstrap.min.css" rel="stylesheet">
    <link href="stylesheets/bootstrap-theme.min.css" rel="stylesheet">
    <link href="stylesheets/ie10-viewport-bug-workaround.css" rel="stylesheet">
    <link rel="stylesheet" href="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/css/bootstrap.min.css">
    
    <!--My CSS-->
    <link rel="stylesheet" href="stylesheets/style.css">

    <!-- jQuery library -->
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/1.12.0/jquery.min.js"></script>
    <!-- Latest compiled JavaScript -->
    <script src="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/js/bootstrap.min.js"></script>

    <!--My JavaScript-->
    <script src="js/javascript.js"></script>
    <script>
        function loadXMLDoc() {
  var xmlhttp = new XMLHttpRequest();
  xmlhttp.onreadystatechange = function() {
    if (xmlhttp.readyState == 4 && xmlhttp.status == 200) {
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

window.onload = loadXMLDoc;
    </script>

<title>Crafter Alliance</title>
</head>

<body class="other">
    <div class="site-wrapper">

      <div class="site-wrapper-inner">

        <div class="cover-container">

          <div class="masthead clearfix">
            <div class="inner">
                
                <h2 class="masthead-brand">Crafter Alliance</h2>
              
                <#include "nav.ftl"> 
            </div>
          </div>
            
            <div class="opacity">
          <div class="content">
              
              <br>
              <form class="form-search">
                  
                  <!--search field-->
                  <input type="text" class="search" placeholder="Type to search..." />
                         
                  <!--button for add event opens to a new page for now-->       
                  <a href="addevent.html" class="btn btn-events">Add Event</a>
               </form>
              
                <!--Pagination, not sure if this will stay
                   <ul class ="pagination">
                        <li><a href="#">Prev</a></li>
                        <li><a href="#">January 2016</a></li>
                        <li class="active"><a href="#"> February 2016</a>
                        <li><a href="#">March 2016</a></li>
                        <li><a href="#">Next</a></li>
                    </ul>-->
              
              <br/><p>Click on event name for more detail.</p><br/>
           
         <!--Bootstrap hover table-->     
         <table id="events">
            <!--<thead>
              <tr>
                <th>Date</th>
                <th>Event Name</th>
                <th>Location</th>
                <th>City, State</th>
            </thead>
            <tbody>
              <tr>
                <td>2/13/2016</td>
                <td><a href="#" data-toggle="popover" title="VINTAGE CRAFT SHOW" data-trigger="focus" data-content="More information listed here">Vintage Craft Show</a></td>
                <td>East End Brewing Company</td>
                <td>Pittsburgh, PA</td>
              </tr>
              <tr>
                <td>2/16/2016</td>
                <td><a href="#" data-toggle="popover" title="CRAFTER MEETUP" data-trigger="focus" data-content="More details on the Crafter Meetup in here">Crafter Meetup</a></td>
                <td>Beads and Things</td>
                <td>Pittsburgh, PA</td>
              </tr>
              <tr>
                <td>2/28/2016</td>
                <td><a href="#" data-toggle="popover" title="GLASS CENTER OPEN HOUSE" data-trigger="focus" data-content="More details on the Crafter Meetup in here">Open House at The Glass Center</a></td>
                <td>Pittsburgh Glass Center</td>
                <td>Pittsburgh, PA</td>
              </tr>
            </tbody>-->
          </table>
              
         </div>
              
              
     </div>
           
    </div>
               
    </div>

        
          <div class="mastfoot">
            <div class="inner">
    
               <p>Crafter Alliance 2016</p>
            </div>
          </div>

</div>

</body>

</html>