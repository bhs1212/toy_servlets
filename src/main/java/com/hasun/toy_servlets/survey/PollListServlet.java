package com.hasun.toy_servlets.survey;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.HashMap;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet(urlPatterns = "/pollListServlet")
public class PollListServlet extends HttpServlet {
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
        DatasInfor datasInfor = new DatasInfor();
        ArrayList<PollListBean> pollListBean = datasInfor.getPollBean();
        ArrayList<PollListBean> pollListBean2 = datasInfor.getUserList();
        PrintWriter printWriter = response.getWriter();
        response.setContentType("text/html;charset=UTF-8");

    }
}
