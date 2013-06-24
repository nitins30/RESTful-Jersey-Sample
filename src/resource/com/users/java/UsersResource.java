package resource.com.users.java;

import java.net.URI;
import java.sql.SQLException;
import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.UriInfo;

import model.com.users.java.User;
import service.com.users.java.UserService;


@Path("/users")
public class UsersResource implements IUsersResource{
	@Context
	UriInfo uriInfo;
	@GET
	@Produces ("application/xml")
	public List<User> getUsersAll() {
		List<User> als=null;
		try {
			als= UserService.getInstance().getUserAll();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return als;
	}
	@POST
	@Consumes ("application/xml")
	@Produces ("application/xml")
	public User  createUser(User user){
		URI uri = uriInfo.getAbsolutePathBuilder().path(user.getUserName()).build();
		Response res=Response.created(uri).build();
		try {
			UserService.getInstance().CreateUser(user);
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return user;
	}
	
	@Path("/user/{username}")
	@GET
	@Produces ("application/xml")
	public List<User> getUser(@PathParam("username") String username) {
		List<User> asl=null;
		try {
			System.out.println("Inside getUser subpath=="+username);
			asl= UserService.getInstance().getUser(username);
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return asl;
	}
	
}
