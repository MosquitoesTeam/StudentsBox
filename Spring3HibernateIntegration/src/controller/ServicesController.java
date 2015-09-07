package controller;


import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import service.AdministrateurManager;
import service.DocumentManager;
import test.Lien;

import com.mysql.jdbc.log.Log;

import entity.AdministrateurEntity;

@Controller
@RequestMapping("/services")
public class ServicesController {
	
	@Autowired
	private AdministrateurManager administrateurManager;

	@Autowired
	private DocumentManager documentManager;
	 
	 

	@RequestMapping(value = "user/{id}", method = RequestMethod.GET)
	 public @ResponseBody AdministrateurEntity getUser(@PathVariable Integer id) {
	   AdministrateurEntity a=administrateurManager.getAdministrateurById(id);
	  return a;
	 }
	
	
	@RequestMapping(value = "users" , method = RequestMethod.GET)
	 public  @ResponseBody  List<AdministrateurEntity> getAllUsers() {
	  List<AdministrateurEntity> users=administrateurManager.getAllAdministrateurs();
	  return users;
	 }
	
	
	


	 
	
}
