package com.bean;

import java.io.PrintWriter;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts.action.Action;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;

import com.service.serviceclass;

public class projectname extends Action {

	
	@Override
	public ActionForward execute(ActionMapping mapping, ActionForm form, HttpServletRequest request,
			HttpServletResponse response) throws Exception {
		PrintWriter out = response.getWriter();
		
	    serviceclass userservice = (serviceclass) ServiceFinder.getContext(request).getBean("serviceclass");
		String date=request.getParameter("date");
		System.out.println(request.getParameter("date"));
		String a=userservice.listprojectname(date);
		
		out.print(a);
		
		return null;
	}
	
}
