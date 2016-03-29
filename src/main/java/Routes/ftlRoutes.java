package Routes;


import java.util.HashMap;
import java.util.Map;
import spark.ModelAndView;
import static spark.Spark.get;
import spark.template.freemarker.FreeMarkerEngine;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Sarah's Laptop
 */
public class ftlRoutes {
    
    private void ftlRoutes(){
        
    get("/topnav", (request, response) -> {
                Map<String, Object> attributes = new HashMap<>();
                // user
                attributes.put("user", "Summer");                
                return new ModelAndView(attributes, "topnav.ftl");
            }, new FreeMarkerEngine());
<<<<<<< HEAD:src/main/java/Routes/ftlRoutes.java
    
    get("/calendar", (request, response) -> {
                Map<String, Object> attributes = new HashMap<>();
                // user
                attributes.put("user", "Summer");                
                return new ModelAndView(attributes, "calendar.ftl");
            }, new FreeMarkerEngine());
    

    get("/guestcalendar", (request, response) -> {
                Map<String, Object> attributes = new HashMap<>();
                // user
                attributes.put("user", "Guest");                
                return new ModelAndView(attributes, "guestcalendar.ftl");
            }, new FreeMarkerEngine());
    

    get("/profile", (request, response) -> {
                Map<String, Object> attributes = new HashMap<>();
                // user
                attributes.put("user", "Summer");
                
                return new ModelAndView(attributes, "profile.ftl");
            }, new FreeMarkerEngine());
    
    get("/header", (request, response) -> {
                Map<String, Object> attributes = new HashMap<>();
                // user
                attributes.put("user", "Summer");
                
                return new ModelAndView(attributes, "header.ftl");
            }, new FreeMarkerEngine());                
                
    
    
=======
>>>>>>> parent of 34865bd... ftl additions:src/main/java/ftlRoutes.java
    }
    
}
