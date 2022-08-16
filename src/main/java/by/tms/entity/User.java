package by.tms.entity;

/**
 * @author Simon Pirko on 9.08.22
 */
public class User {
	private long id;
	private String name;
	private String username;
	private String password;

	public User() {
	}

	public User(long id, String name, String username, String password) {
		this.id = id;
		this.name = name;
		this.username = username;
		this.password = password;
	}

	public User(String name, String username, String password) {
		this.name = name;
		this.username = username;
		this.password = password;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	@Override
	public String toString() {
		return "User{" +
				"name='" + name + '\'' +
				", username='" + username + '\'' +
				", password='" + password + '\'' +
				", id='" + id + '\'' +
				'}';
	}
}
