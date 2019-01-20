<%@page import="com.nam.spring_44.dao.UserDao"%>
<jsp:useBean id="u" class="com.nam.spring_44.bean.User"></jsp:useBean>
<jsp:setProperty property="*" name="u" />

<%
int i = UserDao.save(u);
if (i > 0){
    response.sendRedirect("/adduser-success");
}else{
    response.sendRedirect("/adduser-error");
}
%>