<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html>
<head>
  <meta charset="utf-8">
  <title>个人信息页--酒店客房管理系统</title>
  <meta name="renderer" content="webkit">
  <meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">
  <meta name="viewport" content="width=device-width, initial-scale=1, maximum-scale=1">
  <meta name="apple-mobile-web-app-status-bar-style" content="black">
  <meta name="apple-mobile-web-app-capable" content="yes">
  <meta name="format-detection" content="telephone=no">
  <link rel="stylesheet" href="../layui/css/layui.css" media="all" />
  <link rel="stylesheet" href="../css/public.css" media="all" />
</head>
<body class="childrenBody">
<blockquote class="layui-elem-quote layui-bg-green">
  <div id="nowTime"></div>
</blockquote>
<div>
  <p>用户编号:<span>${user.id}</span></p>
  <p>用户姓名:<span>${user.username}</span></p>
  <p>用户电话:<span>${user.tel}</span></p>
  <p>用户角色:<span>${user.role}</span></p>
  <p>工作照:<span><img src="../images/233.jpg"></span></p>
</div>
<script type="text/javascript" src="../layui/layui.js"></script>
<script type="text/javascript" src="../js/main.js"></script>
<script type="text/javascript" src="../js/userSelf.js"></script>
</body>
</html>
