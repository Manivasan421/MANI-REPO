<%@ taglib uri="/WEB-INF/struts-html.tld" prefix="html"%>
<%@ taglib uri="/WEB-INF/struts-bean.tld" prefix="bean"%>

<html:form action="/saveUser.do" method="post">
 
Project ID : <html:text property="prjectid" />
Project Name :<html:text property="projectname"/>
Select date:  <input type="date" id="mon"><br> <html:hidden property="month" value="" />
Select Project  :<select id="pname"><option value="0">select Project</option></select>&nbsp;
Project Detail :<html:text property="projectdetail"/> 
Created By :<html:text property="created"/>
Started Date : <input type="date" id="sdate"><html:hidden property="stratdate" />
End Date : <input type="date" id="edate"><html:hidden property="enddate" /> <br>
Status :<html:text property="status"/>

<html:submit property="submit" value="Create">Create</html:submit>
<html:submit property="submit" value="Update">Update</html:submit>
<html:submit property="submit" value="Delete">Delete</html:submit>
<input type="reset" value="Reset">

</html:form> 
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.1.1/jquery.min.js"></script>
 <script type="text/javascript" src="1.js"></script>
 