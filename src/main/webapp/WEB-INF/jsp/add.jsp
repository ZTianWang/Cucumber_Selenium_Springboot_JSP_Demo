<html>
<head>
    <title>Add</title>
</head>

<body>
    <p> Add test </p>
    <form action="/test/add" method="post">
        <span>num1: </span><input type="text" name="num1" id="num1"/>
        <span>num1: </span><input type="text" name="num2" id="num2"/>
        <input type="submit" title="add" id="btnAdd">
    <form/>
    result: <label id="result">${result}</label>

</body>
</html>