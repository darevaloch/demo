package com.globant.billing.client.web.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.globant.billing.client.web.dao.UserDAO;
import com.globant.billing.client.web.model.User;

@Controller
public class HomeController {

	@Autowired
	private UserDAO userDao;

	@RequestMapping(value = "/userListExampleXML")
	public ModelAndView home() {
		List<User> listUsers = userDao.list();
		for (User user : listUsers) {
			System.out.println(user.getId());
		}
		ModelAndView model = new ModelAndView("users");
		model.addObject("userList", listUsers);
		return model;
	}
}
