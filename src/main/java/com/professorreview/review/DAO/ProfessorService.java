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
    private ProfessorRespository professorRepository;

    public List<Professor> list(){
        return professorRepository.findAll();
    }
    public void save(Professor saveNewProfessor){
        professorRepository.save(saveNewProfessor);
    }
    public void edit(Professor editExistingProfessor){
        professorRepository.update(editExistingProfessor);
    }
    public Professor findById(Long id){
         return professorRepository.getById(id);

    }
}
