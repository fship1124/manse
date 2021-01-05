package com.tree.family.service;

import com.tree.family.model.Body;
import com.tree.family.model.KanzhiVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;

@Service
public class JapyengService {
    @Autowired
    StrongFlagService strongFlagService;

    String theory = "기타";   // 이론
    String explain = "파격";  // 풀이

    public Map<String, String> defineGyeog(KanzhiVO kanzhi) {
        Map<String, String> rtnMap = new HashMap<>();
        String monthZhi = kanzhi.getBottomMonthFlesh();
        System.out.println(monthZhi);

        // 건록격
        if (monthZhi.equals(Body.Type.BG.name())) {
            rtnMap = guyckBG(kanzhi);

        // 겁재격
        } else if (monthZhi.equals(Body.Type.GJ.name())) {
            // 일간이 양간일 때 양인격
            if (kanzhi.getTopDay().equals(Body.Type.top11.name()) || kanzhi.getTopDay().equals("top21") || kanzhi.getTopDay().equals("top31") || kanzhi.getTopDay().equals("top41") || kanzhi.getTopDay().equals("top51")) {
                rtnMap = guyckGJ(kanzhi);
                rtnMap.put("japyeng_gyeog", "양인격");
            // 건록격과 동일
            } else {
                rtnMap = guyckBG(kanzhi);
                rtnMap.put("japyeng_gyeog", "건록격");
            }
        } else if (monthZhi.equals("SS")) {
            rtnMap = guyckSS(kanzhi);
            rtnMap.put("japyeng_gyeog", "식신격");
        } else if (monthZhi.equals("SG")) {
            rtnMap = guyckSG(kanzhi);
            rtnMap.put("japyeng_gyeog", "상관격");
        } else if (monthZhi.equals("JJ") || monthZhi.equals("PJ")) {
            rtnMap = guyckPJorJJ(kanzhi);
            rtnMap.put("japyeng_gyeog", "재성격");
        } else if (monthZhi.equals("JG")) {
            rtnMap = guyckJG(kanzhi);
            rtnMap.put("japyeng_gyeog", "정관격");
        } else if (monthZhi.equals("PG")) {
            rtnMap = guyckPG(kanzhi);
            rtnMap.put("japyeng_gyeog", "편관격");
        } else if (monthZhi.equals("JI") || monthZhi.equals("PI")) {
            rtnMap = guyckPIorJI(kanzhi);
            rtnMap.put("japyeng_gyeog", "인수격");
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

        theory = "...";
        explain = "파격";

        rtnMap.put("japyeng_theory", theory);
        rtnMap.put("japyeng_explain", explain);
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
        int bg_gj_cnt = kanzhi.getBgCnt() + kanzhi.getGjCnt();
        if (bg_gj_cnt >= 2) {
            if (kanzhi.getTopMonthFlesh().equals("SS") || kanzhi.getTopYearFlesh().equals("SS") || kanzhi.getTopHourFlesh().equals("SS")
                    || kanzhi.getBottomYearFlesh().equals("SS") || kanzhi.getBottomDayFlesh().equals("SS") || kanzhi.getBottomHourFlesh().equals("SS")
                    || kanzhi.getTopMonthFlesh().equals("SG") || kanzhi.getTopYearFlesh().equals("SG") || kanzhi.getTopHourFlesh().equals("SG")
                    || kanzhi.getBottomYearFlesh().equals("SG") || kanzhi.getBottomDayFlesh().equals("SG") || kanzhi.getBottomHourFlesh().equals("SG")
            ) {
                theory = "양인이 왕성하고 식상이 있는 것";
                theory += "<br> 양인이 왕성하면 식상을 용신으로 삼아 왕성한 양인의 기세를 설기해도 좋다.";
                theory += "<br> 하지만 일단 관살을 용신으로 삼아 양인을 제압하는 경우에는 식신과 상관을 용신으로 삼지 못할 뿐만 아니라 식상이 사주에 없어야 비로소 양인격이 성격이 될 수 있다.";
                explain = "파격";

                rtnMap.put("japyeng_theory", theory);
                rtnMap.put("japyeng_explain", explain);
                return rtnMap;
            }
        }

        theory = "...";
        explain = "파격";

        rtnMap.put("japyeng_theory", theory);
        rtnMap.put("japyeng_explain", explain);
        return rtnMap;
    }

    // 식신격
    private Map<String, String> guyckSS(KanzhiVO kanzhi) {
        Map<String, String> rtnMap = new HashMap<>();

        /**
         * 성격
         * 성격 1) : 식신생재
         *           월령이 식신이고 사주에 재가 있다면 식신생재가 되니 격이 올바르게 된 것이다.
         *           월령이 식신이고 사주에 재성이 있으면 식신의 기가 유통되는 것인데 이때는 비견 겁재가 있으면 좋지 않다.
         *      2) : 식신제살
         *           식신과 칠살이 있고 재가 없거나
         *           월령이 식신인데 칠살이 투출하면 식신이 칠살을 제압하는 용신이 될 수 있으며 이럴 때는 재가 있어서 칠살을 돕지 않아야 하므로 재가 없어야 좋다.
         *      3) : 식신을 버리고 칠살을 취해야 할 경우에 인수가 투출한 것
         *           만약 칠살이 왕성하고 인수가 투출했다면 식신을 버리고 칠살을 취하게 되는데 식신으로 제살하지 못하고 인수를 용신으로 삼아 화살하여야 한다.
         *           한 가지 주의할 것이 있다면 식신을 버리고 칠살을 취하는 사주는 비록 월령에 식신이 있다고 해도 식신격의 일반 원리로 논하지 않는다.
         *           만약 효신탈식(편인이 식신을 파괴함)의 형세가 되었다면 식신을 버리고 칠살을 취해야 하니(신강한데 관살과 식상이 대립하면 편인의 극을 당하므로 무력한 식신을 버리고 칠살을 씀) 이 역시 격이 이루어졌다고 하겠다.
         *      4) : 식신봉효
         *           월령이 식신이고 사주에 편인이 있으면 그 편인이 식신을 파괴하는 형상이니 마땅히 재성을 써서 편인을 제압하고 식신을 보호해야 한다.
         *
         */
        /**
         * 파격
         * 파격 1) : 효신탈식
         *           식신이 효신(편인)을 만나거나
         * 파격 2) : 재와 칠살이 모두 있으면
         */

        // 1) 식신생재
        // 월령이 식신이고 사주에 재가 있다면 식신생재가 되니 격이 올바르게 된 것이다.
        // 월령이 식신이고 사주에 재성이 있으면 식신의 기가 유통되는 것인데 이때는 비견 겁재가 있으면 좋지 않다.
        if (kanzhi.getTopMonthFlesh().equals("PJ") || kanzhi.getTopYearFlesh().equals("PJ") || kanzhi.getTopHourFlesh().equals("PJ")
                || kanzhi.getBottomYearFlesh().equals("PJ") || kanzhi.getBottomDayFlesh().equals("PJ") || kanzhi.getBottomHourFlesh().equals("PJ")
                || kanzhi.getTopMonthFlesh().equals("JJ") || kanzhi.getTopYearFlesh().equals("JJ") || kanzhi.getTopHourFlesh().equals("JJ")
                || kanzhi.getBottomYearFlesh().equals("JJ") || kanzhi.getBottomDayFlesh().equals("JJ") || kanzhi.getBottomHourFlesh().equals("JJ")
        ) {
            theory = "식신생재";
            theory += "<br> 월령이 식신이고 사주에 재가 있다면 식신생재가 되니 격이 올바르게 된 것이다.";
            theory += "<br> 월령이 식신이고 사주에 재성이 있으면 식신의 기가 유통되는 것인데 이때는 비견 겁재가 있으면 좋지 않다.";

            if ((kanzhi.getBgCnt() + kanzhi.getGjCnt()) >= 2) {
                explain = "파격";
            } else {
                explain = "성격";
            }

            rtnMap.put("japyeng_theory", theory);
            rtnMap.put("japyeng_explain", explain);
            return rtnMap;
        }

         //2) : 식신제살
         //     식신과 칠살이 있고 재가 없거나
         //     월령이 식신인데 칠살이 투출하면 식신이 칠살을 제압하는 용신이 될 수 있으며 이럴 때는 재가 있어서 칠살을 돕지 않아야 하므로 재가 없어야 좋다.
        if (kanzhi.getPgCnt() >= 1) {
            if ((kanzhi.getPjCnt() + kanzhi.getJjCnt()) == 0) {
                theory = "식신제살";
                theory += "<br> 식신과 칠살이 있고 재가 없거나";
                theory += "<br> 월령이 식신인데 칠살이 투출하면 식신이 칠살을 제압하는 용신이 될 수 있으며 이럴 때는 재가 있어서 칠살을 돕지 않아야 하므로 재가 없어야 좋다.";
                explain = "성격";

                rtnMap.put("japyeng_theory", theory);
                rtnMap.put("japyeng_explain", explain);
                return rtnMap;
            }
        }

         //      3) : 식신을 버리고 칠살을 취해야 할 경우에 인수가 투출한 것
         //           만약 칠살이 왕성하고 인수가 투출했다면 식신을 버리고 칠살을 취하게 되는데 식신으로 제살하지 못하고 인수를 용신으로 삼아 화살하여야 한다.
         //           한 가지 주의할 것이 있다면 식신을 버리고 칠살을 취하는 사주는 비록 월령에 식신이 있다고 해도 식신격의 일반 원리로 논하지 않는다.
         //           만약 효신탈식(편인이 식신을 파괴함)의 형세가 되었다면 식신을 버리고 칠살을 취해야 하니(신강한데 관살과 식상이 대립하면 편인의 극을 당하므로 무력한 식신을 버리고 칠살을 씀) 이 역시 격이 이루어졌다고 하겠다.
        if (kanzhi.getPgCnt() >= 2) {
            if (kanzhi.getTopMonthFlesh().equals("PI") || kanzhi.getTopYearFlesh().equals("PI") || kanzhi.getTopHourFlesh().equals("PI")
                    || kanzhi.getTopMonthFlesh().equals("JI") || kanzhi.getTopYearFlesh().equals("JI") || kanzhi.getTopHourFlesh().equals("JI")
            ) {
                theory = "식신을 버리고 칠살을 취해야 할 경우에 인수가 투출한 것";
                theory += "<br> 한 가지 주의할 것이 있다면 식신을 버리고 칠살을 취하는 사주는 비록 월령에 식신이 있다고 해도 식신격의 일반 원리로 논하지 않는다.";
                theory += "<br> 한 가지 주의할 것이 있다면 식신을 버리고 칠살을 취하는 사주는 비록 월령에 식신이 있다고 해도 식신격의 일반 원리로 논하지 않는다.";
                theory += "<br> 만약 효신탈식(편인이 식신을 파괴함)의 형세가 되었다면 식신을 버리고 칠살을 취해야 하니(신강한데 관살과 식상이 대립하면 편인의 극을 당하므로 무력한 식신을 버리고 칠살을 씀) 이 역시 격이 이루어졌다고 하겠다.";
                explain = "성격";

                if (kanzhi.getBottomYearFlesh().equals("PI") || kanzhi.getBottomDayFlesh().equals("PI")
                ) {
                    theory = "효신탈식";
                    explain = "파격";
                }
            }

            rtnMap.put("japyeng_theory", theory);
            rtnMap.put("japyeng_explain", explain);
            return rtnMap;
        }

        // 4) : 식신봉효
        //      월령이 식신이고 사주에 편인이 있으면 그 편인이 식신을 파괴하는 형상이니 마땅히 재성을 써서 편인을 제압하고 식신을 보호해야 한다.
        if (kanzhi.getPiCnt() >= 1) {
            if ((kanzhi.getPjCnt() + kanzhi.getJjCnt()) >= 1) {
                theory = "식신봉효";
                theory = "<br> 월령이 식신이고 사주에 편인이 있으면 그 편인이 식신을 파괴하는 형상이니 마땅히 재성을 써서 편인을 제압하고 식신을 보호해야 한다.";
                explain = "성격";

                rtnMap.put("japyeng_theory", theory);
                rtnMap.put("japyeng_explain", explain);
                return rtnMap;
            }
        }

        // 파격 1) : 효신탈식
        //           식신이 효신(편인)을 만나거나
        if (kanzhi.getBottomYearFlesh().equals("PI") || kanzhi.getBottomDayFlesh().equals("PI")
        ) {
            theory = "효신탈식";
            theory = "<br> 식신이 효신(편인)을 만나거나";
            explain = "파격";

            rtnMap.put("japyeng_theory", theory);
            rtnMap.put("japyeng_explain", explain);
            return rtnMap;
        }

        // 파격 2) : 재와 칠살이 모두 있다
        if ((kanzhi.getPjCnt() + kanzhi.getJjCnt()) >= 1) {
            if (kanzhi.getPgCnt() >= 1) {
                theory = "<br> 재와 칠살이 모두 있다";
                explain = "파격";

                rtnMap.put("japyeng_theory", theory);
                rtnMap.put("japyeng_explain", explain);
                return rtnMap;
            }
        }

        theory = "...";
        explain = "파격";

        rtnMap.put("japyeng_theory", theory);
        rtnMap.put("japyeng_explain", explain);
        return rtnMap;
    }

    // 상관격
    private Map<String, String> guyckSG(KanzhiVO kanzhi) {
        Map<String, String> rtnMap = new HashMap<>();

        /**
         * 성격
         * 성격 1) : 상관생재
         *           신강하다면 재를 용신으로 삼는다.
         *      2) : 상관패인
         *           신약하다면 인수를 용신으로 삼는다. 상관이 왕성하고 인수가 뿌리가 있으면 운에서 인수가 오면 좋다.
         *      3) : 상관이 왕하고 신약한데 칠살과 인수가 동시에 투출한 것
         *           상관이 왕성하고 일주가 약한데 칠살과 인수가 동시에 투출했다면 당연히 인수가 용신이 디어 상관을 제압해야 하는데 이런 경우에는 칠살이 인수를 생조하게 되니 결국에는 일주를 돕는 역할을 하게 되므로 일원을 돕는 칠살과 인수가 용신이 된다.
         *      4) : 상관가살
         *           상관격에 칠살만 있고 재가 없는 것
         *           비록 월령의 상관격이 인수를 용신으로 삼는 것이 원칙이라 하지만 칠살만 있고 재가 없다면 식신제살격과 마찬가지로 상관가살(상관이 칠살을 제어함)이 되어 칠살을 제복하게 되는 것인데 이 경우에는 재가 있어서 칠살을 생하면 아니 된다. 그러므로 제가 없어야 상관가살격이 성립된다.
         *
         */
        /**
         * 파격
         * 파격 1) : 금수상관격을 제외하고 정관이 있는 상관격
         * 파격 2) : 상관생재가 되면서 칠살이 있는 것
         * 파격 3) : 상관은 미약한데 신강하고 인수가 있는 것
         */


        // 성격 1) : 상관생재
        //           신강하다면 재를 용신으로 삼는다.
        boolean isStrong = strongFlagService.strongFlag(kanzhi);

        if (isStrong) {
            if ((kanzhi.getPjCnt() + kanzhi.getJjCnt()) >= 1) {
                theory = "상관생재";
                theory = "<br> 신강하다면 재를 용신으로 삼는다.";
                explain = "성격";

                rtnMap.put("japyeng_theory", theory);
                rtnMap.put("japyeng_explain", explain);
                return rtnMap;
            }
        }

        //      2) : 상관패인
        //           신약하다면 인수를 용신으로 삼는다. 상관이 왕성하고 인수가 뿌리가 있으면 운에서 인수가 오면 좋다.
        if (!isStrong) {
            if ((kanzhi.getSgCnt() + kanzhi.getSsCnt()) >= 2) {
                if (kanzhi.getBottomYearFlesh().equals(Body.Type.PI.name()) || kanzhi.getBottomDayFlesh().equals(Body.Type.PI.name()) || kanzhi.getBottomHourFlesh().equals(Body.Type.PI.name())
                || kanzhi.getBottomYearFlesh().equals(Body.Type.PI.name()) || kanzhi.getBottomDayFlesh().equals(Body.Type.PI.name()) || kanzhi.getBottomHourFlesh().equals(Body.Type.PI.name())) {
                    theory = "상관패인";
                    theory = "<br> 신약하다면 인수를 용신으로 삼는다. 상관이 왕성하고 인수가 뿌리가 있으면 운에서 인수가 오면 좋다.";
                    explain = "성격";

                    rtnMap.put("japyeng_theory", theory);
                    rtnMap.put("japyeng_explain", explain);
                    return rtnMap;
                }
            }
        }

        //      3) : 상관이 왕하고 신약한데 칠살과 인수가 동시에 투출한 것
        //           상관이 왕성하고 일주가 약한데 칠살과 인수가 동시에 투출했다면 당연히 인수가 용신이 되어 상관을 제압해야 하는데 이런 경우에는 칠살이 인수를 생조하게 되니 결국에는 일주를 돕는 역할을 하게 되므로 일원을 돕는 칠살과 인수가 용신이 된다.
        if (!isStrong) {
            if ((kanzhi.getSgCnt() + kanzhi.getSsCnt()) >= 2) {
                if ((kanzhi.getTopMonthFlesh().equals("PG") || kanzhi.getTopYearFlesh().equals("PG") || kanzhi.getTopHourFlesh().equals("PG"))
                        && (kanzhi.getTopMonthFlesh().equals("PI") || kanzhi.getTopYearFlesh().equals("PI") || kanzhi.getTopHourFlesh().equals("PI")
                            || kanzhi.getTopMonthFlesh().equals("JI") || kanzhi.getTopYearFlesh().equals("JI") || kanzhi.getTopHourFlesh().equals("JI")
                            )
                )
                {
                    theory = "상관이 왕하고 신약한데 칠살과 인수가 동시에 투출한 것";
                    theory = "<br> 상관이 왕성하고 일주가 약한데 칠살과 인수가 동시에 투출했다면 당연히 인수가 용신이 되어 상관을 제압해야 하는데 이런 경우에는 칠살이 인수를 생조하게 되니 결국에는 일주를 돕는 역할을 하게 되므로 일원을 돕는 칠살과 인수가 용신이 된다.";
                    explain = "성격";

                    rtnMap.put("japyeng_theory", theory);
                    rtnMap.put("japyeng_explain", explain);
                    return rtnMap;
                }
            }
        }

        // 파격 1) : 금수상관격을 제외하고 정관이 있는 상관격
        if (kanzhi.getJgCnt() >= 1) {
            theory = "금수상관격을 제외하고 정관이 있는 상관격";
            explain = "파격";

            rtnMap.put("japyeng_theory", theory);
            rtnMap.put("japyeng_explain", explain);
            return rtnMap;
        }

        // 파격 2) : 상관생재가 되면서 칠살이 있는 것
        if ((kanzhi.getPjCnt() + kanzhi.getJjCnt()) >= 1) {
            if (kanzhi.getPgCnt() >= 1) {
                theory = "상관생재가 되면서 칠살이 있는 것";
                explain = "파격";

                rtnMap.put("japyeng_theory", theory);
                rtnMap.put("japyeng_explain", explain);
                return rtnMap;
            }
        }


        // 파격 3) : 상관은 미약한데 신강하고 인수가 있는 것
        if ((kanzhi.getSgCnt() + kanzhi.getSsCnt()) == 1) {
            if (isStrong) {
                if ((kanzhi.getPiCnt() + kanzhi.getJiCnt()) >= 1) {
                    theory = "상관은 미약한데 신강하고 인수가 있는 것";
                    explain = "파격";

                    rtnMap.put("japyeng_theory", theory);
                    rtnMap.put("japyeng_explain", explain);
                }
            }
        }

        theory = "...";
        explain = "파격";

        rtnMap.put("japyeng_theory", theory);
        rtnMap.put("japyeng_explain", explain);
        return rtnMap;
    }

    // 재성격
    private Map<String, String> guyckPJorJJ(KanzhiVO kanzhi) {
        Map<String, String> rtnMap = new HashMap<>();

        /**
         * 성격
         * 성격 1) : 재왕생관
         *           재가 왕성해서 정관을 생하는 것은 월령의 재가 왕하고 사주에 정관이 있어서 왕성한 재가 스스로 관성을 생해 주는 상태가 되는 것이다.
         *      2) : 재투식신
         *           식신이 재를 생하면서 신강하고 비견이 있거나,
         *           월령이 재성인데 사주에 식신이 투출한 것이니 겁재의 기운을 식신이 설하여 재성을 보호하는 것
         *           월령이 재인데 신강하고 식신이 투출하면, 식신이 설수(일간의 기운을 설기하는 것)하여 재를 생하는 것이다.
         *           재는 본래 비견 겁재의 겁탈을 꺼리는 것이지만 식신이 있으면 꺼리지 않고 오히려 좋을 수도 있다. 이는 신강한데 식신이 비견과 겁재의 기운을 빼내어 재를 생하게 만들기 때문이다.
         *      3) : 인수가 투출하여 그 위치가 적절하여 재와 인수가 서로 극하지 않아야 할 것
         *           년간에 인수가 있고 시간에 재가 있는데 월간에 비견이나 겁재가 있어서 재가 인수를 극하지 못하는 것과 같은 경우를 가리킨다.
         *
         */
        /**
         * 파격
         * 파격 1) : 재가 경미한테 비겁이 많거나
         * 파격 2) : 재가 투출하고 칠살이 있는 것은 파격
         */

        boolean isStrong = strongFlagService.strongFlag(kanzhi);

        // 성격 1) : 재왕생관
        //           재가 왕성해서 정관을 생하는 것은 월령의 재가 왕하고 사주에 정관이 있어서 왕성한 재가 스스로 관성을 생해 주는 상태가 되는 것이다.
        if ((kanzhi.getPgCnt() + kanzhi.getJjCnt()) >= 3) {
            if (kanzhi.getJgCnt() >= 1) {
                theory = "재왕생관";
                theory = "<br> 재가 왕성해서 정관을 생하는 것은 월령의 재가 왕하고 사주에 정관이 있어서 왕성한 재가 스스로 관성을 생해 주는 상태가 되는 것이다.";
                explain = "성격";

                rtnMap.put("japyeng_theory", theory);
                rtnMap.put("japyeng_explain", explain);
                return rtnMap;
            }
        }

         //      2) : 재투식신
         //           식신이 재를 생하면서 신강하고 비견이 있거나,
         //           월령이 재성인데 사주에 식신이 투출한 것이니 겁재의 기운을 식신이 설하여 재성을 보호하는 것
         //           월령이 재인데 신강하고 식신이 투출하면, 식신이 설수(일간의 기운을 설기하는 것)하여 재를 생하는 것이다.
         //           재는 본래 비견 겁재의 겁탈을 꺼리는 것이지만 식신이 있으면 꺼리지 않고 오히려 좋을 수도 있다. 이는 신강한데 식신이 비견과 겁재의 기운을 빼내어 재를 생하게 만들기 때문이다.
        if (isStrong) {
            if (kanzhi.getTopMonthFlesh().equals("SS") || kanzhi.getTopYearFlesh().equals("SS") || kanzhi.getTopHourFlesh().equals("SS")
            ) {
                theory = "재투식신";
                theory = "<br> 식신이 재를 생하면서 신강하고 비견이 있거나,";
                theory = "<br> 월령이 재성인데 사주에 식신이 투출한 것이니 겁재의 기운을 식신이 설하여 재성을 보호하는 것";
                theory = "<br> 월령이 재인데 신강하고 식신이 투출하면, 식신이 설수(일간의 기운을 설기하는 것)하여 재를 생하는 것이다.";
                theory = "<br> 재는 본래 비견 겁재의 겁탈을 꺼리는 것이지만 식신이 있으면 꺼리지 않고 오히려 좋을 수도 있다. 이는 신강한데 식신이 비견과 겁재의 기운을 빼내어 재를 생하게 만들기 때문이다.";
                explain = "성격";

                rtnMap.put("japyeng_theory", theory);
                rtnMap.put("japyeng_explain", explain);
                return rtnMap;
            }
        }

        //      3) : 인수가 투출하여 그 위치가 적절하여 재와 인수가 서로 극하지 않아야 할 것
        //          년간에 인수가 있고 시간에 재가 있는데 월간에 비견이나 겁재가 있어서 재가 인수를 극하지 못하는 것과 같은 경우를 가리킨다.
        if (kanzhi.getTopYearFlesh().equals(Body.Type.PI.name()) || kanzhi.getTopHourFlesh().equals(Body.Type.PI.name())
            || kanzhi.getTopYearFlesh().equals(Body.Type.JI.name()) || kanzhi.getTopHourFlesh().equals(Body.Type.JI.name())
        ) {
            theory = "인수가 투출하여 그 위치가 적절하여 재와 인수가 서로 극하지 않아야 할 것";
            theory = "<br> 년간에 인수가 있고 시간에 재가 있는데 월간에 비견이나 겁재가 있어서 재가 인수를 극하지 못하는 것과 같은 경우를 가리킨다.";
            explain = "성격";

            rtnMap.put("japyeng_theory", theory);
            rtnMap.put("japyeng_explain", explain);
            return rtnMap;
        }


        // 파격 1) : 재가 경미한테 비겁이 많거나
        if ((kanzhi.getPjCnt() + kanzhi.getJjCnt()) == 1) {
            if ((kanzhi.getBgCnt() + kanzhi.getGjCnt()) >= 3) {
                theory = "재가 경미한테 비겁이 많거나";
                explain = "파격";

                rtnMap.put("japyeng_theory", theory);
                rtnMap.put("japyeng_explain", explain);
                return rtnMap;
            }
        }

        // 파격 2) : 재가 투출하고 칠살이 있는 것
        if (kanzhi.getPgCnt() >= 1) {
            if (kanzhi.getTopYearFlesh().equals(Body.Type.PJ.name()) || kanzhi.getTopMonthFlesh().equals(Body.Type.PJ.name()) || kanzhi.getTopHourFlesh().equals(Body.Type.PJ.name())
                || kanzhi.getTopYearFlesh().equals(Body.Type.JJ.name()) || kanzhi.getTopMonthFlesh().equals(Body.Type.JJ.name()) || kanzhi.getTopHourFlesh().equals(Body.Type.JJ.name())
            ) {
                theory = "재가 투출하고 칠살이 있는 것";
                explain = "파격";

                rtnMap.put("japyeng_theory", theory);
                rtnMap.put("japyeng_explain", explain);
                return rtnMap;
            }
        }

        theory = "...";
        explain = "파격";

        rtnMap.put("japyeng_theory", theory);
        rtnMap.put("japyeng_explain", explain);
        return rtnMap;
    }

    // 정관격
    private Map<String, String> guyckJG(KanzhiVO kanzhi) {
        Map<String, String> rtnMap = new HashMap<>();

        /**
         * 성격
         * 성격 1) : 재와 인수를 만나면서 형충파해가 없어야 됨
         *           정관이 있는데 재와 인수가 있다는 것은 월령이 정관인데, 신왕하고 정관이 약할 경우에 사주에 재가 있어서 정관을 생조해 주는 경우와, 신약하고 정관이 강할 경우에 사주에 인수가 있어서 관인상생하는 경우를 말한다.
         *           정관격에 재와 인수가 둘 다 있을 때는 반드시 재와 인수가 서로 극하지 않는 위치에 있어야 정관격이 성격이 될 수 있다.
         *           형충파해가 있으면 정관격이 파격이 된다고 하는데 특히 충이 있으면 파격이 될 소지가 많다. 충이란 곧 극이다.
         *           예컨데 목이 정관인데 충을 당한다면 이는 곧 상관인 금으로부터 충을 당한다는 말이니 정관이 파괴되고 만다.
         *           형파해는 잘 살펴보고 참작해서 정관이 파괴되는지 아닌지를 분별해야 하며 형파해가 있다고 해서 무턱대고 정관격이 파격이 되었다고 하면 안된다.
         *      2) : 정관패인
         *           월령이 정관인 경우에 인성을 용신으로 삼아 화관(관성의 기운을 인성으로 설기)하거나
         *           혹은 식상이 정관에게 장애를 초래할 경우에 인성을 용신으로 삼아 식상을 제거하고 정관을 보호하는 것을 말한다.
         *
         */
        /**
         * 파격
         * 파격 1) : 정관이 상관으로부터 극을 당하거나 형충을 당한 것
         */

        boolean isStrong = strongFlagService.strongFlag(kanzhi);

         // 성격 1) : 재와 인수를 만나면서 형충파해가 없어야 됨
         //           정관이 있는데 재와 인수가 있다는 것은 월령이 정관인데, 신왕하고 정관이 약할 경우에 사주에 재가 있어서 정관을 생조해 주는 경우와, 신약하고 정관이 강할 경우에 사주에 인수가 있어서 관인상생하는 경우를 말한다.
         //           정관격에 재와 인수가 둘 다 있을 때는 반드시 재와 인수가 서로 극하지 않는 위치에 있어야 정관격이 성격이 될 수 있다.
         //           형충파해가 있으면 정관격이 파격이 된다고 하는데 특히 충이 있으면 파격이 될 소지가 많다. 충이란 곧 극이다.
         //           예컨데 목이 정관인데 충을 당한다면 이는 곧 상관인 금으로부터 충을 당한다는 말이니 정관이 파괴되고 만다.
         //           형파해는 잘 살펴보고 참작해서 정관이 파괴되는지 아닌지를 분별해야 하며 형파해가 있다고 해서 무턱대고 정관격이 파격이 되었다고 하면 안된다.
        if ((kanzhi.getPjCnt() + kanzhi.getJjCnt()) >= 1) {
            if ((kanzhi.getPiCnt() + kanzhi.getJiCnt()) >= 1) {
                theory = "재와 인수를 만나면서 형충파해가 없어야 됨";
                theory = "<br> 정관이 있는데 재와 인수가 있다는 것은 월령이 정관인데, 신왕하고 정관이 약할 경우에 사주에 재가 있어서 정관을 생조해 주는 경우와, 신약하고 정관이 강할 경우에 사주에 인수가 있어서 관인상생하는 경우를 말한다.";
                theory = "<br> 정관격에 재와 인수가 둘 다 있을 때는 반드시 재와 인수가 서로 극하지 않는 위치에 있어야 정관격이 성격이 될 수 있다.";
                theory = "<br> 형충파해가 있으면 정관격이 파격이 된다고 하는데 특히 충이 있으면 파격이 될 소지가 많다. 충이란 곧 극이다.";
                theory = "<br> 예컨데 목이 정관인데 충을 당한다면 이는 곧 상관인 금으로부터 충을 당한다는 말이니 정관이 파괴되고 만다.";
                theory = "<br> 형파해는 잘 살펴보고 참작해서 정관이 파괴되는지 아닌지를 분별해야 하며 형파해가 있다고 해서 무턱대고 정관격이 파격이 되었다고 하면 안된다.";
                explain = "성격";

                rtnMap.put("japyeng_theory", theory);
                rtnMap.put("japyeng_explain", explain);
                return rtnMap;
            }
        }


        // 파격 1) : 정관이 상관으로부터 극을 당하거나 형충을 당한 것
        if (kanzhi.getBottomYearFlesh().equals(Body.Type.SG.name()) || kanzhi.getBottomDayFlesh().equals(Body.Type.SG.name())) {
            theory = "정관이 상관으로부터 극을 당하거나 형충을 당한 것";
            explain = "파격";

            rtnMap.put("japyeng_theory", theory);
            rtnMap.put("japyeng_explain", explain);
            return rtnMap;
        }

        theory = "...";
        explain = "파격";

        rtnMap.put("japyeng_theory", theory);
        rtnMap.put("japyeng_explain", explain);
        return rtnMap;
    }

    // 편관격
    private Map<String, String> guyckPG(KanzhiVO kanzhi) {
        Map<String, String> rtnMap = new HashMap<>();
        boolean isStrong = strongFlagService.strongFlag(kanzhi);

        /**
         * 성격
         * 성격 1) : 식신이 칠살을 제복하는 것
         *           월령에 편관이 있고 신강하다면 식신을 용신으로 삼아 제살하는 것
         *           만약 신강하고 칠살이 미약하거나 그와 반대로 칠살이 강하고 신약하다면 이 모두 칠살을 제복하는 식신을 용신으로 삼을 수 없다. 신살양정(일주와 칠살이 균형을 이룸)이 되어야 비로소 칠살격이 성격이 되는 것이다.
         * 성격 2) : 월령이 칠살이고 사주에 식신이 너무 많아서 제살태과하면 인성으로 식신을 제압해야 한다.
         * 성격 3) : 살격봉인
         *           월령이 칠살이면 일원이 필연적으로 쇠약하게 마련이므로 일지와 시지에 양인을 용신으로 삼아 칠상에 대항해야 한다는 것이다.
         *
         */
        /**
         * 파격
         * 파격 1) : 칠살이 재를 만나고 식신의 제복이 없으면
         */


         // 성격 1) : 식신이 칠살을 제복하는 것
         //           월령에 편관이 있고 신강하다면 식신을 용신으로 삼아 제살하는 것
         //           만약 신강하고 칠살이 미약하거나 그와 반대로 칠살이 강하고 신약하다면 이 모두 칠살을 제복하는 식신을 용신으로 삼을 수 없다. 신살양정(일주와 칠살이 균형을 이룸)이 되어야 비로소 칠살격이 성격이 되는 것이다.
         if (isStrong) {
             if (kanzhi.getSsCnt() >= 1) {
                 theory = "식신이 칠살을 제복하는 것";
                 theory = "<br> 월령에 편관이 있고 신강하다면 식신을 용신으로 삼아 제살하는 것";
                 theory = "<br> 만약 신강하고 칠살이 미약하거나 그와 반대로 칠살이 강하고 신약하다면 이 모두 칠살을 제복하는 식신을 용신으로 삼을 수 없다. 신살양정(일주와 칠살이 균형을 이룸)이 되어야 비로소 칠살격이 성격이 되는 것이다.";
                 explain = "성격";

                 rtnMap.put("japyeng_theory", theory);
                 rtnMap.put("japyeng_explain", explain);
                 return rtnMap;
             }
         }

        // 성격 2) : 월령이 칠살이고 사주에 식신이 너무 많아서 제살태과하면 인성으로 식신을 제압해야 한다.
        if ((kanzhi.getSsCnt() + kanzhi.getSgCnt()) >= 3) {
            if ((kanzhi.getPiCnt() + kanzhi.getJiCnt()) >= 1) {
                theory = "월령이 칠살이고 사주에 식신이 너무 많아서 제살태과하면 인성으로 식신을 제압해야 한다.";
                explain = "성격";

                rtnMap.put("japyeng_theory", theory);
                rtnMap.put("japyeng_explain", explain);
                return rtnMap;
            }
        }

        // 성격 3) : 살격봉인
        //           월령이 칠살이면 일원이 필연적으로 쇠약하게 마련이므로 일지와 시지에 양인을 용신으로 삼아 칠살에 대항해야 한다는 것이다.
        if (kanzhi.getBottomDayFlesh().equals(Body.Type.GJ.name()) || kanzhi.getBottomHourFlesh().equals(Body.Type.GJ.name())) {
            theory = "월령이 칠살이면 일원이 필연적으로 쇠약하게 마련이므로 일지와 시지에 양인을 용신으로 삼아 칠살에 대항해야 한다는 것이다.";
            explain = "성격";

            rtnMap.put("japyeng_theory", theory);
            rtnMap.put("japyeng_explain", explain);
            return rtnMap;
        }

        // 파격 1) : 칠살이 재를 만나고 식신의 제복이 없으면
        if ((kanzhi.getPjCnt() + kanzhi.getJjCnt()) >= 2) {
            if (kanzhi.getSsCnt() < 1) {
                theory = "칠살이 재를 만나고 식신의 제복이 없으면";
                explain = "파격";

                rtnMap.put("japyeng_theory", theory);
                rtnMap.put("japyeng_explain", explain);
                return rtnMap;
            }
        }

        theory = "...";
        explain = "파격";

        rtnMap.put("japyeng_theory", theory);
        rtnMap.put("japyeng_explain", explain);
        return rtnMap;
    }

    // 인수격
    private Map<String, String> guyckPIorJI(KanzhiVO kanzhi) {
        Map<String, String> rtnMap = new HashMap<>();
        boolean isStrong = strongFlagService.strongFlag(kanzhi);

        /**
         * 성격
         * 성격 1) : 관인쌍전
         *           인수가 경한데 칠살이 있어서 약한 인수를 생조하거나
         *           월령에 인수가 있으나 인수가 미약하여 칠살이 인수를 생하거나, 정관이 인수를 생하면 관인쌍전이 된다.
         * 성격 2) : 신인양왕(일간과 인수가 둘 다 왕성함)한데 식상을 써서 설기하거나
         *           신강하고 인수가 왕성하면 인수를 용신으로 쓰지 못하고 식상을 용신으로 삼아서 일주의 기운을 설기해야 한다.
         * 성격 3) : 인수가 많은데 재가 천간에 투출하고 재의 뿌리가 약한 것
         *           인수가 지나치게 많다면 인수를 파손하는 재를 용신을 삼는다.
         *           예컨대 토가 많아서 금이 매몰되거나 수가 많아서 목이 표류할 경우에는 필히 그 지나친 것(인수)를 제거하고 그 부족한 것을 보충하는 것(재성)으로 용신을 삼는다.
         *           사주의 재가 통근하지 못하고 인수가 지나치게 많아 재가 인수를 파손할 역량이 부족하여 용신으로 쓰기 힘들 경우도 있다.
         *           반대로 사주 원국에 재가 지나치게 왕성하다면 인수가 전멸할 우려가 있으니 이때는 오히려 비견 겁재로 재를 제압하여 인수를 보호하는 것이 좋다.
         * 성격 4) : 인수용관
         *           월령이 인수인 경우에 일원이 인수의 생조를 받아 왕성해지므로 사주의 천간에 정관이 투출하고 다시 재성이 있어서 정관을 생해 주면 관은 맑고 인수는 바르니 관인쌍전하는 것이다. 비록 같은 관인쌍전의 격국이라 해도 정관격에 인수를 용신으로 삼는 경우에는 재성이 인성을 파괴하는 것을 꺼리지만, 인수격에 정관을 용신으로 삼는 경우에는 재성이 있어서 정관을 생해 주는 것이 오히려 좋은 것이니, 그 용법이 판이하게 다른 것이다.
         * 성격 5) : 인수봉살
         *           월령이 인수이고 인수가 경하면 칠살로 인수를 생해 주는 것이 좋다.
         * 성격 6) : 편인투식
         *           월령이 편인인 경우에 식신이 있어서 일간의 왕성한 기운을 설기하면 수기가 유행되어 좋으면서 재성이 나쁜 역할을 할 때
         */
        /**
         * 파격
         * 파격 1) : 인수가 경미한테 재를 만나거나
         * 파격 2) : 신강하고 인수가 중한데 칠살이 투출되면
         */


         // 성격 1) : 관인쌍전
         //           인수가 경한데 칠살이 있어서 약한 인수를 생조하거나
         //           월령에 인수가 있으나 인수가 미약하여 칠살이 인수를 생하거나, 정관이 인수를 생하면 관인쌍전이 된다.
        if ((kanzhi.getPiCnt() + kanzhi.getJiCnt()) == 1) {
            if ((kanzhi.getPgCnt() + kanzhi.getJgCnt()) >= 1) {
                theory = "관인쌍전";
                theory = "인수가 경한데 칠살이 있어서 약한 인수를 생조하거나";
                theory = "월령에 인수가 있으나 인수가 미약하여 칠살이 인수를 생하거나, 정관이 인수를 생하면 관인쌍전이 된다.";
                explain = "성격";

                rtnMap.put("japyeng_theory", theory);
                rtnMap.put("japyeng_explain", explain);
                return rtnMap;
            }
        }

        // 성격 2) : 신인양왕(일간과 인수가 둘 다 왕성함)한데 식상을 써서 설기하거나
        //           신강하고 인수가 왕성하면 인수를 용신으로 쓰지 못하고 식상을 용신으로 삼아서 일주의 기운을 설기해야 한다.
        if (isStrong) {
            if ((kanzhi.getPiCnt() + kanzhi.getJiCnt()) >= 2) {
                theory = "신인양왕(일간과 인수가 둘 다 왕성함)한데 식상을 써서 설기하거나";
                theory = "<br> 신강하고 인수가 왕성하면 인수를 용신으로 쓰지 못하고 식상을 용신으로 삼아서 일주의 기운을 설기해야 한다.";
                explain = "성격";

                rtnMap.put("japyeng_theory", theory);
                rtnMap.put("japyeng_explain", explain);
                return rtnMap;
            }
        }

         // 성격 3) : 인수가 많은데 재가 천간에 투출하고 재의 뿌리가 약한 것
         //           인수가 지나치게 많다면 인수를 파손하는 재를 용신을 삼는다.
         //           예컨대 토가 많아서 금이 매몰되거나 수가 많아서 목이 표류할 경우에는 필히 그 지나친 것(인수)를 제거하고 그 부족한 것을 보충하는 것(재성)으로 용신을 삼는다.
         //           사주의 재가 통근하지 못하고 인수가 지나치게 많아 재가 인수를 파손할 역량이 부족하여 용신으로 쓰기 힘들 경우도 있다.
         //           반대로 사주 원국에 재가 지나치게 왕성하다면 인수가 전멸할 우려가 있으니 이때는 오히려 비견 겁재로 재를 제압하여 인수를 보호하는 것이 좋다.
        if ( (kanzhi.getPiCnt() + kanzhi.getJiCnt()) >= 3) {
            if (kanzhi.getTopYearFlesh().equals(Body.Type.PJ.name()) || kanzhi.getTopMonthFlesh().equals(Body.Type.PJ.name()) || kanzhi.getTopHourFlesh().equals(Body.Type.PJ.name())
                || kanzhi.getTopYearFlesh().equals(Body.Type.JJ.name()) || kanzhi.getTopMonthFlesh().equals(Body.Type.JJ.name()) || kanzhi.getTopHourFlesh().equals(Body.Type.JJ.name())
            ) {
                if ( (kanzhi.getPjCnt() + kanzhi.getJjCnt()) <= 2) {
                    theory = "인수가 많은데 재가 천간에 투출하고 재의 뿌리가 약한 것";
                    theory = "<br> 인수가 지나치게 많다면 인수를 파손하는 재를 용신을 삼는다.";
                    theory = "<br> 예컨대 토가 많아서 금이 매몰되거나 수가 많아서 목이 표류할 경우에는 필히 그 지나친 것(인수)를 제거하고 그 부족한 것을 보충하는 것(재성)으로 용신을 삼는다.";
                    theory = "<br> 사주의 재가 통근하지 못하고 인수가 지나치게 많아 재가 인수를 파손할 역량이 부족하여 용신으로 쓰기 힘들 경우도 있다.";
                    theory = "<br> 반대로 사주 원국에 재가 지나치게 왕성하다면 인수가 전멸할 우려가 있으니 이때는 오히려 비견 겁재로 재를 제압하여 인수를 보호하는 것이 좋다.";
                    explain = "성격";

                    rtnMap.put("japyeng_theory", theory);
                    rtnMap.put("japyeng_explain", explain);
                    return rtnMap;
                }
            }
        }

        //           사주 원국에 재가 지나치게 왕성하다면 인수가 전멸할 우려가 있으니 이때는 오히려 비견 겁재로 재를 제압하여 인수를 보호하는 것이 좋다.
        if ( (kanzhi.getPjCnt() + kanzhi.getJjCnt()) >= 3) {
            if ( (kanzhi.getBgCnt() + kanzhi.getGjCnt()) >= 1) {
                theory = "반대로 사주 원국에 재가 지나치게 왕성하다면 인수가 전멸할 우려가 있으니 이때는 오히려 비견 겁재로 재를 제압하여 인수를 보호하는 것이 좋다.";
                explain = "성격";

                rtnMap.put("japyeng_theory", theory);
                rtnMap.put("japyeng_explain", explain);
                return rtnMap;
            }
        }

        // 성격 4) : 인수용관
        //           월령이 인수인 경우에 일원이 인수의 생조를 받아 왕성해지므로 사주의 천간에 정관이 투출하고 다시 재성이 있어서 정관을 생해 주면 관은 맑고 인수는 바르니 관인쌍전하는 것이다. 비록 같은 관인쌍전의 격국이라 해도 정관격에 인수를 용신으로 삼는 경우에는 재성이 인성을 파괴하는 것을 꺼리지만, 인수격에 정관을 용신으로 삼는 경우에는 재성이 있어서 정관을 생해 주는 것이 오히려 좋은 것이니, 그 용법이 판이하게 다른 것이다.
        if (kanzhi.getTopMonthFlesh().equals("JG") || kanzhi.getTopYearFlesh().equals("JG") || kanzhi.getTopHourFlesh().equals("JG"))
        {
            if ( (kanzhi.getPjCnt() + kanzhi.getJjCnt()) >= 1) {
                theory = "인수용관";
                theory = "<br> 월령이 인수인 경우에 일원이 인수의 생조를 받아 왕성해지므로 사주의 천간에 정관이 투출하고 다시 재성이 있어서 정관을 생해 주면 관은 맑고 인수는 바르니 관인쌍전하는 것이다. 비록 같은 관인쌍전의 격국이라 해도 정관격에 인수를 용신으로 삼는 경우에는 재성이 인성을 파괴하는 것을 꺼리지만, 인수격에 정관을 용신으로 삼는 경우에는 재성이 있어서 정관을 생해 주는 것이 오히려 좋은 것이니, 그 용법이 판이하게 다른 것이다.";
                explain = "성격";

                rtnMap.put("japyeng_theory", theory);
                rtnMap.put("japyeng_explain", explain);
                return rtnMap;
            }
        }

        // 성격 5) : 인수봉살
        //           월령이 인수이고 인수가 경하면 칠살로 인수를 생해 주는 것이 좋다.
        if ( (kanzhi.getPiCnt() + kanzhi.getJiCnt()) == 1) {
            if ( kanzhi.getPgCnt() >= 1) {
                theory = "인수봉살";
                theory = "<br> 월령이 인수이고 인수가 경하면 칠살로 인수를 생해 주는 것이 좋다.";
                explain = "성격";

                rtnMap.put("japyeng_theory", theory);
                rtnMap.put("japyeng_explain", explain);
                return rtnMap;
            }
        }

        // 성격 6) : 편인투식
        //           월령이 편인인 경우에 식신이 있어서 일간의 왕성한 기운을 설기하면 수기가 유행되어 좋으면서 재성이 나쁜 역할을 할 때
        if (kanzhi.getBottomMonthFlesh().equals(Body.Type.PI.name())) {
            if (kanzhi.getSsCnt() >= 1) {
                theory = "편인투식";
                theory = "<br> 월령이 편인인 경우에 식신이 있어서 일간의 왕성한 기운을 설기하면 수기가 유행되어 좋으면서 재성이 나쁜 역할을 할 때";
                explain = "성격";

                rtnMap.put("japyeng_theory", theory);
                rtnMap.put("japyeng_explain", explain);
                return rtnMap;
            }
        }

        // 파격 1) : 인수가 경미한테 재를 만나거나
        if ( (kanzhi.getPiCnt() + kanzhi.getJiCnt()) == 1) {
            if ( (kanzhi.getPjCnt() + kanzhi.getJjCnt()) >= 2) {
                theory = "인수가 경미한테 재를 만나거나";
                explain = "파격";

                rtnMap.put("japyeng_theory", theory);
                rtnMap.put("japyeng_explain", explain);
                return rtnMap;
            }
        }

        // 파격 2) : 신강하고 인수가 중한데 칠살이 투출되면
        if (isStrong) {
            if ( (kanzhi.getPiCnt() + kanzhi.getJiCnt()) >= 3) {
                if (kanzhi.getTopMonthFlesh().equals("PG") || kanzhi.getTopYearFlesh().equals("PG") || kanzhi.getTopHourFlesh().equals("PG"))
                {
                    theory = "신강하고 인수가 중한데 칠살이 투출되면";
                    explain = "파격";

                    rtnMap.put("japyeng_theory", theory);
                    rtnMap.put("japyeng_explain", explain);
                    return rtnMap;
                }
            }
        }

        theory = "...";
        explain = "파격";

        rtnMap.put("japyeng_theory", theory);
        rtnMap.put("japyeng_explain", explain);
        return rtnMap;
    }
}