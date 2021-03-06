package com.bjpowernode.javaweb.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class LogoutServlet extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		
		//获取session对象，若没有获取到session对象，则新建session对象
		//HttpSession session = request.getSession();
		
		//获取session对象，若没有获取到session对象，则新建session对象
		//HttpSession session = request.getSession(true);
		
		//获取session对象，若没有获取到session对象，则返回null
		HttpSession session = request.getSession(false);
		if(session != null){
			//销毁session
			session.invalidate();
		}
	}

}
