<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>

<h1>User Loin</h1>
<form:form method="post" action="userLogin" modelAttribute="userForm">
	<table>
		<tr>
			<td>Name :</td>
			<td><form:input path="firstname" /></td>
		</tr>
		<tr>
			<td>Salary :</td>
			<td><form:input path="password" /></td>
		</tr>
		<tr>
			<td></td>
			<td><input type="submit" value="Login" /></td>
		</tr>
	</table>
</form:form>
