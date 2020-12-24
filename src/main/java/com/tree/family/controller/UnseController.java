package com.tree.family.controller;

import com.tree.family.model.KanzhiVO;
import com.tree.family.service.JapyengService;
import com.tree.family.service.KanzhiService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("/unse")
public class UnseController {
    private final Logger logger = LoggerFactory.getLogger(this.getClass());

    @Autowired
    KanzhiService kanzhiService;
    @Autowired
    JapyengService japyengService;

    @GetMapping("/")
    public Object index(HttpServletRequest request, KanzhiVO kanzhi) {
        System.out.println("kanzhi");
        logger.info(kanzhi.getTopYear());
        logger.info(kanzhi.getTopMonth());
        logger.info(kanzhi.getTopDay());
        logger.info(kanzhi.getTopHour());
        logger.info(kanzhi.getBottomYear());
        logger.info(kanzhi.getBottomMonth());
        logger.info(kanzhi.getBottomDay());
        logger.info(kanzhi.getBottomHour());

        // 육신 카운트
        kanzhiService.kanzhiCount(kanzhi);
        // 명조 위치별 육신 정의
        kanzhiService.kanzhiFleshPosition(kanzhi);

        // 자평진전 격국
        Map<String, String> japyengMap = japyengService.defineGuyck(kanzhi);

        // 적천수

        // 난강망 궁통보감


        // 더큼학당 창광 격국

        // 이타 난강망

        Map<String, Object> map = new HashMap<>();
        map.put("kanzhi", kanzhi);
        map.put("japyeng_theory", "자평진전 이론 : " + japyengMap.get("japyeng_theory"));
        map.put("japyeng_explain", "자평진전 풀이 : " + japyengMap.get("japyeng_explain"));

        return map;
    }
}
