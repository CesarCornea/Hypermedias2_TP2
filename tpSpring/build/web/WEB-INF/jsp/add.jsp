<%-- 
    Document   : add
    Created on : 2018-12-08, 15:39:38
    Author     : admin
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h3>ajouter un nouveau programmeur :</h3>
        <form:form method="post" modelAttribute="form">
            <form:label type="email" path="courriel">Courriel</form:label><br>
            <form:input path="courriel"></form:input><br>
            <form:label path="nom">Nom</form:label><br />
            <form:input path="nom"/><br />
            <form:label path="langages">langages</form:label><br />
            <form:input path="langages" /><br />
            <input type="submit" value="OK"/>
        </form:form>
    </body>
</html>
