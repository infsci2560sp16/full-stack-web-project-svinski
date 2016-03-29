<!DOCTYPE html>
<html>
<head>
 <#include "header.ftl"> 
    <script>
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
                
              <#include "topnav.ftl"> 
                
            </div>
          </div>
            
            <div class="opacity">
          <div class="content">
              
              <br>
              <form class="form-search">
                  
                  <!--search field-->
                  <input type="text" class="search" placeholder="Type to search..." />
                         
                  <!--button for add event opens to a new page for now      
                  <a href="addevent.html" class="btn btn-events">Add Event</a>--> 
               </form>
              
                <!--Pagination, not sure if this will stay
                   <ul class ="pagination">
                        <li><a href="#">Prev</a></li>
                        <li><a href="#">January 2016</a></li>
                        <li class="active"><a href="#"> February 2016</a>
                        <li><a href="#">March 2016</a></li>
                        <li><a href="#">Next</a></li>
                    </ul>-->
              
              
           
         <!--Bootstrap hover table-->     
         <table id="events">
           
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