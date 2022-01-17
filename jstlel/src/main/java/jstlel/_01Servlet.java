package jstlel;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class _01Servlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//value
		int iVal = 10;
		long lVal = 10;
		float fVal = 3.14f; //3.14 = doudble, 3.14f = float
		boolean bVal = true;
		String sVal = "가나다라마바사";
		
		//object
		Object obj = null;
		UserVo userVo = new UserVo();
		userVo.setNo(10L); //10 = int,  10L = long
		userVo.setName("둘리");
		
		//map
		Map<String, Object> map = new HashMap<>();
		map.put("ival", iVal); //auto Boxing
		map.put("lval", lVal);
		map.put("fval", fVal);
		map.put("bval", bVal);
		
		request.setAttribute("ival", iVal);
		request.setAttribute("lval", lVal);
		request.setAttribute("fval", fVal);
		request.setAttribute("bval", bVal);
		request.setAttribute("sval", sVal);
		
		request.setAttribute("obj", obj);
		request.setAttribute("user", userVo);
		
		request.setAttribute("m", map);
		
		
		//chaining -> \n
		request
		.getRequestDispatcher("/WEB-INF/views/01.jsp")
		.forward(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}