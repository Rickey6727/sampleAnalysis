package com.example.sample.repository.account;

import java.util.Optional;

import com.example.sample.config.DomaConfig;
import com.example.sample.entity.account.TExchangeHistory;
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
        @Annotation(target = AnnotationTarget.CONSTRUCTOR_PARAMETER, type = Qualifier.class, elements = "\"AccountConfig\"")
    })
@Dao

public interface TExchangeHistoryDao {

    /**
     * @param id
     * @param exchangeId
     * @param accountId
     * @return the TExchangeHistory entity
     */
    @Select
    Optional<TExchangeHistory> selectById(Long id, Integer exchangeId, Integer accountId);
    
    /**
     * @param exchangeId
     * @return the TExchangeHistory entity
     */
    @Select
    Optional<TExchangeHistory> selectCountByExchangeId(Integer exchangeId);

    /**
     * @param entity
     * @return affected rows
     */
    @Insert
    int insert(TExchangeHistory entity);

    /**
     * @param entity
     * @return affected rows
     */
    @Update
    int update(TExchangeHistory entity);

    /**
     * @param entity
     * @return affected rows
     */
    @Delete
    int delete(TExchangeHistory entity);
}