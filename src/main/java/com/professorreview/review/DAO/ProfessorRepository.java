package com.professorreview.review.DAO;

import com.professorreview.review.Entities.Professor;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;


@Repository
public interface ProfessorRepository extends extends JpaRepository<Professor, Long> {


}

