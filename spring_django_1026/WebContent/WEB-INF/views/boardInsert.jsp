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
				비밀번호<input type="password" id="pwd" name="pwd">
			</th>
		</tr>
		<tr>
			<th>
				작성자<input type="text" id="writer" name="writer" >
			</th>
		</tr>
	
		<tr>
			<th>
				제목<input type="text" id="subject" name="subject">
			</th>
		</tr>
		<tr>
			<th>
				내용<input type="text" id="content" name="content">
			</th>
		</tr>	
	</table>
	  <button type="submit" class="btn btn-default">작성</button>    
</center>
  </form>
</body>
</html>