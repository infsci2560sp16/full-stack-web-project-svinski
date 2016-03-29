/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import com.google.gson.Gson;
import java.util.HashMap;
import java.util.Map;
import static test1.JsonUtil.json;
import static spark.Spark.*;
import static test1.JsonUtil.toJson;




public class UserController {

	public UserController() {
              get("/api/users", (req, res) -> {
                Map<String, User> userList = new HashMap<>();
                User user001 = new User("Summer Sanchez", "summer@randm.com", "Summer Sol", "rickandmorty.com");
                userList.put(user001.getId(), user001);
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
