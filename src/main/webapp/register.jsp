<%@ taglib prefix="s" uri="/struts-tags" %>
<%--
  Created by IntelliJ IDEA.
  User: deca
  Date: 10/08/23
  Time: 5:21 pm
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Register</title>
</head>
<body>
<s:form action="registerAction">
    <s:textfield name="firstName" label="First Name" />
    <s:textfield name="lastName" label="Last Name" />
    <s:radio name="gender" list="{'Male', 'Female'}" label="Gender" />
    <s:textfield name="age" label="Age" />
    <s:textfield name="email" label="Email" />
    <s:textarea name="address" label="Address" cols="30" rows="10"></s:textarea>

    <s:reset value="Reset"></s:reset>
    <s:submit value="Register"></s:submit>
</s:form>

</body>
</html>
