package com.bean;

import java.io.PrintWriter;
import java.util.HashMap;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts.action.Action;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;

import com.service.serviceclass;

public class projectdetails extends Action {

	
	@Override
	public ActionForward execute(ActionMapping mapping, ActionForm form, HttpServletRequest request,
			HttpServletResponse response) throws Exception {
		PrintWriter out = response.getWriter();
		
		serviceclass userservice = (serviceclass) ServiceFinder.getContext(request).getBean("serviceclass");
		String name=request.getParameter("name");
		System.out.println(request.getParameter("name"));
		bean a=userservice.projectdetail(name);
		
		out.print(a.getMonth()+",");
		out.print(a.getProjectname()+",");
		out.print(a.getUserId()+",");
		out.print(a.getProjectdetail()+",");
		out.print(a.getCreated()+",");
		out.print(a.getStratdate()+",");
		out.print(a.getEnddate()+",");
		out.print(a.getStatus());
	
	
		
		

		
		return null;
	}
	
}
