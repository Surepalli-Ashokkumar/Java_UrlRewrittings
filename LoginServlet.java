package com.cisco.urlrewrittting;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/login")
public class LoginServlet extends HttpServlet
{

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException 
	{
		PrintWriter pw = resp.getWriter();
		
		String uname = req.getParameter("uname");
		String upass = req.getParameter("upass");
		String url = "dashboard?userid="+uname;
		//pw.println(uname);
		

		if(uname.equals("sheela")&& upass.equals("sheela@123")) 
		{
                 pw.println("Login Success...!"); 
                 resp.sendRedirect(url);
		}
         else
         {
              pw.println("Login Failed...!");
		      pw.close();
                
         
        }

		
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException 
	{
		doGet(req, resp);
	}
      
}
