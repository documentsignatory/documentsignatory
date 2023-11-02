package logs.mailer.app.user;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

	@Autowired
	private UserService userService;
	
	@RequestMapping(method = RequestMethod.POST, value="/user")
	public User addUser(@RequestBody User user) {
		return userService.addUser(user);
	}
	
	@RequestMapping("/user/{id}")
	public Optional<User> getUser(@PathVariable int id) {
		return userService.getUser(id);
	}
	
	@RequestMapping(method = RequestMethod.PUT, value = "/user")
	public User updateUser(@RequestBody User user) {
		return userService.addUser(user);
	}
}
