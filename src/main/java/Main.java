import java.sql.*;
import java.util.HashMap;
import java.util.ArrayList;
import java.util.Map;

import java.net.URI;
import java.net.URISyntaxException;

import static spark.Spark.*;
import spark.template.freemarker.FreeMarkerEngine;
import spark.ModelAndView;
import static spark.Spark.get;
        
import com.google.gson.Gson;

import com.heroku.sdk.jdbc.DatabaseUrl;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import org.junit.AfterClass;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.fail;
import org.junit.BeforeClass;
import org.junit.Test;
import spark.Request;
import spark.Spark;
import spark.utils.IOUtils;
import static test1.JsonUtil.toJson;

public class Main {
    public static void main(String[] args) {
        
        new UserController(new UserService());
        
        new UserControllerIntegrationTest();
               
    
    port(Integer.valueOf(System.getenv("PORT")));
    staticFileLocation("/public");
              
   get("/topnav", (request, response) -> {
            Map<String, Object> attributes = new HashMap<>();
            attributes.put("user", "Summer");
            
            return new ModelAndView(attributes, "topnav.ftl");
        }, new FreeMarkerEngine());
  
    get("/calendar", (request, response) -> {
            Map<String, Object> attributes = new HashMap<>();
            attributes.put("user", "Summer");

            return new ModelAndView(attributes, "calendar.ftl");
        }, new FreeMarkerEngine());
    
    get("/guestcalendar", (request, response) -> {
            Map<String, Object> attributes = new HashMap<>();
            attributes.put("user", "vistor");

            return new ModelAndView(attributes, "calendar.ftl");
        }, new FreeMarkerEngine());

    get("/db", (req, res) -> {
      Connection connection = null;
      Map<String, Object> attributes = new HashMap<>();
      try {
        connection = DatabaseUrl.extract().getConnection();

        Statement stmt = connection.createStatement();
        stmt.executeUpdate("CREATE TABLE IF NOT EXISTS ticks (tick timestamp)");
        stmt.executeUpdate("INSERT INTO ticks VALUES (now())");
        ResultSet rs = stmt.executeQuery("SELECT tick FROM ticks");

        ArrayList<String> output = new ArrayList<String>();
        while (rs.next()) {
          output.add( "Read from DB: " + rs.getTimestamp("tick"));
        }

        attributes.put("results", output);
        return new ModelAndView(attributes, "db.ftl");
      } catch (Exception e) {
        attributes.put("message", "There was an error: " + e);
        return new ModelAndView(attributes, "error.ftl");
      } finally {
        if (connection != null) try{connection.close();} catch(SQLException e){}
      }
    }, new FreeMarkerEngine());

  }

}

