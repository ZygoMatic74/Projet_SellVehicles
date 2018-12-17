package udm.entity;

import java.io.Serializable;
import javax.persistence.*;

/**
 * Entity implementation class for Entity: User
 *
 */
@NamedQueries({
	@NamedQuery(name="User.findByUsername",
				query="SELECT e.password FROM User e WHERE e.username = :username")
	})

@Entity
@Table(name="User")
public class User implements Serializable {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	private String username;
	
	private String password;
	
	private static final long serialVersionUID = 1L;

	public User() {
		
	}
	
	public User(String username, String password) {
		super();
		setUsername(username);
		setPassword(password);
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
   
}
