<%@ page import="kg.myproject.models.User" %>
<%@ page import="java.util.List" %>
<html>
<body>
<%
    List<User> users = (List<User>) request.getAttribute("users");
    User anUser = users.get(0);
    out.print(anUser.getName());
    out.print(anUser.getAge());
    out.print(anUser.getCountry());
%>
</body>
</html>
