package com.professorreview.review.DAO;

import com.professorreview.review.Entities.Professor;
import com.professorreview.review.Entities.Teacher;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;
import java.util.ArrayList;
import java.util.List;

@Transactional
@Repository
public class teacherDAO extends AbstractDAO<Teacher>{

    public teacherDAO(){
        super();
        setClazz(Teacher.class);
    }

    @Override
    protected Teacher getById(Long entityId) {
        return findOne(entityId);
    }

    public List<Teacher> list(){
        return findAll();
    }
}
