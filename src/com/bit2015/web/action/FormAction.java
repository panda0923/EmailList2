package com.bit2015.web.action;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.bit2015.web.WebUtil;

public class FormAction implements Action {

	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response)throws ServletException, IOException {
		WebUtil.forwarding(request,response,"/view/emailList.jsp");
		// TODO Auto-generated method stub
		

	}

}
