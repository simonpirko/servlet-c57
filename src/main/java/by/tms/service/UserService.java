package by.tms.service;

import by.tms.entity.User;
import by.tms.storage.InMemoryUserStorage;

import java.util.Optional;

/**
 * @author Simon Pirko on 9.08.22
 */
public class UserService {

	private final InMemoryUserStorage storage = new InMemoryUserStorage();

	public void save(User user) {
		storage.save(user);
	}

	public Optional<User> findByUsername(String username) {
		return storage.findByUsername(username);
	}
}
