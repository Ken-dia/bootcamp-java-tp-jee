package com.samanecorp.secureapp.controller;

import java.io.IOException;

import javax.servlet.ServletConfig;
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
 * Servlet implementation class SingUpServlet
 */
@WebServlet(name = "signup", value = "/signup")
public class SignUpServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
    private static final Logger logger = LoggerFactory.getLogger(LoginServlet.class);
    private LoginService loginService;
       
    @Override
    public void init(ServletConfig config) throws ServletException {

        loginService = new LoginService();
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		loadIndex(null, request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		 String fistName = request.getParameter("first_name");
	        String lastName = request.getParameter("last_name");
	        String email = request.getParameter("email");
	        String password = request.getParameter("password");

	        logger.info("Tentative d'inscription avec {}", email);
	        String message = null;
	        try {

	            UserDTO userDTO = new UserDTO();
	            userDTO.setFirstName(fistName);
	            userDTO.setLastName(lastName);
	            userDTO.setEmail(email);
	            userDTO.setPassword(password);
	            boolean result = loginService.saveUser(userDTO);
	            if (result) {
	                message = "informations ajoutées dans la base de données.";
	                logger.info("{}", message);
	            }
	        } catch (Exception e) {
	            message = "informations non ajoutées.";
	            logger.error("{}", message);
	        }
	        loadIndex(message, request, response);
	}
	private void loadIndex(String message, HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		req.setAttribute("message", message);
		 String SINGUP_PAGE = "WEB-INF/jsp/singup.jsp";
		req.getRequestDispatcher(SINGUP_PAGE).forward(req, resp);
	}

}
