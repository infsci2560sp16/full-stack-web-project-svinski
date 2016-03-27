<!DOCTYPE html>
<html>
<head>
    <#include "header.ftl"> 

    <script>
       window.onload = loadJSON;
		
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
            
            <h3>Your Profile</h3>
            
            <!--profile placeholder-->
            <div id="div1">
               <table>
                <tr><th>Your Profile</th></tr>
                 <tr><td><div id = "username"></div></td>
                 <tr><td id="fullname"></td></tr>
                 <tr><td><div id = "bizname"></div></td></tr>
                 <tr><td><div id = "website"></div></td></tr>
                 <tr><td><div id = "craft"></div></td></tr>
                 <tr><td><div id = "about"></div></td></tr>
               </table>

            
            <!--this button will take user to edit profile page with edit profile form-->    
            <a href="editprofile.html" class="btn btn-default">Edit Profile</a>
  
            </div>

        </div> <!-- /container -->
       </div>
      </div>

          <div class="mastfoot">
            <div class="inner">
              <p>Crafter Alliance 2016</p>
            </div>
          </div>

    </div>

</div>
    
  </body>
</html>
