package logs.mailer.app.user;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class User {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String userName;
	private String password;
	private String mailerHost;
	private int mailerPort;
	private String mailerUserName;
	private String mailerPassword;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getMailerHost() {
		return mailerHost;
	}
	public void setMailerHost(String mailerHost) {
		this.mailerHost = mailerHost;
	}
	public int getMailerPort() {
		return mailerPort;
	}
	public void setMailerPort(int mailerPort) {
		this.mailerPort = mailerPort;
	}
	public String getMailerUserName() {
		return mailerUserName;
	}
	public void setMailerUserName(String mailerUserName) {
		this.mailerUserName = mailerUserName;
	}
	public String getMailerPassword() {
		return mailerPassword;
	}
	public void setMailerPassword(String mailerPassword) {
		this.mailerPassword = mailerPassword;
	}
	
	
}
