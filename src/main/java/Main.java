/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */



import Routes.ftlRoutes;
import java.util.Map;

import javax.xml.bind.ValidationEvent;

import spark.template.freemarker.FreeMarkerEngine;
import spark.ModelAndView;
import static spark.Spark.get;

import com.heroku.sdk.jdbc.DatabaseUrl;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import static spark.Spark.get;
import static spark.Spark.post;
import static spark.SparkBase.port;
import static spark.SparkBase.staticFileLocation;
import static Routes.JsonUtil.json;

/**
 *
 * @author Sarah's Laptop
 */
public class Main {
    
<<<<<<< HEAD
        
=======
    
    
    
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
                
>>>>>>> parent of 34865bd... ftl additions
  
    
    public static void main(String[] args){
                
        port(Integer.valueOf(System.getenv("PORT")));
         staticFileLocation("/public");
    
<<<<<<< HEAD
        new ftlRoutes();
       }
=======
       Object a = new AddUserController();
       Object b= new UserController();
       Object c = new ftlRoutes();
    }
    
>>>>>>> parent of 34865bd... ftl additions
}


