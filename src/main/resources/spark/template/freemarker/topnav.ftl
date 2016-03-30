<nav>
                  <ul class="nav masthead-nav">
                      
                    <li> Hi, ${user}. </li>
                      <#if user == "Summer">
                      <li class="greeting"> My man. </li>
                       <#elseif user == "Guest">
                      <li class="greeting"> Enjoy your visit.</li>
                      <#else>
                      <li class="greeting"> Welcome back.</li>
                      </#if>  

                     <#if user == "Guest">
                     <li class="cal"><a href="http://secret-river-4272.herokuapp.com/guestcalendar">Events</a></li>
                     <li class="cal"><a href="signup.html">Sign Up</a></li>
                     <#else>
                    <li class="a"><a href="http://secret-river-4272.herokuapp.com/calendar">Events</a></li>
                    <li class="b"><a href="http://secret-river-4272.herokuapp.com/profile">Your Profile</a></li>
                    <li class="c"><a href="index.html">Sign Out</a></li>
                    </#if>
                  
                  
                </ul>
              </nav>
