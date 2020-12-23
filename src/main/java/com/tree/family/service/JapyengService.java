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
    private Map<String, String> guyckBG(KanzhiVO kanzhi) {
        Map<String, String> rtnMap = new HashMap<>();
        String theory = null;   // 이론
        String explain = null;  // 풀이


        /**
         * 성격
         * 성격 1) : 관성이 투출하고 재와 인수가 있는 것
         * 성격 2) : 재가 투출하고 식상이 있는 것
         * 성격 3) : 식상이 투출하고 제복 된 것
         */
        /**
         * 파격
         * 파격 1) : 재관이 사주에 없는 것
         * 파격 2) : 칠살 투출한 것
         * 파격 3) : 인수가 투출한 것
         * 파격 etc)
        */

        // 성격 1) : 관성이 투출하고 재와 인수가 있는 것
        // 정관 투출
        if (kanzhi.getTopMonthFlesh().equals("JG") || kanzhi.getTopYearFlesh().equals("JG") || kanzhi.getTopHourFlesh().equals("JG")) {
            boolean flagPJorJJ = false;
            boolean flagJI = false;

            // 재가 있는 것
            if (kanzhi.getTopMonthFlesh().equals("PJ") || kanzhi.getTopYearFlesh().equals("PJ") || kanzhi.getTopHourFlesh().equals("PJ")
                    || kanzhi.getBottomYearFlesh().equals("PJ") || kanzhi.getBottomDayFlesh().equals("PJ") || kanzhi.getBottomHourFlesh().equals("PJ")
                || kanzhi.getTopMonthFlesh().equals("JJ") || kanzhi.getTopYearFlesh().equals("JJ") || kanzhi.getTopHourFlesh().equals("JJ")
                    || kanzhi.getBottomYearFlesh().equals("JJ") || kanzhi.getBottomDayFlesh().equals("JJ") || kanzhi.getBottomHourFlesh().equals("JJ")
            )
            {
                flagPJorJJ = true;
            }
            // 인수(정인)가 있는 것
            if (kanzhi.getTopMonthFlesh().equals("JI") || kanzhi.getTopYearFlesh().equals("JI") || kanzhi.getTopHourFlesh().equals("JI")
                    || kanzhi.getBottomYearFlesh().equals("JI") || kanzhi.getBottomDayFlesh().equals("JI") || kanzhi.getBottomHourFlesh().equals("JI")
            )
            {
                flagJI = true;
            }

            if (flagPJorJJ && flagJI) {
                theory = "자평진전 이론 : 관성이 투출하고 재와 인수가 있는 것";
                explain = "자평진전 풀이 : 성격";
            }

            rtnMap.put("japyeng_theory", theory);
            rtnMap.put("japyeng_explain", explain);
            return rtnMap;
        }


        return rtnMap;
    }
}