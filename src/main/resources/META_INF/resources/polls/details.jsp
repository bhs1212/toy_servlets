<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page import="java.util.HashMap, java.util.ArrayList" %>
<!DOCTYPE html>
<html lang="en">
<head>
  <meta charset="UTF-8">
  <meta http-equiv="X-UA-Compatible" content="IE=edge">
  <meta name="viewport" content="width=device-width, initial-scale=1.0">
  <title>Document</title>
  <link
      href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/css/bootstrap.min.css"
      rel="stylesheet"
      integrity="sha384-rbsA2VBKQhggwzxH7pPCaAqO46MgnOM80zW1RWuH61DGLwZJEdK2Kadq2F9CUG65"
      crossorigin="anonymous"
    />
</head>
<body>
  <% 
    HashMap<String, Object> question = (HashMap<String, Object>) request.getAttribute("question"); 
  %>
  <%
    ArrayList<HashMap> example = (ArrayList<HashMap>) request.getAttribute("example");
  %>
    <div>
      <a href="/polls/PollServlet?QUESTIONS_UID=Q1">Q1</a> /
      <a href="/polls/PollServlet?QUESTIONS_UID=Q2">Q2</a> /
      <a href="/polls/PollServlet?QUESTIONS_UID=Q3">Q3</a> /
      <a href="/polls/PollServlet?QUESTIONS_UID=Q4">Q4</a> /
      <a href="/polls/PollServlet?QUESTIONS_UID=Q5">Q5</a> 
    </div>
    <div>
      <%= question.get("ORDERS") %>. <%= question.get("QUESTIONS")%>
    </div>
    <div>
      <% for(int i = 0; i < example.size(); i++) { %>
        (<%= example.get(i).get("ORDERS")%>) <%= example.get(i).get("EXAMPLE") %>
      <% } %>
    </div>
    <script
      src="https://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/js/bootstrap.bundle.min.js"
      integrity="sha384-kenU1KFdBIe4zVF0s0G1M5b4hcpxyD9F7jL+jjXkk+Q2h455rYXK/7HAuoJl+0I4"
      crossorigin="anonymous"
    ></script>
</body>
</html>