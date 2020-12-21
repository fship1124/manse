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
            if (kanzhi.getTopYear().equals("top51") || kanzhi.getTopMonth().equals("top51") || kanzhi.getTopHour().equals("top51") || kanzhi.getBottomYear().equals("bottom51") || kanzhi.getBottomMonth().equals("bottom51") || kanzhi.getBottomHour().equals("bottom51")) {
                kanzhi.setJjCnt(kanzhi.getJjCnt() + 1);
            }


            //
            if (kanzhi.getTopYear().equals("top52") || kanzhi.getTopMonth().equals("top52") || kanzhi.getTopHour().equals("top52") || kanzhi.getBottomYear().equals("bottom52") || kanzhi.getBottomMonth().equals("bottom52") || kanzhi.getBottomHour().equals("bottom52")) {
                kanzhi.setPjCnt(kanzhi.getPjCnt() + 1);
            }
        } else if (kanzhi.getTopDay().equals("top41")) {
            if (kanzhi.getTopYear().equals("top11") || kanzhi.getTopMonth().equals("top11") || kanzhi.getTopHour().equals("top11") || kanzhi.getBottomYear().equals("bottom11") || kanzhi.getBottomMonth().equals("bottom11") || kanzhi.getBottomHour().equals("bottom11")) {
                kanzhi.setPjCnt(kanzhi.getPjCnt() + 1);
            }
            if (kanzhi.getTopYear().equals("top12") || kanzhi.getTopMonth().equals("top12") || kanzhi.getTopHour().equals("top12") || kanzhi.getBottomYear().equals("bottom12") || kanzhi.getBottomMonth().equals("bottom12") || kanzhi.getBottomHour().equals("bottom12")) {
                kanzhi.setJjCnt(kanzhi.getJjCnt() + 1);
            }
            if (kanzhi.getTopYear().equals("top21") || kanzhi.getTopMonth().equals("top21") || kanzhi.getTopHour().equals("top21") || kanzhi.getBottomYear().equals("bottom21") || kanzhi.getBottomMonth().equals("bottom21") || kanzhi.getBottomHour().equals("bottom21")) {
                kanzhi.setPgCnt(kanzhi.getPgCnt() + 1);
            }
            if (kanzhi.getTopYear().equals("top22") || kanzhi.getTopMonth().equals("top22") || kanzhi.getTopHour().equals("top22") || kanzhi.getBottomYear().equals("bottom22") || kanzhi.getBottomMonth().equals("bottom22") || kanzhi.getBottomHour().equals("bottom22")) {
                kanzhi.setJgCnt(kanzhi.getJgCnt() + 1);
            }
            if (kanzhi.getTopYear().equals("top31") || kanzhi.getTopMonth().equals("top31") || kanzhi.getTopHour().equals("top31") || kanzhi.getBottomYear().equals("bottom31") || kanzhi.getBottomMonth().equals("bottom31") || kanzhi.getBottomHour().equals("bottom31") || kanzhi.getBottomYear().equals("bottom33") || kanzhi.getBottomMonth().equals("bottom33") || kanzhi.getBottomHour().equals("bottom33")) {
                kanzhi.setPiCnt(kanzhi.getPiCnt() + 1);
            }
            if (kanzhi.getTopYear().equals("top32") || kanzhi.getTopMonth().equals("top32") || kanzhi.getTopHour().equals("top32") || kanzhi.getBottomYear().equals("bottom32") || kanzhi.getBottomMonth().equals("bottom32") || kanzhi.getBottomHour().equals("bottom32") || kanzhi.getBottomYear().equals("bottom34") || kanzhi.getBottomMonth().equals("bottom34") || kanzhi.getBottomHour().equals("bottom34")) {
                kanzhi.setJiCnt(kanzhi.getJiCnt() + 1);
            }
            if (kanzhi.getTopYear().equals("top41") || kanzhi.getTopMonth().equals("top41") || kanzhi.getTopHour().equals("top41") || kanzhi.getBottomYear().equals("bottom41") || kanzhi.getBottomMonth().equals("bottom41") || kanzhi.getBottomHour().equals("bottom41")) {
                kanzhi.setBgCnt(kanzhi.getBgCnt() + 1);
            }
            if (kanzhi.getTopYear().equals("top42") || kanzhi.getTopMonth().equals("top42") || kanzhi.getTopHour().equals("top42") || kanzhi.getBottomYear().equals("bottom42") || kanzhi.getBottomMonth().equals("bottom42") || kanzhi.getBottomHour().equals("bottom42")) {
                kanzhi.setGjCnt(kanzhi.getGjCnt() + 1);
            }
            if (kanzhi.getTopYear().equals("top51") || kanzhi.getTopMonth().equals("top51") || kanzhi.getTopHour().equals("top51") || kanzhi.getBottomYear().equals("bottom51") || kanzhi.getBottomMonth().equals("bottom51") || kanzhi.getBottomHour().equals("bottom51")) {
                kanzhi.setSsCnt(kanzhi.getSsCnt() + 1);
            }
            if (kanzhi.getTopYear().equals("top52") || kanzhi.getTopMonth().equals("top52") || kanzhi.getTopHour().equals("top52") || kanzhi.getBottomYear().equals("bottom52") || kanzhi.getBottomMonth().equals("bottom52") || kanzhi.getBottomHour().equals("bottom52")) {
                kanzhi.setSgCnt(kanzhi.getSgCnt() + 1);
            }
        } else if (kanzhi.getTopDay().equals("top42")) {
            if (kanzhi.getTopYear().equals("top11") || kanzhi.getTopMonth().equals("top11") || kanzhi.getTopHour().equals("top11") || kanzhi.getBottomYear().equals("bottom11") || kanzhi.getBottomMonth().equals("bottom11") || kanzhi.getBottomHour().equals("bottom11")) {
                kanzhi.setJjCnt(kanzhi.getJjCnt() + 1);
            }
            if (kanzhi.getTopYear().equals("top12") || kanzhi.getTopMonth().equals("top12") || kanzhi.getTopHour().equals("top12") || kanzhi.getBottomYear().equals("bottom12") || kanzhi.getBottomMonth().equals("bottom12") || kanzhi.getBottomHour().equals("bottom12")) {
                kanzhi.setPjCnt(kanzhi.getPjCnt() + 1);
            }
            if (kanzhi.getTopYear().equals("top21") || kanzhi.getTopMonth().equals("top21") || kanzhi.getTopHour().equals("top21") || kanzhi.getBottomYear().equals("bottom21") || kanzhi.getBottomMonth().equals("bottom21") || kanzhi.getBottomHour().equals("bottom21")) {
                kanzhi.setJgCnt(kanzhi.getJgCnt() + 1);
            }
            if (kanzhi.getTopYear().equals("top22") || kanzhi.getTopMonth().equals("top22") || kanzhi.getTopHour().equals("top22") || kanzhi.getBottomYear().equals("bottom22") || kanzhi.getBottomMonth().equals("bottom22") || kanzhi.getBottomHour().equals("bottom22")) {
                kanzhi.setPgCnt(kanzhi.getPgCnt() + 1);
            }
            if (kanzhi.getTopYear().equals("top31") || kanzhi.getTopMonth().equals("top31") || kanzhi.getTopHour().equals("top31") || kanzhi.getBottomYear().equals("bottom31") || kanzhi.getBottomMonth().equals("bottom31") || kanzhi.getBottomHour().equals("bottom31") || kanzhi.getBottomYear().equals("bottom33") || kanzhi.getBottomMonth().equals("bottom33") || kanzhi.getBottomHour().equals("bottom33")) {
                kanzhi.setJiCnt(kanzhi.getJiCnt() + 1);
            }
            if (kanzhi.getTopYear().equals("top32") || kanzhi.getTopMonth().equals("top32") || kanzhi.getTopHour().equals("top32") || kanzhi.getBottomYear().equals("bottom32") || kanzhi.getBottomMonth().equals("bottom32") || kanzhi.getBottomHour().equals("bottom32") || kanzhi.getBottomYear().equals("bottom34") || kanzhi.getBottomMonth().equals("bottom34") || kanzhi.getBottomHour().equals("bottom34")) {
                kanzhi.setPiCnt(kanzhi.getPiCnt() + 1);
            }
            if (kanzhi.getTopYear().equals("top41") || kanzhi.getTopMonth().equals("top41") || kanzhi.getTopHour().equals("top41") || kanzhi.getBottomYear().equals("bottom41") || kanzhi.getBottomMonth().equals("bottom41") || kanzhi.getBottomHour().equals("bottom41")) {
                kanzhi.setGjCnt(kanzhi.getGjCnt() + 1);
            }
            if (kanzhi.getTopYear().equals("top42") || kanzhi.getTopMonth().equals("top42") || kanzhi.getTopHour().equals("top42") || kanzhi.getBottomYear().equals("bottom42") || kanzhi.getBottomMonth().equals("bottom42") || kanzhi.getBottomHour().equals("bottom42")) {
                kanzhi.setBgCnt(kanzhi.getBgCnt() + 1);
            }
            if (kanzhi.getTopYear().equals("top51") || kanzhi.getTopMonth().equals("top51") || kanzhi.getTopHour().equals("top51") || kanzhi.getBottomYear().equals("bottom51") || kanzhi.getBottomMonth().equals("bottom51") || kanzhi.getBottomHour().equals("bottom51")) {
                kanzhi.setSgCnt(kanzhi.getSgCnt() + 1);
            }
            if (kanzhi.getTopYear().equals("top52") || kanzhi.getTopMonth().equals("top52") || kanzhi.getTopHour().equals("top52") || kanzhi.getBottomYear().equals("bottom52") || kanzhi.getBottomMonth().equals("bottom52") || kanzhi.getBottomHour().equals("bottom52")) {
                kanzhi.setSsCnt(kanzhi.getSsCnt() + 1);
            }
        } else if (kanzhi.getTopDay().equals("top51")) {
            if (kanzhi.getTopYear().equals("top11") || kanzhi.getTopMonth().equals("top11") || kanzhi.getTopHour().equals("top11") || kanzhi.getBottomYear().equals("bottom11") || kanzhi.getBottomMonth().equals("bottom11") || kanzhi.getBottomHour().equals("bottom11")) {
                kanzhi.setSsCnt(kanzhi.getSsCnt() + 1);
            }
            if (kanzhi.getTopYear().equals("top12") || kanzhi.getTopMonth().equals("top12") || kanzhi.getTopHour().equals("top12") || kanzhi.getBottomYear().equals("bottom12") || kanzhi.getBottomMonth().equals("bottom12") || kanzhi.getBottomHour().equals("bottom12")) {
                kanzhi.setSgCnt(kanzhi.getSgCnt() + 1);
            }
            if (kanzhi.getTopYear().equals("top21") || kanzhi.getTopMonth().equals("top21") || kanzhi.getTopHour().equals("top21") || kanzhi.getBottomYear().equals("bottom21") || kanzhi.getBottomMonth().equals("bottom21") || kanzhi.getBottomHour().equals("bottom21")) {
                kanzhi.setPjCnt(kanzhi.getPjCnt() + 1);
            }
            if (kanzhi.getTopYear().equals("top22") || kanzhi.getTopMonth().equals("top22") || kanzhi.getTopHour().equals("top22") || kanzhi.getBottomYear().equals("bottom22") || kanzhi.getBottomMonth().equals("bottom22") || kanzhi.getBottomHour().equals("bottom22")) {
                kanzhi.setJjCnt(kanzhi.getJjCnt() + 1);
            }
            if (kanzhi.getTopYear().equals("top31") || kanzhi.getTopMonth().equals("top31") || kanzhi.getTopHour().equals("top31") || kanzhi.getBottomYear().equals("bottom31") || kanzhi.getBottomMonth().equals("bottom31") || kanzhi.getBottomHour().equals("bottom31") || kanzhi.getBottomYear().equals("bottom33") || kanzhi.getBottomMonth().equals("bottom33") || kanzhi.getBottomHour().equals("bottom33")) {
                kanzhi.setPgCnt(kanzhi.getPgCnt() + 1);
            }
            if (kanzhi.getTopYear().equals("top32") || kanzhi.getTopMonth().equals("top32") || kanzhi.getTopHour().equals("top32") || kanzhi.getBottomYear().equals("bottom32") || kanzhi.getBottomMonth().equals("bottom32") || kanzhi.getBottomHour().equals("bottom32") || kanzhi.getBottomYear().equals("bottom34") || kanzhi.getBottomMonth().equals("bottom34") || kanzhi.getBottomHour().equals("bottom34")) {
                kanzhi.setJgCnt(kanzhi.getJgCnt() + 1);
            }
            if (kanzhi.getTopYear().equals("top41") || kanzhi.getTopMonth().equals("top41") || kanzhi.getTopHour().equals("top41") || kanzhi.getBottomYear().equals("bottom41") || kanzhi.getBottomMonth().equals("bottom41") || kanzhi.getBottomHour().equals("bottom41")) {
                kanzhi.setPiCnt(kanzhi.getPiCnt() + 1);
            }
            if (kanzhi.getTopYear().equals("top42") || kanzhi.getTopMonth().equals("top42") || kanzhi.getTopHour().equals("top42") || kanzhi.getBottomYear().equals("bottom42") || kanzhi.getBottomMonth().equals("bottom42") || kanzhi.getBottomHour().equals("bottom42")) {
                kanzhi.setJiCnt(kanzhi.getJiCnt() + 1);
            }
            if (kanzhi.getTopYear().equals("top51") || kanzhi.getTopMonth().equals("top51") || kanzhi.getTopHour().equals("top51") || kanzhi.getBottomYear().equals("bottom51") || kanzhi.getBottomMonth().equals("bottom51") || kanzhi.getBottomHour().equals("bottom51")) {
                kanzhi.setBgCnt(kanzhi.getBgCnt() + 1);
            }
            if (kanzhi.getTopYear().equals("top52") || kanzhi.getTopMonth().equals("top52") || kanzhi.getTopHour().equals("top52") || kanzhi.getBottomYear().equals("bottom52") || kanzhi.getBottomMonth().equals("bottom52") || kanzhi.getBottomHour().equals("bottom52")) {
                kanzhi.setGjCnt(kanzhi.getGjCnt() + 1);
            }
        } else if (kanzhi.getTopDay().equals("top52")) {
            if (kanzhi.getTopYear().equals("top11") || kanzhi.getTopMonth().equals("top11") || kanzhi.getTopHour().equals("top11") || kanzhi.getBottomYear().equals("bottom11") || kanzhi.getBottomMonth().equals("bottom11") || kanzhi.getBottomHour().equals("bottom11")) {
                kanzhi.setSgCnt(kanzhi.getSgCnt() + 1);
            }
            if (kanzhi.getTopYear().equals("top12") || kanzhi.getTopMonth().equals("top12") || kanzhi.getTopHour().equals("top12") || kanzhi.getBottomYear().equals("bottom12") || kanzhi.getBottomMonth().equals("bottom12") || kanzhi.getBottomHour().equals("bottom12")) {
                kanzhi.setSsCnt(kanzhi.getSsCnt() + 1);
            }
            if (kanzhi.getTopYear().equals("top21") || kanzhi.getTopMonth().equals("top21") || kanzhi.getTopHour().equals("top21") || kanzhi.getBottomYear().equals("bottom21") || kanzhi.getBottomMonth().equals("bottom21") || kanzhi.getBottomHour().equals("bottom21")) {
                kanzhi.setJjCnt(kanzhi.getJjCnt() + 1);
            }
            if (kanzhi.getTopYear().equals("top22") || kanzhi.getTopMonth().equals("top22") || kanzhi.getTopHour().equals("top22") || kanzhi.getBottomYear().equals("bottom22") || kanzhi.getBottomMonth().equals("bottom22") || kanzhi.getBottomHour().equals("bottom22")) {
                kanzhi.setPjCnt(kanzhi.getPjCnt() + 1);
            }
            if (kanzhi.getTopYear().equals("top31") || kanzhi.getTopMonth().equals("top31") || kanzhi.getTopHour().equals("top31") || kanzhi.getBottomYear().equals("bottom31") || kanzhi.getBottomMonth().equals("bottom31") || kanzhi.getBottomHour().equals("bottom31") || kanzhi.getBottomYear().equals("bottom33") || kanzhi.getBottomMonth().equals("bottom33") || kanzhi.getBottomHour().equals("bottom33")) {
                kanzhi.setJgCnt(kanzhi.getJgCnt() + 1);
            }
            if (kanzhi.getTopYear().equals("top32") || kanzhi.getTopMonth().equals("top32") || kanzhi.getTopHour().equals("top32") || kanzhi.getBottomYear().equals("bottom32") || kanzhi.getBottomMonth().equals("bottom32") || kanzhi.getBottomHour().equals("bottom32") || kanzhi.getBottomYear().equals("bottom34") || kanzhi.getBottomMonth().equals("bottom34") || kanzhi.getBottomHour().equals("bottom34")) {
                kanzhi.setPgCnt(kanzhi.getPgCnt() + 1);
            }
            if (kanzhi.getTopYear().equals("top41") || kanzhi.getTopMonth().equals("top41") || kanzhi.getTopHour().equals("top41") || kanzhi.getBottomYear().equals("bottom41") || kanzhi.getBottomMonth().equals("bottom41") || kanzhi.getBottomHour().equals("bottom41")) {
                kanzhi.setJiCnt(kanzhi.getJiCnt() + 1);
            }
            if (kanzhi.getTopYear().equals("top42") || kanzhi.getTopMonth().equals("top42") || kanzhi.getTopHour().equals("top42") || kanzhi.getBottomYear().equals("bottom42") || kanzhi.getBottomMonth().equals("bottom42") || kanzhi.getBottomHour().equals("bottom42")) {
                kanzhi.setPiCnt(kanzhi.getPiCnt() + 1);
            }
            if (kanzhi.getTopYear().equals("top51") || kanzhi.getTopMonth().equals("top51") || kanzhi.getTopHour().equals("top51") || kanzhi.getBottomYear().equals("bottom51") || kanzhi.getBottomMonth().equals("bottom51") || kanzhi.getBottomHour().equals("bottom51")) {
                kanzhi.setGjCnt(kanzhi.getGjCnt() + 1);
            }
            if (kanzhi.getTopYear().equals("top52") || kanzhi.getTopMonth().equals("top52") || kanzhi.getTopHour().equals("top52") || kanzhi.getBottomYear().equals("bottom52") || kanzhi.getBottomMonth().equals("bottom52") || kanzhi.getBottomHour().equals("bottom52")) {
                kanzhi.setBgCnt(kanzhi.getBgCnt() + 1);
            }
        }
    }
}
