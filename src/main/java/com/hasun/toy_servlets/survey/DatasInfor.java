package com.hasun.toy_servlets.survey;

import java.util.ArrayList;
import java.util.HashMap;

public class DatasInfor {
    public ArrayList<PollListBean> getUserList(){
        ArrayList<PollListBean> user = new ArrayList<>();
        PollListBean pollListBean = new PollListBean();
        pollListBean.setName("배하선");
        pollListBean.setBelong("kh");
        user.add(pollListBean);
        return user;
    }

    public ArrayList<PollListBean> getPollBean(){
        ArrayList<PollListBean> pollList = new ArrayList<>();
        PollListBean pollListBean = new PollListBean();
        pollListBean.setName("배하선");
        pollListBean.setBelong("kh");
        pollListBean.setQuestion("해당 매장을 방문시 매장은 청결하였습니까?");
        pollListBean.setAnswer1("(1) 전혀 아니다");
        pollListBean.setAnswer2("(2) 아니다");
        pollList.add(pollListBean);

        PollListBean pollListBean2 = new PollListBean();
        pollListBean2.setQuestion("주문시 직원은 고객님께 친절하였습니까?");
        pollListBean2.setAnswer1("(1) 전혀 아니다");
        pollListBean2.setAnswer2("(2) 아니다");
        pollListBean2.setAnswer3("(3) 보통이다");
        pollList.add(pollListBean2);

        PollListBean pollListBean3 = new PollListBean();
        pollListBean3.setQuestion("주문하신 음료가 나오기까지 시간이 적당하였습니까?");
        pollListBean3.setAnswer1("(1)전혀 아니다");
        pollListBean3.setAnswer2("(2)아니다");
        pollList.add(pollListBean3);

        PollListBean pollListBean4 = new PollListBean();
        pollListBean4.setQuestion("해당 매장을 다음에도 재방문 하실 의향이 있으십니까?");
        pollListBean4.setAnswer1("(1)전혀 아니다");
        pollListBean4.setAnswer2("(2)아니다");
        pollListBean4.setAnswer3("(3)보통이다");
        pollListBean4.setAnswer4("(4)그렇다");
        pollListBean4.setAnswer5("(5)매우 그렇다");
        pollList.add(pollListBean4);

        PollListBean pollListBean5 = new PollListBean();
        pollListBean5.setQuestion("직원이 제조한 음료에 대해 맛은 좋았습니까?");
        pollListBean5.setAnswer1("(1)전혀 아니다");
        pollListBean5.setAnswer2("(2)아니다");
        pollListBean5.setAnswer3("(3)보통이다");
        pollList.add(pollListBean5);

        return pollList;
    }

    // public HashMap<String, Object> getPollsData(){
    //     HashMap<String, Object> pollsData = new HashMap<>();

    //     pollsData.put("userList",getUserList());
    //     pollsData.put("pollBean", getPollBean());

    //     return pollsData;
    // }
}
