/**
 * 
 */
package com.prokarma.app.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.prokarma.app.bd.UserLoginBD;
import com.prokarma.app.vo.UserLoginVO;

/**
 * @author Amara Subramanyam
 *
 */
@Controller
public class UserController {

	@Autowired
	private UserLoginBD userLoginBD;

	@RequestMapping(value = "/login", method = RequestMethod.GET)
	public String showAddUserForm(Model model) {
		UserLoginVO loginVO = new UserLoginVO();
		model.addAttribute("userForm", loginVO);
		return "userLogin";

	}

	@RequestMapping(value = "/userLogin", method = RequestMethod.POST)
	public ModelAndView saveEmployee(@ModelAttribute("userForm") UserLoginVO userForm,
			RedirectAttributes redirectAttributes) {
		boolean isExists = userLoginBD.getUserDetails(userForm);
		if (isExists) {
			redirectAttributes.addFlashAttribute("success", "Ur Login Success " + userForm.getFirstname() + " ");
		} else {
			redirectAttributes.addFlashAttribute("failure",
					"Ur Unable to Login Sorry  " + userForm.getFirstname() + " ");
		}
		return new ModelAndView("redirect:/showUser");
	}

	@RequestMapping(value = "/showUser", method = RequestMethod.GET)
	public String showUser() {
		return "status";
	}
}
