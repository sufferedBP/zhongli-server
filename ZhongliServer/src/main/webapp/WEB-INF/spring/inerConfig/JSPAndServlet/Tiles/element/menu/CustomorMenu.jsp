
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions"%>
<div class="navbar navbar-default" role="navigation">
	<div class="container-fluid">
		<div class="navbar-header">
			<button type="button" class="navbar-toggle" data-toggle="collapse"
				data-target=".navbar-collapse">
				<span class="sr-only">Toggle navigation</span> <span
					class="icon-bar"></span> <span class="icon-bar"></span> <span
					class="icon-bar"></span>
			</button>
			<a class="navbar-brand"
				href="${pageData.components[0].textUnits[0].herf}">${pageData.components[0].textUnits[0].text_en}</a>
		</div>
		<div class="navbar-collapse collapse">
			<ul class="nav navbar-nav">
				<c:forEach items="${pageData.components[0].components}"
					var="menuUnit">
					<c:if test="${fn:length(menuUnit.textUnits) == 1}">
						<c:if
							test="${menuUnit.textUnits[0].herf == orgRequest}">
							<li class="active"><a href="${menuUnit.textUnits[0].herf}">${menuUnit.textUnits[0].text_en}</a></li>
						</c:if>
						<c:if
							test="${menuUnit.textUnits[0].herf != orgRequest}">
							<li><a href="${menuUnit.textUnits[0].herf}">${menuUnit.textUnits[0].text_en}</a></li>
						</c:if>
					</c:if>
					<c:if test="${fn:length(menuUnit.textUnits) > 1}">
						<li class="dropdown"><a href="#" class="dropdown-toggle"
							data-toggle="dropdown">${menuUnit.textUnits[0].text_en} <span
								class="caret"></span></a>
							<ul class="dropdown-menu" role="menu">
								<c:forEach items="${menuUnit.textUnits}" var="textUnit"
									varStatus="stat">
									<c:if test="${not stat.first}">
										<li><a href="${textUnit.herf}">${textUnit.text_en}</a></li>
									</c:if>
								</c:forEach>
								<li class="divider"></li>
								<li class="dropdown-header">Nav header</li>
							</ul></li>
					</c:if>
				</c:forEach>
			</ul>
			<ul class="nav navbar-nav navbar-right">
				<c:forEach items="${pageData.components[2].components}"
					var="menuUnit">
					<c:if test="${fn:length(menuUnit.textUnits) == 1}">
						<c:if
							test="${menuUnit.textUnits[0].herf == orgRequest}">
							<li class="active"><a href="${menuUnit.textUnits[0].herf}">${menuUnit.textUnits[0].text_en}</a></li>
						</c:if>
						<c:if
							test="${menuUnit.textUnits[0].herf != orgRequest}">
							<li><a href="${menuUnit.textUnits[0].herf}">${menuUnit.textUnits[0].text_en}</a></li>
						</c:if>
					</c:if>
					<c:if test="${fn:length(menuUnit.textUnits) > 1}">
						<li class="dropdown"><a href="#" class="dropdown-toggle"
							data-toggle="dropdown">${menuUnit.textUnits[0].text_en} <span
								class="caret"></span></a>
							<ul class="dropdown-menu" role="menu">
								<c:forEach items="${menuUnit.textUnits}" var="textUnit"
									varStatus="stat">
									<c:if test="${not stat.first}">
										<li><a href="${textUnit.herf}">${textUnit.text_en}</a></li>
									</c:if>
								</c:forEach>
								<li class="divider"></li>
								<li class="dropdown-header">Nav header</li>
							</ul></li>
					</c:if>
				</c:forEach>
			</ul>
		</div>
		<!--/.nav-collapse -->
	</div>
	<!--/.container-fluid -->
</div>

