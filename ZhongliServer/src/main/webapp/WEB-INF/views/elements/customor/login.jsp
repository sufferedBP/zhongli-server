
<%@ taglib uri='http://java.sun.com/jsp/jstl/core' prefix='c'%>
<c:if test="${'fail' eq param.auth}">
	<div class="panel panel-primary">
</c:if>
<c:if test="${empty param.auth}">
	<div class="panel panel-primary">
</c:if>
<div class="panel-heading">
	<h3 class="panel-title">Please sign in</h3>
</div>
<div class="panel-body">
<form class="form-signin" role="form" action="/<c:url value='j_spring_security_check' />" method="post">
	<input name="userName" type="text" class="form-control"placeholder="User Name" required autofocus> 
	<input name="password" type="password" class="form-control" placeholder="Password" required>
	<br>
	<input type="checkbox" value="remember-me"> Remember me
	<br>
	<c:if test="${empty param.auth}">
		<button class="btn btn-lg btn-primary btn-block" type="submit">Signin</button>
	</c:if>
	<c:if test="${'fail' eq param.auth}">
		<span class="label label-warning">
			${sessionScope["SPRING_SECURITY_LAST_EXCEPTION"].message}</span>
		<button class="btn btn-lg btn-primary btn-block" type="submit">Signin</button>
	</c:if>
	
</form>
</div>
</div>
