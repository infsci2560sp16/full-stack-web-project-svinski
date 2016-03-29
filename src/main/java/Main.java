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
    
    /*@BeforeClass
	public static void beforeClass() {
		Main.main(null);
	}

	@AfterClass
	public static void afterClass() {
		Spark.stop();
	}

	@Test
	public void aNewUserShouldBeCreated() {
		UserControllerIntegrationTest.TestResponse res = request("POST", "/users");
		Map<String, String> json = res.json();
		assertEquals(200, res.status);
		assertEquals("john", json.get("name"));
		assertEquals("john@foobar.com", json.get("email"));
		assertNotNull(json.get("id"));
	}

	private UserControllerIntegrationTest.TestResponse request(String method, String path) {
		try {
			URL url = new URL("http://localhost:4567" + path);
			HttpURLConnection connection = (HttpURLConnection) url.openConnection();
			connection.setRequestMethod(method);
			connection.setDoOutput(true);
			connection.connect();
			String body = IOUtils.toString(connection.getInputStream());
			return new UserControllerIntegrationTest.TestResponse(connection.getResponseCode(), body);
		} catch (IOException e) {
			e.printStackTrace();
			fail("Sending request failed: " + e.getMessage());
			return null;
		}
	}*/

    
    private static boolean shouldReturnHtml(Request request) {
        String accept = request.headers("Accept");
        return accept != null && accept.contains("text/html");
    }
    
  /*public static void main(String[] args) {
      

   port(Integer.valueOf(System.getenv("PORT")));
    staticFileLocation("/public");
     new UserController(new UserService());*/
   

    Gson gson = new Gson();
   
    
       
    private void setupRoutes() {
        get("/users/001", (req, res) -> {
            Map<String, Object> data = new HashMap<>();
            data.put("id", "001");
            data.put("name", "Summer Sanchez");
            return data;
        }, gson::toJson);

            
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
            attributes.put("message", "This is a test");

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
