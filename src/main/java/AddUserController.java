
import com.google.gson.Gson;
import java.util.HashMap;
import java.util.Map;
import static spark.Spark.post;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Sarah's Laptop
 */
public class AddUserController {
    
    public AddUserController(){
    post("/api/add_user", (req, res) -> {
            	String name = req.queryParams("name");
                String email  = req.queryParams("email");
                String bizname = req.queryParams("bizname");
                String website = req.queryParams("website");
                String craft = req.queryParams("craft");
                String about = req.queryParams("about");
            	
                Map<String, Object> userData = new HashMap<>();
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
