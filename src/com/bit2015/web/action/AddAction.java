package com.bit2015.web.action;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.bit2015.emaillist.Vo.EmailListVo;
import com.bit2015.emaillist.model.EmailLsitDao;
import com.bit2015.web.WebUtil;

public class AddAction implements Action {

	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		String firstname = request.getParameter( "firstname" );
		String lastname = request.getParameter( "lastname" );
		String email = request.getParameter( "email" );
		
		EmailListVo vo = new EmailListVo();
		vo.setFirstname(firstname);
		vo.setLastname(lastname);
		vo.setEmail(email);
		
		EmailLsitDao dao = new EmailLsitDao();
		dao.insert(vo);
		
		WebUtil.redirect(response, "/emaillist2/el?a=show" );

	}

}
