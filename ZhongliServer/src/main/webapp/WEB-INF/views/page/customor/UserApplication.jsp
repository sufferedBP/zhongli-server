<%@ taglib uri="http://tiles.apache.org/tags-tiles" prefix="tiles" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
 
<tiles:insertDefinition name="customor">
    <tiles:putAttribute name="body">
 	<c:import url="../../elements/customor/userApplication.jsp"></c:import>
    </tiles:putAttribute>
</tiles:insertDefinition>