<%@ page language="java" contentType="text/html; charset=BIG5"
    pageEncoding="BIG5"
    import="Dao.porderDao"
    import="Model.porder"
    %>
<!DOCTYPE html>
<html>
<head>
<meta charset="BIG5">
<title>Insert title here</title>
</head>
<%
porder p=(porder)session.getAttribute("P");
%>
<body>
<table width=750 align=center border=1>
		<tr>
			<td height=150 align=center>
			<jsp:include page="title.jsp"/>
		<tr>
			<td height=450 align=center>
			<table width=400 align=center border=1>
				<tr>
					<td colspan=2 align=center>
					<h3>�q�槹��</h3>�o�O�A���I�\�ӥ�
				<tr>
					<td width=100>�ู
					<td><%=p.getDesk() %>
				<tr>
					<td>A�\
					<td><%=p.getA() %>
				<tr>
					<td>B�\
					<td><%=p.getB() %>
				<tr>
					<td>C�\
					<td><%=p.getC() %>
				<tr>
					<td>�@
					<td><%=p.getSum() %>��
				<tr>
					<td colspan=2 align=center>
					<a href="addOrder.jsp">���s�I�\</a>
					<DIV ALIGN="CENTER">
						<FORM>
						<INPUT NAME="print" TYPE="button" VALUE="�C�L����"
						ONCLICK="varitext()">
						</FORM>
					</DIV>
			</table>
				
		<tr>
			<td height=50 align=center>
			<jsp:include page="end.jsp"/>
	</table>
</body>
</html>