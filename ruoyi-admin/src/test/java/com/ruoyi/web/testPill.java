package com.ruoyi.web;

import com.ruoyi.pill.domain.PillDrug;
import com.ruoyi.pill.domain.PillFactory;
import com.ruoyi.pill.service.IPillDrugService;
import com.ruoyi.pill.service.IPillFactoryService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

/**
 * author: ljg
 * Date: 2023/3/3 16:46
 * FileName: testPill
 * Description: 测试pill
 */
@SpringBootTest
public class testPill {

    @Autowired
    private IPillFactoryService pillFactoryService;

    @Autowired
    private IPillDrugService drugService;

    @Test
    public void test(){
        PillFactory pillFactory = new PillFactory();
        pillFactory.setFactoryName("云南");
        List<PillFactory> factoriesList = pillFactoryService.selectPillFactoryList(pillFactory);
        System.out.println(factoriesList);

    }

    @Test
    public void test1(){
        PillDrug pillDrug = new PillDrug();
        PillFactory pillFactory = new PillFactory();
        pillFactory.setFactoryName("哈药");
        pillDrug.setPillFactory(pillFactory);
        List<PillDrug> pillDrugs = drugService.selectPillDrugList(pillDrug);
        System.out.println(pillDrugs);

    }

}
