<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Personal Dictionary</title>

</head>
<body>
<center>
<h1>Personal Dictionary</h1>
<p><b>Add a new Word</b></p>
<form action="addNew">

<input type="text" name="word" placeholder="Word">
&nbsp&nbsp&nbsp&nbsp&nbsp
<input type="text" name="meaning" placeholder="Meaning">
<br><br><br>
<input type="submit" value="ADD" >
</center>
<br><br>
</form>
<center>
<form action ="findWord">
<b>Enter a word to search</b><br><br>
<input type="text" name ="word"><br><br>
<input type="submit" value="FETCH" >

</center>
</form>
</form>
<center>
<form action ="updateWord">
<b>Enter a word you want to update</b><br><br>
<input type="text" name ="word"><br><br>
<input type="text" name ="toMeaning"><br><br>
<input type="submit" value="UPDATE" >

</center>
</form>


</body>
</html>