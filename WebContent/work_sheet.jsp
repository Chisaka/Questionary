<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
	<head>
		<meta charset="UTF-8">
		<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
		<title>秘密のアンケート</title>
	</head>
	<body>
	<% request.setCharacterEncoding("utf-8"); %>
	<h1>アンケート結果</h1>
	<hr>
	<ul>
		<li>性別 : <%= request.getParameter("sex") %></li>
		<li>年齢 : <%= request.getParameter("age") %></li>
		<li>職業 : <%= request.getParameter("job") %></li>
		<li>今日の気分</li>
		<%= request.getParameter("today") %>
	</ul><br>


	<p>ご協力ありがとうございました</p>

	</body>
</html>