package com.bean;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts.action.Action;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;
import org.apache.struts.actions.DispatchAction;

import com.service.serviceclass;


public class operationmethods extends DispatchAction{
	
	public ActionForward Create(ActionMapping mapping, ActionForm form, HttpServletRequest request,HttpServletResponse response) throws Exception {
		serviceclass userservice = (serviceclass) ServiceFinder.getContext(request).getBean("userservice");
		form frm = (form) form;
		bean bean = new bean();
		bean.setMonth(((com.bean.form) form).getMonth());
		bean.setProjectname(((com.bean.form) form).getProjectname());
		bean.setPrjectid(((com.bean.form) form).getPrjectid());
		bean.setProjectdetail(((com.bean.form) form).getProjectdetail());
		bean.setCreated(((com.bean.form) form).getCreated());
		bean.setStratdate(((com.bean.form) form).getStratdate());
		bean.setEnddate(((com.bean.form) form).getEnddate());
		bean.setStatus(((com.bean.form) form).getStatus());

		userservice.saveUser(bean);
	  	 
	  return mapping.findForward("success");
	 }
	
	public ActionForward Update(ActionMapping mapping, ActionForm form, HttpServletRequest request,HttpServletResponse response) throws Exception {
	
		serviceclass userservice = (serviceclass) ServiceFinder.getContext(request).getBean("userservice");
	form frm = (form) form;
	bean bean = new bean();
	bean.setMonth(((com.bean.form) form).getMonth());
	bean.setProjectname(((com.bean.form) form).getProjectname());
	bean.setPrjectid(((com.bean.form) form).getPrjectid());
	bean.setProjectdetail(((com.bean.form) form).getProjectdetail());
	bean.setCreated(((com.bean.form) form).getCreated());
	bean.setStratdate(((com.bean.form) form).getStratdate());
	bean.setEnddate(((com.bean.form) form).getEnddate());
	bean.setStatus(((com.bean.form) form).getStatus());
 
	userservice.updateUser(bean);
	  	 
	  return mapping.findForward("success");
	 }
	
	public ActionForward Delete(ActionMapping mapping, ActionForm form, HttpServletRequest request,
			HttpServletResponse response) throws Exception {
		
		serviceclass userservice = (serviceclass) ServiceFinder.getContext(request).getBean("userservice");
		form frm = (form) form;
		bean bean = new bean();
		
		bean.setUserId(((com.bean.form) form).getPrjectid());
		userservice.DeleteUser(bean);
		
		
		 return mapping.findForward("success");
	}
	
	
	

}
