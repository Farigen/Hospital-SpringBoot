package com.hospital.registration.controller;

import com.hospital.registration.entities.Department;
import com.hospital.registration.entities.Doctor;
import com.hospital.registration.entities.Register;
import com.hospital.registration.services.DoctorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.w3c.dom.stylesheets.LinkStyle;

import javax.print.Doc;
import java.util.ArrayList;
import java.util.List;

/**
 * @program: registration
 * @description: DocCtroller
 * @author: Lucas
 * @create: 2019/07/14 16:11
 */
@Controller
public class DocController {

    @Autowired
    DoctorService doctorService;

    @ResponseBody
    @RequestMapping("/getDocsByDeptName")
    public List<Doctor> getDocsByDept(String deptName){
        return doctorService.getDocsByDeptName(deptName);
    }

    //temp
    @ResponseBody
    @RequestMapping("/addDoc")
    public String addDoc(){
        List<Doctor> list = new ArrayList<>();

        Doctor doctor10 = new Doctor("徐标", 1, 50, "135466221@163.com"
                ,"18251816718", "http://www.njglyy.com/upload/image/20181116/15423505592302671.jpg", "主任医师"
                , "擅长在复杂冠脉介入诊疗/先天性心脏病介入治疗等多方面有丰富的经验，在冠脉介入领域创造了我省多个第一"
                , 1, 1);

        Doctor doctor20 = new Doctor("张均", 1, 50,"135466221@163.com"
                ,"18251816718", "http://www.njglyy.com/upload/image/20181116/15423482749538954.jpg"
                , "主任医师", "擅长神经科疑难杂症和脑血管疾病", 1, 2);
        Doctor doctor21 = new Doctor("潘锡近", 1,40, "135466221@163.com"
                ,"18251816718", "http://www.njglyy.com/upload/image/20181221/15453755019834761.jpg"
                , "主任医师", "擅长脑血管疾病、癫痫、帕金森氏病、痴呆症等，对神经内科疑难杂症有独特的诊疗经验"
                , 1, 2);
        Doctor doctor22 = new Doctor("王中原", 2, 30,"135466221@163.com"
                ,"18251816718", "http://www.njglyy.com/upload/image/20181115/15422749859909331.jpg"
                , "副主任医师", "擅长脑血管病、血管性痴呆、癫痫、神经系统变性疾病、肌病等疾病的诊治，尤其对神经电生理的应用有深入研究"
                , 1, 2);
        Doctor doctor23 = new Doctor("张扬", 1, 25,"135466221@163.com"
                ,"18251816718", "http://www.njglyy.com/upload/image/20190312/15523560653976713.jpg"
                , "副主任医师", "擅长帕金森病、痴呆、脑血管病以及脱髓鞘疾病的诊治"
                , 1, 2);
        Doctor doctor24 = new Doctor("王晓云", 2,25, "135466221@163.com"
                ,"18251816718", "http://www.njglyy.com/upload/image/20181114/15422059412685819.jpg"
                , "副主任医师", "擅长脑血管病、癫痫、周围神经病变的诊断和治疗"
                , 1, 2);
        Doctor doctor25 = new Doctor("邵渊", 1, 25,"135466221@163.com"
                ,"18251816718", "http://www.njglyy.com/upload/image/20181114/15422054717000563.jpg"
                , "副主任医师", "擅长神经重症、脑血管病、脱髓鞘等疾病的诊治，神经介入，经颅多普勒等脑血管及脑功能评估技术"
                , 1, 2);

        /*Doctor doctor5 = new Doctor("宋知非", 1, 25, "135466221@163.com"
                ,"18251816718", "http://www.njglyy.com/upload/image/20181127/15433110561834104.gif", "主任医师"
                , "擅长周围神经损伤和神经卡压性疾病，手部外伤及疾病，四肢骨折和关节脱位，四肢畸形和骨环坏死的诊断和治疗"
                , 1, 70);*/

        list.add(doctor10);
        list.add(doctor20);
        list.add(doctor21);
        list.add(doctor22);
        list.add(doctor23);
        list.add(doctor24);
        list.add(doctor25);

        for (Doctor doc : list) {
            doctorService.addDoc(doc);
        }
        return " AddDoc done!";
    }

}
