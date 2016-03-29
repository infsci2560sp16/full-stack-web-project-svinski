/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */



import java.util.*;

public class UserService {

	Map<String, User> userList = new HashMap<>();

	public List<User> getAllUsers() {
		return new ArrayList<>(userList.values());
	}

	public User getUser(String id) {
		return userList.get(id);
	}

	public User createUser(String name, String email, String bizname, String website) {
		User user = new User(name, email, bizname, website);
		userList.put(user.getId(), user);
		return user;
	}

	
	/*private void failIfInvalid(String name, String email) {
		if (name == null || name.isEmpty()) {
			throw new IllegalArgumentException("Name cannot be empty");
		}
		if (email == null || email.isEmpty()) {
			throw new IllegalArgumentException("Email cannot be empty");
		}
	}*/
}