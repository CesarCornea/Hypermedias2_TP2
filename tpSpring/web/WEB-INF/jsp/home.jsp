<%-- 
    Document   : home
    Created on : 2018-12-08, 11:14:34
    Author     : admin
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>TP2 Spring | Home</title>
    </head>
    <body>
        <h1>${bienvenue}</h1>
        <div>Rechercher des programmeur par langages : <form style="display:inline"><input type="text" name="recherche"><button>Rechercher</button></form></div>
        <h3>Liste des programmeurs <c:if test="${not empty param.recherche}"> pour langage(s) "${param.recherche}"</c:if>:</h3>
        <ul>
            <c:forEach items="${programmeurs}" var="unProgrammeur">
                <li><a href="profil?u=${unProgrammeur.courriel}"><c:out value="${unProgrammeur.nom}" /></a></li>
            </c:forEach>
        </ul>
        <c:if test="${empty programmeurs}">
            <div>(Aucun programmeur à afficher)</div><br>
        </c:if>
        
        <a href="add">ajouter un programmeur</a>
    </body>
</html>
