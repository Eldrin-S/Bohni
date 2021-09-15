import java.util.Enumeration;

import javax.servlet.ServletContext;
import javax.servlet.http.HttpSession;
import javax.servlet.http.HttpSessionContext;

import org.springframework.beans.factory.annotation.Autowired;

import controller.AdminController;
import service.AdminService;

/*import java.io.IOException;
import java.io.PrintWriter;
import java.util.Collection;
import java.util.Locale;

import javax.servlet.ServletOutputStream;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletResponse;*/
import org.springframework.web.servlet.ModelAndView;

public class AppMain 


{
public static ModelAndView main(String[] args) {
	/*
	 * HttpServletResponse res = (HttpServletResponse) new AppMain() ;
	 * 
	 * 
	 * res.sendRedirect("admin.jsp");
	 */
	System.out.println("Yooo");
	ModelAndView mav  = new ModelAndView();
	AdminController adminContoller = new AdminController();
	mav = adminContoller.viewAdminLogin();
	return mav;
}
}
