package resource.com.users.java;

import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;

import model.com.users.java.User;


public interface IUsersResource {
	
	@GET
	@Produces ("application/xml")
	public List<User> getUsersAll();
	
	@POST
	@Consumes ("application/xml")
	@Produces ("application/xml")

	public User  createUser(User user);
	
	@Path("/user/{username}")
	@GET
	@Produces ("application/xml")
	public List<User> getUser(@PathParam("username") String username);
	
}
