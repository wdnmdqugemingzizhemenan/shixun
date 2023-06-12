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
<div style="padding: 20px" >
  <%--编号在数据库中通过索引自动生成--%>
  <div>
          <span>
          <label class="layui-form-label">用户编号:</label>
            <input type="text" name="id" style="width: 200px;"
                   class="layui-input" value="${user.id}" readonly></span>
  </div>
  <div>
        <span>
        <label class="layui-form-label">用户编码:</label>
          <input type="text" name="username" style="width: 200px;"
                 class="layui-input" value="${user.username}" readonly></span>
  </div>
  <div>
        <span>
        <label class="layui-form-label">密码:</label>
          <input type="password" name="password" style="width: 200px;" class="layui-input"
                 value="${user.password}" readonly></span>
  </div>
  <div>
        <span>
        <label class="layui-form-label">电话:</label>
          <input type="text" name="tel" style="width: 200px;" class="layui-input"
                 value="${user.tel}" readonly></span>
  </div>
  <div>
        <span>
        <label class="layui-form-label">角色:</label>
          <input type="text" name="tel" style="width: 200px;" class="layui-input"
                 value="${user.role}" readonly></span>
  </div>
  <div>
    <label>工作照片:</label>
    <span><img id="a_workPic" src="../images/233.jpg" alt=""/></span>
  </div>
</div>
<script type="text/javascript" src="../layui/layui.js"></script>
<script type="text/javascript" src="../js/main.js"></script>
<script type="text/javascript" src="../js/userSelf.js"></script>

</body>
</html>
