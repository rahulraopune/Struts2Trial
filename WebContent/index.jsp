<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Registration Page</title>
</head>
<body>
<h1>
<s:text name="global.title"></s:text>
</h1>
<s:form action="LoginAction">
<s:textfield  name="username"    key="global.username"></s:textfield>
<s:textfield  name="password"    key="global.password"></s:textfield>
<s:textfield  name="firstname"   key="global.firstname"></s:textfield>
<s:textfield  name="lastname"    key="global.lastname"></s:textfield>
<s:textfield  name="age"         key="global.age"></s:textfield>
<s:textfield  name="nationality" key="global.nationality"></s:textfield>
<s:submit     name="submit"      key="global.submit"></s:submit>
</s:form>

<s:url id="localeEN" namespace="/" action="Locale">
	<s:param name="request_locale">en</s:param>
</s:url>
<s:url id="localeDE" namespace="/" action="Locale">
	<s:param name="request_locale">de</s:param>
</s:url>
<s:url id="localeFR" namespace="/" action="Locale">
	<s:param name="request_locale">fr</s:param>
</s:url>


<s:a href="%{localeEN}" >English</s:a>
<s:a href="%{localeDE}" >German</s:a>
<s:a href="%{localeFR}" >France</s:a>

</body>
</html>