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
    
    
    
    
    /*Gson gson = new Gson();
    
    private void setupRoutes(){          
                     
                     
            
           /* get("/api/users",(req, res) -> {
            ArrayList<> allUsers = new ArrayList<>
            allUsers =UserService.getAllUsers();
            return allUsers;
            }, gson::toJson);
                        
                      
            
            get("/api/event/001", (req, res) -> {
                Map<String, Object> eventData = new HashMap<>();
                eventData.put("event", "live");
                eventData.put("now", new Date());

                
                String xml = readXML("data/peoples.xml");
                res.type("text/xml");
                return xml;
            });
            
    }
                
    public String readXML(String file) throws IOException {
    	BufferedReader br = null;
		br = new BufferedReader(new FileReader(file));
	    StringBuilder sb = new StringBuilder();
	    String line = br.readLine();

	    while (line != null) {
	        sb.append(line);
	        sb.append(System.lineSeparator());
	        line = br.readLine();
	    }
	    String everything = sb.toString();
	    br.close();
	    return everything;

    }*/
    
    public static void main(String[] args){
                
        port(Integer.valueOf(System.getenv("PORT")));
         staticFileLocation("/public");
    
        new AddUserController();
        new ftlRoutes();
    }
    
}


