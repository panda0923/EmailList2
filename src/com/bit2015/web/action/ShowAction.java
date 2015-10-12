package com.bit2015.web.action;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.bit2015.emaillist.Vo.EmailListVo;
import com.bit2015.emaillist.model.EmailLsitDao;
import com.bit2015.web.WebUtil;

public class ShowAction implements Action {

	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		EmailLsitDao dao = new EmailLsitDao();
		List<EmailListVo> list = dao.getList();
		
		request.setAttribute("list", list);
		WebUtil.forwarding(request,response,"/view/showemaillist.jsp");
	}

}
