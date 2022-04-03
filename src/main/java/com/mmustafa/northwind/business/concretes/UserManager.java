package com.mmustafa.northwind.business.concretes;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mmustafa.northwind.business.abstracts.UserService;
import com.mmustafa.northwind.core.dataAccess.UserDao;
import com.mmustafa.northwind.core.entities.User;
import com.mmustafa.northwind.core.utilities.results.DataResult;
import com.mmustafa.northwind.core.utilities.results.Result;
import com.mmustafa.northwind.core.utilities.results.SuccessDataResult;
import com.mmustafa.northwind.core.utilities.results.SuccessResult;

@Service
public class UserManager implements UserService {
	
	private UserDao userDao;
	
	@Autowired
	public UserManager(UserDao userDao) {
		super();
		this.userDao = userDao;
	}
	
	@Override
	public Result add(User user) {
		
		this.userDao.save(user);
		
		return new SuccessResult("Kullanıcı Eklendi");
	}
	
	@Override
	public DataResult<User> findByEmail(String email) {
		
		return new SuccessDataResult<User>(this.userDao.findByEmail(email) , "kullanıcı bulundu");
	}

}
