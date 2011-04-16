/**
 * 
 */
package ${package}.rest.impl;

import javax.ws.rs.core.Response;
import javax.ws.rs.core.Response.Status;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ${package}.model.User;
import ${package}.persistence.UserDao;
import ${package}.rest.UserService;

/**
 * @author Bill
 *
 */
@Service("userService")
public class UserServiceImpl implements UserService {
	
	private UserDao userDao;

	/**
	 * 
	 */
	@Autowired
	public UserServiceImpl(UserDao userDao) {
		// TODO Auto-generated constructor stub
		this.userDao = userDao;
	}
	
	public Response create(User user) {
		// TODO Auto-generated method stub
		userDao.save(user);
		return Response.status(Status.OK).build();
	}
	
	public User show(Long id) {
		// TODO Auto-generated method stub
		return userDao.find(id);
	}

}
