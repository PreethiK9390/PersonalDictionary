<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<center>
<h1>YOUR WORD</h1>
<table style="border:dotted" cellspacing="15" cellpadding="5" borderspacing="0" width="50">
<tr>
<th style="border:dotted">Word</th>
<th style="border:dotted">Meaning</th>
</tr>
<tr>

<td style="border:dotted">
${word.word}
</td>
<td style="border:dotted">
${word.meaning}
</td>

</tr>
</table>
</center>
</body>
</html>