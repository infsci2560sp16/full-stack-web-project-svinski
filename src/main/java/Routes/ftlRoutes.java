package Routes;


import java.util.HashMap;
import java.util.Map;
import spark.ModelAndView;
import static spark.Spark.get;
import spark.template.freemarker.FreeMarkerEngine;

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
                
    
    
    }
    
    
}
