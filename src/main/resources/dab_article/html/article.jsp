<%@include file="../../commun/commun.jspf"%>

<template:addResources type="css" resources="article.css" />

<jcr:nodeProperty node="${currentNode}" name="titre" var="titre"/>
<jcr:nodeProperty node="${currentNode}" name="chapo" var="chapo"/>
<jcr:nodeProperty node="${currentNode}" name="corps" var="corps"/>
<jcr:nodeProperty node="${currentNode}" name="visuel" var="visuel"/>
<jcr:nodeProperty node="${currentNode}" name="force" var="force"/>

<div class="article">
<div class="articleTitre">${titre.string}</div>
<c:if test="${! empty visuel.node.url}">
    <div class="articleImg"><img url="${visuel.node.url}"></div>
</c:if>
<div class="articleDesc">${chapo.string}</div>
</div>

