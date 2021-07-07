<%@ page import="java.util.List" %>
<%@ page import="com.hr.entity.User" %>
<html>
<body>
<%
    List<User> users = (List<User>) request.getAttribute("users");
    if (users != null){
        for (User user : users){
            out.print(user+"<br/>");
        }
    }

%>
</body>
</html>
