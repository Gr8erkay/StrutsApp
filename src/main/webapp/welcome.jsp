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
    <title>Welcome</title>
</head>
<body>
<h2>Registration Form</h2>
    <s:form action="testAction">
        <s:label value="First Name: " /> <s:property value="firstName" /> <br/>

        <s:label value="Last Name: " /> <s:property value="lastName" /> <br/>

        <s:label value="Age: " /> <s:property value="age" /> <br/>

        <s:label value="Gender: " /> <s:property value="gender" /> <br/>

        <s:label value="Email: " /> <s:property value="email" /> <br/>

        <s:label value="Address: " /> <s:property value="address" /> <br/>
    </s:form>
</body>

</html>
