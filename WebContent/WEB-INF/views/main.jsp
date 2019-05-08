<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>${message}</h1>
	
	<form:form action="${pageContext.request.contextPath}/formData" method="POST" modelAttribute="product">
		<label>Ingrese el nombre del producto: </label>
		<form:input type="text" name="nombre" path="nombre"/>
		<form:errors path="nombre" cssStyle="color:#E81505;"/>
		<br>
		<label>Ingese la marca del producto: </label>
		<form:input type="text" name="marca" path="marca"/>
		<form:errors path="marca" cssStyle="color:#E81505;"></form:errors>
		<br>
		<label>Ingrese la descripcion del producto: </label>
		<form:input type="text" name="descripcion" path="descripcion"/>
		<form:errors path="descripcion" cssStyle="color:#E81505;"></form:errors>
		<br>
		<label>Ingrese el precio del producto: </label>
		<form:input type="text" name="precio" path="precio"/>
		<form:errors path="precio" cssStyle="color:#E81505;"></form:errors>
		<br>
		<label>Ingrese la fecha de vencimiento del producto: </label>
		<form:input type="text" name="fecha_de_expiracion" path="fecha_de_expiracion"/>
		<form:errors path="fecha_de_expiracion" cssStyle="color:#E81505;"></form:errors>
		<br>
		<input type="submit" value= "Agregar producto"/>
	</form:form>
</body>
</html>