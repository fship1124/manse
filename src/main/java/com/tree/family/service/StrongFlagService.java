package com.tree.family.service;

import com.tree.family.model.Body;
import com.tree.family.model.KanzhiVO;
import org.springframework.stereotype.Service;

/**
 *  신강 신약 여부
 *
 *  신강신약 판별하는 법
 *  1. 득령
 *          득령이란 일간을 월지에 대조하여 그 생월로부터 '기를 얻었다'는 말이다.
 *          일간이 월지에서 같은 오행이 있거나, 월지가 일간을 생하여 주게 되면 '득령하였다'라고 한다.
 *          이와 반대로 월에서 기를 얻지 못한 것을 실령이라고 한다.
 *          득령이 되면 1차적으로 신강사주의 요건을 갖추게 되는 것이며, 반대로 실령을 하게 되면 신약 사주의 첫번째 요건을 갖추는 것이다.
 *  2. 득지
 *          득지란 일간을 일지에 대조하였을 때 지지가 비겁이나 인성이 되는 경우를 말하기도 하며, 일간이 일지에 뿌리를 내려 통근이 되는 것을 말하기도 한다.
 *          일주가 유근하게 되면 안정되고 강하다고 보는 것이다.
 *          이와 반대로 일간이 일지에 식상, 재성, 관성이 있게 되면 생하지도 못하고 통근도 되지 못하는 것을 실지, 무기, 무근이라 하여 일주가 약하다고 보는 것이다.
 *  3. 득세
 *          일간이 월지와 일지를 제외한 기타의 간지에서 생조를 많이 받고 있는 것을 말한다.
 *          생조라는 것은 생하는 인수(정인, 편인)와 도우는 비겁을 말한다.
 *          생조하는게 많다는 것은 일간을 생조하는 비겁과 인성이 세개 이상 있는 것으로 이해하면 되겠다.
 *          이러한 경우 일간을 돕는 세력이 형성되었으니 득세하였다고 마랗고 일간이 강해질 수 있는 요건이 되며 그러지 못한 경우는 실세라고 말한다.
 *  신강사주
 *  1. 최강사주
 *          최강사주는 일간이 득령, 득지, 득세한 사주를 말하며, 이는 인성과 비겁이 태강하여 그 오행의 기세를 거스르지 못하는 경우와 그러하지 않는 경우가 있다.
 *          오행의 기세를 거스르지 못하는 경우는 특별한 사주로 취급을 하게 된다.
 *  2. 중강사주
 *          일간이 득령, 득세 하였으나 실지
 *  3. 강사주
 *          일간이 득령, 득지 하였으나 실세
 *  4. 불약사주
 *          일간이 사주 전반적인 상황에서 약하지 않는 경우를 말한다.
 *          실령을 하였으나, 득지 득세한 사주를 말하는 것으로, 비록 실령을 하여서 신약사주가 되지만 다른 곳에서 기세를 얻어 오히려 강한 사주가 되는 것이라 할 수 있다.
 *
 *
 *  신약사주
 *  1. 최약사주
 *          일간이 실령, 실지, 실세한 사주를 말하며, 사주에서 왕한 오행의 기세를 거스르지 못하는 경우와 그러하지 않는 경우가 있다.
 *  2. 중약사주
 *          일간이 실령, 실세 하였으나 득지
 *  3. 강사주
 *          일간이 실령, 실지 하였으나 득세
 *  4. 불강사주
 *          일간이 득령하였으나, 실지 실세한 사주를 말하며, 득령을 하여 신강한 사주가 되지만 다른 곳에서 기세를 잃어 오히려 약한 사주가 되는 것이다.
 */


@Service
public class StrongFlagService {

    public boolean strongFlag(KanzhiVO kanzhi) {
        boolean isStrong = false;

    //  신강사주
                //  1. 최강사주
                //          최강사주는 일간이 득령, 득지, 득세한 사주를 말하며, 이는 인성과 비겁이 태강하여 그 오행의 기세를 거스르지 못하는 경우와 그러하지 않는 경우가 있다.
                //          오행의 기세를 거스르지 못하는 경우는 특별한 사주로 취급을 하게 된다.
                //  2. 중강사주
                //          일간이 득령, 득세 하였으나 실지
                //  3. 강사주
                //          일간이 득령, 득지 하였으나 실세
                //  4. 불약사주
                //          일간이 사주 전반적인 상황에서 약하지 않는 경우를 말한다.
                //          실령을 하였으나, 득지 득세한 사주를 말하는 것으로, 비록 실령을 하여서 신약사주가 되지만 다른 곳에서 기세를 얻어 오히려 강한 사주가 되는 것이라 할 수 있다.

     //  신약사주
                //  1. 최약사주
                //          일간이 실령, 실지, 실세한 사주를 말하며, 사주에서 왕한 오행의 기세를 거스르지 못하는 경우와 그러하지 않는 경우가 있다.
                //  2. 중약사주
                //          일간이 실령, 실세 하였으나 득지
                //  3. 강사주
                //          일간이 실령, 실지 하였으나 득세
                //  4. 불강사주
                //          일간이 득령하였으나, 실지 실세한 사주를 말하며, 득령을 하여 신강한 사주가 되지만 다른 곳에서 기세를 잃어 오히려 약한 사주가 되는 것이다.


        // 득령
        boolean getBottomMonth = false;
        // 득지
        boolean getBottomDay = false;
        // 득세
        boolean getnfluence = false;


        if (kanzhi.getBottomMonthFlesh().equals(Body.Type.BG) || kanzhi.getBottomMonthFlesh().equals(Body.Type.GJ) || kanzhi.getBottomMonthFlesh().equals(Body.Type.PI) || kanzhi.getBottomMonthFlesh().equals(Body.Type.JI)) {
            getBottomMonth = true;
        }
        if (kanzhi.getBottomDayFlesh().equals(Body.Type.BG) || kanzhi.getBottomDayFlesh().equals(Body.Type.GJ) || kanzhi.getBottomDayFlesh().equals(Body.Type.PI) || kanzhi.getBottomDayFlesh().equals(Body.Type.JI)) {
            getBottomDay = true;
        }
        if ((kanzhi.getBgCnt() + kanzhi.getGjCnt() + kanzhi.getPiCnt() + kanzhi.getJiCnt()) >= 3) {
            getnfluence = true;
        }

        if (getBottomMonth && getnfluence) {
            isStrong = true;
        }

        if (getBottomMonth && getBottomDay) {
            isStrong = true;
        }

        if (getBottomDay && getnfluence) {
            isStrong = true;
        }

        return isStrong;
    }

}
