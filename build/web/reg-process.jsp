<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
pageEncoding="ISO-8859-1"%>
<%@page import="java.sql.*,java.util.*"%>
<%
String uname=request.getParameter("name");
String uaddress=request.getParameter("address");
String uphone=request.getParameter("phone");
String uusername=request.getParameter("username");
String upassword=request.getParameter("password");
String uemail=request.getParameter("email");
try
{
Class.forName("com.mysql.jdbc.Driver");
Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/jspdatabase", "root", "");
Statement st=conn.createStatement();
int i=st.executeUpdate("insert into record(name,address,phone,username,password,email)values('"+uname+"','"+uaddress+"','"+uphone+"','"+uusername+"','"+upassword+"','"+uemail+"')");
out.println("Thank you for register ! Please <a href='back.html'>Login</a> to continue.");
}
catch(Exception e)
{
System.out.print(e);
e.printStackTrace();
}
%>