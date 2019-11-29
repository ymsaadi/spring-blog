<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<%@include file="templates/header.html" %>

<div class="container">
    <header class="jumbotron">
        <div class="container">
            <h1>Welcome To YelpCamp!</h1>
            <p>View our hand-picked campgrounds from all over the world</p>
            <p>
                <a class="btn btn-primary btn-large" href="/Spring-Blog/blog/campgrounds/new">Add New Campground</a>
            </p>
        </div>
    </header>

    <div class="row text-center" style="display: flex; flex-wrap: wrap;">
    	<c:forEach items="${ campgrounds }" var="campground">
    		<div class="col-md-3 col-sm-6">
                <div class="thumbnail">
                        <img src="${ campground.image }" alt="${ campground.name }">
                        <div class="caption">
                            <h4>${ campground.name }</h4>
                        </div>
                </div>
            </div>
    	</c:forEach>
    </div>

</div>

<%@include file="templates/footer.html" %>