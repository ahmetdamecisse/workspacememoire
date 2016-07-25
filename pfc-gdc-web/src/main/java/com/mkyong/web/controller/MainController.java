package com.mkyong.web.controller;

import org.springframework.security.authentication.AnonymousAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class MainController {

	@RequestMapping(value = { "/", "/welcome**" }, method = RequestMethod.GET)
	public ModelAndView defaultPage() {

		ModelAndView model = new ModelAndView();
		model.addObject("title", "La page d'accueil de notre application. On ne demande pas une connexion.");
		model.addObject("message", "C'est la page par d�faut!");
		model.setViewName("hello");
		return model;

	}

	@RequestMapping(value = "/admin**", method = RequestMethod.GET)
	public ModelAndView adminPage() {

		ModelAndView model = new ModelAndView();
		model.addObject("title", "La page d'administration. Elle n�cessite une authentification.");
		model.addObject("message", "Seul l'administrateur est autoris� � acc�der � cette page apr�s authentifcation.!");
		model.setViewName("admin");

		return model;

	}

        @RequestMapping(value = "/candidathome**", method = RequestMethod.GET)
	public ModelAndView candidathomePage() {

		ModelAndView model = new ModelAndView();
		model.addObject("title", "La page d'accueil du candidat. il faut le r�le candiadt.");
		model.addObject("message", "C'est la page par d�faut du candidat qui s'est connect�!");
		model.setViewName("candidathome");
		return model;

	}
        
        @RequestMapping(value = "/recruteurhome**", method = RequestMethod.GET)
	public ModelAndView recruteurhomePage() {

		ModelAndView model = new ModelAndView();
		model.addObject("title", "La page d'accueil du recruteur. il faut le r�le recruteur.");
		model.addObject("message", "C'est la page par d�faut du recruteur qui s'est connect�!");
		model.setViewName("recruteurhome");
		return model;

	}
        
          @RequestMapping(value = "/anonymousepage**", method = RequestMethod.GET)
	public ModelAndView anonymousepagePage() {

		ModelAndView model = new ModelAndView();
		model.addObject("title", "La page accessible par tout le monde.");
		model.addObject("message", "Cettes est l'une des pages qui ne n�cessitent pas une connexion.!");
		model.setViewName("anonymousepage");
		return model;

	}
        
	@RequestMapping(value = "/login", method = RequestMethod.GET)
	public ModelAndView login(@RequestParam(value = "error", required = false) String error,
			@RequestParam(value = "logout", required = false) String logout) {

		ModelAndView model = new ModelAndView();
		if (error != null) {
			model.addObject("error", "Nom d'utilisateur et mot de passe incorrects!");
		}

		if (logout != null) {
			model.addObject("msg", "Vous vous �tes d�connecter avec succ�s.");
		}
		model.setViewName("login");

		return model;

	}
	
	//for 403 access denied page
	@RequestMapping(value = "/403", method = RequestMethod.GET)
	public ModelAndView accesssDenied() {

		ModelAndView model = new ModelAndView();
		
		//check if user is login
		Authentication auth = SecurityContextHolder.getContext().getAuthentication();
		if (!(auth instanceof AnonymousAuthenticationToken)) {
			UserDetails userDetail = (UserDetails) auth.getPrincipal();
			System.out.println(userDetail);
		
			model.addObject("username", userDetail.getUsername());
			
		}
		
		model.setViewName("403");
		return model;

	}

}