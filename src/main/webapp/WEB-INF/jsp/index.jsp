<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>

<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Hello</title>
    </head>
    <body>
        <h4>Option 1: URL</h4>
        
        <p>${message}</p>
        
        <h4>Option 2: Form</h4>
        
        <form:form commandName="form" method="get" action="${pageContext.request.contextPath}/show">
            <form:label path="name">Name:</form:label>
            <form:input path="name" type="text"/>
            <input type="submit" value="Press Me"/>
        </form:form>
        
    </body>
</html>
