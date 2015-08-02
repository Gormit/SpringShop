<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page isELIgnored="false" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring" %>
<%@ taglib uri="http://tiles.apache.org/tags-tiles" prefix="tiles" %>


<div class="span9">

    <table id="hello-table" class="table table-striped table-hover">
        <thead>
        <th>Наименование товара</th>
        <th>Цена</th>
        <th>Есть на складе</th>
        </thead>
        <tbody>
        <c:forEach var="good" items="${goods}">
            <tr>
                <td><a href="/shop/good/viewGood/${good.goodId}.do">${good.name}</a></td>
                <td>${good.price}</td>
                <td id="count">
                    <c:choose>
                        <c:when test="${good.count > 0}">
                            ${good.count}
                        </c:when>
                        <c:otherwise>
                            Прикинь, разобраллли!!!
                        </c:otherwise>
                    </c:choose>
                </td>
            </tr>
        </c:forEach>
        </tbody>
    </table>

</div>

