<%-- 
    Document   : member_outcome
    Created on : Jun 19, 2018, 8:49:05 PM
    Author     : Lerato
--%>

<%@page import="org.json.JSONObject"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Member Outcome Page</title>
    </head>
    <body>
        <h1>Member Outcome Details :</h1>
        <form action="ActionMemberServlet.do" method="POST">
            <%
                String memberJSON = (String)request.getAttribute("member");
                JSONObject member = new JSONObject(memberJSON);
                JSONObject address = member.getJSONObject("address");
            %>
            <table>
                <tr>
                    <td>Member ID Number :</td>
                    <td><input type="text" name="id" value="<%=member.getLong("id")%>"></td>
                </tr>
                <tr>
                    <td>Member Name :</td>
                    <td><input type="text" name="name" value="<%=member.getString("name")%>"></td>
                </tr>
                <tr>
                    <td>Member Surname :</td>
                    <td><input type="text" name="surname" value="<%=member.getString("surname")%>"></td>
                </tr>
                <tr>
                    <td>Member Birth date :</td>
                    <td><input type="date" name="birthdate" value="<%=member.getString("birthdate")%>"></td>
                </tr>
                <tr>
                    <td>Member Email Address :</td>
                    <td><input type="email" name="emailaddresses" value="<%=member.getString("emailaddresses")%>"></td>
                </tr>
                <tr>
                    <td>Member Cell Number :</td>
                    <td><input type="text" name="cellnumbers" value="<%=member.getString("cellnumbers")%>"></td>
                </tr>
               <tr>
                    <td>Member Street :</td>
                    <td><input type="text" name="street" value="<%=address.getString("street")%>"></td>
                </tr>
                <tr>
                    <td>Member Location :</td>
                    <td><input type="text" name="area" value="<%=address.getString("area")%>"></td>
                </tr>
                <tr>
                    <td>Member Area Code :</td>
                    <td><input type="text" name="areaCode" value="<%=address.getString("areaCode")%>"></td>
                </tr>
                <tr>
                    <td></td>
                    <td><input type="submit" name="delete" value="Delete Member"></td>
                </tr>
            </table>
        </form>
    </body>
</html>
