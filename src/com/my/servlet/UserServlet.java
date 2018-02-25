package com.my.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.my.bussiness.service.UserService;
import com.my.bussiness.service.UserServiceImpl;
import com.my.domain.User;

/**
 * Servlet implementation class UserServlet
 */
@WebServlet("/UserServlet")
public class UserServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public UserServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doPost(request,response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		request.setCharacterEncoding("utf-8");
		String flg = request.getParameter("flg");
		if("add".equals(flg)) {
		String name = request.getParameter("name");
		String pass = request.getParameter("pass");
		String que = request.getParameter("que");
		String ans = request.getParameter("ans");
		String email = request.getParameter("email");
		String realname = request.getParameter("realname");
		String sex = request.getParameter("sex");
		String iden = request.getParameter("iden");
		String tel = request.getParameter("tel");
		String area = request.getParameter("area") + "-" + request.getParameter("area_city1") + "-" + request.getParameter("area_city2");
		String address = request.getParameter("address");
		String post = request.getParameter("post");
		User user = new User(
				name
				,pass
				,que
				,ans
				,email
				,realname
				,sex
				,iden
				,tel
				,area
				,address
				,post
				);
		UserService us = new UserServiceImpl();
		if (us.addUser(user)) {
			System.out.println("ok");
			// 重定向到index.jsp
			response.sendRedirect("index.jsp");
			return;
		}
		System.out.println("error");
	} else if ("log".equals(flg)) {
		// 登陆
		/*--用户名*/
		String name = request.getParameter("name");
		/*--密码*/
		String pass = request.getParameter("pass");
		UserService us = new UserServiceImpl();
		User user = us.getUserByName(name);
		response.setCharacterEncoding("utf-8");
		PrintWriter pw = response.getWriter();
		pw.print("<html>");
		pw.print("<head>");
		pw.print("<meta http-equiv=\"Content-Type\" content=\"text/html; charset=utf-8\">");
		pw.print("<body>");
		if (user != null && user.getPASS().equals(pass)) {
			pw.print("welcome to login interface!" +"<br>"
		+ name + "!");
			response.sendRedirect("index.jsp");
		} else {
			pw.print("<p color='red'>error!please return login interface!</p>");
			response.sendRedirect("error.jsp");
		}
		pw.print("</body>");
		pw.print("</head>");
		pw.print("</html>");
		pw.flush();
		pw.close();
	}

}

}
