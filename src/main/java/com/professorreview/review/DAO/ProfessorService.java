package com.professorreview.review.DAO;


import com.professorreview.review.Entities.Professor;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Service
@Transactional
public class ProfessorService {

    Logger logger = LoggerFactory.getLogger(ProfessorService.class);

    @Autowired
    private ProfessorDAO professorDAO;

    public List<Professor> list(){
        logger.info("professor DAO: findAll called.");
        return professorDAO.findAll();
    }
    public void save(Professor saveNewProfessor){
        professorDAO.save(saveNewProfessor);
    }
    public void edit(Professor editExistingProfessor){
        professorDAO.update(editExistingProfessor);
    }
    public Professor findById(Long id){
         return professorDAO.getById(id);

    }
}
