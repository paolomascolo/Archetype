<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1" 
	import="java.util.List"
	import="it.contrader.dto.UserDTO"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<link href="css/salvatorestyle.css" rel="stylesheet">
<title>User Manager</title>
</head>
<body>
<%@ include file="/css/header.jsp" %>

<div class="navbar">
  <a class="" href="homeadmin.jsp">Home</a>
  <a href="UserServlet?mode=userlist" class="active">Users</a>
  <a href="LogoutServlet" id="logout">Logout</a>
</div>
<div class="main">
	<%
		List<UserDTO> list = (List<UserDTO>) request.getAttribute("list");
	%>

<br>

	<table>
		<tr>
			<th>Username</th>
			<th>Password</th>
			<th>Usertype</th>
			<th>Action</th>
		</tr>
		<%
			for (UserDTO u : list) {
		%>
		<tr>
			<td><a href=UserServlet?mode=read&id=<%=u.getId()%>>
					<%=u.getUsername()%>
			</a></td>
			<td><%=u.getPassword()%></td>
			<td><%=u.getUsertype()%></td>
			<td><a class="edit" href=UserServlet?mode=read&update=true&id=<%=u.getId()%>></a>&nbsp;&nbsp;<!-- Blank fields -->
				<a class="delete" href=UserServlet?mode=delete&id=<%=u.getId()%>></a>	<!-- Icon links within themed actions  -->
			</td>

		</tr>
		<%
			}
		%>
	</table>



<form id="floatright" action="UserServlet?mode=insert" method="post">
  <div class="row">
    <div class="col-25">
      <label for="user">Username</label>
    </div>
    <div class="col-75">
      <input type="text" id="user" name="username" placeholder="Insert username" required style="width: 90%;">
    </div>
  </div>
  <div class="row">
    <div class="col-25">
     <label for="pass">Password</label>
    </div>
    <div class="col-75">
      <input type="text" id="pass" name="password" placeholder="Insert password" required style="width: 90%;"> 
    </div>
  </div>
  <div class="row">
    <div class="col-25">
      <label for="type">Usertype</label>
    </div>
   		 <div class="col-75">
 			<select id="type" name="usertype">
 				<option value="" disabled selected>Select Usertype</option>
  				<option value="ADMIN">ADMIN</option>
  				<option value="USER">USER</option>
 
			</select>
    	</div>
  </div>
      <button type="submit" >Insert</button>
</form>

</div>
<br>
<%@ include file="/css/footer.jsp" %>
</body>
</html>