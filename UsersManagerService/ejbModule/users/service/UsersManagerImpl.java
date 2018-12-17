package users.service;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import udm.entity.User;

@Stateless
public class UsersManagerImpl implements UsersManager {

	@PersistenceContext(name = "UsersService")
	EntityManager em;
	
	public boolean IsGoodPassword(String username, String password) {
		boolean result = false;
		// TODO Auto-generated method stub
		if(username == em.createNamedQuery("User.findByUsername")
							.setParameter("username",username)
							.getSingleResult()) 
		{
			result = true;
		}
		return result;
	}

	public User createUser(String username, String password) {
		// TODO Auto-generated method stub
		User user = new User(username,password);
		em.persist(user);
		return user;
	}
}
