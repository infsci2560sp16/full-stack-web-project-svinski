<nav>
                  <ul class="nav masthead-nav">
                      
                    <li> Hi, ${user}. </li>
                      <#if user == "Summer">
                      <li class="greeting> My man. </li>
                      <#elseif user == "Guest">
                      <li class="greeting> Enjoy your visit. </li>
                      <#else>
                      <li class="greeting> Welcome back.</li>
                      </if>
                  
                    <li><a href="http://secret-river-4272.herokuapp.com/calendar">Events</a></li>
                  <li><a href="http://secret-river-4272.herokuapp.com/profile">Your Profile</a></li>
                  <li><a href="index.html">Sign Out</a></li>
                  
                </ul>
  </nav>
