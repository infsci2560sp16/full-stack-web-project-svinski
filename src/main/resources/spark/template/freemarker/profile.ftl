<!DOCTYPE html>
<html lang="en">
  <head>
    <meta charset="utf-8">
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

<title>Crafter Alliance</title>
</head>

 <body class="other">

    <div class="site-wrapper">

      <div class="site-wrapper-inner">

        <div class="cover-container">

          <div class="masthead clearfix">
            <div class="inner">
                
                <h2 class="masthead-brand">Crafter Alliance</h2>
              <nav>
                  
                <ul class="nav masthead-nav">
                  <li><a href="calendar.html">Events</a></li>
                  <li><a href="profile.html">Your Profile</a></li>
                  <li><a href="index.html">Sign Out</a></li>
                 
                </ul>
              </nav>
                
            </div>
          </div>
            
         <div class="opacity">
          <div class="content">
            
            <h3>Your Profile</h3>
            
            <!--profile placeholder-->
            <div id="div1">
                <p><b>Username</b>: ${username} </p>
                <p><b> Full </b> ${firstname} ${lastname}</p>
                <p><b>Business name</b>: ${bizname}</p>
                <p><b>Website</b>: ${website}</p>
                <p><b>Your Craft(s)</b>: ${craft1}, ${craft2} </p>
                <p><b>About</b>: ${about}</p>
            
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
