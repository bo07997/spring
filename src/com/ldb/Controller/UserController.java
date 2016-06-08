package com.ldb.Controller;
import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.ldb.Controller.dao.IUserDAO;
import com.ldb.Controller.entity.User;
import com.ldb.Controller.service.IUserManager;

@Controller
@RequestMapping("/User")
public class UserController {

	@Resource(name="UserManager")
	public IUserManager UserManager;
	@RequestMapping("/addUser")
	public String addUser(User user)
	{
		UserManager.addUser(user);
		return "/success";
	}
	@RequestMapping("/toaddUser")
	public String toaddUser()
	{
		return "/addUser";
	}
	
}
