<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Login status</title>
</head>
<body>

	<c:if test="${not empty success}">
		<strong>${success}</strong>
	</c:if>

	<c:if test="${not empty failure}">
		<strong>${failure}</strong>
	</c:if>

</body>
</html>