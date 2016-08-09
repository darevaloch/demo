package com.globant.billing.client.web.controller;

import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.globant.billing.client.web.model.Owner;

@Controller
public class OwnerController {

	@RequestMapping(value = "/owners/find", method = RequestMethod.GET)
	public String initFindForm(Map<String, Object> model) {
		model.put("owner", new Owner());
		return "owners/findOwners";
	}
}
