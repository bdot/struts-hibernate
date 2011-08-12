<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@taglib prefix="s" uri="/struts-tags" %>

<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">

<html xmlns="http://www.w3.org/1999/xhtml">
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8"/>
    <!-- TODO - Give relevant name -->
    <title>Struts-Hibernate CRUD App - Reeves</title>
    <link type="text/css" rel="stylesheet" href="/styles/crudapp.css"/>
</head>
<body>
<div class="content">
    <h1>List Of Users</h1>

    <div class="data">
        <s:a action="newUser" cssClass="add">Add New User</s:a>
        <br/><br/>
        <table border="0" cellpadding="4" cellspacing="0">
            <tr>
                <th>Id</th>
                <th>First Name</th>
                <th>Last Name</th>
                <th>Edit</th>
                <th>Delete</th>
            </tr>
            <s:iterator value="users" id="user">
                <tr>
                    <td><s:property value="%{#user.id}"/></td>
                    <td><s:property value="%{#user.firstName}"/></td>
                    <td><s:property value="%{#user.lastName}"/></td>
                    <td><s:a action="newUser?user.id=%{#user.id}" cssClass="edit"></s:a></td>
                    <td><s:a action="deleteUser?user.id=%{#user.id}" cssClass="delete"></s:a></td>
                </tr>
            </s:iterator>
        </table>
        <br/>
    </div>
</body>
</html>