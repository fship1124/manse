package com.tree.family.model;

public class KanzhiVO {
    private String topYear;         // 년간
    private String topMonth;        // 월간
    private String topDay;          // 일간
    private String topHour;         // 시간
    private String bottomYear;     // 년지
    private String bottomMonth;    // 월지
    private String bottomDay;      // 일지
    private String bottomHour;     // 시지

    private int top11;  // 갑
    private int top12;  // 을
    private int top21;  // 병
    private int top22;  // 정
    private int top31;  // 무
    private int top32;  // 기
    private int top41;  // 경
    private int top42;  // 신
    private int top51;  // 임
    private int top52;  // 계

    private int bottom11;   // 인
    private int bottom12;   // 묘
    private int bottom31;   // 진
    private int bottom21;   // 사
    private int bottom22;   // 오
    private int bottom32;   // 미
    private int bottom41;   // 신
    private int bottom42;   // 유
    private int bottom33;   // 술
    private int bottom51;   // 해
    private int bottom52;   // 자
    private int bottom34;   // 축

    private int topCnt11;  // 갑 개수
    private int topCnt12;  // 을 개수
    private int topCnt21;  // 병 개수
    private int topCnt22;  // 정 개수
    private int topCnt31;  // 무 개수
    private int topCnt32;  // 기 개수
    private int topCnt41;  // 경 개수
    private int topCnt42;  // 신 개수
    private int topCnt51;  // 임 개수
    private int topCnt52;  // 계 개수

    private int bottomCnt11;   // 인 개수
    private int bottomCnt12;   // 묘 개수
    private int bottomCnt31;   // 진 개수
    private int bottomCnt21;   // 사 개수
    private int bottomCnt22;   // 오 개수
    private int bottomCnt32;   // 미 개수
    private int bottomCnt41;   // 신 개수
    private int bottomCnt42;   // 유 개수
    private int bottomCnt33;   // 술 개수
    private int bottomCnt51;   // 해 개수
    private int bottomCnt52;   // 자 개수
    private int bottomCnt34;   // 축 개수

    private String topYearFlesh;         // 년간 육신(육친)
    private String topMonthFlesh;        // 월간 육신(육친)
    private String topHourFlesh;         // 시간 육신(육친)
    private String bottomYearFlesh;     // 년지 육신(육친)
    private String bottomMonthFlesh;    // 월지 육신(육친)
    private String bottomDayFlesh;      // 일지 육신(육친)
    private String bottomHourFlesh;     // 시지 육신(육친)

    private int bgCnt = 0;  // 비견 개수
    private int gjCnt = 0;  // 겁재 개수
    private int ssCnt = 0;  // 식신 개수
    private int sgCnt = 0;  // 상관 개수
    private int jjCnt = 0;  // 정재 개수
    private int pjCnt = 0;  // 편재 개수
    private int jgCnt = 0;  // 정관 개수
    private int pgCnt = 0;  // 편관 개수
    private int jiCnt = 0;  // 정인 개수
    private int piCnt = 0;  // 편인 개수

    public String getTopYear() {
        return topYear;
    }

    public void setTopYear(String topYear) {
        this.topYear = topYear;
    }

    public String getTopMonth() {
        return topMonth;
    }

    public void setTopMonth(String topMonth) {
        this.topMonth = topMonth;
    }

    public String getTopDay() {
        return topDay;
    }

    public void setTopDay(String topDay) {
        this.topDay = topDay;
    }

    public String getTopHour() {
        return topHour;
    }

    public void setTopHour(String topHour) {
        this.topHour = topHour;
    }

    public String getBottomYear() {
        return bottomYear;
    }

    public void setBottomYear(String bottomYear) {
        this.bottomYear = bottomYear;
    }

    public String getBottomMonth() {
        return bottomMonth;
    }

    public void setBottomMonth(String bottomMonth) {
        this.bottomMonth = bottomMonth;
    }

    public String getBottomDay() {
        return bottomDay;
    }

    public void setBottomDay(String bottomDay) {
        this.bottomDay = bottomDay;
    }

    public String getBottomHour() {
        return bottomHour;
    }

    public void setBottomHour(String bottomHour) {
        this.bottomHour = bottomHour;
    }

    public int getTop11() {
        return top11;
    }

    public void setTop11(int top11) {
        this.top11 = top11;
    }

    public int getTop12() {
        return top12;
    }

    public void setTop12(int top12) {
        this.top12 = top12;
    }

    public int getTop21() {
        return top21;
    }

    public void setTop21(int top21) {
        this.top21 = top21;
    }

    public int getTop22() {
        return top22;
    }

    public void setTop22(int top22) {
        this.top22 = top22;
    }

    public int getTop31() {
        return top31;
    }

    public void setTop31(int top31) {
        this.top31 = top31;
    }

    public int getTop32() {
        return top32;
    }

    public void setTop32(int top32) {
        this.top32 = top32;
    }

    public int getTop41() {
        return top41;
    }

    public void setTop41(int top41) {
        this.top41 = top41;
    }

    public int getTop42() {
        return top42;
    }

    public void setTop42(int top42) {
        this.top42 = top42;
    }

    public int getTop51() {
        return top51;
    }

    public void setTop51(int top51) {
        this.top51 = top51;
    }

    public int getTop52() {
        return top52;
    }

    public void setTop52(int top52) {
        this.top52 = top52;
    }

    public int getBottom11() {
        return bottom11;
    }

    public void setBottom11(int bottom11) {
        this.bottom11 = bottom11;
    }

    public int getBottom12() {
        return bottom12;
    }

    public void setBottom12(int bottom12) {
        this.bottom12 = bottom12;
    }

    public int getBottom31() {
        return bottom31;
    }

    public void setBottom31(int bottom31) {
        this.bottom31 = bottom31;
    }

    public int getBottom21() {
        return bottom21;
    }

    public void setBottom21(int bottom21) {
        this.bottom21 = bottom21;
    }

    public int getBottom22() {
        return bottom22;
    }

    public void setBottom22(int bottom22) {
        this.bottom22 = bottom22;
    }

    public int getBottom32() {
        return bottom32;
    }

    public void setBottom32(int bottom32) {
        this.bottom32 = bottom32;
    }

    public int getBottom41() {
        return bottom41;
    }

    public void setBottom41(int bottom41) {
        this.bottom41 = bottom41;
    }

    public int getBottom42() {
        return bottom42;
    }

    public void setBottom42(int bottom42) {
        this.bottom42 = bottom42;
    }

    public int getBottom33() {
        return bottom33;
    }

    public void setBottom33(int bottom33) {
        this.bottom33 = bottom33;
    }

    public int getBottom51() {
        return bottom51;
    }

    public void setBottom51(int bottom51) {
        this.bottom51 = bottom51;
    }

    public int getBottom52() {
        return bottom52;
    }

    public void setBottom52(int bottom52) {
        this.bottom52 = bottom52;
    }

    public int getBottom34() {
        return bottom34;
    }

    public void setBottom34(int bottom34) {
        this.bottom34 = bottom34;
    }

    public int getTopCnt11() {
        return topCnt11;
    }

    public void setTopCnt11(int topCnt11) {
        this.topCnt11 = topCnt11;
    }

    public int getTopCnt12() {
        return topCnt12;
    }

    public void setTopCnt12(int topCnt12) {
        this.topCnt12 = topCnt12;
    }

    public int getTopCnt21() {
        return topCnt21;
    }

    public void setTopCnt21(int topCnt21) {
        this.topCnt21 = topCnt21;
    }

    public int getTopCnt22() {
        return topCnt22;
    }

    public void setTopCnt22(int topCnt22) {
        this.topCnt22 = topCnt22;
    }

    public int getTopCnt31() {
        return topCnt31;
    }

    public void setTopCnt31(int topCnt31) {
        this.topCnt31 = topCnt31;
    }

    public int getTopCnt32() {
        return topCnt32;
    }

    public void setTopCnt32(int topCnt32) {
        this.topCnt32 = topCnt32;
    }

    public int getTopCnt41() {
        return topCnt41;
    }

    public void setTopCnt41(int topCnt41) {
        this.topCnt41 = topCnt41;
    }

    public int getTopCnt42() {
        return topCnt42;
    }

    public void setTopCnt42(int topCnt42) {
        this.topCnt42 = topCnt42;
    }

    public int getTopCnt51() {
        return topCnt51;
    }

    public void setTopCnt51(int topCnt51) {
        this.topCnt51 = topCnt51;
    }

    public int getTopCnt52() {
        return topCnt52;
    }

    public void setTopCnt52(int topCnt52) {
        this.topCnt52 = topCnt52;
    }

    public int getBottomCnt11() {
        return bottomCnt11;
    }

    public void setBottomCnt11(int bottomCnt11) {
        this.bottomCnt11 = bottomCnt11;
    }

    public int getBottomCnt12() {
        return bottomCnt12;
    }

    public void setBottomCnt12(int bottomCnt12) {
        this.bottomCnt12 = bottomCnt12;
    }

    public int getBottomCnt31() {
        return bottomCnt31;
    }

    public void setBottomCnt31(int bottomCnt31) {
        this.bottomCnt31 = bottomCnt31;
    }

    public int getBottomCnt21() {
        return bottomCnt21;
    }

    public void setBottomCnt21(int bottomCnt21) {
        this.bottomCnt21 = bottomCnt21;
    }

    public int getBottomCnt22() {
        return bottomCnt22;
    }

    public void setBottomCnt22(int bottomCnt22) {
        this.bottomCnt22 = bottomCnt22;
    }

    public int getBottomCnt32() {
        return bottomCnt32;
    }

    public void setBottomCnt32(int bottomCnt32) {
        this.bottomCnt32 = bottomCnt32;
    }

    public int getBottomCnt41() {
        return bottomCnt41;
    }

    public void setBottomCnt41(int bottomCnt41) {
        this.bottomCnt41 = bottomCnt41;
    }

    public int getBottomCnt42() {
        return bottomCnt42;
    }

    public void setBottomCnt42(int bottomCnt42) {
        this.bottomCnt42 = bottomCnt42;
    }

    public int getBottomCnt33() {
        return bottomCnt33;
    }

    public void setBottomCnt33(int bottomCnt33) {
        this.bottomCnt33 = bottomCnt33;
    }

    public int getBottomCnt51() {
        return bottomCnt51;
    }

    public void setBottomCnt51(int bottomCnt51) {
        this.bottomCnt51 = bottomCnt51;
    }

    public int getBottomCnt52() {
        return bottomCnt52;
    }

    public void setBottomCnt52(int bottomCnt52) {
        this.bottomCnt52 = bottomCnt52;
    }

    public int getBottomCnt34() {
        return bottomCnt34;
    }

    public void setBottomCnt34(int bottomCnt34) {
        this.bottomCnt34 = bottomCnt34;
    }

    public String getTopYearFlesh() {
        return topYearFlesh;
    }

    public void setTopYearFlesh(String topYearFlesh) {
        this.topYearFlesh = topYearFlesh;
    }

    public String getTopMonthFlesh() {
        return topMonthFlesh;
    }

    public void setTopMonthFlesh(String topMonthFlesh) {
        this.topMonthFlesh = topMonthFlesh;
    }

    public String getTopHourFlesh() {
        return topHourFlesh;
    }

    public void setTopHourFlesh(String topHourFlesh) {
        this.topHourFlesh = topHourFlesh;
    }

    public String getBottomYearFlesh() {
        return bottomYearFlesh;
    }

    public void setBottomYearFlesh(String bottomYearFlesh) {
        this.bottomYearFlesh = bottomYearFlesh;
    }

    public String getBottomMonthFlesh() {
        return bottomMonthFlesh;
    }

    public void setBottomMonthFlesh(String bottomMonthFlesh) {
        this.bottomMonthFlesh = bottomMonthFlesh;
    }

    public String getBottomDayFlesh() {
        return bottomDayFlesh;
    }

    public void setBottomDayFlesh(String bottomDayFlesh) {
        this.bottomDayFlesh = bottomDayFlesh;
    }

    public String getBottomHourFlesh() {
        return bottomHourFlesh;
    }

    public void setBottomHourFlesh(String bottomHourFlesh) {
        this.bottomHourFlesh = bottomHourFlesh;
    }

    public int getBgCnt() {
        return bgCnt;
    }

    public void setBgCnt(int bgCnt) {
        this.bgCnt = bgCnt;
    }

    public int getGjCnt() {
        return gjCnt;
    }

    public void setGjCnt(int gjCnt) {
        this.gjCnt = gjCnt;
    }

    public int getSsCnt() {
        return ssCnt;
    }

    public void setSsCnt(int ssCnt) {
        this.ssCnt = ssCnt;
    }

    public int getSgCnt() {
        return sgCnt;
    }

    public void setSgCnt(int sgCnt) {
        this.sgCnt = sgCnt;
    }

    public int getJjCnt() {
        return jjCnt;
    }

    public void setJjCnt(int jjCnt) {
        this.jjCnt = jjCnt;
    }

    public int getPjCnt() {
        return pjCnt;
    }

    public void setPjCnt(int pjCnt) {
        this.pjCnt = pjCnt;
    }

    public int getJgCnt() {
        return jgCnt;
    }

    public void setJgCnt(int jgCnt) {
        this.jgCnt = jgCnt;
    }

    public int getPgCnt() {
        return pgCnt;
    }

    public void setPgCnt(int pgCnt) {
        this.pgCnt = pgCnt;
    }

    public int getJiCnt() {
        return jiCnt;
    }

    public void setJiCnt(int jiCnt) {
        this.jiCnt = jiCnt;
    }

    public int getPiCnt() {
        return piCnt;
    }

    public void setPiCnt(int piCnt) {
        this.piCnt = piCnt;
    }
}