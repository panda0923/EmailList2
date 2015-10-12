package com.bit2015.emaillist.servlet;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.bit2015.emaillist.Vo.EmailListVo;
import  com.bit2015.emaillist.model.EmailLsitDao;
import com.bit2015.emaillist.web.action.EmailListActionFactory;
import com.bit2015.web.WebUtil;
import com.bit2015.web.action.Action;
import com.bit2015.web.action.ActionFactory;
/**
 * Servlet implementation class EmailListServlet
 */
@WebServlet("/el")
public class EmailListServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		
	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding( "UTF-8" );
		String actionName = request.getParameter( "a" );
		ActionFactory actionFactory = new EmailListActionFactory();
		Action action = actionFactory.getAction( actionName );
		action.execute(request, response);
	}
	

}
//		
//	//	if("show".equals(a)==true){
//	//		EmailLsitDao dao = new EmailLsitDao();
//	//		List<EmailListVo> list = dao.getList();
//			
//	//		request.setAttribute("list", list);
//	//		forwarding(request,response,"/view/show_emaillist.jsp");
//	//}else{
//	//	System.out.println("unknown action");
//	//}
//		
//		
//		if("form".equals(a)){
//			WebUtil.forwarding(request,response,"/view/emailList.jsp");
//		}else if("add".equals(a)){
//			String firstname = request.getParameter( "firstname" );
//			String lastname = request.getParameter( "lastname" );
//			String email = request.getParameter( "email" );
//			
//			EmailListVo vo = new EmailListVo();
//			vo.setFirstname(firstname);
//			vo.setLastname(lastname);
//			vo.setEmail(email);
//			
//			EmailLsitDao dao = new EmailLsitDao();
//			dao.insert(vo);
//			
//			WebUtil.redirect(response, "/emaillist2/el?a=show" );
//		}
//			else{
//				//default action
//				EmailLsitDao dao = new EmailLsitDao();
//				List<EmailListVo> list = dao.getList();
//				
//				request.setAttribute("list", list);
//				WebUtil.forwarding(request,response,"/view/showemaillist.jsp");
//			}
			
