package com.uncleYar.controllers;

import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.authority.AuthorityUtils;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.web.authentication.AuthenticationSuccessHandler;
import org.springframework.security.web.authentication.LoginUrlAuthenticationEntryPoint;
import org.springframework.security.web.authentication.SavedRequestAwareAuthenticationSuccessHandler;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/login")
class LoginController {

	@GetMapping
	public String form() {
		return "login";
	}
	

	private AuthenticationSuccessHandler handler = new SavedRequestAwareAuthenticationSuccessHandler();
	@PostMapping
	public void authenticate(@RequestParam Map<String, String> map,
			HttpServletRequest request, HttpServletResponse response) throws Exception {
		Authentication result = new UsernamePasswordAuthenticationToken(
				map.get("username"), "N/A",
				AuthorityUtils.commaSeparatedStringToAuthorityList("ROLE_USER"));
		SecurityContextHolder.getContext().setAuthentication(result);
		handler.onAuthenticationSuccess(request, response, result);
	}
}
