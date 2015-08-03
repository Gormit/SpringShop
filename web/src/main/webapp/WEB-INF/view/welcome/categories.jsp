<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page isELIgnored="false" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring" %>
<%@ taglib uri="http://tiles.apache.org/tags-tiles" prefix="tiles" %>


<div class="span9">

  <table id="hello-table" class="table table-striped table-hover">
    <thead>
    <th><spring:message code="table_text.category"/></th>
    </thead>
    <tbody>
    <c:forEach var="category" items="${categories}">
      <tr>
        <td><a href="/shop/category/view/${category.categoryId}.do">${category.categoryName}</a></td>
      </tr>
    </c:forEach>
    </tbody>
  </table>

</div>
