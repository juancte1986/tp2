package ar.edu.uces.progweb2.agenda.controller;

import javax.servlet.http.HttpServletResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.CookieValue;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.bind.support.SessionStatus;
import ar.edu.uces.progweb2.agenda.dto.FormLoginDTO;
import ar.edu.uces.progweb2.agenda.helper.CookieHelper;
import ar.edu.uces.progweb2.agenda.model.User;
import ar.edu.uces.progweb2.agenda.service.UserService;
import ar.edu.uces.progweb2.agenda.validator.LoginValidator;

@SessionAttributes("user")
@Controller
public class UserController {

	private LoginValidator loginValidator;
	private UserService userService;
	private CookieHelper cookieHelper;

	@Autowired
	public void setLoginValidator(LoginValidator loginValidator) {
		this.loginValidator = loginValidator;
	}

	@Autowired
	public void setUserService(UserService userService) {
		this.userService = userService;
	}

	@Autowired
	public void setCookieHelper(CookieHelper cookieHelper) {
		this.cookieHelper = cookieHelper;
	}

	@RequestMapping(value = "/initFormLogin")
	public String initFormLogin(
			ModelMap model,
			@CookieValue(value = "cookieCalendar", required = false) String cookieCalendar) {
		if (cookieCalendar != null) {
			FormLoginDTO form = new FormLoginDTO();
			form.setPassword(this.cookieHelper.getPassword(cookieCalendar));
			form.setUser(this.cookieHelper.getPassword(cookieCalendar));
			User user = this.userService.getUser(form);
			if (user != null) {
				model.addAttribute("user", user);
				return "/jsp/calendar.jsp";
			} else {
				// falta implementar el error de cookie inexistente
				model.addAttribute("error", true);
				return "/jsp/login.jsp";
			}

		}
		model.addAttribute("formLoginDTO", new FormLoginDTO());
		return "/jsp/login.jsp";
	}

	@RequestMapping(value = "/processFormLogin", method = RequestMethod.POST)
	public String processFormLogin(
			@ModelAttribute("formLoginDTO") FormLoginDTO form,
			BindingResult result, ModelMap model, HttpServletResponse response) {
		this.loginValidator.validate(form, result);
		if (result.hasErrors()) {
			return "/jsp/login.jsp";
		}
		User user = this.userService.getUser(form);
		if (user != null) {
			//implementar error de credenciales invalidas
			model.addAttribute("error", true);
			return "/jsp/login.jsp";
		}
		this.cookieHelper.createCookie(user.getPassword(), user.getUser(),
				response);
		model.addAttribute("user", user);
		return "/jsp/calendar.jsp";
	}

	@RequestMapping(value = "/logout")
	public String logout(ModelMap model, SessionStatus sessionStatus,
			HttpServletResponse response) {
		this.cookieHelper.deleteCookie(response);
		sessionStatus.setComplete();
		model.addAttribute("user", null);
		return "/jsp/login.jsp";
	}

}
