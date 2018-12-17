package users.service;

import javax.ejb.Remote;

import udm.entity.User;

@Remote
public interface UsersManager {
	public User createUser(String username, String password);
	public boolean IsGoodPassword(String username, String password);
}
