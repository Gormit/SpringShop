<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page isELIgnored="false" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring" %>
<%@ taglib uri="http://tiles.apache.org/tags-tiles" prefix="tiles" %>
<%@ taglib prefix="sec" uri="http://www.springframework.org/security/tags" %>

<html>
<head>
    <title>index</title>
</head>
<body>

<sec:authorize access="hasRole('ban')">
    <jsp:forward page="/ban.do"/>
    <%--<a href="ban.do">ban</a>--%>
</sec:authorize>

<sec:authorize access="hasAnyRole('admin', 'user', 'anonymous')">
    <jsp:forward page="/welcome.do"/>
</sec:authorize>

</body>
</html>
