/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */



import java.util.Map;

import javax.xml.bind.ValidationEvent;

import spark.template.freemarker.FreeMarkerEngine;
import spark.ModelAndView;
import static spark.Spark.get;

import com.heroku.sdk.jdbc.DatabaseUrl;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import static spark.Spark.get;
import static spark.Spark.post;
import static spark.SparkBase.port;
import static spark.SparkBase.staticFileLocation;
import static test1.JsonUtil.json;

/**
 *
 * @author Sarah's Laptop
 */
public class Main {
    
    public Main(){
        ftlRoutes();
    }
       
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
           
  
    
    public static void main(String[] args){
                
        port(Integer.valueOf(System.getenv("PORT")));
         staticFileLocation("/public");
    
       new AddUserController();
       new UserController();
       }
    
}


