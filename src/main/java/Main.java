/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */



import Routes.ftlRoutes;



import static spark.SparkBase.port;
import static spark.SparkBase.staticFileLocation;

/**
 *
 * @author Sarah's Laptop
 */
public class Main {
    
    
    
    
    /*Gson gson = new Gson();
    
    private void setupRoutes(){          
                     
                     
            
           /* get("/api/users",(req, res) -> {
            ArrayList<> allUsers = new ArrayList<>
            allUsers =UserService.getAllUsers();
            return allUsers;
            }, gson::toJson);
                        
                      
            
            get("/api/event/001", (req, res) -> {
                Map<String, Object> eventData = new HashMap<>();
               

                
                
            });
            
    }*/
                
  
    
    public static void main(String[] args){
                
        port(Integer.valueOf(System.getenv("PORT")));
         staticFileLocation("/public");
    

        new ftlRoutes();
        
        new UserController();
        
       // new AddUserController();
       }

       
       
    }
    





