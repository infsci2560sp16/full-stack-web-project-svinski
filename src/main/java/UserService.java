/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */



import java.util.*;

public class UserService {

	private Map<String, User> users = new HashMap<>();

	public List<User> getAllUsers() {
		return new ArrayList<>(users.values());
	}

	public User getUser(String id) {
		return users.get(id);
	}

	public User createUser(String id, String name, String email, String bizname, String website) {
		failIfInvalid(name, email);
		User user = new User(id, name, email, bizname, website);
		users.put(user.getId(), user);
		return user;
	}

	public User updateUser(String id, String name, String email) {
		User user = users.get(id);
		if (user == null) {
			throw new IllegalArgumentException("No user with id '" + id + "' found");
		}
		failIfInvalid(name, email);
		user.setName(name);
		user.setEmail(email);
		return user;
	}

	private void failIfInvalid(String name, String email) {
		if (name == null || name.isEmpty()) {
			throw new IllegalArgumentException("Name cannot be empty");
		}
		if (email == null || email.isEmpty()) {
			throw new IllegalArgumentException("Email cannot be empty");
		}
	}
}