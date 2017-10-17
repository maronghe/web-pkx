package com.dl.neusoft;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;
import java.util.Map;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.dl.neusoft.util.DBUtil;

/**
 * Servlet implementation class GetData
 */
@WebServlet("/login_app.app_action_get_data")
public class GetData extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public GetData() {
        super();
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		DBUtil db = new DBUtil();
		String sql = "select * from datas order by id desc";
		
		List<Map<String, String>> list =db.getList(sql);
		
		Datas datas = new Datas() ;
		if(list != null && list.size()>0) {
			Map<String, String> map = list.get(0);
			String hum = map.get("hum");
			datas.setHum(hum);
			datas.setId(Integer.valueOf(map.get("id")));
			datas.setTemp(map.get("temp"));
		}
		
		String sql2 = "select * from datas_yali order by id desc";
		
		List<Map<String, String>> list2 =db.getList(sql2);
		if(list2 != null && list2.size()>0) {
			Map<String, String> map = list2.get(0);
			datas.setYali(map.get("yali"));
		}
		
		PrintWriter out = response.getWriter();
		System.out.println(datas.toString());
		out.print(datas.toString());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
