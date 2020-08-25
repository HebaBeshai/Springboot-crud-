package com.professorreview.review.Controllers;

import com.professorreview.review.DAO.ProfessorService;
import com.professorreview.review.Entities.Professor;
import com.professorreview.review.Entities.Student;
import com.professorreview.review.Entities.Teacher;
import com.professorreview.review.model.professorParam;
import com.professorreview.review.model.studentParameters;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@EnableAutoConfiguration
public class FeedbackController {

    Logger logger = LoggerFactory.getLogger(FeedbackController.class);

    @Autowired
    ProfessorService professorService;

    @GetMapping("/heartbeat")
    public String heartbaet(){
        return "alive";
    }

    @GetMapping("/getProfessors")
    public ResponseEntity getProfessors(){
        try {
            return new ResponseEntity(professorService.list().toString(),HttpStatus.OK);
        }
        catch (Exception e){
            logger.info(e.getMessage());
            return new ResponseEntity("No professors available.", HttpStatus.OK);
        }
    }

    @PostMapping("/editProfessorInfo")
    public ResponseEntity editProfessorInfo(@RequestBody professorParam professorparam){
          Professor professorInfo= professorService.findById(professorparam.getId());
          String newName = (professorparam.getName());
          professorInfo.setFirstName(newName);
          professorService.edit(professorInfo);
          return new ResponseEntity(professorInfo.getFirstName()+" has been changed", HttpStatus.OK);
    }
    @GetMapping("/returnAmountOfProfessors")
    public ResponseEntity AmountOfProfessors(){
        int size = professorService.list().size();
        return new ResponseEntity("The number of professors is: "+size, HttpStatus.OK);
    }


    @GetMapping("/returnHello")
    public ResponseEntity hello(){
        return new ResponseEntity("hello", HttpStatus.OK);
    }

    @PostMapping("/addStudent")
    public ResponseEntity addStudent(@RequestBody studentParameters studentParameters){
            Student student = new Student();
            student.setStudentID(345);
            student.setFname(studentParameters.getName());
            student.setLname(studentParameters.getLastName());
            student.setAddress(studentParameters.getAddress());
            student.setYear(studentParameters.getYear());
            return new ResponseEntity("Your information was successfully saved", HttpStatus.OK);
    }
    @PostMapping("/addTeacher")
    public ResponseEntity addTeacher(@RequestBody Teacher Teacher){
            Teacher teacher = new Teacher();
            teacher.setFirstName(teacher.getFirstName());
            teacher.setLastName(teacher.getLastnamee());
            teacher.setSubject(teacher.getSubject());
            return new ResponseEntity("Teacher information has been successfully saved", HttpStatus.OK);
    }
//
    @PostMapping("/addProfessor")
    public ResponseEntity addProfessor(@RequestBody Professor professor){
        professorService.save(professor);
        return new ResponseEntity("The new professor information has been successfully saved", HttpStatus.OK);
    }


}
