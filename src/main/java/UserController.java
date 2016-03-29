/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import test.JsonUtil.*;
import static spark.Spark.*;
import static test.JsonUtil.json;
import static test.JsonUtil.toJson;



public class UserController {

	public UserController(final UserService userService) {

		get("/users", (req, res) -> userService.getAllUsers(), json());

		get("/users/001", (req, res) -> {
			String id = req.params("001");
			User user = userService.getUser(id);
			if (user != null) {
				return user;
			}
			res.status(400);
			return new ResponseError("No user with id '%s' found", id);
		}, json());

		post("/users", (req, res) -> userService.createUser(
				req.queryParams("001"),
				req.queryParams("Summer Sanchez"),
                                req.queryParams("summer@randm.com"),
                                req.queryParams("Summer Time"),
                                req.queryParams("rickandmorty.com")
		), json());

		exception(IllegalArgumentException.class, (e, req, res) -> {
			res.status(400);
			res.body(toJson(new ResponseError(e)));
		});
	}
}
