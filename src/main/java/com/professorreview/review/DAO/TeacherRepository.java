package com.professorreview.review.DAO;

import com.professorreview.review.Entities.Professor;
import com.professorreview.review.Entities.Teacher;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;
import java.util.ArrayList;
import java.util.List;


@Repository
public interface TeacherRepository extends JpaRepository<Teacher, Long>{
    
}
