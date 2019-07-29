package com.hospital.registration.controller;

import com.hospital.registration.annotation.UserLoginToken;
import com.hospital.registration.entities.Department;
import com.hospital.registration.entities.DepartmentType;
import com.hospital.registration.services.DeptsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Arrays;
import java.util.List;

/**
 * @program: registration
 * @description: DeptsController
 * @author: Lucas
 * @create: 2019/07/14 16:48
 */
@Controller
public class DeptsController {

    @Autowired
    DeptsService deptsService;


    @ResponseBody
    @RequestMapping("/getDeptsByTypeName")
    public List<Department> getDeptsByTypeName(String typeName){
        return deptsService.getDeptsByTypeName(typeName);
    }

    @ResponseBody
    @RequestMapping("/addDepts")
    public String addDepts(){
        String[] deptsOfNeiKe = {"心血管内科", "神经内科", "消化内科", "内分泌科", "免疫科", "呼吸科", "肾病内科"
                , "血液科", "感染内科", "过敏反应科", "老年病科", "普通内科", "血液透析科", "变态反应科"
                , "感染科", "风湿免疫科", "社区全科", "炎症性肠病内科门诊", "肝病科"};
        String[] deptsOfWaike = {"神经外科", "功能神经外科", "心血管外科", "胸外科", "整形科", "乳腺外科", "泌尿外科"
                , "肝胆外科", "肛肠科", "血管外科", "器官移植", "微创外科", "普外科", "男性学科", "皮肤美容科", "碎石科"
                , "脑外科", "烧伤科", "整形美容科"};
        String[] deptsOfFuchanke = { "妇科", "产科", "妇科内分泌", "妇泌尿科", "遗传咨询科", "妇产科", "生殖中心"
                , "更年期门诊", "孕产期营养"};
        String[] deptsOfErke = { "儿科", "新生儿科", "小儿呼吸科", "小儿消化科", "小儿营养保健科", "小儿神经内科"
                , "小儿心内科", "小儿内分泌科", "小儿免疫科", "小儿皮肤科", "小儿耳鼻喉科", "小儿血液科", "小儿精神科"
                , "小儿外科", "小儿心外科", "小儿胸外科", "小儿骨科", "小儿泌尿科", "小儿康复科", "内科", "外科", "五官科"};
        String[] deptsOfGuke = { "骨科", "脊柱外科", "手外科", "创伤骨科", "骨关节科", "矫形骨科", "骨质疏松科", "骨伤专科"
                , "运动损伤科", "推拿按摩科门诊"};
        String[] deptsOfYanke = {"眼科", "小儿眼科", "眼底", "角膜科", "青光眼", "白内障", "眼外伤", "眼眶及肿瘤"
                , "屈光", "眼整形", "眼肌门诊" , "眼整形门诊"};
        String[] deptsOfKouqiang = {"口腔科", "颌面外科", "正畸科", "牙体牙髓科", "牙周科", "口腔粘膜科", "儿童口腔科"
                , "口腔修复科", "种植科", "口腔预防科", "口腔特诊科"
                , "口腔急诊科", "牙体牙髓科", "口腔肿瘤科", "牙周科", "口腔美容科", "种植门诊"};
        String[] deptsOfErHouBi = {"耳鼻喉", "头颈外科", "耳鼻咽喉头颈外科", "头颈外科", "鼻过敏科", "耳聋耳鸣专病门诊"};
        String[] deptsOfZhongliu = {"肿瘤内科", "肿瘤外科", "肿瘤妇科", "放疗科", "骨肿瘤科", "肿瘤康复科", "肿瘤综合科"
                , "肿瘤科", "头颈外科肿瘤"};
        String[] deptsOfOthers = {"皮肤科", "精神科", "康复科", "预防保健科", "性病科"};

        List<String[]> list = Arrays.asList(deptsOfNeiKe, deptsOfWaike, deptsOfFuchanke, deptsOfErke,
                deptsOfGuke, deptsOfYanke, deptsOfKouqiang, deptsOfErHouBi, deptsOfZhongliu, deptsOfOthers);

        int i = 1;
        for (String[] depts : list) {
            for (String dept : depts) {
                Department temp = new Department();
                temp.setName(dept);
                temp.setDeptTypeId(i);
                temp.setLocation("南京鼓楼医院三楼");
                deptsService.addDept(temp);
                System.out.println(temp.getId());
            }
            i++;
        }

        return "done!";
    }

    @ResponseBody
    @RequestMapping("/addDeptsTypes")
    public String addDeptsType(){
        String[] names = {"内科", "外科", "妇产科", "儿科", "骨科", "眼科", "口腔科", "耳鼻喉科"
                        , "肿瘤科", "其他"};
        for (String name : names) {
            DepartmentType temp = new DepartmentType();
            temp.setName(name);
            deptsService.addDeptsType(temp);
            System.out.println(temp.getId());
        }
        return "done!";
    }
}
