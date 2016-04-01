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
                     <li class="cal"><a href="/guestcalendar">Events</a></li>
                     <li class="cal"><a href="signup.html">Sign Up</a></li>
                     <#else>
                    <li class="a"><a href="/calendar">Events</a></li>
                    <li class="b"><a href="/profile">Your Profile</a></li>
                    <li class="c"><a href="index.html">Sign Out</a></li>
                    </#if>
                  
                  
                </ul>
              </nav>
