package com.professorreview.review.DAO;


import com.professorreview.review.Entities.Teacher;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Service
@Transactional
public class teacherService {

    Logger logger = LoggerFactory.getLogger(teacherService.class);

    @Autowired
    private TeacherRepository teacherRepository;

    public List<Teacher> list(){
        logger.info("professor DAO: findAll called");
        return teacherRepository.findAll();
    }

}










