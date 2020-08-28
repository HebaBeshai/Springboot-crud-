package com.professorreview.review.DAO;

import com.professorreview.review.Entities.Professor;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;

@Transactional
@Repository
public class ProfessorDAO extends AbstractDAO<Professor> {

    public ProfessorDAO() {
        super();
        setClazz(Professor.class);
    }

    @Override
    protected Professor getById(Long entityId) {
        return entityManager.find(Professor.class, entityId);
    }

}

