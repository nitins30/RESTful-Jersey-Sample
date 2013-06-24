package service.com.users.java;

import java.sql.SQLException;
import java.util.List;

import model.com.users.java.User;

public interface  IUserService{
	public List<User> getUserAll() throws ClassNotFoundException, SQLException;
	public List<User> getUser(String name) throws ClassNotFoundException, SQLException;
	public void CreateUser(User user) throws SQLException, ClassNotFoundException ;
}
