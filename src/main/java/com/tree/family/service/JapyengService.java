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

        Map<String, String> map = new HashMap<>();

        return map;
    }
}
