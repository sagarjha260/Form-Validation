<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<html>
<head>
	<title>Employee Saved Successfully</title>
</head>
<body>
<h3>
	Employee Saved Successfully.
</h3>

<strong>Employee ID:${emp.id}</strong><br>
<strong>Employee Name:${emp.name}</strong><br>
<strong>Employee Role:${emp.role}</strong><br>

</body>
</html>
