<%-- 
    Document   : profil
    Created on : Dec 8, 2018, 3:42:02 PM
    Author     : Cesar
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>TP2 Spring | Profil</title>
    </head>
    <body>
        <h1>Profil de ${programmeur.nom}</h1>
        <h3>Son courriel : ${programmeur.courriel}</h3>
        <h3>Ses langages : ${programmeur.langages}</h3>
    </body>
</html>
