
import com.google.gson.Gson;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import static spark.Spark.get;
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
        try{
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
        

         }catch(Exception e){
            final JPanel panel = new JPanel();

        JOptionPane.showMessageDialog(panel, "Could not add user.", "Error", JOptionPane.ERROR_MESSAGE);
        }
}
}
