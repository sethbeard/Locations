<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Create Location</title>
</head>
<body>

<form action="updateLoc" method="post">
<pre>
Id: &nbsp;&nbsp;<input type="text" name="id" value="${location.id}"/>
Code: <input type="text" name="code" value="${location.code}"/>
Name: <input type ="text" name="name" value="${location.name}" }>
<!-- type: ${location.type} -->
Type: Urban <input type="radio" name="type" value="URBAN" ${location.type=='URBAN'?'checked':''}/>
	  Rural <input type="radio" name="type" value="RURAL" ${location.type=='RURAL'?'checked':''}/>
<input type="submit" value="save"/>
</pre>
</form>
${msg}
</br>
</br>

</body>
</html>