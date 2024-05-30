package com.samanecorp.secureapp.controller;

import java.io.IOException;
import java.util.Optional;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.samanecorp.secureapp.dto.UserDTO;
import com.samanecorp.secureapp.service.LoginService;

/**
 * Servlet implementation class LoginServlet
 */
@WebServlet(name="login", value="/login")
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private LoginService loginService;
    Logger logger = LoggerFactory.getLogger(LoginServlet.class);
	private final String LOGIN_PAGE = "index.jsp";
	private final String HOME_PAGE = "WEB-INF/jsp/welcome.jsp";
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public LoginServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		loadIndex(null, request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		logger.info("Connexion methode post");
        String email = request.getParameter("email");
        String password = request.getParameter("password");
        logger.info("Tentative de connexion avec {} et {}", email, password);
        try {
            Optional<UserDTO> userDtoOption = loginService.loginUser(email,password);
            UserDTO userDto = userDtoOption.get();
            request.getSession().setAttribute("username", userDto.getEmail());
            response.sendRedirect(HOME_PAGE);
        }  catch (Exception e) {
            String message = "informations de connexion incorrect.";
            logger.error("{}", message);
            loadIndex(message, request, response);
        }
	}
	private void loadIndex(String message, HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.setAttribute("message", message);
        req.getRequestDispatcher(LOGIN_PAGE).forward(req, resp);
    }

}
