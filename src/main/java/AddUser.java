/**
 *
 * @author Sarah's Laptop
 */
// Import required java libraries
import com.google.gson.Gson;
import java.io.*;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;
import javax.servlet.*;
import javax.servlet.http.*;
import static spark.Spark.post;

// Extend HttpServlet class
public class AddUser extends HttpServlet {
 
  // Method to handle GET method request.
  public void doGet(HttpServletRequest request,
                    HttpServletResponse response)
            throws ServletException, IOException
  {
      post("/newuser", (req, res) -> {
        
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
                res.redirect("/signup.html");
                return gson.toJson(userData);
                
            });
                
  }
  // Method to handle POST method request.
  public void doPost(HttpServletRequest request,
                     HttpServletResponse response)
      throws ServletException, IOException {
     doGet(request, response);
  }
}

