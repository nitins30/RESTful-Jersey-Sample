package service.com.users.java;

import java.util.ArrayList;
import java.util.List;

import model.com.users.java.User;

/**
 * 
 * @author Nitin Kumar
 *
 */
public class UserServiceStb {
	public static UserServiceStb userService = new UserServiceStb();
	
	/**
	 * 
	 * @return
	 */
	public List<User> getUserAll() {
		// TODO Auto-generated method stub
		List<User> ls=new ArrayList();
		User u1=new User("John","@john");
		User u2=new User("Titus","@titus");
		ls.add(u1);ls.add(u2);
		return  ls;
	}
	/**
	 * 
	 * @param user
	 * @return
	 */
	public User CreateUser(User user) {
		
		// TODO Store into DB
		return user;

	}
	public static UserServiceStb getInstance() {
		return userService;

	}
	public User getUser(String username) {
		// TODO Auto-generated method stub
		
		return new User(username,"@abc");
	}

}
