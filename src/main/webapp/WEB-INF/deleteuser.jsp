<%@page import="com.nam.spring_44.dao.UserDao"%>
<jsp:useBean id="u" class="com.nam.spring_44.bean.User"></jsp:useBean>
<jsp:setProperty property="*" name="u"/>
<%
UserDao.delete(u);
response.sendRedirect("/viewusers");
%>