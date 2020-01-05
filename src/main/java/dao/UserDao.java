package dao;

import javax.persistence.EntityManager;
import javax.persistence.Query;

import model.User;

public class UserDao extends GenericDao<User> {
	
	
	public User buscarUsuarioParaLogin(String username , String password) {
	
		EntityManager em = getEntityManager();
		
		try {
			StringBuilder sb = new StringBuilder();
			sb.append("SELECT * FROM users WHERE loginUser = :user AND passwordUser = :password");
			Query query = em.createNativeQuery(sb.toString(), User.class);
			query.setParameter("user", username);
			query.setParameter("password", password);
			return (User) query.getSingleResult();

		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}finally {
			em.close();
		}

	}
	
	
	public User findByUsername(String username) {
	
		EntityManager em = getEntityManager();
		
		try {
			StringBuilder sb = new StringBuilder();
			sb.append("select * from users where loginUser = :user");
			Query query = em.createNativeQuery(sb.toString());
			query.setParameter("user", username);
			return (User)query.getSingleResult();

		}
		catch(Exception err) {
			err.printStackTrace();
			return null;
		}
		finally {
			em.close();
		}
	}
}
