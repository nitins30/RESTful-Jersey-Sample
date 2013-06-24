package model.com.users.java;

import javax.xml.bind.annotation.XmlRootElement;

/**
 * 
 * @author Nitin Kumar
 * 
 */
@XmlRootElement
public class User {
	private String userName;
	private String userPasswd;

	public User(String userName, String userPasswd) {
		this.userName = userName;
		this.userPasswd = userPasswd;
	}
	public User() {
		super();
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getUserPasswd() {
		return userPasswd;
	}

	public void setUserPasswd(String userPasswd) {
		this.userPasswd = userPasswd;
	}
}
