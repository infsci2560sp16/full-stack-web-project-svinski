/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.util.UUID;

public class User {

	private String id;
	private String name;
	private String email;
        private String bizname;
        private String website;

	public User(String name, String email, String bizname, String website) {
		this.id = UUID.randomUUID().toString();
		this.name = name;
		this.email = email;
                this.bizname = bizname;
                this.website = website;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
        
        public String getBizName() {
		return bizname;
	}

	public void setBizName(String bizname) {
		this.bizname = bizname;
	}
        
        public String website() {
		return website;
	}

	public void website(String website) {
		this.website = website;
	}
        
        
        
        
        

}
