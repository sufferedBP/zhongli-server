
<%@ taglib uri="http://tiles.apache.org/tags-tiles" prefix="tiles"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<hr class="featurette-divider">
<footer>
	<p class="pull-right">
		<a href="#">Back to top</a>
	</p>
	<p>
		<c:forEach items="${pageData.components[1].textUnits}" var="textUnit">
			<c:if test="${not empty textUnit}">
				<c:if test="${not empty textUnit.herf}">
					<a href="${textUnit.herf}"> ${textUnit.text_en} </a>
				</c:if>
				<c:if test="${empty textUnit.herf}">
				<c:if test="${not empty textUnit.text_en}">
				${textUnit.text_en} 
			</c:if>
			</c:if>
			</c:if>
		&middot;
	</c:forEach>
	</p>
</footer>