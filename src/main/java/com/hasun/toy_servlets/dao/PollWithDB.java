package com.hasun.toy_servlets.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.HashMap;

public class PollWithDB {
    public HashMap<String, Object> getQuestion(String questionsUid) throws SQLException{
        Commons commons = new Commons();
        Statement statement = commons.getStatement();

        String query = "SELECT * FROM QUESTIONS_LIST " +
                        "WHERE QUESTIONS_UID = '"+questionsUid+"'";
        ResultSet resultSet = statement.executeQuery(query);
        HashMap<String, Object> result = null;
        while(resultSet.next()){
            result = new HashMap<>();
            result.put("QUESTIONS_UID", resultSet.getString("QUESTIONS_UID"));
            result.put("QUESTIONS", resultSet.getString("QUESTIONS"));
            result.put("ORDERS", resultSet.getInt("ORDERS"));
        }
        return result;
    }

    public ArrayList<HashMap> getExample(String questionsUid) throws SQLException{
        Commons commons = new Commons();
        Statement statement = commons.getStatement();

        String query = "SELECT example_list.EXAMPLE_UID, example_list.EXAMPLE, example_list.ORDERS " +
        "FROM answers inner Join example_list " +
        "on answers.EXAMPLE_UID = example_list.EXAMPLE_UID " +
        "WHERE QUESTIONS_UID = '"+questionsUid+"' ORDER BY ORDERS";

        ResultSet resultSet = statement.executeQuery(query);
        ArrayList<HashMap> answer = new ArrayList<>();
        HashMap<String, Object> example = null;
        while(resultSet.next()){
            example = new HashMap<>();
            example.put("ORDERS", resultSet.getInt("ORDERS"));
            example.put("EXAMPLE", resultSet.getString("EXAMPLE"));
            example.put("EXAMPLE_UID", resultSet.getString("EXAMPLE_UID"));

            answer.add(example);
        }
        return answer;
    }
}
