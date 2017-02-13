<#assign base = request.contextPath />
<!DOCTYPE html>
<html lang="zh-CN">
<head>
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <meta name="author" content="fyunli">

    <base id="base" href="${base}">
    <title>Spring Boot - hello Sudoku</title>

    <!-- Bootstrap core CSS -->
    <link href="//cdn.jsdelivr.net/bootstrap/3.3.6/css/bootstrap.min.css" rel="stylesheet">
    <link href="${base}/css/main.css" rel="stylesheet">

    <!-- HTML5 shim and Respond.js for IE8 support of HTML5 elements and media queries -->
    <!--[if lt IE 9]>
    <script src="//cdn.jsdelivr.net/html5shiv/3.7.3/html5shiv.min.js"></script>
    <script src="//cdn.jsdelivr.net/respond/1.4.2/respond.min.js"></script>
    <![endif]-->
</head>

<body>

<!-- Begin page content -->
<div class="container">
    <div class="page-header">
        <h1>Sprint Boot: Hello Sudoku</h1>
    </div>

    <div>
        Date: ${time?date}
        <br>
        Time: ${time?time}
        <br>
        ${message}
        <br><br>
        <#list sudoku as i>
            |
            <#list i as j>
                ${j}
                <#if 0==((j_index+1)%3)>
                    |
                </#if>
            </#list>
            <br>
            <#if  0==((i_index+1)%3)>
                <br>
            </#if>
        </#list>
    </div>
</div>

<footer class="footer">
    <div class="container">
        <p class="text-muted">©2017 Alex</p>
    </div>
</footer>


<!-- IE10 viewport hack for Surface/desktop Windows 8 bug -->
<script src="//cdn.jsdelivr.net/ie10-viewport/1.0.0/ie10-viewport.min.js"></script>
<script src="//cdn.jsdelivr.net/jquery/1.12.1/jquery.min.js"></script>
<script src="//cdn.jsdelivr.net/bootstrap/3.3.6/js/bootstrap.min.js"></script>
</body>
</html>