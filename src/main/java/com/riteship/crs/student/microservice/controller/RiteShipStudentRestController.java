package com.riteship.crs.student.microservice.controller;

import com.riteship.crs.student.microservice.convertor.StudentDataBeanConvertor;
import com.riteship.crs.student.microservice.dtos.StudentDataBeanDTO;
import com.riteship.crs.student.microservice.entities.StudentDataBean;
import com.riteship.crs.student.microservice.impl.RiteShipStudentServiceBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;

@RestController
@RequestMapping("/riteship/students")
public class RiteShipStudentRestController {

    /*@Autowired
    private RiteShipStudentDBOperationsBean StudentDBOperationsBean;*/

    @Autowired
    private RiteShipStudentServiceBean<StudentDataBean, Integer> studentServiceBean;

    @GetMapping("/")
    public String index() {
        return "index";
    }

    @GetMapping("/getAll")
    public @ResponseBody List<StudentDataBeanDTO> getAllCompanies() {
        return StudentDataBeanConvertor.convertStudentDataListToStudentDataBean(studentServiceBean.getAllStudent());
    }

    @PutMapping("/save-student")
    public @ResponseBody String saveStudent(StudentDataBeanDTO studentData) {
        studentServiceBean.saveStudent((HashMap)StudentDataBeanConvertor.getMapOfStudentDataFromStudentDataBean(studentData));
        return "Success";
    }

    @GetMapping("/get-student")
    public @ResponseBody StudentDataBeanDTO getStudentDetails(int student_id) {
        return StudentDataBeanConvertor.getStudentDataBeanDTOFromDataMap(studentServiceBean.getStudentDetails(student_id));
    }

    @PatchMapping("/update-student")
    public @ResponseBody String updateStudent(StudentDataBeanDTO studentData) {
        return studentServiceBean.updateStudent((HashMap)StudentDataBeanConvertor.getMapOfStudentDataFromStudentDataBean(studentData));
    }
}
