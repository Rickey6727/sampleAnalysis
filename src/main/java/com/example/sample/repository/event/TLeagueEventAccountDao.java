package com.example.sample.repository.event;

import java.util.Optional;

import com.example.sample.config.EventConfig;
import com.example.sample.entity.event.TLeagueEventAccount;
import org.seasar.doma.Dao;
import org.seasar.doma.Delete;
import org.seasar.doma.Insert;
import org.seasar.doma.Select;
import org.seasar.doma.Update;
import org.seasar.doma.boot.ConfigAutowireable;

import org.seasar.doma.AnnotateWith;
import org.seasar.doma.Annotation;
import org.seasar.doma.AnnotationTarget;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Autowired;



/**
 */
@AnnotateWith(annotations = {
        @Annotation(target = AnnotationTarget.CLASS, type = Repository.class),
        @Annotation(target = AnnotationTarget.CLASS, type = Component.class),
        @Annotation(target = AnnotationTarget.CONSTRUCTOR, type = Autowired.class),
        @Annotation(target = AnnotationTarget.CONSTRUCTOR_PARAMETER, type = Qualifier.class, elements = "\"EventConfig\"")
    })
@Dao
public interface TLeagueEventAccountDao {

    /**
     * @param eventId
     * @param accountId
     * @return the TLeagueEventAccount entity
     */
    @Select
    Optional<TLeagueEventAccount> selectById(Integer eventId, Integer accountId);
    
    /**
     * @param eventId
     * @return the TLeagueEventAccount entity
     */
    @Select
    Optional<TLeagueEventAccount> selectActiveUserByCurrentPoint(Integer eventId);

    /**
     * @param entity
     * @return affected rows
     */
    @Insert
    int insert(TLeagueEventAccount entity);

    /**
     * @param entity
     * @return affected rows
     */
    @Update
    int update(TLeagueEventAccount entity);

    /**
     * @param entity
     * @return affected rows
     */
    @Delete
    int delete(TLeagueEventAccount entity);
}