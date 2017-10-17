package com.dl.neusoft;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.dl.neusoft.util.DBUtil;

/**
 * Servlet implementation class StroeData
 */
@WebServlet("/login_app.app_action")
public class StroeData extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private static DBUtil db ;
    /**
     * Default constructor. 
     */
    public StroeData() {
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		db = new DBUtil();
		
		String temp = request.getParameter("temp");
		
		String hum = request.getParameter("hum");
		
		if(temp == null || "".equals(temp)) {
			temp = "";
		}
		if(hum == null || "".equals(hum)) {
			hum = "";
		}
		
		String sql = "insert into datas(temp,hum) values('"+temp +"','"+hum +"')";
		System.out.println(sql);
		int i =db.update(sql);
		if(i == i) {
			response.getWriter().append("Result: ").append("success");
		}else {
			response.getWriter().append("Result: ").append("false");
		}
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
