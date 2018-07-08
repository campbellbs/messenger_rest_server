package messenger.Dao;

import java.util.List;

import messenger.Domain.User;

public interface UserDao {

	/**
	 * Generische Methode, um die übergebene Entität als Eintrag in der Datenbank zu
	 * erzeugen.
	 * 
	 * @param entity
	 *            generische Entität, welche in die Datenbank persistiert werden
	 *            soll
	 */
	public <T> void persistObject(T entity);

	/**
	 * Generische Methode, um den Eintrag der übergebenen Entität in der Datenbank
	 * zu aktualisieren.
	 * 
	 * @param entity
	 *            generische Entität, dessen Eintrag in der Datenbank aktualisiert
	 *            werden soll
	 */
	public <T> void mergeObject(T entity);

	/**
	 * Generische Methode, um den Eintrag der übergebenen Entität aus der Datenbank
	 * zu entfernen.
	 * 
	 * @param entity
	 *            generische Entität, dessen Eintrag aus der Datenbank entfernt
	 *            werden soll
	 */
	public <T> void removeObject(T entity);

	/**
	 * Methode um alle User auszulesen
	 * 
	 * @return Liste aller User-Objekte
	 *            
	 */
	public List<User> getAllUsers();
	
	/**
	 * get user object to corresponding username
	 * 
	 * @param username of the user
	 * @return user object
	 *            
	 */
	public User getUserByName(String username);
	
	/**
	 * get user object to corresponding userId
	 * 
	 * @param userId of the user
	 * @return user object
	 *            
	 */
	public User getUserById(Long userId);
	
}
