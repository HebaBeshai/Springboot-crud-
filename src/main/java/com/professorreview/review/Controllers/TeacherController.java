package com.professorreview.review.Controllers;

import com.professorreview.review.DAO.teacherService;
import com.professorreview.review.model.teacherParameters;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@EnableAutoConfiguration
public class TeacherController {

    Logger logger = LoggerFactory.getLogger(ProfessorController.class);

    @Autowired
    teacherService TeacherService;

    @GetMapping("/get_teachers")
    public ResponseEntity getTeachers(){
       try{
           return new ResponseEntity(teacherService.list().toString(), HttpStatus.OK);
       }
          catch (Exception e){
            logger.info(e.getMessage());
            return new ResponseEntity("No professors available.", HttpStatus.OK);
        }
   }


}
