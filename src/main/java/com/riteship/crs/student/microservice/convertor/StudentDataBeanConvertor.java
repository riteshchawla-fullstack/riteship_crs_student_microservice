package com.riteship.crs.student.microservice.convertor;

import com.riteship.crs.student.microservice.dtos.StudentDataBeanDTO;
import org.springframework.util.CollectionUtils;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class StudentDataBeanConvertor {

    public static List<StudentDataBeanDTO> convertStudentDataListToStudentDataBean(ArrayList StudentDataList) {
        List<StudentDataBeanDTO> studentDataBeanDTOS = new ArrayList<>();
        if(!CollectionUtils.isEmpty(StudentDataList)) {
            StudentDataList.stream().forEach(data -> {
                if(data != null) {
                    HashMap studentData = (HashMap) data;
                    if(!CollectionUtils.isEmpty(studentData)) {
                        StudentDataBeanDTO studentDataBeanDTO = getStudentDataBeanDTOFromDataMap(studentData);
                        if(studentDataBeanDTO != null) {
                            studentDataBeanDTOS.add(studentDataBeanDTO);
                        }
                    }
                }
            });
        }
        return studentDataBeanDTOS;
    }

    public static StudentDataBeanDTO getStudentDataBeanDTOFromDataMap(HashMap StudentData) {
        StudentDataBeanDTO studentDataBeanDTO = null;
        if(!CollectionUtils.isEmpty(StudentData)) {
            studentDataBeanDTO = new StudentDataBeanDTO();
            studentDataBeanDTO.setStudentCity((String) StudentData.get("student_city"));
            studentDataBeanDTO.setStudentState(String.valueOf(StudentData.get("student_state")));
            studentDataBeanDTO.setStudentEmail((String) StudentData.get("student_email"));
            studentDataBeanDTO.setStudentMobile((String) StudentData.get("student_mobile"));
            studentDataBeanDTO.setStudentAddress((String) StudentData.get("student_address"));
            studentDataBeanDTO.setStudentId(Integer.valueOf((String) StudentData.get("student_id")));
            studentDataBeanDTO.setStudentEmail((String) StudentData.get("student_email"));
            studentDataBeanDTO.setStudentPassword((String) StudentData.get("student_password"));
            studentDataBeanDTO.setStudentPincode((String) StudentData.get("student_pincode"));
            studentDataBeanDTO.setStudentHighCollege((String) StudentData.get("student_high_college"));
            studentDataBeanDTO.setStudentHighStart((String) StudentData.get("student_high_start"));
            studentDataBeanDTO.setStudentHighPass((String) StudentData.get("student_high_pass"));
            studentDataBeanDTO.setStudentName((String) StudentData.get("student_name"));
            studentDataBeanDTO.setStudentHighSubject((String) StudentData.get("student_high_subject"));
            studentDataBeanDTO.setStudentHighPersantage((String) StudentData.get("student_high_persantage"));
            studentDataBeanDTO.setStudentInterCollege((String) StudentData.get("student_inter_college"));
            studentDataBeanDTO.setStudentInterPass((String) StudentData.get("student_inter_pass"));
            studentDataBeanDTO.setStudentInterPass((String) StudentData.get("student_inter_subject"));
            studentDataBeanDTO.setStudentInterPersantage((String) StudentData.get("student_inter_persantage"));
            studentDataBeanDTO.setStudentGraduateCollege((String) StudentData.get("student_graduate_college"));
            studentDataBeanDTO.setStudentGraduateStart((String) StudentData.get("student_graduate_start"));
            studentDataBeanDTO.setStudentGraduatePass((String) StudentData.get("student_graduate_pass"));
            studentDataBeanDTO.setStudentGraduateSubject((String) StudentData.get("student_graduate_subject"));
            studentDataBeanDTO.setStudentGraduatePersantage((String) StudentData.get("student_graduate_persantage"));
            studentDataBeanDTO.setStudentPgCollege((String) StudentData.get("student_pg_college"));
            studentDataBeanDTO.setStudentPgPass((String) StudentData.get("student_pg_pass"));
            studentDataBeanDTO.setStudentPgSubject((String) StudentData.get("student_pg_subject"));
            studentDataBeanDTO.setStudentPgPersantage((String) StudentData.get("student_pg_persantage"));
        }
        return studentDataBeanDTO;
    }

    public static Map<String, String> getMapOfStudentDataFromStudentDataBean(StudentDataBeanDTO studentDataBeanDTO) {
        Map<String, String> results = new HashMap<>();
        if(studentDataBeanDTO != null) {
            results.put("student_name",studentDataBeanDTO.getStudentName());
            results.put("student_mobile",studentDataBeanDTO.getStudentMobile());
            results.put("student_email",studentDataBeanDTO.getStudentEmail());
            results.put("student_password",studentDataBeanDTO.getStudentPassword());
            results.put("student_address",studentDataBeanDTO.getStudentAddress());
            results.put("student_city",studentDataBeanDTO.getStudentCity());
            results.put("student_state",studentDataBeanDTO.getStudentState());
            results.put("student_pincode",studentDataBeanDTO.getStudentPincode());
            results.put("student_id",String.valueOf(studentDataBeanDTO.getStudentId()));
            results.put("student_high_college",studentDataBeanDTO.getStudentHighCollege());
            results.put("student_high_start",studentDataBeanDTO.getStudentHighStart());
            results.put("student_high_pass",studentDataBeanDTO.getStudentHighPass());
            results.put("student_high_subject",studentDataBeanDTO.getStudentHighSubject());
            results.put("student_high_persantage",studentDataBeanDTO.getStudentHighPersantage());
            results.put("student_inter_college",studentDataBeanDTO.getStudentInterCollege());
            results.put("student_inter_start",studentDataBeanDTO.getStudentInterStart());
            results.put("student_inter_pass",studentDataBeanDTO.getStudentInterPass());
            results.put("student_inter_subject",studentDataBeanDTO.getStudentInterSubject());
            results.put("student_inter_persantage",studentDataBeanDTO.getStudentInterPersantage());
            results.put("student_graduate_college",studentDataBeanDTO.getStudentGraduateCollege());
            results.put("student_graduate_start",studentDataBeanDTO.getStudentGraduateStart());
            results.put("student_graduate_pass",studentDataBeanDTO.getStudentGraduatePass());
            results.put("student_graduate_subject",studentDataBeanDTO.getStudentGraduateSubject());
            results.put("student_graduate_persantage",studentDataBeanDTO.getStudentGraduatePersantage());
            results.put("student_pg_college",studentDataBeanDTO.getStudentPgCollege());
            results.put("student_pg_start",studentDataBeanDTO.getStudentPgStart());
            results.put("student_pg_pass",studentDataBeanDTO.getStudentPgPass());
            results.put("student_pg_subject",studentDataBeanDTO.getStudentPgSubject());
            results.put("student_pg_persantage",studentDataBeanDTO.getStudentPgPersantage());
        }
        return results;
    }
}
