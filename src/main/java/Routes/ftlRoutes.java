package Routes;

import com.google.gson.Gson;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;
import spark.ModelAndView;
import static spark.Spark.get;
import spark.template.freemarker.FreeMarkerEngine;

/**
 *
 * @author Sarah's Laptop
 */
public class ftlRoutes {
    
    Gson gson = new Gson();
    
    public ftlRoutes(){
        setRoutes();
    }
        
    private void setRoutes(){
        
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
                // guest user
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
    get("/newusers", (req, res) -> {
                String username = req.queryParams("username");
            	String name = req.queryParams("name");
                String email  = req.queryParams("email");
                String bizname = req.queryParams("bizname");
                String website = req.queryParams("website");
                String craft = req.queryParams("craft");
                String about = req.queryParams("about");
            	String id = UUID.randomUUID().toString();
                
                Map<String, Object> userData = new HashMap<>();
                userData.put("id", id);
                userData.put("username", username);
                userData.put("name", name);
                userData.put("email", email);
                userData.put("bizname", bizname);
                userData.put("website", website);
                userData.put("craft", craft);
                userData.put("about", about);
                Gson gson = new Gson();
                
                return gson.toJson(userData);
            });
                
    
        }   
}

