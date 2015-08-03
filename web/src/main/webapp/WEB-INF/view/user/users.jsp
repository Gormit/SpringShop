<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page isELIgnored="false" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring" %>
<%@ taglib uri="http://tiles.apache.org/tags-tiles" prefix="tiles" %>


<div class="span9">

    <table id="hello-table" class="table table-striped table-hover">
        <thead>
        <th>Mail</th>
        <th>Role</th>
        </thead>
        <tbody>
        <c:forEach var="user" items="${users}">
            <tr>
                <td>
                    ${user.mail}
                </td>
                <td>
                    ${user.role.name}
                </td>
            </tr>
        </c:forEach>
        </tbody>
    </table>

</div>
