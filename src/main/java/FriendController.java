/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import com.google.gson.Gson;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;
import static spark.Spark.*;




public class FriendController {

	public FriendController() {
              get("/friends", (req, res) -> {
                /*Map<String, User> userList = new HashMap<>();
                User user001 = new User("Summer Smith", "summer@randm.com", "Summer Sol", "rickandmorty.com");
                userList.put(user001.getId(), user001);
                Gson gson = new Gson();
                return gson.toJson(userList);*/
                String id = UUID.randomUUID().toString();
                Map<String, Object> friendList = new HashMap<>();
                friendList.put("id", id);
                friendList.put("username", "schwiftytime");
                friendList.put("name", "Rick Sanchez");
                friendList.put("email", "rick@rick.com");
                friendList.put("bizname", "Curse Purge Plus!");
                friendList.put("website", "rickandmorty.com");
                friendList.put("craft", "Science");
                friendList.put("about", "*Burp*");
                Gson gson = new Gson();
                return gson.toJson(friendList);
            });
            
            
            

		/*get("/users", (req, res) -> userService.getAllUsers(), json());

		get("/users/:id", (req, res) -> {
			String id = req.params(":id");
			User user = userService.getUser(id);
			if (user  != null) {
				return user;
			}
			res.status(400);
			return new ResponseError("No user with id '%s' found", id);
		}, json());

		wrote similar code elsewhere
                post("/users", (req, res) -> userService.createUser(
				req.queryParams("name"),
                                req.queryParams("email"),
                                req.queryParams("bizname"),
                                req.queryParams("website")
		), json());

		exception(IllegalArgumentException.class, (e, req, res) -> {
			res.status(400);
			res.body(toJson(new ResponseError(e)));
		});*/
	}
}
