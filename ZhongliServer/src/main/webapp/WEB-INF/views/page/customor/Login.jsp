<%@ taglib uri="http://tiles.apache.org/tags-tiles" prefix="tiles"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<tiles:insertDefinition name="customor">
	<tiles:putAttribute name="body">
		<br>
		<br>
		<br>
		<br>
		<br>
		<div class="row">
			<div class="container center-block">
				<div class="col-md-4"></div>
				<div class="col-md-4">
					<c:import url="../../elements/customor/login.jsp" />
				</div>
				<div class="col-md-4"></div>
			</div>
		</div>
		<br>
		<br>
		<br>
		<br>
		<br>
		<br>
		<br>
	</tiles:putAttribute>
</tiles:insertDefinition>