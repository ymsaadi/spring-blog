<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>

<%@include file="templates/header.html" %>

<div class="container">
    <div class="row">
        <h1 style="text-align: center">Create a New Campground</h1>
        <div style="width: 30%; margin: 25px auto">
        	<form:form action="/Spring-Blog/blog/campgrounds/savecampground" modelAttribute="campground" method="POST">
        	
        		<form:hidden path="id" />
        	
        		<div class="form-group">
                    <form:input class="form-control" path="name" placeholder="name"/>
                </div>
                <div class="form-group">
                    <form:input class="form-control" path="image" placeholder="image url"/>
                </div>
                <div class="form-group">
                    <form:input class="form-control" path="description" placeholder="description"/>
                </div>
                <div class="form-group">
                    <button class="btn btn-lg btn-primary btn-block">Submit!</button>
                </div>
                
        	</form:form>
            
            
            
            <a href="/Spring-Blog/blog/campgrounds">Back</a>
        </div>
        
        <%@include file="templates/footer.html" %>
    </div>
</div>