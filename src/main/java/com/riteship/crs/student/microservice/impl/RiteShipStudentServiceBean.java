package com.riteship.crs.student.microservice.impl;

import com.riteship.common.apis.services.impls.RiteShipGeneralServiceImpl;
import com.riteship.crs.student.microservice.RiteShipStudentDBOperationsBean;
import jakarta.annotation.PostConstruct;
import org.springframework.stereotype.Service;

@Service
public class RiteShipStudentServiceBean<StudentDataBean, Integer> extends RiteShipGeneralServiceImpl<StudentDataBean, Integer> {

        @PostConstruct
        public void initializeBean() {
            setRiteShipDatabaseOperationsBean(new RiteShipStudentDBOperationsBean().getDatabaseOperationsBean());
        }

}
