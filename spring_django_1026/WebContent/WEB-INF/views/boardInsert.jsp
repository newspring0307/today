<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
</head>
<body>
 <form action="boardSave" method="post">
<center>
	<table>
		<tr>
			<th>
				��й�ȣ<input type="password" id="pwd" name="pwd">
			</th>
		</tr>
		<tr>
			<th>
				�ۼ���<input type="text" id="writer" name="writer" >
			</th>
		</tr>
	
		<tr>
			<th>
				����<input type="text" id="subject" name="subject">
			</th>
		</tr>
		<tr>
			<th>
				����<input type="text" id="content" name="content">
			</th>
		</tr>	
	</table>
	  <button type="submit" class="btn btn-default">�ۼ�</button>    
</center>
  </form>
</body>
</html>