package com.hasun.toy_servlets.survey;

import java.io.IOException;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashMap;

import com.hasun.toy_servlets.dao.PollWithDB;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet(urlPatterns = "/polls/PollServlet")
public class DetailServlets extends HttpServlet {
    @Override
    // a 태그(details.html에서 a 태그 사용)는 post가 아니라 get 사용
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // 클라이언트를 통해서 들어올때는 getParameter
        // input type
        String questions_uid = request.getParameter("QUESTIONS_UID");

        // biz with DB and Class
        PollWithDB pollWithDB = new PollWithDB();
        HashMap<String, Object> question = null;
        ArrayList<HashMap> example = new ArrayList<>();
        try {
            question = pollWithDB.getQuestion(questions_uid);
            example = pollWithDB.getExample(questions_uid);
        } catch (SQLException e) {
            e.printStackTrace();
        }

        // output with html
        request.setAttribute("question", question);
        request.setAttribute("example", example);

        
        RequestDispatcher requestDispatcher = request.getRequestDispatcher("/polls/details.jsp");
        requestDispatcher.forward(request, response);
    }
}
