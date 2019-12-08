<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<%@include file="templates/header.html" %>

<div style="background-color: #F3F3F3" class="container">
	<h1 style="text-align: center;">${ campground.name }</h1>

	<img style="width: 60%; margin: 0 20% 20px 20%;" src="${ campground.image }" alt="${ campground.name }">
	
	<p style="width: 60%; margin: 0 20%;">${ campground.description }</p>
	
	<a style="width: 60%; margin: 0 20%;" href="/Spring-Blog/blog/campgrounds">Back</a>
	
	<p style="width: 60%; margin: 20px 20%;">
		<c:url var="modifyLink" value="/blog/campground/modify">
			<c:param name="id" value="${ campground.id }"/>
		</c:url>
		<c:url var="deleteLink" value="/blog/campground/delete">
			<c:param name="id" value="${ campground.id }"/>
		</c:url>
		<a href="${ modifyLink }" class="btn btn-primary">Modify</a>
		<a href="${ deleteLink }" class="btn btn-primary">Delete</a>
	 </p>
</div>


<%@include file="templates/footer.html" %>