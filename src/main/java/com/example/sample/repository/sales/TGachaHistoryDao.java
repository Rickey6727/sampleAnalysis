package com.example.sample.repository.sales;

import java.util.Optional;
import java.sql.Timestamp;

import com.example.sample.config.SalesConfig;
import com.example.sample.entity.sales.TGachaHistory;
import org.seasar.doma.Dao;
import org.seasar.doma.Delete;
import org.seasar.doma.Insert;
import org.seasar.doma.Select;
import org.seasar.doma.Update;
import org.seasar.doma.boot.ConfigAutowireable;
import org.springframework.transaction.annotation.Transactional;

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
        @Annotation(target = AnnotationTarget.CONSTRUCTOR_PARAMETER, type = Qualifier.class, elements = "\"SalesConfig\"")
    })
@Dao

public interface TGachaHistoryDao {

    /**
     * @param serialId
     * @return the TGachaHistory entity
     */
    @Select
    Optional<TGachaHistory> selectById(Long serialId);
    
    /**
     * @param gachaId
     * @param selectStartDate
     * @param selectEndDate
     * @return the TGachaHistory entity
     */
    @Select
    Optional<TGachaHistory> selectByTerm(Integer gachaId, String selectStartDate, String selectEndDate);
    
    /**
     * @param gachaId
     * @param salesStartDate
     * @param selectEndDate
     * @return the TGachaHistory entity
     */
    @Select
    Optional<TGachaHistory> selectThreeDaysCountByGachaId(Integer gachaId, String salesStartDate, String selectEndDate);
    
    /**
     * @param gachaId
     * @param salesStartDate
     * @param selectEndDate
     * @return the TGachaHistory entity
     */
    @Select
    Optional<TGachaHistory> selectFreeThreeDaysCountByGachaId(Integer gachaId, String salesStartDate, String selectEndDate);
    
    /**
     * @param gachaId
     * @param salesStartDate
     * @param selectEndDate
     * @return the TGachaHistory entity
     */
    @Select
    Optional<TGachaHistory> selectAllFreeThreeDaysCountByGachaId(Integer gachaId, String salesStartDate, String selectEndDate);
    
    /**
     * @param gachaId
     * @param salesStartDate
     * @param selectEndDate
     * @return the TGachaHistory entity
     */
    @Select
    Optional<TGachaHistory> selectTenTwoThreeDaysCountByGachaId(Integer gachaId, String salesStartDate, String selectEndDate);
    
    
    /**
     * @param gachaId
     * @return the TGachaHistory entity
     */
    @Select
    Optional<TGachaHistory> selectStepCountByGachaId(Integer gachaId);
    
    /**
     * @param gachaId
     * @param salesStartDate
     * @param selectEndDate
     * @return the TGachaHistory entity
     */
    @Select
    Optional<TGachaHistory> selectStepCountThreeDaysCountByGachaId(Integer gachaId, String salesStartDate, String selectEndDate);
    
    /**
     * @param gachaId
     * @return the TGachaHistory entity
     */
    @Select
    Optional<TGachaHistory> selectByGachaId(Integer gachaId);
    
    /**
     * @param gachaId
     * @return the TGachaHistory entity
     */
    @Select
    Optional<TGachaHistory> selectFreeCountByGachaId(Integer gachaId);
    
    /**
     * @param gachaId
     * @return the TGachaHistory entity
     */
    @Select
    Optional<TGachaHistory> selectAllFreeCountByGachaId(Integer gachaId);
    
    /**
     * @param gachaId
     * @return the TGachaHistory entity
     */
    @Select
    Optional<TGachaHistory> selectTenTwoByGachaId(Integer gachaId);

    /**
     * @param entity
     * @return affected rows
     */
    @Insert
    int insert(TGachaHistory entity);

    /**
     * @param entity
     * @return affected rows
     */
    @Update
    int update(TGachaHistory entity);

    /**
     * @param entity
     * @return affected rows
     */
    @Delete
    int delete(TGachaHistory entity);
}