<html>

<head>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<title>SE754 SpringBoot + JSP DEMO</title>
</head>

<body>
	<BR/>
	${name}, the items that are on your bid list are :
	 <c:forEach items="${lists}" var="entry">
           ID ${entry.id} <br/>
           name ${entry.name} <br/>
    </c:forEach>

</body>

</html>