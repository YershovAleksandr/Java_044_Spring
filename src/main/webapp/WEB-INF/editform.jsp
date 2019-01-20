<%@ taglib prefix='c' uri='http://java.sun.com/jsp/jstl/core' %>

<!DOCTYPE html>
<html>
<head>
<title>Edit Form</title>
</head>
<body>
<%@page import="com.nam.spring_44.dao.UserDao,com.nam.spring_44.bean.User"%>

<%
String id = request.getParameter("id");
User u = UserDao.getRecordById(Integer.parseInt(id));
%>

<h1>Edit Form</h1>
<form action="/edituser" method="post">
<input type="hidden" name="id" value="<%=u.getId() %>">
<table>
<tr>
<td>Name:</td>
<td><input type="text" name="name" value="<%= u.getName()%>"></td>
</tr>
<tr>
<td>Password:</td>
<td><input type="password" name="password" value="<%= u.getPassword()%>"></td>
</tr>
<tr>
<td>Email:</td>
<td><input type="email" name="email" value="<%= u.getEmail()%>"></td>
</tr>
<tr>
<td>Sex:</td>
<td>
<input type="radio" name="sex" value="male"

<%if (u.getSex().equals("male")){%>
checked
<%}%>

>Male
<input type="radio" name="sex" value="female"
<%if (u.getSex().equals("female")){%>
checked
<%}%>

>Female
</td>
</tr>
<tr>
<td>Country:</td>
<td>
<select name="country">
<option>Russia</option>
<option>Ukraine</option>
<option>Belarus</option>
<option>Kazakhstan</option>
<option>Other</option>
</select>
</td>
</tr>
<tr>
<td colspan="2"><input type="submit" value="Edit User"/></td>
</tr>
</table>
</form>

</body>
</html>