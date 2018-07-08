package messenger.Service;

import java.util.List;

import messenger.Domain.User;

public interface UserManagement {
	
	/**
	 * add a new user to the chat system
	 * @param username name of the new user 
	 * @param password password of the new user
	 * @return 0: added successfully<br>
	 * 1: user already exists<br>
	 * 2: other error while adding
	 */
	public int addUser(String username, String password);
	
	/**
	 * delete an user from the chat system
	 * @param user to delete
	 * @return true: user deleted successfully<br>
	 * false: error while deleting
	 */
	public boolean deleteUser(User user);
	
	/**
	 * update user data
	 * @param user to update
	 * @return true: update successful<br>
	 * false: error while updating
	 */
	public boolean updateUser(User user);
	
	/**
	 * checks login credentials
	 * @param username name of an user
	 * @param password password of the user
	 * @return user<br>
	 * null when credentials not found
	 */
	public User loginUser(String username, String password);
	
	/**
	 * list with all users
	 * @return list with all users
	 */
	public List<User> getAllUsers();
	
}
