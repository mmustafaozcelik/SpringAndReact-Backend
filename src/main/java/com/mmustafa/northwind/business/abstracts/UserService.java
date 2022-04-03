package com.mmustafa.northwind.business.abstracts;

import com.mmustafa.northwind.core.entities.User;
import com.mmustafa.northwind.core.utilities.results.DataResult;
import com.mmustafa.northwind.core.utilities.results.Result;

public interface UserService {
	
	Result add(User user);
	DataResult<User> findByEmail(String email);
}
