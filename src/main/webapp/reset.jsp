<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<%@ taglib prefix="s" uri="/struts-tags" %>
<html>

<body>
<s:form action="reset">
<s:textfield name="new password" value ="new password"/>
<s:textfield name="confirm password" value ="confirm password"></s:textfield>
<s:submit></s:submit>
</s:form>
</body>
</html>