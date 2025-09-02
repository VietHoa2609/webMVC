<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ page import="model.Survey" %>
<%
  Survey survey = (Survey) request.getAttribute("survey");
%>
<!DOCTYPE html>
<html>
<head>
  <meta charset="UTF-8">
  <title>Thanks for taking our survey!</title>
  <link rel="stylesheet" href="${pageContext.request.contextPath}/styles/survey.css">
</head>
<body>
  <div class="container">

    <!-- HERO header đỏ -->
    <div class="hero">
      <img src="${pageContext.request.contextPath}/images/murachlogo.jpg" alt="Murach Logo">
      <div>
        <h1>Thanks for taking our survey!</h1>
        <p>We appreciate your feedback. Here is the information you entered:</p>
      </div>
    </div>

    <!-- Thông tin hiển thị dạng thẻ -->
    <div class="card section">
      <h2>Your information</h2>
      <div class="kv">
        <div class="k">Full name</div><div class="v"><%= survey.getFullName() %></div>
        <div class="k">Email</div><div class="v"><%= survey.getEmail() %></div>
        <div class="k">Date of Birth</div><div class="v"><%= survey.getDob() %></div>
      </div>
    </div>

    <div class="card section">
      <h2>How did you hear about us?</h2>
      <strong><%= survey.getHeardFrom() %></strong>
    </div>

    <div class="card section">
      <h2>Announcements &amp; Special Offers</h2>
      <div class="kv">
        <div class="k">Receive announcements</div><div class="v"><%= survey.getReceiveAnnouncementsText() %></div>
        <div class="k">Email announcements</div><div class="v"><%= survey.getEmailAnnouncementsText() %></div>
      </div>
    </div>

    <div class="card section">
      <h2>Preferred contact method</h2>
      <strong><%= survey.getContact() %></strong>
    </div>

    <div class="actions">
      <button class="btn ghost" type="button" onclick="history.back()">Back</button>
    </div>
  </div>
</body>
</html>
