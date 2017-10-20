package com.dl.neusoft;

import java.io.IOException;
import java.util.List;
import java.util.Map;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.dl.neusoft.util.DBUtil;

/**
 * Servlet implementation class StroeData
 */
@WebServlet("/openLights")
public class openLights extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private static DBUtil db ;
    /**
     * Default constructor. 
     */
    public openLights() {
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		db = new DBUtil();
		String sql = "select * from deng";
	
		List<Map<String, String>> list =db.getList(sql);
		
		if(list != null && list.size()>0) {
			Map<String, String> map = list.get(0);
			String status = map.get("status");
			String updateSql = "";
			if("1".equals(status)) {
				updateSql = "update deng set status = 0 where id = 1";
			}else {
				updateSql = "update deng set status = 1 where id = 1";
			}
			int i = db.update(updateSql);
			if(i == i) {
				response.getWriter().append("Result: ").append("success");
			}else {
				response.getWriter().append("Result: ").append("false");
			}
		}
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
