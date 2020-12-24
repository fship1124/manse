package com.tree.family.service;

import com.tree.family.model.KanzhiVO;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;

@Service
public class JapyengService {
    String theory = "기타";   // 이론
    String explain = "파격";  // 풀이

    public Map<String, String> defineGuyck(KanzhiVO kanzhi) {
        Map<String, String> rtnMap = new HashMap<>();
        String monthZhi = kanzhi.getBottomMonthFlesh();
        System.out.println(monthZhi);

        // 건록격
        if (monthZhi.equals("BG")) {
            rtnMap = guyckBG(kanzhi);

        // 겁재격
        } else if (monthZhi.equals("GJ")) {
            // 일간이 양간일 때 양인격
            if (kanzhi.getTopDay().equals("top11") || kanzhi.getTopDay().equals("top21") || kanzhi.getTopDay().equals("top31") || kanzhi.getTopDay().equals("top41") || kanzhi.getTopDay().equals("top51")) {
                System.out.println("양인격일 때");
                rtnMap = guyckGJ(kanzhi);
            // 건록격과 동일
            } else {
                rtnMap = guyckBG(kanzhi);
            }
        } else if (monthZhi.equals("SS")) {
            rtnMap = guyckSS(kanzhi);
        } else if (monthZhi.equals("SG")) {
            rtnMap = guyckSG(kanzhi);
        } else if (monthZhi.equals("JJ") || monthZhi.equals("PJ")) {
            rtnMap = guyckPJorJJ(kanzhi);
        } else if (monthZhi.equals("JG")) {
            rtnMap = guyckJG(kanzhi);
        } else if (monthZhi.equals("PG")) {
            rtnMap = guyckPG(kanzhi);
        } else if (monthZhi.equals("JI") || monthZhi.equals("PI")) {
            rtnMap = guyckPIorJI(kanzhi);
        }

        return rtnMap;
    }

    // 록겁격
    private Map<String, String> guyckBG(KanzhiVO kanzhi) {
        Map<String, String> rtnMap = new HashMap<>();

        /**
         * 성격
         * 성격 1) : 관성이 투출하고 재와 인수가 있는 것. 정관이 투출하고 재와 인수가 있으면 정관격과 동일하게 판단 된다.
         * 성격 2) : 재가 투출하고 식상이 있는 것. 재가 투출하고 식상이 있으면 재격과 동일하게 판단 된다.
         * 성격 3) : 칠살이 투출하고 제복 된 것. 칠살이 투출하고 제복이 있으면 칠살격과 동일하게 판단 된다.
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
                theory = "관성이 투출하고 재와 인수가 있는 것. 정관격과 동일하게 판단 된다.";
                explain = "성격";

                rtnMap.put("japyeng_theory", theory);
                rtnMap.put("japyeng_explain", explain);
                return rtnMap;
            }
        }

        // 성격 2) : 재가 투출하고 식상이 있는 것
        // 재가 투출 한 것
        if (kanzhi.getTopMonthFlesh().equals("PJ") || kanzhi.getTopYearFlesh().equals("PJ") || kanzhi.getTopHourFlesh().equals("PJ")
            || kanzhi.getTopMonthFlesh().equals("JJ") || kanzhi.getTopYearFlesh().equals("JJ") || kanzhi.getTopHourFlesh().equals("JJ")
        ) {
            // 식상이 있는 것
            if (kanzhi.getTopMonthFlesh().equals("SS") || kanzhi.getTopYearFlesh().equals("SS") || kanzhi.getTopHourFlesh().equals("SS")
                    || kanzhi.getBottomYearFlesh().equals("SS") || kanzhi.getBottomDayFlesh().equals("SS") || kanzhi.getBottomHourFlesh().equals("SS")
                    || kanzhi.getTopMonthFlesh().equals("SG") || kanzhi.getTopYearFlesh().equals("SG") || kanzhi.getTopHourFlesh().equals("SG")
                    || kanzhi.getBottomYearFlesh().equals("SG") || kanzhi.getBottomDayFlesh().equals("SG") || kanzhi.getBottomHourFlesh().equals("SG")
            ) {
                theory = "재가 투출하고 식상이 있는 것. 재격과 동일하게 판단 된다.";
                explain = "성격";

                rtnMap.put("japyeng_theory", theory);
                rtnMap.put("japyeng_explain", explain);
                return rtnMap;
            }
        }

        // 성격 3) : 칠살이 투출하고 제복 된 것
        if (kanzhi.getTopMonthFlesh().equals("PG") || kanzhi.getTopYearFlesh().equals("PG") || kanzhi.getTopHourFlesh().equals("PG")
        ) {
            // 식상이 있는 것
            if (kanzhi.getTopMonthFlesh().equals("SS") || kanzhi.getTopYearFlesh().equals("SS") || kanzhi.getTopHourFlesh().equals("SS")
                    || kanzhi.getBottomYearFlesh().equals("SS") || kanzhi.getBottomDayFlesh().equals("SS") || kanzhi.getBottomHourFlesh().equals("SS")
                    || kanzhi.getTopMonthFlesh().equals("SG") || kanzhi.getTopYearFlesh().equals("SG") || kanzhi.getTopHourFlesh().equals("SG")
                    || kanzhi.getBottomYearFlesh().equals("SG") || kanzhi.getBottomDayFlesh().equals("SG") || kanzhi.getBottomHourFlesh().equals("SG")
            ) {
                theory = "칠살이 투출하고 제복 된 것. 칠살격과 동일하게 판단 된다.";
                explain = "성격";

                rtnMap.put("japyeng_theory", theory);
                rtnMap.put("japyeng_explain", explain);
                return rtnMap;
            }
        }

        // 파격 1) : 재관이 사주에 없는 것
        if (!kanzhi.getTopMonthFlesh().equals("JG") && !kanzhi.getTopYearFlesh().equals("JG") && !kanzhi.getTopHourFlesh().equals("JG")
            || !kanzhi.getBottomYearFlesh().equals("JG") && !kanzhi.getBottomDayFlesh().equals("JG") && !kanzhi.getBottomHourFlesh().equals("JG")
            || !kanzhi.getTopMonthFlesh().equals("PG") && !kanzhi.getTopYearFlesh().equals("PG") && !kanzhi.getTopHourFlesh().equals("PG")
            || !kanzhi.getBottomYearFlesh().equals("PG") && !kanzhi.getBottomDayFlesh().equals("PG") && !kanzhi.getBottomHourFlesh().equals("PG")
        )
        {
            if (!kanzhi.getTopMonthFlesh().equals("JJ") && !kanzhi.getTopYearFlesh().equals("JJ") && !kanzhi.getTopHourFlesh().equals("JJ")
                    || !kanzhi.getBottomYearFlesh().equals("JJ") && !kanzhi.getBottomDayFlesh().equals("JJ") && !kanzhi.getBottomHourFlesh().equals("JJ")
                    || !kanzhi.getTopMonthFlesh().equals("PJ") && !kanzhi.getTopYearFlesh().equals("PJ") && !kanzhi.getTopHourFlesh().equals("PJ")
                    || !kanzhi.getBottomYearFlesh().equals("PJ") && !kanzhi.getBottomDayFlesh().equals("PJ") && !kanzhi.getBottomHourFlesh().equals("PJ")
            ) {
                theory = "재관이 사주에 없는 것";
                explain = "파격";

                rtnMap.put("japyeng_theory", theory);
                rtnMap.put("japyeng_explain", explain);
                return rtnMap;
            }
        }

        // 파격 2) : 칠살 투출한 것
        if (kanzhi.getTopMonthFlesh().equals("PG") || kanzhi.getTopYearFlesh().equals("PG") || kanzhi.getTopHourFlesh().equals("PG"))
        {
            theory = "칠살 투출하고 제복되지 않은 것";
            explain = "파격";

            rtnMap.put("japyeng_theory", theory);
            rtnMap.put("japyeng_explain", explain);
            return rtnMap;
        }

        // 파격 3) : 인수가 투출한 것
        if (kanzhi.getTopMonthFlesh().equals("PI") || kanzhi.getTopYearFlesh().equals("PI") || kanzhi.getTopHourFlesh().equals("PI")
            || kanzhi.getTopMonthFlesh().equals("JI") || kanzhi.getTopYearFlesh().equals("JI") || kanzhi.getTopHourFlesh().equals("JI")
        ) {
            theory = "인수가 투출한 것";
            explain = "파격";

            rtnMap.put("japyeng_theory", theory);
            rtnMap.put("japyeng_explain", explain);
            return rtnMap;
        }

        return rtnMap;
    }

    // 양인격
    private Map<String, String> guyckGJ(KanzhiVO kanzhi) {
        Map<String, String> rtnMap = new HashMap<>();

        /**
         * 성격
         * 성격 1) : 관살이 투출하고 재와 인수가 있고 상관이 없는 것
         */
        /**
         * 파격
         * 파격 1) : 관살이 없으면 파격
         * 파격 2) : 양인이 왕성하하고 식상이 있는 것
         */

        // 성격 1) : 관살이 투출하고 재와 인수가 있고 상관이 없는 것
        if (kanzhi.getTopMonthFlesh().equals("PG") || kanzhi.getTopYearFlesh().equals("PG") || kanzhi.getTopHourFlesh().equals("PG")
                || kanzhi.getTopMonthFlesh().equals("JG") || kanzhi.getTopYearFlesh().equals("JG") || kanzhi.getTopHourFlesh().equals("JG")
        ) {
            if (kanzhi.getTopMonthFlesh().equals("PJ") || kanzhi.getTopYearFlesh().equals("PJ") || kanzhi.getTopHourFlesh().equals("PJ")
                    || kanzhi.getBottomYearFlesh().equals("PJ") || kanzhi.getBottomDayFlesh().equals("PJ") || kanzhi.getBottomHourFlesh().equals("PJ")
                    || kanzhi.getTopMonthFlesh().equals("JJ") || kanzhi.getTopYearFlesh().equals("JJ") || kanzhi.getTopHourFlesh().equals("JJ")
                    || kanzhi.getBottomYearFlesh().equals("JJ") || kanzhi.getBottomDayFlesh().equals("JJ") || kanzhi.getBottomHourFlesh().equals("JJ")
            ) {
                if (kanzhi.getTopMonthFlesh().equals("PI") || kanzhi.getTopYearFlesh().equals("PI") || kanzhi.getTopHourFlesh().equals("PI")
                        || kanzhi.getBottomYearFlesh().equals("PI") || kanzhi.getBottomDayFlesh().equals("PI") || kanzhi.getBottomHourFlesh().equals("PI")
                        || kanzhi.getTopMonthFlesh().equals("JI") || kanzhi.getTopYearFlesh().equals("JI") || kanzhi.getTopHourFlesh().equals("JI")
                        || kanzhi.getBottomYearFlesh().equals("JI") || kanzhi.getBottomDayFlesh().equals("JI") || kanzhi.getBottomHourFlesh().equals("JI")
                ) {
                    if (!kanzhi.getTopMonthFlesh().equals("SS") || !kanzhi.getTopYearFlesh().equals("SS") || !kanzhi.getTopHourFlesh().equals("SS")
                            || !kanzhi.getBottomYearFlesh().equals("SS") || !kanzhi.getBottomDayFlesh().equals("SS") || !kanzhi.getBottomHourFlesh().equals("SS")
                            || !kanzhi.getTopMonthFlesh().equals("SG") || !kanzhi.getTopYearFlesh().equals("SG") || !kanzhi.getTopHourFlesh().equals("SG")
                            || !kanzhi.getBottomYearFlesh().equals("SG") || !kanzhi.getBottomDayFlesh().equals("SG") || !kanzhi.getBottomHourFlesh().equals("SG")
                    ) {
                        theory = "관살이 투출하고 재와 인수가 있고 상관이 없는 것";
                        theory += "<br> 월령이 양인이면 관살로 양인을 제압해야 하는데 이렇게 되면 가장 이상적이다.";
                        if (kanzhi.getPgCnt() >= 2) {
                            theory += "<br> 양인로살";
                            theory += "<br> 양인도 왕성하고 칠살도 강하면 권세가 혁혁하게 된다.";
                            theory += "<br> 월령이 양인이면 일원이 필연적으로 왕성하게 되므로 칠살을 용신으로 삼아 양인을 제압해야 한다는 뜻이니 바로 살인격을 일컫는다.";
                        }
                        theory += "<br> 인수는 양인을 강화시키고 재는 칠살을 강화시키니 재와 인수가 둘 다 있으면 좋다.";
                        theory += "<br> 이 경우에는 재와 인수가 상극하지 않는 위치에 있어야 함은 물론이다.";
                        explain = "성격";

                        rtnMap.put("japyeng_theory", theory);
                        rtnMap.put("japyeng_explain", explain);
                        return rtnMap;
                    }
                }
            }
        }

        // 파격 1) : 관살이 없는 것
        if (!kanzhi.getTopMonthFlesh().equals("JG") && !kanzhi.getTopYearFlesh().equals("JG") && !kanzhi.getTopHourFlesh().equals("JG")
                || !kanzhi.getBottomYearFlesh().equals("JG") && !kanzhi.getBottomDayFlesh().equals("JG") && !kanzhi.getBottomHourFlesh().equals("JG")
                || !kanzhi.getTopMonthFlesh().equals("PG") && !kanzhi.getTopYearFlesh().equals("PG") && !kanzhi.getTopHourFlesh().equals("PG")
                || !kanzhi.getBottomYearFlesh().equals("PG") && !kanzhi.getBottomDayFlesh().equals("PG") && !kanzhi.getBottomHourFlesh().equals("PG")
        ) {
            theory = "관살이 없는 것";
            explain = "파격";

            rtnMap.put("japyeng_theory", theory);
            rtnMap.put("japyeng_explain", explain);
            return rtnMap;
        }

        // 파격 2) : 양인이 왕성하고 식상이 있는 것


        return rtnMap;
    }

    // 식신격
    private Map<String, String> guyckSS(KanzhiVO kanzhi) {

        return null;
    }
    // 상관격
    private Map<String, String> guyckSG(KanzhiVO kanzhi) {

        return null;
    }
    // 재성격
    private Map<String, String> guyckPJorJJ(KanzhiVO kanzhi) {

        return null;
    }
    // 정관격
    private Map<String, String> guyckJG(KanzhiVO kanzhi) {

        return null;
    }
    // 편관격
    private Map<String, String> guyckPG(KanzhiVO kanzhi) {

        return null;
    }
    // 인수격
    private Map<String, String> guyckPIorJI(KanzhiVO kanzhi) {

        return null;
    }
}