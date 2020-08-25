package com.professorreview.review.DAO;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.io.Serializable;
import java.util.List;

@Repository
public abstract  class AbstractDAO < T extends Serializable> {

    Logger logger = LoggerFactory.getLogger(AbstractDAO.class);
    private Class< T > clazz;

    @PersistenceContext
    EntityManager entityManager;

    public void setClazz( Class< T > clazzToSet ) {
        this.clazz = clazzToSet;
    }

    public T findOne( Long id ){
        return entityManager.find( clazz, id );
    }

    public List< T > findAll(){
        logger.info("Query being executed: select a from \" + clazz.getName()+\" a ");
        return entityManager.createQuery( "select a from " + clazz.getName()+" a")
                .getResultList();
    }

    public void save( T entity ){
        entityManager.persist( entity );
    }

    public void update( T entity ){
        entityManager.merge( entity );
    }

    public void delete( T entity ){
        entityManager.remove( entity );
    }
    public void deleteById( Long entityId ){
        T entity = getById( entityId );
        delete( entity );
    }

    protected abstract T getById(Long entityId);
}