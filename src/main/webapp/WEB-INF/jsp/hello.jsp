<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>

<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Hello</title>
    </head>
    <body>
        <h1>Hello</h1>
        
        <form:form commandName="form" method="get" action="show">
            <form:label path="name">Name:</form:label>
            <form:input path="name" type="text" value="Insert here"/>
            <input type="submit" value="Press Me"/>
        </form:form>
    </body>
</html>
