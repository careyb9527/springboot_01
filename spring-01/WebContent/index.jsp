<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf-8"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>Insert title here</title>
</head>
<body>



	<a href=testRedirect>testRedirect</a>
	<br>
	<a href="testview">testview</a>
	<br>
	<a href="testcookiesvalue">testcookiesvalue</a>
	<br>
	<a href="testrequestParam?username=carey&age=10">testrequestParam</a>
	<br>

	<form action="testAntPath2/1">
		<input type="hidden" value="PUT" /> <input type="submit"
			value="testPUT" />
	</form>

	<br>
	<form action="testAntPath2/1">
		<input type="hidden" value="DELETE" /> <input type="submit"
			value="testdelete" />
	</form>

	<br>
	<form action="testAntPath2/abc">
		<input type="submit" value="testpost" />
	</form>
	<br>
	<a href="testAntPath2/abc">testrest get</a>
	<br>

	<a href="testAntPath2/abc">映射路径匹配</a>

	<a href="testAntPath/hhhhhh/abc">映射路径匹配</a>
	<a href="helloword">hello word</a>

	<a href="testMethodAndHanders?username=zhangsan&age=1">handers</a>
	
	
	<br>
	<fmt:message key="i18n.username"></fmt:message>
	<br>
	<fmt:message key="i18n.password"></fmt:message>

	
</body>
</html>