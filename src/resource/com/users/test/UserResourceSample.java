package resource.com.users.test;

import javax.ws.rs.core.MediaType;

import model.com.users.java.User;
import utility.users.helper.java.ForumConstant;

import com.sun.jersey.api.client.Client;
import com.sun.jersey.api.client.ClientResponse;
import com.sun.jersey.api.client.WebResource;
import com.sun.jersey.api.client.config.ClientConfig;
import com.sun.jersey.api.client.config.DefaultClientConfig;

/**
 * 
 * @author Nitin Kumar
 * 
 */
public class UserResourceSample {
	/**
	 * 
	 * Retrieve all user list to test
	 * @return
	 */
	public String testGetUsersAll() {
		ClientConfig config = new DefaultClientConfig();
		Client client = Client.create(config);
		WebResource resource = client
				.resource(ForumConstant.USER_URI);
		ClientResponse response = resource.type(MediaType.APPLICATION_XML).get(
				ClientResponse.class);
		String en = response.getEntity(String.class);
		return en;
	}
/**
 * Test single user
 * @return
 */
	public String testGetUsers() {
		ClientConfig config = new DefaultClientConfig();
		Client client = Client.create(config);
		WebResource resource = client.resource(ForumConstant.USER_URI);
		ClientResponse response = resource.type(MediaType.APPLICATION_XML).get(
				ClientResponse.class);
		String en = response.getEntity(String.class);
		return en;
	}
	/**
	 * Create user
	 * @return
	 */
	public User testCreateUser() {
		User user = new User("John", "john@");
		Client client = Client.create();
		WebResource r = client.resource(ForumConstant.USER_URI);
		ClientResponse response = r.accept(MediaType.APPLICATION_XML).post(
				ClientResponse.class, user);
		return user;
	}

	public static void main(String args[]) {
		UserResourceSample userSample = new UserResourceSample();
		System.out.println("User Created");
		userSample.testCreateUser();
		//System.out.println("User Retrieve");
		//userSample.testGetUsersAll();
	}
}
