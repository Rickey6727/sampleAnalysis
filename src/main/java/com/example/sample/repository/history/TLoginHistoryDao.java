package com.example.sample.repository.history;

import java.util.Optional;

import com.example.sample.config.HistoryConfig;
import com.example.sample.entity.history.TLoginHistory;
import java.time.LocalDate;
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
        @Annotation(target = AnnotationTarget.CONSTRUCTOR_PARAMETER, type = Qualifier.class, elements = "\"HistoryConfig\"")
    })
@Dao
public interface TLoginHistoryDao {

    /**
     * @param accountId
     * @param loginDate
     * @return the TLoginHistory entity
     */
    @Select
    Optional<TLoginHistory> selectById(Integer accountId, LocalDate loginDate);
    
    /**
     * @param startDate
     * @param endDate
     * @return the TLoginHistory entity
     */
    @Select
    Optional<TLoginHistory> selectUUByEventId(String startDate, String endDate);

    /**
     * @param entity
     * @return affected rows
     */
    @Insert
    int insert(TLoginHistory entity);

    /**
     * @param entity
     * @return affected rows
     */
    @Update
    int update(TLoginHistory entity);

    /**
     * @param entity
     * @return affected rows
     */
    @Delete
    int delete(TLoginHistory entity);
}