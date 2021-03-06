package com.example.sample.repository.operation;

import java.util.List;
import java.util.Optional;

import com.example.sample.config.OperationConfig;
import com.example.sample.entity.operation.MGachaExchange;
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
        @Annotation(target = AnnotationTarget.CONSTRUCTOR_PARAMETER, type = Qualifier.class, elements = "\"OperationConfig\"")
    })
@Dao

public interface MGachaExchangeDao {

    /**
     * @param exchangeId
     * @return the MGachaExchange entity
     */
    @Select
    Optional<MGachaExchange> selectById(Integer exchangeId);
    
    /**
     * @param gachaId
     * @return the MGachaExchange entity
     */
    @Select
    List<MGachaExchange> selectExchangeType1ByGachaId(Integer gachaId);
    
    /**
     * @param gachaId
     * @return the MGachaExchange entity
     */
    @Select
    List<MGachaExchange> selectExchangeType2ByGachaId(Integer gachaId);

    /**
     * @param entity
     * @return affected rows
     */
    @Insert
    int insert(MGachaExchange entity);

    /**
     * @param entity
     * @return affected rows
     */
    @Update
    int update(MGachaExchange entity);

    /**
     * @param entity
     * @return affected rows
     */
    @Delete
    int delete(MGachaExchange entity);
}