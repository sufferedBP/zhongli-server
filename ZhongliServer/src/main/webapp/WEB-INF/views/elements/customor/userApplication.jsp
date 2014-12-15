<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://www.springframework.org/tags" prefix="s"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<div class="row">
	<div class="col-md-5">
		<form:form method="POST" action="user" modelAttribute="user"
			role="form">
			<h3>Zhongli user Application</h3>
			<hr class="featurette-divider">
			<div class="form-group erro">
				<form:label for="userName" path="">User Name</form:label> 
				<form:input type="text" class="form-control" id="userName" placeholder="Enter User Name" path="userName"/>
				<span class="label label-warning"><form:errors path="userName" /></span>
			</div>
			<div class="form-group">
				<form:label for="passWord" path="">Password</form:label> 
				<form:input type="password" class="form-control" id="passWord" placeholder="Enter Password" path="password"/>
				<span class="label label-warning"><form:errors path="password" /></span>
			</div>
			<div class="form-group">
				<form:label for="Re-passWord" path="rePassword">Re-type Password</form:label> 
				<form:input type="password" class="form-control" id="Re-passWord" placeholder="Enter Password" path="rePassword"/>
				<span class="label label-warning"><form:errors path="rePassword" /></span>
			</div>
			 <button type="submit" class="btn btn-default">Next</button>

		</form:form>
	</div>


</div>