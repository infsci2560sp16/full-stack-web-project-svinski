
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
                // message
                attributes.put("user", "Summer");                
                return new ModelAndView(attributes, "topnav.ftl");
            }, new FreeMarkerEngine());
    }
    
}
