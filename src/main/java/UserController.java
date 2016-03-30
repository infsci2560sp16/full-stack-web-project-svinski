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




public class UserController {

	public UserController() {
              get("/users", (req, res) -> {
                /*Map<String, User> userList = new HashMap<>();
                User user001 = new User("Summer Smith", "summer@randm.com", "Summer Sol", "rickandmorty.com");
                userList.put(user001.getId(), user001);
                Gson gson = new Gson();
                return gson.toJson(userList);*/
                String id = UUID.randomUUID().toString();
                Map<String, Object> userList = new HashMap<>();
                userList.put("id", id);
                userList.put("username", "summersol");
                userList.put("name", "Summer Smith");
                userList.put("email", "summer@randm.com");
                userList.put("bizname", "Summer Sol");
                userList.put("website", "rickandmorty.com");
                userList.put("craft", "Jewelry Making");
                userList.put("about", "I live in the desert and make things with turquoise.");
                Gson gson = new Gson();
                return gson.toJson(userList);
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
