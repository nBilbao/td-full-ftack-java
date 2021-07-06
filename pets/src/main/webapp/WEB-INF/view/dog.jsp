<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8" />
    <title>Dog Page</title>
</head>
<body>
    <p>
        <c:out value="${dog.showAffection()}"/>
    </p>
</body>
</html>