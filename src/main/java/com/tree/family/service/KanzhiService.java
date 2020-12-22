package com.tree.family.service;

import com.tree.family.model.KanzhiVO;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

@Service
public class KanzhiService {
    private final Logger logger = LoggerFactory.getLogger(this.getClass());

    public void kanzhiCount(KanzhiVO kanzhi) {
        if (kanzhi.getTopDay().equals("top11")) {
            if (kanzhi.getTopYear().equals("top11")) {
                kanzhi.setBgCnt(kanzhi.getBgCnt() + 1);
            }
            if (kanzhi.getTopMonth().equals("top11")) {
                kanzhi.setBgCnt(kanzhi.getBgCnt() + 1);
            }
            if (kanzhi.getTopHour().equals("top11")) {
                kanzhi.setBgCnt(kanzhi.getBgCnt() + 1);
            }
            if (kanzhi.getBottomYear().equals("bottom11")) {
                kanzhi.setBgCnt(kanzhi.getBgCnt() + 1);
            }
            if (kanzhi.getBottomMonth().equals("bottom11")) {
                kanzhi.setBgCnt(kanzhi.getBgCnt() + 1);
            }
            if (kanzhi.getBottomHour().equals("bottom11")) {
                kanzhi.setBgCnt(kanzhi.getBgCnt() + 1);
            }


            //
            if (kanzhi.getTopYear().equals("top12")) {
                kanzhi.setGjCnt(kanzhi.getGjCnt() + 1);
            }
            if (kanzhi.getTopMonth().equals("top12")) {
                kanzhi.setGjCnt(kanzhi.getGjCnt() + 1);
            }
            if (kanzhi.getTopHour().equals("top12")) {
                kanzhi.setGjCnt(kanzhi.getGjCnt() + 1);
            }
            if (kanzhi.getBottomYear().equals("bottom12")) {
                kanzhi.setGjCnt(kanzhi.getGjCnt() + 1);
            }
            if (kanzhi.getBottomMonth().equals("bottom12")) {
                kanzhi.setGjCnt(kanzhi.getGjCnt() + 1);
            }
            if (kanzhi.getBottomHour().equals("bottom12")) {
                kanzhi.setGjCnt(kanzhi.getGjCnt() + 1);
            }


            //
            if (kanzhi.getTopYear().equals("top21")) {
                kanzhi.setSsCnt(kanzhi.getSsCnt() + 1);
            }
            if (kanzhi.getTopMonth().equals("top21")) {
                kanzhi.setSsCnt(kanzhi.getSsCnt() + 1);
            }
            if (kanzhi.getTopHour().equals("top21")) {
                kanzhi.setSsCnt(kanzhi.getSsCnt() + 1);
            }
            if (kanzhi.getBottomYear().equals("bottom21")) {
                kanzhi.setSsCnt(kanzhi.getSsCnt() + 1);
            }
            if (kanzhi.getBottomMonth().equals("bottom21")) {
                kanzhi.setSsCnt(kanzhi.getSsCnt() + 1);
            }
            if (kanzhi.getBottomHour().equals("bottom21")) {
                kanzhi.setSsCnt(kanzhi.getSsCnt() + 1);
            }


            //
            if (kanzhi.getTopYear().equals("top22")) {
                kanzhi.setSgCnt(kanzhi.getSgCnt() + 1);
            }
            if (kanzhi.getTopMonth().equals("top22")) {
                kanzhi.setSgCnt(kanzhi.getSgCnt() + 1);
            }
            if (kanzhi.getTopHour().equals("top22")) {
                kanzhi.setSgCnt(kanzhi.getSgCnt() + 1);
            }
            if (kanzhi.getBottomYear().equals("bottom22")) {
                kanzhi.setSgCnt(kanzhi.getSgCnt() + 1);
            }
            if (kanzhi.getBottomMonth().equals("bottom22")) {
                kanzhi.setSgCnt(kanzhi.getSgCnt() + 1);
            }
            if (kanzhi.getBottomHour().equals("bottom22")) {
                kanzhi.setSgCnt(kanzhi.getSgCnt() + 1);
            }


            //
            if (kanzhi.getTopYear().equals("top31")) {
                kanzhi.setPjCnt(kanzhi.getPjCnt() + 1);
            }
            if (kanzhi.getTopMonth().equals("top31")) {
                kanzhi.setPjCnt(kanzhi.getPjCnt() + 1);
            }
            if (kanzhi.getTopHour().equals("top31")) {
                kanzhi.setPjCnt(kanzhi.getPjCnt() + 1);
            }
            if (kanzhi.getBottomYear().equals("bottom31")) {
                kanzhi.setPjCnt(kanzhi.getPjCnt() + 1);
            }
            if (kanzhi.getBottomMonth().equals("bottom31")) {
                kanzhi.setPjCnt(kanzhi.getPjCnt() + 1);
            }
            if (kanzhi.getBottomHour().equals("bottom31")) {
                kanzhi.setPjCnt(kanzhi.getPjCnt() + 1);
            }
            if (kanzhi.getBottomYear().equals("bottom33")) {
                kanzhi.setPjCnt(kanzhi.getPjCnt() + 1);
            }
            if (kanzhi.getBottomMonth().equals("bottom33")) {
                kanzhi.setPjCnt(kanzhi.getPjCnt() + 1);
            }
            if (kanzhi.getBottomHour().equals("bottom33")) {
                kanzhi.setPjCnt(kanzhi.getPjCnt() + 1);
            }


            //
            if (kanzhi.getTopYear().equals("top32")) {
                kanzhi.setJjCnt(kanzhi.getJjCnt() + 1);
            }
            if (kanzhi.getTopMonth().equals("top32")) {
                kanzhi.setJjCnt(kanzhi.getJjCnt() + 1);
            }
            if (kanzhi.getTopHour().equals("top32")) {
                kanzhi.setJjCnt(kanzhi.getJjCnt() + 1);
            }
            if (kanzhi.getBottomYear().equals("bottom32")) {
                kanzhi.setJjCnt(kanzhi.getJjCnt() + 1);
            }
            if (kanzhi.getBottomMonth().equals("bottom32")) {
                kanzhi.setJjCnt(kanzhi.getJjCnt() + 1);
            }
            if (kanzhi.getBottomHour().equals("bottom32")) {
                kanzhi.setJjCnt(kanzhi.getJjCnt() + 1);
            }
            if (kanzhi.getBottomYear().equals("bottom34")) {
                kanzhi.setJjCnt(kanzhi.getJjCnt() + 1);
            }
            if (kanzhi.getBottomMonth().equals("bottom34")) {
                kanzhi.setJjCnt(kanzhi.getJjCnt() + 1);
            }
            if (kanzhi.getBottomHour().equals("bottom34")) {
                kanzhi.setJjCnt(kanzhi.getJjCnt() + 1);
            }


            //
            if (kanzhi.getTopYear().equals("top41")) {
                kanzhi.setPgCnt(kanzhi.getPgCnt() + 1);
            }
            if (kanzhi.getTopMonth().equals("top41")) {
                kanzhi.setPgCnt(kanzhi.getPgCnt() + 1);
            }
            if (kanzhi.getTopHour().equals("top41")) {
                kanzhi.setPgCnt(kanzhi.getPgCnt() + 1);
            }
            if (kanzhi.getBottomYear().equals("bottom41")) {
                kanzhi.setPgCnt(kanzhi.getPgCnt() + 1);
            }
            if (kanzhi.getBottomMonth().equals("bottom41")) {
                kanzhi.setPgCnt(kanzhi.getPgCnt() + 1);
            }
            if (kanzhi.getBottomHour().equals("bottom41")) {
                kanzhi.setPgCnt(kanzhi.getPgCnt() + 1);
            }


            //
            if (kanzhi.getTopYear().equals("top42")) {
                kanzhi.setJgCnt(kanzhi.getJgCnt() + 1);
            }
            if (kanzhi.getTopMonth().equals("top42")) {
                kanzhi.setJgCnt(kanzhi.getJgCnt() + 1);
            }
            if (kanzhi.getTopHour().equals("top42")) {
                kanzhi.setJgCnt(kanzhi.getJgCnt() + 1);
            }
            if (kanzhi.getBottomYear().equals("bottom42")) {
                kanzhi.setJgCnt(kanzhi.getJgCnt() + 1);
            }
            if (kanzhi.getBottomMonth().equals("bottom42")) {
                kanzhi.setJgCnt(kanzhi.getJgCnt() + 1);
            }
            if (kanzhi.getBottomHour().equals("bottom42")) {
                kanzhi.setJgCnt(kanzhi.getJgCnt() + 1);
            }


            //
            if (kanzhi.getTopYear().equals("top51")) {
                kanzhi.setPiCnt(kanzhi.getPiCnt() + 1);
            }
            if (kanzhi.getTopMonth().equals("top51")) {
                kanzhi.setPiCnt(kanzhi.getPiCnt() + 1);
            }
            if (kanzhi.getTopHour().equals("top51")) {
                kanzhi.setPiCnt(kanzhi.getPiCnt() + 1);
            }
            if (kanzhi.getBottomYear().equals("bottom51")) {
                kanzhi.setPiCnt(kanzhi.getPiCnt() + 1);
            }
            if (kanzhi.getBottomMonth().equals("bottom51")) {
                kanzhi.setPiCnt(kanzhi.getPiCnt() + 1);
            }
            if (kanzhi.getBottomHour().equals("bottom51")) {
                kanzhi.setPiCnt(kanzhi.getPiCnt() + 1);
            }


            //
            if (kanzhi.getTopYear().equals("top52")) {
                kanzhi.setJiCnt(kanzhi.getJiCnt() + 1);
            }
            if (kanzhi.getTopMonth().equals("top52")) {
                kanzhi.setJiCnt(kanzhi.getJiCnt() + 1);
            }
            if (kanzhi.getTopHour().equals("top52")) {
                kanzhi.setJiCnt(kanzhi.getJiCnt() + 1);
            }
            if (kanzhi.getBottomYear().equals("bottom52")) {
                kanzhi.setJiCnt(kanzhi.getJiCnt() + 1);
            }
            if (kanzhi.getBottomMonth().equals("bottom52")) {
                kanzhi.setJiCnt(kanzhi.getJiCnt() + 1);
            }
            if (kanzhi.getBottomHour().equals("bottom52")) {
                kanzhi.setJiCnt(kanzhi.getJiCnt() + 1);
            }
        } else if (kanzhi.getTopDay().equals("top12")) {
            if (kanzhi.getTopYear().equals("top11")) {
                kanzhi.setGjCnt(kanzhi.getGjCnt() + 1);
            }
            if (kanzhi.getTopMonth().equals("top11")) {
                kanzhi.setGjCnt(kanzhi.getGjCnt() + 1);
            }
            if (kanzhi.getTopHour().equals("top11")) {
                kanzhi.setGjCnt(kanzhi.getGjCnt() + 1);
            }
            if (kanzhi.getBottomYear().equals("bottom11")) {
                kanzhi.setGjCnt(kanzhi.getGjCnt() + 1);
            }
            if (kanzhi.getBottomMonth().equals("bottom11")) {
                kanzhi.setGjCnt(kanzhi.getGjCnt() + 1);
            }
            if (kanzhi.getBottomHour().equals("bottom11")) {
                kanzhi.setGjCnt(kanzhi.getGjCnt() + 1);
            }


            //
            if (kanzhi.getTopYear().equals("top12")) {
                kanzhi.setBgCnt(kanzhi.getBgCnt() + 1);
            }
            if (kanzhi.getTopMonth().equals("top12")) {
                kanzhi.setBgCnt(kanzhi.getBgCnt() + 1);
            }
            if (kanzhi.getTopHour().equals("top12")) {
                kanzhi.setBgCnt(kanzhi.getBgCnt() + 1);
            }
            if (kanzhi.getBottomYear().equals("bottom12")) {
                kanzhi.setBgCnt(kanzhi.getBgCnt() + 1);
            }
            if (kanzhi.getBottomMonth().equals("bottom12")) {
                kanzhi.setBgCnt(kanzhi.getBgCnt() + 1);
            }
            if (kanzhi.getBottomHour().equals("bottom12")) {
                kanzhi.setBgCnt(kanzhi.getBgCnt() + 1);
            }


            //
            if (kanzhi.getTopYear().equals("top21")) {
                kanzhi.setSgCnt(kanzhi.getSgCnt() + 1);
            }
            if (kanzhi.getTopMonth().equals("top21")) {
                kanzhi.setSgCnt(kanzhi.getSgCnt() + 1);
            }
            if (kanzhi.getTopHour().equals("top21")) {
                kanzhi.setSgCnt(kanzhi.getSgCnt() + 1);
            }
            if (kanzhi.getBottomYear().equals("bottom21")) {
                kanzhi.setSgCnt(kanzhi.getSgCnt() + 1);
            }
            if (kanzhi.getBottomMonth().equals("bottom21")) {
                kanzhi.setSgCnt(kanzhi.getSgCnt() + 1);
            }
            if (kanzhi.getBottomHour().equals("bottom21")) {
                kanzhi.setSgCnt(kanzhi.getSgCnt() + 1);
            }


            //
            if (kanzhi.getTopYear().equals("top22")) {
                kanzhi.setSsCnt(kanzhi.getSsCnt() + 1);
            }
            if (kanzhi.getTopMonth().equals("top22")) {
                kanzhi.setSsCnt(kanzhi.getSsCnt() + 1);
            }
            if (kanzhi.getTopHour().equals("top22")) {
                kanzhi.setSsCnt(kanzhi.getSsCnt() + 1);
            }
            if (kanzhi.getBottomYear().equals("bottom22")) {
                kanzhi.setSsCnt(kanzhi.getSsCnt() + 1);
            }
            if (kanzhi.getBottomMonth().equals("bottom22")) {
                kanzhi.setSsCnt(kanzhi.getSsCnt() + 1);
            }
            if (kanzhi.getBottomHour().equals("bottom22")) {
                kanzhi.setSsCnt(kanzhi.getSsCnt() + 1);
            }


            //
            if (kanzhi.getTopYear().equals("top31")) {
                kanzhi.setJjCnt(kanzhi.getJjCnt() + 1);
            }
            if (kanzhi.getTopMonth().equals("top31")) {
                kanzhi.setJjCnt(kanzhi.getJjCnt() + 1);
            }
            if (kanzhi.getTopHour().equals("top31")) {
                kanzhi.setJjCnt(kanzhi.getJjCnt() + 1);
            }
            if (kanzhi.getBottomYear().equals("bottom31")) {
                kanzhi.setJjCnt(kanzhi.getJjCnt() + 1);
            }
            if (kanzhi.getBottomMonth().equals("bottom31")) {
                kanzhi.setJjCnt(kanzhi.getJjCnt() + 1);
            }
            if (kanzhi.getBottomHour().equals("bottom31")) {
                kanzhi.setJjCnt(kanzhi.getJjCnt() + 1);
            }
            if (kanzhi.getBottomYear().equals("bottom33")) {
                kanzhi.setJjCnt(kanzhi.getJjCnt() + 1);
            }
            if (kanzhi.getBottomMonth().equals("bottom33")) {
                kanzhi.setJjCnt(kanzhi.getJjCnt() + 1);
            }
            if (kanzhi.getBottomHour().equals("bottom33")) {
                kanzhi.setJjCnt(kanzhi.getJjCnt() + 1);
            }


            //
            if (kanzhi.getTopYear().equals("top32")) {
                kanzhi.setPjCnt(kanzhi.getPjCnt() + 1);
            }
            if (kanzhi.getTopMonth().equals("top32")) {
                kanzhi.setPjCnt(kanzhi.getPjCnt() + 1);
            }
            if (kanzhi.getTopHour().equals("top32")) {
                kanzhi.setPjCnt(kanzhi.getPjCnt() + 1);
            }
            if (kanzhi.getBottomYear().equals("bottom32")) {
                kanzhi.setPjCnt(kanzhi.getPjCnt() + 1);
            }
            if (kanzhi.getBottomMonth().equals("bottom32")) {
                kanzhi.setPjCnt(kanzhi.getPjCnt() + 1);
            }
            if (kanzhi.getBottomHour().equals("bottom32")) {
                kanzhi.setPjCnt(kanzhi.getPjCnt() + 1);
            }
            if (kanzhi.getBottomYear().equals("bottom34")) {
                kanzhi.setPjCnt(kanzhi.getPjCnt() + 1);
            }
            if (kanzhi.getBottomMonth().equals("bottom34")) {
                kanzhi.setPjCnt(kanzhi.getPjCnt() + 1);
            }
            if (kanzhi.getBottomHour().equals("bottom34")) {
                kanzhi.setPjCnt(kanzhi.getPjCnt() + 1);
            }


            //
            if (kanzhi.getTopYear().equals("top41")) {
                kanzhi.setJgCnt(kanzhi.getJgCnt() + 1);
            }
            if (kanzhi.getTopMonth().equals("top41")) {
                kanzhi.setJgCnt(kanzhi.getJgCnt() + 1);
            }
            if (kanzhi.getTopHour().equals("top41")) {
                kanzhi.setJgCnt(kanzhi.getJgCnt() + 1);
            }
            if (kanzhi.getBottomYear().equals("bottom41")) {
                kanzhi.setJgCnt(kanzhi.getJgCnt() + 1);
            }
            if (kanzhi.getBottomMonth().equals("bottom41")) {
                kanzhi.setJgCnt(kanzhi.getJgCnt() + 1);
            }
            if (kanzhi.getBottomHour().equals("bottom41")) {
                kanzhi.setJgCnt(kanzhi.getJgCnt() + 1);
            }


            //
            if (kanzhi.getTopYear().equals("top42")) {
                kanzhi.setPgCnt(kanzhi.getPgCnt() + 1);
            }
            if (kanzhi.getTopMonth().equals("top42")) {
                kanzhi.setPgCnt(kanzhi.getPgCnt() + 1);
            }
            if (kanzhi.getTopHour().equals("top42")) {
                kanzhi.setPgCnt(kanzhi.getPgCnt() + 1);
            }
            if (kanzhi.getBottomYear().equals("bottom42")) {
                kanzhi.setPgCnt(kanzhi.getPgCnt() + 1);
            }
            if (kanzhi.getBottomMonth().equals("bottom42")) {
                kanzhi.setPgCnt(kanzhi.getPgCnt() + 1);
            }
            if (kanzhi.getBottomHour().equals("bottom42")) {
                kanzhi.setPgCnt(kanzhi.getPgCnt() + 1);
            }


            //
            if (kanzhi.getTopYear().equals("top51")) {
                kanzhi.setJiCnt(kanzhi.getJiCnt() + 1);
            }
            if (kanzhi.getTopMonth().equals("top51")) {
                kanzhi.setJiCnt(kanzhi.getJiCnt() + 1);
            }
            if (kanzhi.getTopHour().equals("top51")) {
                kanzhi.setJiCnt(kanzhi.getJiCnt() + 1);
            }
            if (kanzhi.getBottomYear().equals("bottom51")) {
                kanzhi.setJiCnt(kanzhi.getJiCnt() + 1);
            }
            if (kanzhi.getBottomMonth().equals("bottom51")) {
                kanzhi.setJiCnt(kanzhi.getJiCnt() + 1);
            }
            if (kanzhi.getBottomHour().equals("bottom51")) {
                kanzhi.setJiCnt(kanzhi.getJiCnt() + 1);
            }


            //
            if (kanzhi.getTopYear().equals("top52")) {
                kanzhi.setPiCnt(kanzhi.getPiCnt() + 1);
            }
            if (kanzhi.getTopMonth().equals("top52")) {
                kanzhi.setPiCnt(kanzhi.getPiCnt() + 1);
            }
            if (kanzhi.getTopHour().equals("top52")) {
                kanzhi.setPiCnt(kanzhi.getPiCnt() + 1);
            }
            if (kanzhi.getBottomYear().equals("bottom52")) {
                kanzhi.setPiCnt(kanzhi.getPiCnt() + 1);
            }
            if (kanzhi.getBottomMonth().equals("bottom52")) {
                kanzhi.setPiCnt(kanzhi.getPiCnt() + 1);
            }
            if (kanzhi.getBottomHour().equals("bottom52")) {
                kanzhi.setPiCnt(kanzhi.getPiCnt() + 1);
            }

        } else if (kanzhi.getTopDay().equals("top21")) {
            if (kanzhi.getTopYear().equals("top11")) {
                kanzhi.setPiCnt(kanzhi.getPiCnt() + 1);
            }

            if (kanzhi.getTopMonth().equals("top11")) {
                kanzhi.setPiCnt(kanzhi.getPiCnt() + 1);
            }
            if (kanzhi.getTopHour().equals("top11")) {
                kanzhi.setPiCnt(kanzhi.getPiCnt() + 1);
            }
            if (kanzhi.getBottomYear().equals("bottom11")) {
                kanzhi.setPiCnt(kanzhi.getPiCnt() + 1);
            }
            if (kanzhi.getBottomMonth().equals("bottom11")) {
                kanzhi.setPiCnt(kanzhi.getPiCnt() + 1);
            }
            if (kanzhi.getBottomHour().equals("bottom11")) {
                kanzhi.setPiCnt(kanzhi.getPiCnt() + 1);
            }


            //
            if (kanzhi.getTopYear().equals("top12")) {
                kanzhi.setJiCnt(kanzhi.getJiCnt() + 1);
            }
            if (kanzhi.getTopMonth().equals("top12")) {
                kanzhi.setJiCnt(kanzhi.getJiCnt() + 1);
            }
            if (kanzhi.getTopHour().equals("top12")) {
                kanzhi.setJiCnt(kanzhi.getJiCnt() + 1);
            }
            if (kanzhi.getBottomYear().equals("bottom12")) {
                kanzhi.setJiCnt(kanzhi.getJiCnt() + 1);
            }
            if (kanzhi.getBottomMonth().equals("bottom12")) {
                kanzhi.setJiCnt(kanzhi.getJiCnt() + 1);
            }
            if (kanzhi.getBottomHour().equals("bottom12")) {
                kanzhi.setJiCnt(kanzhi.getJiCnt() + 1);
            }


            //
            if (kanzhi.getTopYear().equals("top21")) {
                kanzhi.setBgCnt(kanzhi.getBgCnt() + 1);
            }
            if (kanzhi.getTopMonth().equals("top21")) {
                kanzhi.setBgCnt(kanzhi.getBgCnt() + 1);
            }
            if (kanzhi.getTopHour().equals("top21")) {
                kanzhi.setBgCnt(kanzhi.getBgCnt() + 1);
            }
            if (kanzhi.getBottomYear().equals("bottom21")) {
                kanzhi.setBgCnt(kanzhi.getBgCnt() + 1);
            }
            if (kanzhi.getBottomMonth().equals("bottom21")) {
                kanzhi.setBgCnt(kanzhi.getBgCnt() + 1);
            }
            if (kanzhi.getBottomHour().equals("bottom21")) {
                kanzhi.setBgCnt(kanzhi.getBgCnt() + 1);
            }


            //
            if (kanzhi.getTopYear().equals("top22")) {
                kanzhi.setGjCnt(kanzhi.getGjCnt() + 1);
            }
            if (kanzhi.getTopMonth().equals("top22")) {
                kanzhi.setGjCnt(kanzhi.getGjCnt() + 1);
            }
            if (kanzhi.getTopHour().equals("top22")) {
                kanzhi.setGjCnt(kanzhi.getGjCnt() + 1);
            }
            if (kanzhi.getBottomYear().equals("bottom22")) {
                kanzhi.setGjCnt(kanzhi.getGjCnt() + 1);
            }
            if (kanzhi.getBottomMonth().equals("bottom22")) {
                kanzhi.setGjCnt(kanzhi.getGjCnt() + 1);
            }
            if (kanzhi.getBottomHour().equals("bottom22")) {
                kanzhi.setGjCnt(kanzhi.getGjCnt() + 1);
            }


            //
            if (kanzhi.getTopYear().equals("top31")) {
                kanzhi.setSsCnt(kanzhi.getSsCnt() + 1);
            }
            if (kanzhi.getTopMonth().equals("top31")) {
                kanzhi.setSsCnt(kanzhi.getSsCnt() + 1);
            }
            if (kanzhi.getTopHour().equals("top31")) {
                kanzhi.setSsCnt(kanzhi.getSsCnt() + 1);
            }
            if (kanzhi.getBottomYear().equals("bottom31")) {
                kanzhi.setSsCnt(kanzhi.getSsCnt() + 1);
            }
            if (kanzhi.getBottomMonth().equals("bottom31")) {
                kanzhi.setSsCnt(kanzhi.getSsCnt() + 1);
            }
            if (kanzhi.getBottomHour().equals("bottom31")) {
                kanzhi.setSsCnt(kanzhi.getSsCnt() + 1);
            }
            if (kanzhi.getBottomYear().equals("bottom33")) {
                kanzhi.setSsCnt(kanzhi.getSsCnt() + 1);
            }
            if (kanzhi.getBottomMonth().equals("bottom33")) {
                kanzhi.setSsCnt(kanzhi.getSsCnt() + 1);
            }
            if (kanzhi.getBottomHour().equals("bottom33")) {
                kanzhi.setSsCnt(kanzhi.getSsCnt() + 1);
            }


            //
            if (kanzhi.getTopYear().equals("top32")) {
                kanzhi.setSgCnt(kanzhi.getSgCnt() + 1);
            }
            if (kanzhi.getTopMonth().equals("top32")) {
                kanzhi.setSgCnt(kanzhi.getSgCnt() + 1);
            }
            if (kanzhi.getTopHour().equals("top32")) {
                kanzhi.setSgCnt(kanzhi.getSgCnt() + 1);
            }
            if (kanzhi.getBottomYear().equals("bottom32")) {
                kanzhi.setSgCnt(kanzhi.getSgCnt() + 1);
            }
            if (kanzhi.getBottomMonth().equals("bottom32")) {
                kanzhi.setSgCnt(kanzhi.getSgCnt() + 1);
            }
            if (kanzhi.getBottomHour().equals("bottom32")) {
                kanzhi.setSgCnt(kanzhi.getSgCnt() + 1);
            }
            if (kanzhi.getBottomYear().equals("bottom34")) {
                kanzhi.setSgCnt(kanzhi.getSgCnt() + 1);
            }
            if (kanzhi.getBottomMonth().equals("bottom34")) {
                kanzhi.setSgCnt(kanzhi.getSgCnt() + 1);
            }
            if (kanzhi.getBottomHour().equals("bottom34")) {
                kanzhi.setSgCnt(kanzhi.getSgCnt() + 1);
            }


            //
            if (kanzhi.getTopYear().equals("top41")) {
                kanzhi.setPjCnt(kanzhi.getPjCnt() + 1);
            }
            if (kanzhi.getTopMonth().equals("top41")) {
                kanzhi.setPjCnt(kanzhi.getPjCnt() + 1);
            }
            if (kanzhi.getTopHour().equals("top41")) {
                kanzhi.setPjCnt(kanzhi.getPjCnt() + 1);
            }
            if (kanzhi.getBottomYear().equals("bottom41")) {
                kanzhi.setPjCnt(kanzhi.getPjCnt() + 1);
            }
            if (kanzhi.getBottomMonth().equals("bottom41")) {
                kanzhi.setPjCnt(kanzhi.getPjCnt() + 1);
            }
            if (kanzhi.getBottomHour().equals("bottom41")) {
                kanzhi.setPjCnt(kanzhi.getPjCnt() + 1);
            }


            //
            if (kanzhi.getTopYear().equals("top42")) {
                kanzhi.setJjCnt(kanzhi.getJjCnt() + 1);
            }
            if (kanzhi.getTopMonth().equals("top42")) {
                kanzhi.setJjCnt(kanzhi.getJjCnt() + 1);
            }
            if (kanzhi.getTopHour().equals("top42")) {
                kanzhi.setJjCnt(kanzhi.getJjCnt() + 1);
            }
            if (kanzhi.getBottomYear().equals("bottom42")) {
                kanzhi.setJjCnt(kanzhi.getJjCnt() + 1);
            }
            if (kanzhi.getBottomMonth().equals("bottom42")) {
                kanzhi.setJjCnt(kanzhi.getJjCnt() + 1);
            }
            if (kanzhi.getBottomHour().equals("bottom42")) {
                kanzhi.setJjCnt(kanzhi.getJjCnt() + 1);
            }


            //
            if (kanzhi.getTopYear().equals("top51")) {
                kanzhi.setPgCnt(kanzhi.getPgCnt() + 1);
            }
            if (kanzhi.getTopMonth().equals("top51")) {
                kanzhi.setPgCnt(kanzhi.getPgCnt() + 1);
            }
            if (kanzhi.getTopHour().equals("top51")) {
                kanzhi.setPgCnt(kanzhi.getPgCnt() + 1);
            }
            if (kanzhi.getBottomYear().equals("bottom51")) {
                kanzhi.setPgCnt(kanzhi.getPgCnt() + 1);
            }
            if (kanzhi.getBottomMonth().equals("bottom51")) {
                kanzhi.setPgCnt(kanzhi.getPgCnt() + 1);
            }
            if (kanzhi.getBottomHour().equals("bottom51")) {
                kanzhi.setPgCnt(kanzhi.getPgCnt() + 1);
            }


            //
            if (kanzhi.getTopYear().equals("top52")) {
                kanzhi.setJgCnt(kanzhi.getJgCnt() + 1);
            }
            if (kanzhi.getTopMonth().equals("top52")) {
                kanzhi.setJgCnt(kanzhi.getJgCnt() + 1);
            }
            if (kanzhi.getTopHour().equals("top52")) {
                kanzhi.setJgCnt(kanzhi.getJgCnt() + 1);
            }
            if (kanzhi.getBottomYear().equals("bottom52")) {
                kanzhi.setJgCnt(kanzhi.getJgCnt() + 1);
            }
            if (kanzhi.getBottomMonth().equals("bottom52")) {
                kanzhi.setJgCnt(kanzhi.getJgCnt() + 1);
            }
            if (kanzhi.getBottomHour().equals("bottom52")) {
                kanzhi.setJgCnt(kanzhi.getJgCnt() + 1);
            }
        } else if (kanzhi.getTopDay().equals("top22")) {
            if (kanzhi.getTopYear().equals("top11")) {
                kanzhi.setJiCnt(kanzhi.getJiCnt() + 1);
            }
            if (kanzhi.getTopMonth().equals("top11")) {
                kanzhi.setJiCnt(kanzhi.getJiCnt() + 1);
            }
            if (kanzhi.getTopHour().equals("top11")) {
                kanzhi.setJiCnt(kanzhi.getJiCnt() + 1);
            }
            if (kanzhi.getBottomYear().equals("bottom11")) {
                kanzhi.setJiCnt(kanzhi.getJiCnt() + 1);
            }
            if (kanzhi.getBottomMonth().equals("bottom11")) {
                kanzhi.setJiCnt(kanzhi.getJiCnt() + 1);
            }
            if (kanzhi.getBottomHour().equals("bottom11")) {
                kanzhi.setJiCnt(kanzhi.getJiCnt() + 1);
            }


            //
            if (kanzhi.getTopYear().equals("top12")) {
                kanzhi.setPiCnt(kanzhi.getPiCnt() + 1);
            }
            if (kanzhi.getTopMonth().equals("top12")) {
                kanzhi.setPiCnt(kanzhi.getPiCnt() + 1);
            }
            if (kanzhi.getTopHour().equals("top12")) {
                kanzhi.setPiCnt(kanzhi.getPiCnt() + 1);
            }
            if (kanzhi.getBottomYear().equals("bottom12")) {
                kanzhi.setPiCnt(kanzhi.getPiCnt() + 1);
            }
            if (kanzhi.getBottomMonth().equals("bottom12")) {
                kanzhi.setPiCnt(kanzhi.getPiCnt() + 1);
            }
            if (kanzhi.getBottomHour().equals("bottom12")) {
                kanzhi.setPiCnt(kanzhi.getPiCnt() + 1);
            }


            //
            if (kanzhi.getTopYear().equals("top21")) {
                kanzhi.setGjCnt(kanzhi.getGjCnt() + 1);
            }
            if (kanzhi.getTopMonth().equals("top21")) {
                kanzhi.setGjCnt(kanzhi.getGjCnt() + 1);
            }
            if (kanzhi.getTopHour().equals("top21")) {
                kanzhi.setGjCnt(kanzhi.getGjCnt() + 1);
            }
            if (kanzhi.getBottomYear().equals("bottom21")) {
                kanzhi.setGjCnt(kanzhi.getGjCnt() + 1);
            }
            if (kanzhi.getBottomMonth().equals("bottom21")) {
                kanzhi.setGjCnt(kanzhi.getGjCnt() + 1);
            }
            if (kanzhi.getBottomHour().equals("bottom21")) {
                kanzhi.setGjCnt(kanzhi.getGjCnt() + 1);
            }


            //
            if (kanzhi.getTopYear().equals("top22")) {
                kanzhi.setBgCnt(kanzhi.getBgCnt() + 1);
            }
            if (kanzhi.getTopMonth().equals("top22")) {
                kanzhi.setBgCnt(kanzhi.getBgCnt() + 1);
            }
            if (kanzhi.getTopHour().equals("top22")) {
                kanzhi.setBgCnt(kanzhi.getBgCnt() + 1);
            }
            if (kanzhi.getBottomYear().equals("bottom22")) {
                kanzhi.setBgCnt(kanzhi.getBgCnt() + 1);
            }
            if (kanzhi.getBottomMonth().equals("bottom22")) {
                kanzhi.setBgCnt(kanzhi.getBgCnt() + 1);
            }
            if (kanzhi.getBottomHour().equals("bottom22")) {
                kanzhi.setBgCnt(kanzhi.getBgCnt() + 1);
            }


            //
            if (kanzhi.getTopYear().equals("top31")) {
                kanzhi.setSgCnt(kanzhi.getSgCnt() + 1);
            }
            if (kanzhi.getTopMonth().equals("top31")) {
                kanzhi.setSgCnt(kanzhi.getSgCnt() + 1);
            }
            if (kanzhi.getTopHour().equals("top31")) {
                kanzhi.setSgCnt(kanzhi.getSgCnt() + 1);
            }
            if (kanzhi.getBottomYear().equals("bottom31")) {
                kanzhi.setSgCnt(kanzhi.getSgCnt() + 1);
            }
            if (kanzhi.getBottomMonth().equals("bottom31")) {
                kanzhi.setSgCnt(kanzhi.getSgCnt() + 1);
            }
            if (kanzhi.getBottomHour().equals("bottom31")) {
                kanzhi.setSgCnt(kanzhi.getSgCnt() + 1);
            }
            if (kanzhi.getBottomYear().equals("bottom33")) {
                kanzhi.setSgCnt(kanzhi.getSgCnt() + 1);
            }
            if (kanzhi.getBottomMonth().equals("bottom33")) {
                kanzhi.setSgCnt(kanzhi.getSgCnt() + 1);
            }
            if (kanzhi.getBottomHour().equals("bottom33")) {
                kanzhi.setSgCnt(kanzhi.getSgCnt() + 1);
            }


            //
            if (kanzhi.getTopYear().equals("top32")) {
                kanzhi.setSsCnt(kanzhi.getSsCnt() + 1);
            }
            if (kanzhi.getTopMonth().equals("top32")) {
                kanzhi.setSsCnt(kanzhi.getSsCnt() + 1);
            }
            if (kanzhi.getTopHour().equals("top32")) {
                kanzhi.setSsCnt(kanzhi.getSsCnt() + 1);
            }
            if (kanzhi.getBottomYear().equals("bottom32")) {
                kanzhi.setSsCnt(kanzhi.getSsCnt() + 1);
            }
            if (kanzhi.getBottomMonth().equals("bottom32")) {
                kanzhi.setSsCnt(kanzhi.getSsCnt() + 1);
            }
            if (kanzhi.getBottomHour().equals("bottom32")) {
                kanzhi.setSsCnt(kanzhi.getSsCnt() + 1);
            }
            if (kanzhi.getBottomYear().equals("bottom34")) {
                kanzhi.setSsCnt(kanzhi.getSsCnt() + 1);
            }
            if (kanzhi.getBottomMonth().equals("bottom34")) {
                kanzhi.setSsCnt(kanzhi.getSsCnt() + 1);
            }
            if (kanzhi.getBottomHour().equals("bottom34")) {
                kanzhi.setSsCnt(kanzhi.getSsCnt() + 1);
            }

            //
            if (kanzhi.getTopYear().equals("top41")) {
                kanzhi.setJjCnt(kanzhi.getJjCnt() + 1);
            }
            if (kanzhi.getTopMonth().equals("top41")) {
                kanzhi.setJjCnt(kanzhi.getJjCnt() + 1);
            }
            if (kanzhi.getTopHour().equals("top41")) {
                kanzhi.setJjCnt(kanzhi.getJjCnt() + 1);
            }
            if (kanzhi.getBottomYear().equals("bottom41")) {
                kanzhi.setJjCnt(kanzhi.getJjCnt() + 1);
            }
            if (kanzhi.getBottomMonth().equals("bottom41")) {
                kanzhi.setJjCnt(kanzhi.getJjCnt() + 1);
            }
            if (kanzhi.getBottomHour().equals("bottom41")) {
                kanzhi.setJjCnt(kanzhi.getJjCnt() + 1);
            }


            //
            if (kanzhi.getTopYear().equals("top42")) {
                kanzhi.setPjCnt(kanzhi.getPjCnt() + 1);
            }
            if (kanzhi.getTopMonth().equals("top42")) {
                kanzhi.setPjCnt(kanzhi.getPjCnt() + 1);
            }
            if (kanzhi.getTopHour().equals("top42")) {
                kanzhi.setPjCnt(kanzhi.getPjCnt() + 1);
            }
            if (kanzhi.getBottomYear().equals("bottom42")) {
                kanzhi.setPjCnt(kanzhi.getPjCnt() + 1);
            }
            if (kanzhi.getBottomMonth().equals("bottom42")) {
                kanzhi.setPjCnt(kanzhi.getPjCnt() + 1);
            }
            if (kanzhi.getBottomHour().equals("bottom42")) {
                kanzhi.setPjCnt(kanzhi.getPjCnt() + 1);
            }


            //
            if (kanzhi.getTopYear().equals("top51")) {
                kanzhi.setJgCnt(kanzhi.getJgCnt() + 1);
            }
            if (kanzhi.getTopMonth().equals("top51")) {
                kanzhi.setJgCnt(kanzhi.getJgCnt() + 1);
            }
            if (kanzhi.getTopHour().equals("top51")) {
                kanzhi.setJgCnt(kanzhi.getJgCnt() + 1);
            }
            if (kanzhi.getBottomYear().equals("bottom51")) {
                kanzhi.setJgCnt(kanzhi.getJgCnt() + 1);
            }
            if (kanzhi.getBottomMonth().equals("bottom51")) {
                kanzhi.setJgCnt(kanzhi.getJgCnt() + 1);
            }
            if (kanzhi.getBottomHour().equals("bottom51")) {
                kanzhi.setJgCnt(kanzhi.getJgCnt() + 1);
            }


            //
            if (kanzhi.getTopYear().equals("top52")) {
                kanzhi.setPgCnt(kanzhi.getPgCnt() + 1);
            }
            if (kanzhi.getTopMonth().equals("top52")) {
                kanzhi.setPgCnt(kanzhi.getPgCnt() + 1);
            }
            if (kanzhi.getTopHour().equals("top52")) {
                kanzhi.setPgCnt(kanzhi.getPgCnt() + 1);
            }
            if (kanzhi.getBottomYear().equals("bottom52")) {
                kanzhi.setPgCnt(kanzhi.getPgCnt() + 1);
            }
            if (kanzhi.getBottomMonth().equals("bottom52")) {
                kanzhi.setPgCnt(kanzhi.getPgCnt() + 1);
            }
            if (kanzhi.getBottomHour().equals("bottom52")) {
                kanzhi.setPgCnt(kanzhi.getPgCnt() + 1);
            }
        } else if (kanzhi.getTopDay().equals("top31")) {
            if (kanzhi.getTopYear().equals("top11")) {
                kanzhi.setPgCnt(kanzhi.getPgCnt() + 1);
            }
            if (kanzhi.getTopMonth().equals("top11")) {
                kanzhi.setPgCnt(kanzhi.getPgCnt() + 1);
            }
            if (kanzhi.getTopHour().equals("top11")) {
                kanzhi.setPgCnt(kanzhi.getPgCnt() + 1);
            }
            if (kanzhi.getBottomYear().equals("bottom11")) {
                kanzhi.setPgCnt(kanzhi.getPgCnt() + 1);
            }
            if (kanzhi.getBottomMonth().equals("bottom11")) {
                kanzhi.setPgCnt(kanzhi.getPgCnt() + 1);
            }
            if (kanzhi.getBottomHour().equals("bottom11")) {
                kanzhi.setPgCnt(kanzhi.getPgCnt() + 1);
            }


            //
            if (kanzhi.getTopYear().equals("top12")) {
                kanzhi.setJgCnt(kanzhi.getJgCnt() + 1);
            }
            if (kanzhi.getTopMonth().equals("top12")) {
                kanzhi.setJgCnt(kanzhi.getJgCnt() + 1);
            }
            if (kanzhi.getTopHour().equals("top12")) {
                kanzhi.setJgCnt(kanzhi.getJgCnt() + 1);
            }
            if (kanzhi.getBottomYear().equals("bottom12")) {
                kanzhi.setJgCnt(kanzhi.getJgCnt() + 1);
            }
            if (kanzhi.getBottomMonth().equals("bottom12")) {
                kanzhi.setJgCnt(kanzhi.getJgCnt() + 1);
            }
            if (kanzhi.getBottomHour().equals("bottom12")) {
                kanzhi.setJgCnt(kanzhi.getJgCnt() + 1);
            }


            //
            if (kanzhi.getTopYear().equals("top21")) {
                kanzhi.setPiCnt(kanzhi.getPiCnt() + 1);
            }
            if (kanzhi.getTopMonth().equals("top21")) {
                kanzhi.setPiCnt(kanzhi.getPiCnt() + 1);
            }
            if (kanzhi.getTopHour().equals("top21")) {
                kanzhi.setPiCnt(kanzhi.getPiCnt() + 1);
            }
            if (kanzhi.getBottomYear().equals("bottom21")) {
                kanzhi.setPiCnt(kanzhi.getPiCnt() + 1);
            }
            if (kanzhi.getBottomMonth().equals("bottom21")) {
                kanzhi.setPiCnt(kanzhi.getPiCnt() + 1);
            }
            if (kanzhi.getBottomHour().equals("bottom21")) {
                kanzhi.setPiCnt(kanzhi.getPiCnt() + 1);
            }


            //
            if (kanzhi.getTopYear().equals("top22")) {
                kanzhi.setJiCnt(kanzhi.getJiCnt() + 1);
            }
            if (kanzhi.getTopMonth().equals("top22")) {
                kanzhi.setJiCnt(kanzhi.getJiCnt() + 1);
            }
            if (kanzhi.getTopHour().equals("top22")) {
                kanzhi.setJiCnt(kanzhi.getJiCnt() + 1);
            }
            if (kanzhi.getBottomYear().equals("bottom22")) {
                kanzhi.setJiCnt(kanzhi.getJiCnt() + 1);
            }
            if (kanzhi.getBottomMonth().equals("bottom22")) {
                kanzhi.setJiCnt(kanzhi.getJiCnt() + 1);
            }
            if (kanzhi.getBottomHour().equals("bottom22")) {
                kanzhi.setJiCnt(kanzhi.getJiCnt() + 1);
            }


            //
            if (kanzhi.getTopYear().equals("top31")) {
                kanzhi.setBgCnt(kanzhi.getBgCnt() + 1);
            }
            if (kanzhi.getTopMonth().equals("top31")) {
                kanzhi.setBgCnt(kanzhi.getBgCnt() + 1);
            }
            if (kanzhi.getTopHour().equals("top31")) {
                kanzhi.setBgCnt(kanzhi.getBgCnt() + 1);
            }
            if (kanzhi.getBottomYear().equals("bottom31")) {
                kanzhi.setBgCnt(kanzhi.getBgCnt() + 1);
            }
            if (kanzhi.getBottomMonth().equals("bottom31")) {
                kanzhi.setBgCnt(kanzhi.getBgCnt() + 1);
            }
            if (kanzhi.getBottomHour().equals("bottom31")) {
                kanzhi.setBgCnt(kanzhi.getBgCnt() + 1);
            }
            if (kanzhi.getBottomYear().equals("bottom33")) {
                kanzhi.setBgCnt(kanzhi.getBgCnt() + 1);
            }
            if (kanzhi.getBottomMonth().equals("bottom33")) {
                kanzhi.setBgCnt(kanzhi.getBgCnt() + 1);
            }
            if (kanzhi.getBottomHour().equals("bottom33")) {
                kanzhi.setBgCnt(kanzhi.getBgCnt() + 1);
            }


            //
            if (kanzhi.getTopYear().equals("top32")) {
                kanzhi.setGjCnt(kanzhi.getGjCnt() + 1);
            }
            if (kanzhi.getTopMonth().equals("top32")) {
                kanzhi.setGjCnt(kanzhi.getGjCnt() + 1);
            }
            if (kanzhi.getTopHour().equals("top32")) {
                kanzhi.setGjCnt(kanzhi.getGjCnt() + 1);
            }
            if (kanzhi.getBottomYear().equals("bottom32")) {
                kanzhi.setGjCnt(kanzhi.getGjCnt() + 1);
            }
            if (kanzhi.getBottomMonth().equals("bottom32")) {
                kanzhi.setGjCnt(kanzhi.getGjCnt() + 1);
            }
            if (kanzhi.getBottomHour().equals("bottom32")) {
                kanzhi.setGjCnt(kanzhi.getGjCnt() + 1);
            }
            if (kanzhi.getBottomYear().equals("bottom34")) {
                kanzhi.setGjCnt(kanzhi.getGjCnt() + 1);
            }
            if (kanzhi.getBottomMonth().equals("bottom34")) {
                kanzhi.setGjCnt(kanzhi.getGjCnt() + 1);
            }
            if (kanzhi.getBottomHour().equals("bottom34")) {
                kanzhi.setGjCnt(kanzhi.getGjCnt() + 1);
            }


            //
            if (kanzhi.getTopYear().equals("top41")) {
                kanzhi.setSsCnt(kanzhi.getSsCnt() + 1);
            }
            if (kanzhi.getTopMonth().equals("top41")) {
                kanzhi.setSsCnt(kanzhi.getSsCnt() + 1);
            }
            if (kanzhi.getTopHour().equals("top41")) {
                kanzhi.setSsCnt(kanzhi.getSsCnt() + 1);
            }
            if (kanzhi.getBottomYear().equals("bottom41")) {
                kanzhi.setSsCnt(kanzhi.getSsCnt() + 1);
            }
            if (kanzhi.getBottomMonth().equals("bottom41")) {
                kanzhi.setSsCnt(kanzhi.getSsCnt() + 1);
            }
            if (kanzhi.getBottomHour().equals("bottom41")) {
                kanzhi.setSsCnt(kanzhi.getSsCnt() + 1);
            }


            //
            if (kanzhi.getTopYear().equals("top42")) {
                kanzhi.setSgCnt(kanzhi.getSgCnt() + 1);
            }
            if (kanzhi.getTopMonth().equals("top42")) {
                kanzhi.setSgCnt(kanzhi.getSgCnt() + 1);
            }
            if (kanzhi.getTopHour().equals("top42")) {
                kanzhi.setSgCnt(kanzhi.getSgCnt() + 1);
            }
            if (kanzhi.getBottomYear().equals("bottom42")) {
                kanzhi.setSgCnt(kanzhi.getSgCnt() + 1);
            }
            if (kanzhi.getBottomMonth().equals("bottom42")) {
                kanzhi.setSgCnt(kanzhi.getSgCnt() + 1);
            }
            if (kanzhi.getBottomHour().equals("bottom42")) {
                kanzhi.setSgCnt(kanzhi.getSgCnt() + 1);
            }


            //
            if (kanzhi.getTopYear().equals("top51")) {
                kanzhi.setPjCnt(kanzhi.getPjCnt() + 1);
            }
            if (kanzhi.getTopMonth().equals("top51")) {
                kanzhi.setPjCnt(kanzhi.getPjCnt() + 1);
            }
            if (kanzhi.getTopHour().equals("top51")) {
                kanzhi.setPjCnt(kanzhi.getPjCnt() + 1);
            }
            if (kanzhi.getBottomYear().equals("bottom51")) {
                kanzhi.setPjCnt(kanzhi.getPjCnt() + 1);
            }
            if (kanzhi.getBottomMonth().equals("bottom51")) {
                kanzhi.setPjCnt(kanzhi.getPjCnt() + 1);
            }
            if (kanzhi.getBottomHour().equals("bottom51")) {
                kanzhi.setPjCnt(kanzhi.getPjCnt() + 1);
            }


            //
            if (kanzhi.getTopYear().equals("top52")) {
                kanzhi.setJjCnt(kanzhi.getJjCnt() + 1);
            }
            if (kanzhi.getTopMonth().equals("top52")) {
                kanzhi.setJjCnt(kanzhi.getJjCnt() + 1);
            }
            if (kanzhi.getTopHour().equals("top52")) {
                kanzhi.setJjCnt(kanzhi.getJjCnt() + 1);
            }
            if (kanzhi.getBottomYear().equals("bottom52")) {
                kanzhi.setJjCnt(kanzhi.getJjCnt() + 1);
            }
            if (kanzhi.getBottomMonth().equals("bottom52")) {
                kanzhi.setJjCnt(kanzhi.getJjCnt() + 1);
            }
            if (kanzhi.getBottomHour().equals("bottom52")) {
                kanzhi.setJjCnt(kanzhi.getJjCnt() + 1);
            }
        } else if (kanzhi.getTopDay().equals("top32")) {
            if (kanzhi.getTopYear().equals("top11")) {
                kanzhi.setJgCnt(kanzhi.getJgCnt() + 1);
            }
            if (kanzhi.getTopMonth().equals("top11")) {
                kanzhi.setJgCnt(kanzhi.getJgCnt() + 1);
            }
            if (kanzhi.getTopHour().equals("top11")) {
                kanzhi.setJgCnt(kanzhi.getJgCnt() + 1);
            }
            if (kanzhi.getBottomYear().equals("bottom11")) {
                kanzhi.setJgCnt(kanzhi.getJgCnt() + 1);
            }
            if (kanzhi.getBottomMonth().equals("bottom11")) {
                kanzhi.setJgCnt(kanzhi.getJgCnt() + 1);
            }
            if (kanzhi.getBottomHour().equals("bottom11")) {
                kanzhi.setJgCnt(kanzhi.getJgCnt() + 1);
            }


            //
            if (kanzhi.getTopYear().equals("top12")) {
                kanzhi.setPgCnt(kanzhi.getPgCnt() + 1);
            }
            if (kanzhi.getTopMonth().equals("top12")) {
                kanzhi.setPgCnt(kanzhi.getPgCnt() + 1);
            }
            if (kanzhi.getTopHour().equals("top12")) {
                kanzhi.setPgCnt(kanzhi.getPgCnt() + 1);
            }
            if (kanzhi.getBottomYear().equals("bottom12")) {
                kanzhi.setPgCnt(kanzhi.getPgCnt() + 1);
            }
            if (kanzhi.getBottomMonth().equals("bottom12")) {
                kanzhi.setPgCnt(kanzhi.getPgCnt() + 1);
            }
            if (kanzhi.getBottomHour().equals("bottom12")) {
                kanzhi.setPgCnt(kanzhi.getPgCnt() + 1);
            }


            //
            if (kanzhi.getTopYear().equals("top21")) {
                kanzhi.setJiCnt(kanzhi.getJiCnt() + 1);
            }
            if (kanzhi.getTopMonth().equals("top21")) {
                kanzhi.setJiCnt(kanzhi.getJiCnt() + 1);
            }
            if (kanzhi.getTopHour().equals("top21")) {
                kanzhi.setJiCnt(kanzhi.getJiCnt() + 1);
            }
            if (kanzhi.getBottomYear().equals("bottom21")) {
                kanzhi.setJiCnt(kanzhi.getJiCnt() + 1);
            }
            if (kanzhi.getBottomMonth().equals("bottom21")) {
                kanzhi.setJiCnt(kanzhi.getJiCnt() + 1);
            }
            if (kanzhi.getBottomHour().equals("bottom21")) {
                kanzhi.setJiCnt(kanzhi.getJiCnt() + 1);
            }


            //
            if (kanzhi.getTopYear().equals("top22")) {
                kanzhi.setPiCnt(kanzhi.getPiCnt() + 1);
            }
            if (kanzhi.getTopMonth().equals("top22")) {
                kanzhi.setPiCnt(kanzhi.getPiCnt() + 1);
            }
            if (kanzhi.getTopHour().equals("top22")) {
                kanzhi.setPiCnt(kanzhi.getPiCnt() + 1);
            }
            if (kanzhi.getBottomYear().equals("bottom22")) {
                kanzhi.setPiCnt(kanzhi.getPiCnt() + 1);
            }
            if (kanzhi.getBottomMonth().equals("bottom22")) {
                kanzhi.setPiCnt(kanzhi.getPiCnt() + 1);
            }
            if (kanzhi.getBottomHour().equals("bottom22")) {
                kanzhi.setPiCnt(kanzhi.getPiCnt() + 1);
            }


            //
            if (kanzhi.getTopYear().equals("top31")) {
                kanzhi.setGjCnt(kanzhi.getGjCnt() + 1);
            }
            if (kanzhi.getTopMonth().equals("top31")) {
                kanzhi.setGjCnt(kanzhi.getGjCnt() + 1);
            }
            if (kanzhi.getTopHour().equals("top31")) {
                kanzhi.setGjCnt(kanzhi.getGjCnt() + 1);
            }
            if (kanzhi.getBottomYear().equals("bottom31")) {
                kanzhi.setGjCnt(kanzhi.getGjCnt() + 1);
            }
            if (kanzhi.getBottomMonth().equals("bottom31")) {
                kanzhi.setGjCnt(kanzhi.getGjCnt() + 1);
            }
            if (kanzhi.getBottomHour().equals("bottom31")) {
                kanzhi.setGjCnt(kanzhi.getGjCnt() + 1);
            }
            if (kanzhi.getBottomYear().equals("bottom33")) {
                kanzhi.setGjCnt(kanzhi.getGjCnt() + 1);
            }
            if (kanzhi.getBottomMonth().equals("bottom33")) {
                kanzhi.setGjCnt(kanzhi.getGjCnt() + 1);
            }
            if (kanzhi.getBottomHour().equals("bottom33")) {
                kanzhi.setGjCnt(kanzhi.getGjCnt() + 1);
            }


            //
            if (kanzhi.getTopYear().equals("top32")) {
                kanzhi.setBgCnt(kanzhi.getBgCnt() + 1);
            }
            if (kanzhi.getTopMonth().equals("top32")) {
                kanzhi.setBgCnt(kanzhi.getBgCnt() + 1);
            }
            if (kanzhi.getTopHour().equals("top32")) {
                kanzhi.setBgCnt(kanzhi.getBgCnt() + 1);
            }
            if (kanzhi.getBottomYear().equals("bottom32")) {
                kanzhi.setBgCnt(kanzhi.getBgCnt() + 1);
            }
            if (kanzhi.getBottomMonth().equals("bottom32")) {
                kanzhi.setBgCnt(kanzhi.getBgCnt() + 1);
            }
            if (kanzhi.getBottomHour().equals("bottom32")) {
                kanzhi.setBgCnt(kanzhi.getBgCnt() + 1);
            }
            if (kanzhi.getBottomYear().equals("bottom34")) {
                kanzhi.setBgCnt(kanzhi.getBgCnt() + 1);
            }
            if (kanzhi.getBottomMonth().equals("bottom34")) {
                kanzhi.setBgCnt(kanzhi.getBgCnt() + 1);
            }
            if (kanzhi.getBottomHour().equals("bottom34")) {
                kanzhi.setBgCnt(kanzhi.getBgCnt() + 1);
            }

            //
            if (kanzhi.getTopYear().equals("top41")) {
                kanzhi.setSgCnt(kanzhi.getSgCnt() + 1);
            }
            if (kanzhi.getTopMonth().equals("top41")) {
                kanzhi.setSgCnt(kanzhi.getSgCnt() + 1);
            }
            if (kanzhi.getTopHour().equals("top41")) {
                kanzhi.setSgCnt(kanzhi.getSgCnt() + 1);
            }
            if (kanzhi.getBottomYear().equals("bottom41")) {
                kanzhi.setSgCnt(kanzhi.getSgCnt() + 1);
            }
            if (kanzhi.getBottomMonth().equals("bottom41")) {
                kanzhi.setSgCnt(kanzhi.getSgCnt() + 1);
            }
            if (kanzhi.getBottomHour().equals("bottom41")) {
                kanzhi.setSgCnt(kanzhi.getSgCnt() + 1);
            }

            //
            if (kanzhi.getTopYear().equals("top42")) {
                kanzhi.setSsCnt(kanzhi.getSsCnt() + 1);
            }
            if (kanzhi.getTopMonth().equals("top42")) {
                kanzhi.setSsCnt(kanzhi.getSsCnt() + 1);
            }
            if (kanzhi.getTopHour().equals("top42")) {
                kanzhi.setSsCnt(kanzhi.getSsCnt() + 1);
            }
            if (kanzhi.getBottomYear().equals("bottom42")) {
                kanzhi.setSsCnt(kanzhi.getSsCnt() + 1);
            }
            if (kanzhi.getBottomMonth().equals("bottom42")) {
                kanzhi.setSsCnt(kanzhi.getSsCnt() + 1);
            }
            if (kanzhi.getBottomHour().equals("bottom42")) {
                kanzhi.setSsCnt(kanzhi.getSsCnt() + 1);
            }


            //
            if (kanzhi.getTopYear().equals("top51")) {
                kanzhi.setJjCnt(kanzhi.getJjCnt() + 1);
            }
            if (kanzhi.getTopMonth().equals("top51")) {
                kanzhi.setJjCnt(kanzhi.getJjCnt() + 1);
            }
            if (kanzhi.getTopHour().equals("top51")) {
                kanzhi.setJjCnt(kanzhi.getJjCnt() + 1);
            }
            if (kanzhi.getBottomYear().equals("bottom51")) {
                kanzhi.setJjCnt(kanzhi.getJjCnt() + 1);
            }
            if (kanzhi.getBottomMonth().equals("bottom51")) {
                kanzhi.setJjCnt(kanzhi.getJjCnt() + 1);
            }
            if (kanzhi.getBottomHour().equals("bottom51")) {
                kanzhi.setJjCnt(kanzhi.getJjCnt() + 1);
            }


            //
            if (kanzhi.getTopYear().equals("top52")) {
                kanzhi.setPjCnt(kanzhi.getPjCnt() + 1);
            }
            if (kanzhi.getTopMonth().equals("top52")) {
                kanzhi.setPjCnt(kanzhi.getPjCnt() + 1);
            }
            if (kanzhi.getTopHour().equals("top52")) {
                kanzhi.setPjCnt(kanzhi.getPjCnt() + 1);
            }
            if (kanzhi.getBottomYear().equals("bottom52")) {
                kanzhi.setPjCnt(kanzhi.getPjCnt() + 1);
            }
            if (kanzhi.getBottomMonth().equals("bottom52")) {
                kanzhi.setPjCnt(kanzhi.getPjCnt() + 1);
            }
            if (kanzhi.getBottomHour().equals("bottom52")) {
                kanzhi.setPjCnt(kanzhi.getPjCnt() + 1);
            }
        } else if (kanzhi.getTopDay().equals("top41")) {
            if (kanzhi.getTopYear().equals("top11")) {
                kanzhi.setPjCnt(kanzhi.getPjCnt() + 1);
            }
            if (kanzhi.getTopMonth().equals("top11")) {
                kanzhi.setPjCnt(kanzhi.getPjCnt() + 1);
            }
            if (kanzhi.getTopHour().equals("top11")) {
                kanzhi.setPjCnt(kanzhi.getPjCnt() + 1);
            }
            if (kanzhi.getBottomYear().equals("bottom11")) {
                kanzhi.setPjCnt(kanzhi.getPjCnt() + 1);
            }
            if (kanzhi.getBottomMonth().equals("bottom11")) {
                kanzhi.setPjCnt(kanzhi.getPjCnt() + 1);
            }
            if (kanzhi.getBottomHour().equals("bottom11")) {
                kanzhi.setPjCnt(kanzhi.getPjCnt() + 1);
            }


            //
            if (kanzhi.getTopYear().equals("top12")) {
                kanzhi.setJjCnt(kanzhi.getJjCnt() + 1);
            }
            if (kanzhi.getTopMonth().equals("top12")) {
                kanzhi.setJjCnt(kanzhi.getJjCnt() + 1);
            }
            if (kanzhi.getTopHour().equals("top12")) {
                kanzhi.setJjCnt(kanzhi.getJjCnt() + 1);
            }
            if (kanzhi.getBottomYear().equals("bottom12")) {
                kanzhi.setJjCnt(kanzhi.getJjCnt() + 1);
            }
            if (kanzhi.getBottomMonth().equals("bottom12")) {
                kanzhi.setJjCnt(kanzhi.getJjCnt() + 1);
            }
            if (kanzhi.getBottomHour().equals("bottom12")) {
                kanzhi.setJjCnt(kanzhi.getJjCnt() + 1);
            }


            //
            if (kanzhi.getTopYear().equals("top21")) {
                kanzhi.setPgCnt(kanzhi.getPgCnt() + 1);
            }
            if (kanzhi.getTopMonth().equals("top21")) {
                kanzhi.setPgCnt(kanzhi.getPgCnt() + 1);
            }
            if (kanzhi.getTopHour().equals("top21")) {
                kanzhi.setPgCnt(kanzhi.getPgCnt() + 1);
            }
            if (kanzhi.getBottomYear().equals("bottom21")) {
                kanzhi.setPgCnt(kanzhi.getPgCnt() + 1);
            }
            if (kanzhi.getBottomMonth().equals("bottom21")) {
                kanzhi.setPgCnt(kanzhi.getPgCnt() + 1);
            }
            if (kanzhi.getBottomHour().equals("bottom21")) {
                kanzhi.setPgCnt(kanzhi.getPgCnt() + 1);
            }


            //
            if (kanzhi.getTopYear().equals("top22")) {
                kanzhi.setJgCnt(kanzhi.getJgCnt() + 1);
            }
            if (kanzhi.getTopMonth().equals("top22")) {
                kanzhi.setJgCnt(kanzhi.getJgCnt() + 1);
            }
            if (kanzhi.getTopHour().equals("top22")) {
                kanzhi.setJgCnt(kanzhi.getJgCnt() + 1);
            }
            if (kanzhi.getBottomYear().equals("bottom22")) {
                kanzhi.setJgCnt(kanzhi.getJgCnt() + 1);
            }
            if (kanzhi.getBottomMonth().equals("bottom22")) {
                kanzhi.setJgCnt(kanzhi.getJgCnt() + 1);
            }
            if (kanzhi.getBottomHour().equals("bottom22")) {
                kanzhi.setJgCnt(kanzhi.getJgCnt() + 1);
            }


            //
            if (kanzhi.getTopYear().equals("top31")) {
                kanzhi.setPiCnt(kanzhi.getPiCnt() + 1);
            }
            if (kanzhi.getTopMonth().equals("top31")) {
                kanzhi.setPiCnt(kanzhi.getPiCnt() + 1);
            }
            if (kanzhi.getTopHour().equals("top31")) {
                kanzhi.setPiCnt(kanzhi.getPiCnt() + 1);
            }
            if (kanzhi.getBottomYear().equals("bottom31")) {
                kanzhi.setPiCnt(kanzhi.getPiCnt() + 1);
            }
            if (kanzhi.getBottomMonth().equals("bottom31")) {
                kanzhi.setPiCnt(kanzhi.getPiCnt() + 1);
            }
            if (kanzhi.getBottomHour().equals("bottom31")) {
                kanzhi.setPiCnt(kanzhi.getPiCnt() + 1);
            }
            if (kanzhi.getBottomYear().equals("bottom33")) {
                kanzhi.setPiCnt(kanzhi.getPiCnt() + 1);
            }
            if (kanzhi.getBottomMonth().equals("bottom33")) {
                kanzhi.setPiCnt(kanzhi.getPiCnt() + 1);
            }
            if (kanzhi.getBottomHour().equals("bottom33")) {
                kanzhi.setPiCnt(kanzhi.getPiCnt() + 1);
            }


            //
            if (kanzhi.getTopYear().equals("top32")) {
                kanzhi.setJiCnt(kanzhi.getJiCnt() + 1);
            }
            if (kanzhi.getTopMonth().equals("top32")) {
                kanzhi.setJiCnt(kanzhi.getJiCnt() + 1);
            }
            if (kanzhi.getTopHour().equals("top32")) {
                kanzhi.setJiCnt(kanzhi.getJiCnt() + 1);
            }
            if (kanzhi.getBottomYear().equals("bottom32")) {
                kanzhi.setJiCnt(kanzhi.getJiCnt() + 1);
            }
            if (kanzhi.getBottomMonth().equals("bottom32")) {
                kanzhi.setJiCnt(kanzhi.getJiCnt() + 1);
            }
            if (kanzhi.getBottomHour().equals("bottom32")) {
                kanzhi.setJiCnt(kanzhi.getJiCnt() + 1);
            }
            if (kanzhi.getBottomYear().equals("bottom34")) {
                kanzhi.setJiCnt(kanzhi.getJiCnt() + 1);
            }
            if (kanzhi.getBottomMonth().equals("bottom34")) {
                kanzhi.setJiCnt(kanzhi.getJiCnt() + 1);
            }
            if (kanzhi.getBottomHour().equals("bottom34")) {
                kanzhi.setJiCnt(kanzhi.getJiCnt() + 1);
            }


            //
            if (kanzhi.getTopYear().equals("top41")) {
                kanzhi.setBgCnt(kanzhi.getBgCnt() + 1);
            }
            if (kanzhi.getTopMonth().equals("top41")) {
                kanzhi.setBgCnt(kanzhi.getBgCnt() + 1);
            }
            if (kanzhi.getTopHour().equals("top41")) {
                kanzhi.setBgCnt(kanzhi.getBgCnt() + 1);
            }
            if (kanzhi.getBottomYear().equals("bottom41")) {
                kanzhi.setBgCnt(kanzhi.getBgCnt() + 1);
            }
            if (kanzhi.getBottomMonth().equals("bottom41")) {
                kanzhi.setBgCnt(kanzhi.getBgCnt() + 1);
            }
            if (kanzhi.getBottomHour().equals("bottom41")) {
                kanzhi.setBgCnt(kanzhi.getBgCnt() + 1);
            }


            //
            if (kanzhi.getTopYear().equals("top42")) {
                kanzhi.setGjCnt(kanzhi.getGjCnt() + 1);
            }
            if (kanzhi.getTopMonth().equals("top42")) {
                kanzhi.setGjCnt(kanzhi.getGjCnt() + 1);
            }
            if (kanzhi.getTopHour().equals("top42")) {
                kanzhi.setGjCnt(kanzhi.getGjCnt() + 1);
            }
            if (kanzhi.getBottomYear().equals("bottom42")) {
                kanzhi.setGjCnt(kanzhi.getGjCnt() + 1);
            }
            if (kanzhi.getBottomMonth().equals("bottom42")) {
                kanzhi.setGjCnt(kanzhi.getGjCnt() + 1);
            }
            if (kanzhi.getBottomHour().equals("bottom42")) {
                kanzhi.setGjCnt(kanzhi.getGjCnt() + 1);
            }


            //
            if (kanzhi.getTopYear().equals("top51")) {
                kanzhi.setSsCnt(kanzhi.getSsCnt() + 1);
            }
            if (kanzhi.getTopMonth().equals("top51")) {
                kanzhi.setSsCnt(kanzhi.getSsCnt() + 1);
            }
            if (kanzhi.getTopHour().equals("top51")) {
                kanzhi.setSsCnt(kanzhi.getSsCnt() + 1);
            }
            if (kanzhi.getBottomYear().equals("bottom51")) {
                kanzhi.setSsCnt(kanzhi.getSsCnt() + 1);
            }
            if (kanzhi.getBottomMonth().equals("bottom51")) {
                kanzhi.setSsCnt(kanzhi.getSsCnt() + 1);
            }
            if (kanzhi.getBottomHour().equals("bottom51")) {
                kanzhi.setSsCnt(kanzhi.getSsCnt() + 1);
            }


            //
            if (kanzhi.getTopYear().equals("top52")) {
                kanzhi.setSgCnt(kanzhi.getSgCnt() + 1);
            }
            if (kanzhi.getTopMonth().equals("top52")) {
                kanzhi.setSgCnt(kanzhi.getSgCnt() + 1);
            }
            if (kanzhi.getTopHour().equals("top52")) {
                kanzhi.setSgCnt(kanzhi.getSgCnt() + 1);
            }
            if (kanzhi.getBottomYear().equals("bottom52")) {
                kanzhi.setSgCnt(kanzhi.getSgCnt() + 1);
            }
            if (kanzhi.getBottomMonth().equals("bottom52")) {
                kanzhi.setSgCnt(kanzhi.getSgCnt() + 1);
            }
            if (kanzhi.getBottomHour().equals("bottom52")) {
                kanzhi.setSgCnt(kanzhi.getSgCnt() + 1);
            }
        } else if (kanzhi.getTopDay().equals("top42")) {
            if (kanzhi.getTopYear().equals("top11")) {
                kanzhi.setJjCnt(kanzhi.getJjCnt() + 1);
            }
            if (kanzhi.getTopMonth().equals("top11")) {
                kanzhi.setJjCnt(kanzhi.getJjCnt() + 1);
            }
            if (kanzhi.getTopHour().equals("top11")) {
                kanzhi.setJjCnt(kanzhi.getJjCnt() + 1);
            }
            if (kanzhi.getBottomYear().equals("bottom11")) {
                kanzhi.setJjCnt(kanzhi.getJjCnt() + 1);
            }
            if (kanzhi.getBottomMonth().equals("bottom11")) {
                kanzhi.setJjCnt(kanzhi.getJjCnt() + 1);
            }
            if (kanzhi.getBottomHour().equals("bottom11")) {
                kanzhi.setJjCnt(kanzhi.getJjCnt() + 1);
            }


            //
            if (kanzhi.getTopYear().equals("top12")) {
                kanzhi.setPjCnt(kanzhi.getPjCnt() + 1);
            }
            if (kanzhi.getTopMonth().equals("top12")) {
                kanzhi.setPjCnt(kanzhi.getPjCnt() + 1);
            }
            if (kanzhi.getTopHour().equals("top12")) {
                kanzhi.setPjCnt(kanzhi.getPjCnt() + 1);
            }
            if (kanzhi.getBottomYear().equals("bottom12")) {
                kanzhi.setPjCnt(kanzhi.getPjCnt() + 1);
            }
            if (kanzhi.getBottomMonth().equals("bottom12")) {
                kanzhi.setPjCnt(kanzhi.getPjCnt() + 1);
            }
            if (kanzhi.getBottomHour().equals("bottom12")) {
                kanzhi.setPjCnt(kanzhi.getPjCnt() + 1);
            }


            //
            if (kanzhi.getTopYear().equals("top21")) {
                kanzhi.setJgCnt(kanzhi.getJgCnt() + 1);
            }
            if (kanzhi.getTopMonth().equals("top21")) {
                kanzhi.setJgCnt(kanzhi.getJgCnt() + 1);
            }
            if (kanzhi.getTopHour().equals("top21")) {
                kanzhi.setJgCnt(kanzhi.getJgCnt() + 1);
            }
            if (kanzhi.getBottomYear().equals("bottom21")) {
                kanzhi.setJgCnt(kanzhi.getJgCnt() + 1);
            }
            if (kanzhi.getBottomMonth().equals("bottom21")) {
                kanzhi.setJgCnt(kanzhi.getJgCnt() + 1);
            }
            if (kanzhi.getBottomHour().equals("bottom21")) {
                kanzhi.setJgCnt(kanzhi.getJgCnt() + 1);
            }


            //
            if (kanzhi.getTopYear().equals("top22")) {
                kanzhi.setPgCnt(kanzhi.getPgCnt() + 1);
            }
            if (kanzhi.getTopMonth().equals("top22")) {
                kanzhi.setPgCnt(kanzhi.getPgCnt() + 1);
            }
            if (kanzhi.getTopHour().equals("top22")) {
                kanzhi.setPgCnt(kanzhi.getPgCnt() + 1);
            }
            if (kanzhi.getBottomYear().equals("bottom22")) {
                kanzhi.setPgCnt(kanzhi.getPgCnt() + 1);
            }
            if (kanzhi.getBottomMonth().equals("bottom22")) {
                kanzhi.setPgCnt(kanzhi.getPgCnt() + 1);
            }
            if (kanzhi.getBottomHour().equals("bottom22")) {
                kanzhi.setPgCnt(kanzhi.getPgCnt() + 1);
            }


            //
            if (kanzhi.getTopYear().equals("top31")) {
                kanzhi.setJiCnt(kanzhi.getJiCnt() + 1);
            }
            if (kanzhi.getTopMonth().equals("top31")) {
                kanzhi.setJiCnt(kanzhi.getJiCnt() + 1);
            }
            if (kanzhi.getTopHour().equals("top31")) {
                kanzhi.setJiCnt(kanzhi.getJiCnt() + 1);
            }
            if (kanzhi.getBottomYear().equals("bottom31")) {
                kanzhi.setJiCnt(kanzhi.getJiCnt() + 1);
            }
            if (kanzhi.getBottomMonth().equals("bottom31")) {
                kanzhi.setJiCnt(kanzhi.getJiCnt() + 1);
            }
            if (kanzhi.getBottomHour().equals("bottom31")) {
                kanzhi.setJiCnt(kanzhi.getJiCnt() + 1);
            }
            if (kanzhi.getBottomYear().equals("bottom33")) {
                kanzhi.setJiCnt(kanzhi.getJiCnt() + 1);
            }
            if (kanzhi.getBottomMonth().equals("bottom33")) {
                kanzhi.setJiCnt(kanzhi.getJiCnt() + 1);
            }
            if (kanzhi.getBottomHour().equals("bottom33")) {
                kanzhi.setJiCnt(kanzhi.getJiCnt() + 1);
            }


            //
            if (kanzhi.getTopYear().equals("top32")) {
                kanzhi.setPiCnt(kanzhi.getPiCnt() + 1);
            }
            if (kanzhi.getTopMonth().equals("top32")) {
                kanzhi.setPiCnt(kanzhi.getPiCnt() + 1);
            }
            if (kanzhi.getTopHour().equals("top32")) {
                kanzhi.setPiCnt(kanzhi.getPiCnt() + 1);
            }
            if (kanzhi.getBottomYear().equals("bottom32")) {
                kanzhi.setPiCnt(kanzhi.getPiCnt() + 1);
            }
            if (kanzhi.getBottomMonth().equals("bottom32")) {
                kanzhi.setPiCnt(kanzhi.getPiCnt() + 1);
            }
            if (kanzhi.getBottomHour().equals("bottom32")) {
                kanzhi.setPiCnt(kanzhi.getPiCnt() + 1);
            }
            if (kanzhi.getBottomYear().equals("bottom34")) {
                kanzhi.setPiCnt(kanzhi.getPiCnt() + 1);
            }
            if (kanzhi.getBottomMonth().equals("bottom34")) {
                kanzhi.setPiCnt(kanzhi.getPiCnt() + 1);
            }
            if (kanzhi.getBottomHour().equals("bottom34")) {
                kanzhi.setPiCnt(kanzhi.getPiCnt() + 1);
            }


            //
            if (kanzhi.getTopYear().equals("top41")) {
                kanzhi.setGjCnt(kanzhi.getGjCnt() + 1);
            }
            if (kanzhi.getTopMonth().equals("top41")) {
                kanzhi.setGjCnt(kanzhi.getGjCnt() + 1);
            }
            if (kanzhi.getTopHour().equals("top41")) {
                kanzhi.setGjCnt(kanzhi.getGjCnt() + 1);
            }
            if (kanzhi.getBottomYear().equals("bottom41")) {
                kanzhi.setGjCnt(kanzhi.getGjCnt() + 1);
            }
            if (kanzhi.getBottomMonth().equals("bottom41")) {
                kanzhi.setGjCnt(kanzhi.getGjCnt() + 1);
            }
            if (kanzhi.getBottomHour().equals("bottom41")) {
                kanzhi.setGjCnt(kanzhi.getGjCnt() + 1);
            }


            //
            if (kanzhi.getTopYear().equals("top42")) {
                kanzhi.setBgCnt(kanzhi.getBgCnt() + 1);
            }
            if (kanzhi.getTopMonth().equals("top42")) {
                kanzhi.setBgCnt(kanzhi.getBgCnt() + 1);
            }
            if (kanzhi.getTopHour().equals("top42")) {
                kanzhi.setBgCnt(kanzhi.getBgCnt() + 1);
            }
            if (kanzhi.getBottomYear().equals("bottom42")) {
                kanzhi.setBgCnt(kanzhi.getBgCnt() + 1);
            }
            if (kanzhi.getBottomMonth().equals("bottom42")) {
                kanzhi.setBgCnt(kanzhi.getBgCnt() + 1);
            }
            if (kanzhi.getBottomHour().equals("bottom42")) {
                kanzhi.setBgCnt(kanzhi.getBgCnt() + 1);
            }


            //
            if (kanzhi.getTopYear().equals("top51")) {
                kanzhi.setSgCnt(kanzhi.getSgCnt() + 1);
            }
            if (kanzhi.getTopMonth().equals("top51")) {
                kanzhi.setSgCnt(kanzhi.getSgCnt() + 1);
            }
            if (kanzhi.getTopHour().equals("top51")) {
                kanzhi.setSgCnt(kanzhi.getSgCnt() + 1);
            }
            if (kanzhi.getBottomYear().equals("bottom51")) {
                kanzhi.setSgCnt(kanzhi.getSgCnt() + 1);
            }
            if (kanzhi.getBottomMonth().equals("bottom51")) {
                kanzhi.setSgCnt(kanzhi.getSgCnt() + 1);
            }
            if (kanzhi.getBottomHour().equals("bottom51")) {
                kanzhi.setSgCnt(kanzhi.getSgCnt() + 1);
            }


            //
            if (kanzhi.getTopYear().equals("top52")) {
                kanzhi.setSsCnt(kanzhi.getSsCnt() + 1);
            }
            if (kanzhi.getTopMonth().equals("top52")) {
                kanzhi.setSsCnt(kanzhi.getSsCnt() + 1);
            }
            if (kanzhi.getTopHour().equals("top52")) {
                kanzhi.setSsCnt(kanzhi.getSsCnt() + 1);
            }
            if (kanzhi.getBottomYear().equals("bottom52")) {
                kanzhi.setSsCnt(kanzhi.getSsCnt() + 1);
            }
            if (kanzhi.getBottomMonth().equals("bottom52")) {
                kanzhi.setSsCnt(kanzhi.getSsCnt() + 1);
            }
            if (kanzhi.getBottomHour().equals("bottom52")) {
                kanzhi.setSsCnt(kanzhi.getSsCnt() + 1);
            }
        } else if (kanzhi.getTopDay().equals("top51")) {
            if (kanzhi.getTopYear().equals("top11")) {
                kanzhi.setSsCnt(kanzhi.getSsCnt() + 1);
            }
            if (kanzhi.getTopMonth().equals("top11")) {
                kanzhi.setSsCnt(kanzhi.getSsCnt() + 1);
            }
            if (kanzhi.getTopHour().equals("top11")) {
                kanzhi.setSsCnt(kanzhi.getSsCnt() + 1);
            }
            if (kanzhi.getBottomYear().equals("bottom11")) {
                kanzhi.setSsCnt(kanzhi.getSsCnt() + 1);
            }
            if (kanzhi.getBottomMonth().equals("bottom11")) {
                kanzhi.setSsCnt(kanzhi.getSsCnt() + 1);
            }
            if (kanzhi.getBottomHour().equals("bottom11")) {
                kanzhi.setSsCnt(kanzhi.getSsCnt() + 1);
            }


            //
            if (kanzhi.getTopYear().equals("top12")) {
                kanzhi.setSgCnt(kanzhi.getSgCnt() + 1);
            }
            if (kanzhi.getTopMonth().equals("top12")) {
                kanzhi.setSgCnt(kanzhi.getSgCnt() + 1);
            }
            if (kanzhi.getTopHour().equals("top12")) {
                kanzhi.setSgCnt(kanzhi.getSgCnt() + 1);
            }
            if (kanzhi.getBottomYear().equals("bottom12")) {
                kanzhi.setSgCnt(kanzhi.getSgCnt() + 1);
            }
            if (kanzhi.getBottomMonth().equals("bottom12")) {
                kanzhi.setSgCnt(kanzhi.getSgCnt() + 1);
            }
            if (kanzhi.getBottomHour().equals("bottom12")) {
                kanzhi.setSgCnt(kanzhi.getSgCnt() + 1);
            }


            //
            if (kanzhi.getTopYear().equals("top21")) {
                kanzhi.setPjCnt(kanzhi.getPjCnt() + 1);
            }
            if (kanzhi.getTopMonth().equals("top21")) {
                kanzhi.setPjCnt(kanzhi.getPjCnt() + 1);
            }
            if (kanzhi.getTopHour().equals("top21")) {
                kanzhi.setPjCnt(kanzhi.getPjCnt() + 1);
            }
            if (kanzhi.getBottomYear().equals("bottom21")) {
                kanzhi.setPjCnt(kanzhi.getPjCnt() + 1);
            }
            if (kanzhi.getBottomMonth().equals("bottom21")) {
                kanzhi.setPjCnt(kanzhi.getPjCnt() + 1);
            }
            if (kanzhi.getBottomHour().equals("bottom21")) {
                kanzhi.setPjCnt(kanzhi.getPjCnt() + 1);
            }


            //
            if (kanzhi.getTopYear().equals("top22")) {
                kanzhi.setJjCnt(kanzhi.getJjCnt() + 1);
            }
            if (kanzhi.getTopMonth().equals("top22")) {
                kanzhi.setJjCnt(kanzhi.getJjCnt() + 1);
            }
            if (kanzhi.getTopHour().equals("top22")) {
                kanzhi.setJjCnt(kanzhi.getJjCnt() + 1);
            }
            if (kanzhi.getBottomYear().equals("bottom22")) {
                kanzhi.setJjCnt(kanzhi.getJjCnt() + 1);
            }
            if (kanzhi.getBottomMonth().equals("bottom22")) {
                kanzhi.setJjCnt(kanzhi.getJjCnt() + 1);
            }
            if (kanzhi.getBottomHour().equals("bottom22")) {
                kanzhi.setJjCnt(kanzhi.getJjCnt() + 1);
            }


            //
            if (kanzhi.getTopYear().equals("top31")) {
                kanzhi.setPgCnt(kanzhi.getPgCnt() + 1);
            }
            if (kanzhi.getTopMonth().equals("top31")) {
                kanzhi.setPgCnt(kanzhi.getPgCnt() + 1);
            }
            if (kanzhi.getTopHour().equals("top31")) {
                kanzhi.setPgCnt(kanzhi.getPgCnt() + 1);
            }
            if (kanzhi.getBottomYear().equals("bottom31")) {
                kanzhi.setPgCnt(kanzhi.getPgCnt() + 1);
            }
            if (kanzhi.getBottomMonth().equals("bottom31")) {
                kanzhi.setPgCnt(kanzhi.getPgCnt() + 1);
            }
            if (kanzhi.getBottomHour().equals("bottom31")) {
                kanzhi.setPgCnt(kanzhi.getPgCnt() + 1);
            }
            if (kanzhi.getBottomYear().equals("bottom33")) {
                kanzhi.setPgCnt(kanzhi.getPgCnt() + 1);
            }
            if (kanzhi.getBottomMonth().equals("bottom33")) {
                kanzhi.setPgCnt(kanzhi.getPgCnt() + 1);
            }
            if (kanzhi.getBottomHour().equals("bottom33")) {
                kanzhi.setPgCnt(kanzhi.getPgCnt() + 1);
            }


            //
            if (kanzhi.getTopYear().equals("top32")) {
                kanzhi.setJgCnt(kanzhi.getJgCnt() + 1);
            }
            if (kanzhi.getTopMonth().equals("top32")) {
                kanzhi.setJgCnt(kanzhi.getJgCnt() + 1);
            }
            if (kanzhi.getTopHour().equals("top32")) {
                kanzhi.setJgCnt(kanzhi.getJgCnt() + 1);
            }
            if (kanzhi.getBottomYear().equals("bottom32")) {
                kanzhi.setJgCnt(kanzhi.getJgCnt() + 1);
            }
            if (kanzhi.getBottomMonth().equals("bottom32")) {
                kanzhi.setJgCnt(kanzhi.getJgCnt() + 1);
            }
            if (kanzhi.getBottomHour().equals("bottom32")) {
                kanzhi.setJgCnt(kanzhi.getJgCnt() + 1);
            }
            if (kanzhi.getBottomYear().equals("bottom34")) {
                kanzhi.setJgCnt(kanzhi.getJgCnt() + 1);
            }
            if (kanzhi.getBottomMonth().equals("bottom34")) {
                kanzhi.setJgCnt(kanzhi.getJgCnt() + 1);
            }
            if (kanzhi.getBottomHour().equals("bottom34")) {
                kanzhi.setJgCnt(kanzhi.getJgCnt() + 1);
            }


            //
            if (kanzhi.getTopYear().equals("top41")) {
                kanzhi.setPiCnt(kanzhi.getPiCnt() + 1);
            }
            if (kanzhi.getTopMonth().equals("top41")) {
                kanzhi.setPiCnt(kanzhi.getPiCnt() + 1);
            }
            if (kanzhi.getTopHour().equals("top41")) {
                kanzhi.setPiCnt(kanzhi.getPiCnt() + 1);
            }
            if (kanzhi.getBottomYear().equals("bottom41")) {
                kanzhi.setPiCnt(kanzhi.getPiCnt() + 1);
            }
            if (kanzhi.getBottomMonth().equals("bottom41")) {
                kanzhi.setPiCnt(kanzhi.getPiCnt() + 1);
            }
            if (kanzhi.getBottomHour().equals("bottom41")) {
                kanzhi.setPiCnt(kanzhi.getPiCnt() + 1);
            }


            //
            if (kanzhi.getTopYear().equals("top42")) {
                kanzhi.setJiCnt(kanzhi.getJiCnt() + 1);
            }
            if (kanzhi.getTopMonth().equals("top42")) {
                kanzhi.setJiCnt(kanzhi.getJiCnt() + 1);
            }
            if (kanzhi.getTopHour().equals("top42")) {
                kanzhi.setJiCnt(kanzhi.getJiCnt() + 1);
            }
            if (kanzhi.getBottomYear().equals("bottom42")) {
                kanzhi.setJiCnt(kanzhi.getJiCnt() + 1);
            }
            if (kanzhi.getBottomMonth().equals("bottom42")) {
                kanzhi.setJiCnt(kanzhi.getJiCnt() + 1);
            }
            if (kanzhi.getBottomHour().equals("bottom42")) {
                kanzhi.setJiCnt(kanzhi.getJiCnt() + 1);
            }


            //
            if (kanzhi.getTopYear().equals("top51")) {
                kanzhi.setBgCnt(kanzhi.getBgCnt() + 1);
            }
            if (kanzhi.getTopMonth().equals("top51")) {
                kanzhi.setBgCnt(kanzhi.getBgCnt() + 1);
            }
            if (kanzhi.getTopHour().equals("top51")) {
                kanzhi.setBgCnt(kanzhi.getBgCnt() + 1);
            }
            if (kanzhi.getBottomYear().equals("bottom51")) {
                kanzhi.setBgCnt(kanzhi.getBgCnt() + 1);
            }
            if (kanzhi.getBottomMonth().equals("bottom51")) {
                kanzhi.setBgCnt(kanzhi.getBgCnt() + 1);
            }
            if (kanzhi.getBottomHour().equals("bottom51")) {
                kanzhi.setBgCnt(kanzhi.getBgCnt() + 1);
            }


            //
            if (kanzhi.getTopYear().equals("top52")) {
                kanzhi.setGjCnt(kanzhi.getGjCnt() + 1);
            }
            if (kanzhi.getTopMonth().equals("top52")) {
                kanzhi.setGjCnt(kanzhi.getGjCnt() + 1);
            }
            if (kanzhi.getTopHour().equals("top52")) {
                kanzhi.setGjCnt(kanzhi.getGjCnt() + 1);
            }
            if (kanzhi.getBottomYear().equals("bottom52")) {
                kanzhi.setGjCnt(kanzhi.getGjCnt() + 1);
            }
            if (kanzhi.getBottomMonth().equals("bottom52")) {
                kanzhi.setGjCnt(kanzhi.getGjCnt() + 1);
            }
            if (kanzhi.getBottomHour().equals("bottom52")) {
                kanzhi.setGjCnt(kanzhi.getGjCnt() + 1);
            }
        } else if (kanzhi.getTopDay().equals("top52")) {
            if (kanzhi.getTopYear().equals("top11")) {
                kanzhi.setSgCnt(kanzhi.getSgCnt() + 1);
            }
            if (kanzhi.getTopMonth().equals("top11")) {
                kanzhi.setSgCnt(kanzhi.getSgCnt() + 1);
            }
            if (kanzhi.getTopHour().equals("top11")) {
                kanzhi.setSgCnt(kanzhi.getSgCnt() + 1);
            }
            if (kanzhi.getBottomYear().equals("bottom11")) {
                kanzhi.setSgCnt(kanzhi.getSgCnt() + 1);
            }
            if (kanzhi.getBottomMonth().equals("bottom11")) {
                kanzhi.setSgCnt(kanzhi.getSgCnt() + 1);
            }
            if (kanzhi.getBottomHour().equals("bottom11")) {
                kanzhi.setSgCnt(kanzhi.getSgCnt() + 1);
            }


            //
            if (kanzhi.getTopYear().equals("top12")) {
                kanzhi.setSsCnt(kanzhi.getSsCnt() + 1);
            }
            if (kanzhi.getTopMonth().equals("top12")) {
                kanzhi.setSsCnt(kanzhi.getSsCnt() + 1);
            }
            if (kanzhi.getTopHour().equals("top12")) {
                kanzhi.setSsCnt(kanzhi.getSsCnt() + 1);
            }
            if (kanzhi.getBottomYear().equals("bottom12")) {
                kanzhi.setSsCnt(kanzhi.getSsCnt() + 1);
            }
            if (kanzhi.getBottomMonth().equals("bottom12")) {
                kanzhi.setSsCnt(kanzhi.getSsCnt() + 1);
            }
            if (kanzhi.getBottomHour().equals("bottom12")) {
                kanzhi.setSsCnt(kanzhi.getSsCnt() + 1);
            }


            //
            if (kanzhi.getTopYear().equals("top21")) {
                kanzhi.setJjCnt(kanzhi.getJjCnt() + 1);
            }
            if (kanzhi.getTopMonth().equals("top21")) {
                kanzhi.setJjCnt(kanzhi.getJjCnt() + 1);
            }
            if (kanzhi.getTopHour().equals("top21")) {
                kanzhi.setJjCnt(kanzhi.getJjCnt() + 1);
            }
            if (kanzhi.getBottomYear().equals("bottom21")) {
                kanzhi.setJjCnt(kanzhi.getJjCnt() + 1);
            }
            if (kanzhi.getBottomMonth().equals("bottom21")) {
                kanzhi.setJjCnt(kanzhi.getJjCnt() + 1);
            }
            if (kanzhi.getBottomHour().equals("bottom21")) {
                kanzhi.setJjCnt(kanzhi.getJjCnt() + 1);
            }


            //
            if (kanzhi.getTopYear().equals("top22")) {
                kanzhi.setPjCnt(kanzhi.getPjCnt() + 1);
            }
            if (kanzhi.getTopMonth().equals("top22")) {
                kanzhi.setPjCnt(kanzhi.getPjCnt() + 1);
            }
            if (kanzhi.getTopHour().equals("top22")) {
                kanzhi.setPjCnt(kanzhi.getPjCnt() + 1);
            }
            if (kanzhi.getBottomYear().equals("bottom22")) {
                kanzhi.setPjCnt(kanzhi.getPjCnt() + 1);
            }
            if (kanzhi.getBottomMonth().equals("bottom22")) {
                kanzhi.setPjCnt(kanzhi.getPjCnt() + 1);
            }
            if (kanzhi.getBottomHour().equals("bottom22")) {
                kanzhi.setPjCnt(kanzhi.getPjCnt() + 1);
            }


            //
            if (kanzhi.getTopYear().equals("top31")) {
                kanzhi.setJgCnt(kanzhi.getJgCnt() + 1);
            }
            if (kanzhi.getTopMonth().equals("top31")) {
                kanzhi.setJgCnt(kanzhi.getJgCnt() + 1);
            }
            if (kanzhi.getTopHour().equals("top31")) {
                kanzhi.setJgCnt(kanzhi.getJgCnt() + 1);
            }
            if (kanzhi.getBottomYear().equals("bottom31")) {
                kanzhi.setJgCnt(kanzhi.getJgCnt() + 1);
            }
            if (kanzhi.getBottomMonth().equals("bottom31")) {
                kanzhi.setJgCnt(kanzhi.getJgCnt() + 1);
            }
            if (kanzhi.getBottomHour().equals("bottom31")) {
                kanzhi.setJgCnt(kanzhi.getJgCnt() + 1);
            }
            if (kanzhi.getBottomYear().equals("bottom33")) {
                kanzhi.setJgCnt(kanzhi.getJgCnt() + 1);
            }
            if (kanzhi.getBottomMonth().equals("bottom33")) {
                kanzhi.setJgCnt(kanzhi.getJgCnt() + 1);
            }
            if (kanzhi.getBottomHour().equals("bottom33")) {
                kanzhi.setJgCnt(kanzhi.getJgCnt() + 1);
            }


            //
            if (kanzhi.getTopYear().equals("top32")) {
                kanzhi.setPgCnt(kanzhi.getPgCnt() + 1);
            }
            if (kanzhi.getTopMonth().equals("top32")) {
                kanzhi.setPgCnt(kanzhi.getPgCnt() + 1);
            }
            if (kanzhi.getTopHour().equals("top32")) {
                kanzhi.setPgCnt(kanzhi.getPgCnt() + 1);
            }
            if (kanzhi.getBottomYear().equals("bottom32")) {
                kanzhi.setPgCnt(kanzhi.getPgCnt() + 1);
            }
            if (kanzhi.getBottomMonth().equals("bottom32")) {
                kanzhi.setPgCnt(kanzhi.getPgCnt() + 1);
            }
            if (kanzhi.getBottomHour().equals("bottom32")) {
                kanzhi.setPgCnt(kanzhi.getPgCnt() + 1);
            }
            if (kanzhi.getBottomYear().equals("bottom34")) {
                kanzhi.setPgCnt(kanzhi.getPgCnt() + 1);
            }
            if (kanzhi.getBottomMonth().equals("bottom34")) {
                kanzhi.setPgCnt(kanzhi.getPgCnt() + 1);
            }
            if (kanzhi.getBottomHour().equals("bottom34")) {
                kanzhi.setPgCnt(kanzhi.getPgCnt() + 1);
            }

            //
            if (kanzhi.getTopYear().equals("top41")) {
                kanzhi.setJiCnt(kanzhi.getJiCnt() + 1);
            }
            if (kanzhi.getTopMonth().equals("top41")) {
                kanzhi.setJiCnt(kanzhi.getJiCnt() + 1);
            }
            if (kanzhi.getTopHour().equals("top41")) {
                kanzhi.setJiCnt(kanzhi.getJiCnt() + 1);
            }
            if (kanzhi.getBottomYear().equals("bottom41")) {
                kanzhi.setJiCnt(kanzhi.getJiCnt() + 1);
            }
            if (kanzhi.getBottomMonth().equals("bottom41")) {
                kanzhi.setJiCnt(kanzhi.getJiCnt() + 1);
            }
            if (kanzhi.getBottomHour().equals("bottom41")) {
                kanzhi.setJiCnt(kanzhi.getJiCnt() + 1);
            }


            //
            if (kanzhi.getTopYear().equals("top42")) {
                kanzhi.setPiCnt(kanzhi.getPiCnt() + 1);
            }
            if (kanzhi.getTopMonth().equals("top42")) {
                kanzhi.setPiCnt(kanzhi.getPiCnt() + 1);
            }
            if (kanzhi.getTopHour().equals("top42")) {
                kanzhi.setPiCnt(kanzhi.getPiCnt() + 1);
            }
            if (kanzhi.getBottomYear().equals("bottom42")) {
                kanzhi.setPiCnt(kanzhi.getPiCnt() + 1);
            }
            if (kanzhi.getBottomMonth().equals("bottom42")) {
                kanzhi.setPiCnt(kanzhi.getPiCnt() + 1);
            }
            if (kanzhi.getBottomHour().equals("bottom42")) {
                kanzhi.setPiCnt(kanzhi.getPiCnt() + 1);
            }


            //
            if (kanzhi.getTopYear().equals("top51")) {
                kanzhi.setGjCnt(kanzhi.getGjCnt() + 1);
            }
            if (kanzhi.getTopMonth().equals("top51")) {
                kanzhi.setGjCnt(kanzhi.getGjCnt() + 1);
            }
            if (kanzhi.getTopHour().equals("top51")) {
                kanzhi.setGjCnt(kanzhi.getGjCnt() + 1);
            }
            if (kanzhi.getBottomYear().equals("bottom51")) {
                kanzhi.setGjCnt(kanzhi.getGjCnt() + 1);
            }
            if (kanzhi.getBottomMonth().equals("bottom51")) {
                kanzhi.setGjCnt(kanzhi.getGjCnt() + 1);
            }
            if (kanzhi.getBottomHour().equals("bottom51")) {
                kanzhi.setGjCnt(kanzhi.getGjCnt() + 1);
            }


            //
            if (kanzhi.getTopYear().equals("top52")) {
                kanzhi.setBgCnt(kanzhi.getBgCnt() + 1);
            }
            if (kanzhi.getTopMonth().equals("top52")) {
                kanzhi.setBgCnt(kanzhi.getBgCnt() + 1);
            }
            if (kanzhi.getTopHour().equals("top52")) {
                kanzhi.setBgCnt(kanzhi.getBgCnt() + 1);
            }
            if (kanzhi.getBottomYear().equals("bottom52")) {
                kanzhi.setBgCnt(kanzhi.getBgCnt() + 1);
            }
            if (kanzhi.getBottomMonth().equals("bottom52")) {
                kanzhi.setBgCnt(kanzhi.getBgCnt() + 1);
            }
            if (kanzhi.getBottomHour().equals("bottom52")) {
                kanzhi.setBgCnt(kanzhi.getBgCnt() + 1);
            }
        }
    }

    public void kanzhiFleshPosition(KanzhiVO kanzhi) {

        if (kanzhi.getTopDay().equals("top11")) {
            if (kanzhi.getTopYear().equals("top11")) {
                kanzhi.setTopYearFlesh("BG");
            } else if(kanzhi.getTopYear().equals("top12")) {
                kanzhi.setTopYearFlesh("GJ");
            } else if(kanzhi.getTopYear().equals("top21")) {
                kanzhi.setTopYearFlesh("SS");
            } else if(kanzhi.getTopYear().equals("top22")) {
                kanzhi.setTopYearFlesh("SG");
            } else if(kanzhi.getTopYear().equals("top31")) {
                kanzhi.setTopYearFlesh("PJ");
            } else if(kanzhi.getTopYear().equals("top32")) {
                kanzhi.setTopYearFlesh("JJ");
            } else if(kanzhi.getTopYear().equals("top41")) {
                kanzhi.setTopYearFlesh("PG");
            } else if(kanzhi.getTopYear().equals("top32")) {
                kanzhi.setTopYearFlesh("JG");
            } else if(kanzhi.getTopYear().equals("top51")) {
                kanzhi.setTopYearFlesh("PI");
            } else if(kanzhi.getTopYear().equals("top52")) {
                kanzhi.setTopYearFlesh("JI");
            }

            if (kanzhi.getTopMonth().equals("top11")) {
                kanzhi.setTopMonthFlesh("BG");
            } else if(kanzhi.getTopMonth().equals("top12")) {
                kanzhi.setTopMonthFlesh("GJ");
            } else if(kanzhi.getTopMonth().equals("top21")) {
                kanzhi.setTopMonthFlesh("SS");
            } else if(kanzhi.getTopMonth().equals("top22")) {
                kanzhi.setTopMonthFlesh("SG");
            } else if(kanzhi.getTopMonth().equals("top31")) {
                kanzhi.setTopMonthFlesh("PJ");
            } else if(kanzhi.getTopMonth().equals("top32")) {
                kanzhi.setTopMonthFlesh("JJ");
            } else if(kanzhi.getTopMonth().equals("top41")) {
                kanzhi.setTopMonthFlesh("PG");
            } else if(kanzhi.getTopMonth().equals("top32")) {
                kanzhi.setTopMonthFlesh("JG");
            } else if(kanzhi.getTopMonth().equals("top51")) {
                kanzhi.setTopMonthFlesh("PI");
            } else if(kanzhi.getTopMonth().equals("top52")) {
                kanzhi.setTopMonthFlesh("JI");
            }

            if (kanzhi.getTopHour().equals("top11")) {
                kanzhi.setTopHourFlesh("BG");
            } else if(kanzhi.getTopHour().equals("top12")) {
                kanzhi.setTopHourFlesh("GJ");
            } else if(kanzhi.getTopHour().equals("top21")) {
                kanzhi.setTopHourFlesh("SS");
            } else if(kanzhi.getTopHour().equals("top22")) {
                kanzhi.setTopHourFlesh("SG");
            } else if(kanzhi.getTopHour().equals("top31")) {
                kanzhi.setTopHourFlesh("PJ");
            } else if(kanzhi.getTopHour().equals("top32")) {
                kanzhi.setTopHourFlesh("JJ");
            } else if(kanzhi.getTopHour().equals("top41")) {
                kanzhi.setTopHourFlesh("PG");
            } else if(kanzhi.getTopHour().equals("top32")) {
                kanzhi.setTopHourFlesh("JG");
            } else if(kanzhi.getTopHour().equals("top51")) {
                kanzhi.setTopHourFlesh("PI");
            } else if(kanzhi.getTopHour().equals("top52")) {
                kanzhi.setTopHourFlesh("JI");
            }

            if (kanzhi.getBottomYear().equals("bottom11")) {
                kanzhi.setBottomYearFlesh("BG");
            } else if(kanzhi.getBottomYear().equals("bottom12")) {
                kanzhi.setBottomYearFlesh("GJ");
            } else if(kanzhi.getBottomYear().equals("bottom21")) {
                kanzhi.setBottomYearFlesh("SS");
            } else if(kanzhi.getBottomYear().equals("bottom22")) {
                kanzhi.setBottomYearFlesh("SG");
            } else if(kanzhi.getBottomYear().equals("bottom31") || kanzhi.getBottomYear().equals("bottom33")) {
                kanzhi.setBottomYearFlesh("PJ");
            } else if(kanzhi.getBottomYear().equals("bottom32") || kanzhi.getBottomYear().equals("bottom34")) {
                kanzhi.setBottomYearFlesh("JJ");
            } else if(kanzhi.getBottomYear().equals("bottom41")) {
                kanzhi.setBottomYearFlesh("PG");
            } else if(kanzhi.getBottomYear().equals("bottom42")) {
                kanzhi.setBottomYearFlesh("JG");
            } else if(kanzhi.getBottomYear().equals("bottom51")) {
                kanzhi.setBottomYearFlesh("PI");
            } else if(kanzhi.getBottomYear().equals("bottom52")) {
                kanzhi.setBottomYearFlesh("JI");
            }

            if (kanzhi.getBottomMonth().equals("bottom11")) {
                kanzhi.setBottomMonthFlesh("BG");
            } else if(kanzhi.getBottomMonth().equals("bottom12")) {
                kanzhi.setBottomMonthFlesh("GJ");
            } else if(kanzhi.getBottomMonth().equals("bottom21")) {
                kanzhi.setBottomMonthFlesh("SS");
            } else if(kanzhi.getBottomMonth().equals("bottom22")) {
                kanzhi.setBottomMonthFlesh("SG");
            } else if(kanzhi.getBottomMonth().equals("bottom31") || kanzhi.getBottomMonth().equals("bottom33")) {
                kanzhi.setBottomMonthFlesh("PJ");
            } else if(kanzhi.getBottomMonth().equals("bottom32") || kanzhi.getBottomMonth().equals("bottom34")) {
                kanzhi.setBottomMonthFlesh("JJ");
            } else if(kanzhi.getBottomMonth().equals("bottom41")) {
                kanzhi.setBottomMonthFlesh("PG");
            } else if(kanzhi.getBottomMonth().equals("bottom42")) {
                kanzhi.setBottomMonthFlesh("JG");
            } else if(kanzhi.getBottomMonth().equals("bottom51")) {
                kanzhi.setBottomMonthFlesh("PI");
            } else if(kanzhi.getBottomMonth().equals("bottom52")) {
                kanzhi.setBottomMonthFlesh("JI");
            }

            if (kanzhi.getBottomDay().equals("bottom11")) {
                kanzhi.setBottomDayFlesh("BG");
            } else if(kanzhi.getBottomDay().equals("bottom12")) {
                kanzhi.setBottomDayFlesh("GJ");
            } else if(kanzhi.getBottomDay().equals("bottom21")) {
                kanzhi.setBottomDayFlesh("SS");
            } else if(kanzhi.getBottomDay().equals("bottom22")) {
                kanzhi.setBottomDayFlesh("SG");
            } else if(kanzhi.getBottomDay().equals("bottom31") || kanzhi.getBottomDay().equals("bottom33")) {
                kanzhi.setBottomDayFlesh("PJ");
            } else if(kanzhi.getBottomDay().equals("bottom32") || kanzhi.getBottomDay().equals("bottom34")) {
                kanzhi.setBottomDayFlesh("JJ");
            } else if(kanzhi.getBottomDay().equals("bottom41")) {
                kanzhi.setBottomDayFlesh("PG");
            } else if(kanzhi.getBottomDay().equals("bottom42")) {
                kanzhi.setBottomDayFlesh("JG");
            } else if(kanzhi.getBottomDay().equals("bottom51")) {
                kanzhi.setBottomDayFlesh("PI");
            } else if(kanzhi.getBottomDay().equals("bottom52")) {
                kanzhi.setBottomDayFlesh("JI");
            }

            if (kanzhi.getBottomHour().equals("bottom11")) {
                kanzhi.setBottomHourFlesh("BG");
            } else if(kanzhi.getBottomHour().equals("bottom12")) {
                kanzhi.setBottomHourFlesh("GJ");
            } else if(kanzhi.getBottomHour().equals("bottom21")) {
                kanzhi.setBottomHourFlesh("SS");
            } else if(kanzhi.getBottomHour().equals("bottom22")) {
                kanzhi.setBottomHourFlesh("SG");
            } else if(kanzhi.getBottomHour().equals("bottom31") || kanzhi.getBottomHour().equals("bottom33")) {
                kanzhi.setBottomHourFlesh("PJ");
            } else if(kanzhi.getBottomHour().equals("bottom32") || kanzhi.getBottomHour().equals("bottom34")) {
                kanzhi.setBottomHourFlesh("JJ");
            } else if(kanzhi.getBottomHour().equals("bottom41")) {
                kanzhi.setBottomHourFlesh("PG");
            } else if(kanzhi.getBottomHour().equals("bottom42")) {
                kanzhi.setBottomHourFlesh("JG");
            } else if(kanzhi.getBottomHour().equals("bottom51")) {
                kanzhi.setBottomHourFlesh("PI");
            } else if(kanzhi.getBottomHour().equals("bottom52")) {
                kanzhi.setBottomHourFlesh("JI");
            }
        } else if(kanzhi.getTopDay().equals("top12")) {

        } else if(kanzhi.getTopDay().equals("top21")) {

        } else if(kanzhi.getTopDay().equals("top22")) {

        } else if(kanzhi.getTopDay().equals("top31")) {

        } else if(kanzhi.getTopDay().equals("top32")) {

        } else if(kanzhi.getTopDay().equals("top41")) {

        } else if(kanzhi.getTopDay().equals("top42")) {

        } else if(kanzhi.getTopDay().equals("top51")) {

        } else if(kanzhi.getTopDay().equals("top52")) {

        }

    }
}
