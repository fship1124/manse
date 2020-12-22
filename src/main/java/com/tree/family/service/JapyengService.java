package com.tree.family.service;

import com.tree.family.model.KanzhiVO;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;

@Service
public class JapyengService {

    public Map<String, String> defineGuyck(KanzhiVO kanzhi) {

        String monthZhi = kanzhi.getBottomMonthFlesh();
        System.out.println(monthZhi);

        // 건록격
        if (monthZhi.equals("BG")) {
            guyckBG(kanzhi);

        // 겁재격
        } else if (monthZhi.equals("GJ")) {
            // 일간이 양간일 때 양인격
            if (kanzhi.getTopDay().equals("top11") || kanzhi.getTopDay().equals("top21") || kanzhi.getTopDay().equals("top31") || kanzhi.getTopDay().equals("top41") || kanzhi.getTopDay().equals("top51")) {
                System.out.println("양인격일 때");

            // 건록격과 동일
            } else {
                guyckBG(kanzhi);
            }
        } else if (monthZhi.equals("SS")) {

        } else if (monthZhi.equals("SG")) {

        } else if (monthZhi.equals("JJ")) {

        } else if (monthZhi.equals("PJ")) {

        } else if (monthZhi.equals("JG")) {

        } else if (monthZhi.equals("PG")) {

        } else if (monthZhi.equals("JI")) {

        } else if (monthZhi.equals("PI")) {

        }


        Map<String, String> map = new HashMap<>();

        return map;
    }

    // 건록격
    private Map<String, String> guyckBG(KanzhiVO kanzhiVO) {

        // 성격
        // 성격 1) : 관성이 투출하고 재와 인수가 있는 것
        // 성격 2) : 재가 투출하고 식상이 있는 것
        // 성격 3) : 식상이 투출하고 제복 된 것

        // 파격
        // 파격 1) : 재관이 사주에 없는 것
        // 파격 2) : 칠살이나 인수가 투출한 것
        // 파격 etc)



        return null;
    }


}
