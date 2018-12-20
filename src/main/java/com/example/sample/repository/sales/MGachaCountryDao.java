package com.example.sample.repository.sales;

import java.util.Optional;

import com.example.sample.config.SalesConfig;
import com.example.sample.entity.sales.MGachaCountry;
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

public interface MGachaCountryDao {

    /**
     * @param gachaId
     * @param countryCd
     * @return the MGachaCountry entity
     */
    @Select
    Optional<MGachaCountry> selectById(Integer gachaId, Integer countryCd);

    /**
     * @param entity
     * @return affected rows
     */
    @Insert
    int insert(MGachaCountry entity);

    /**
     * @param entity
     * @return affected rows
     */
    @Update
    int update(MGachaCountry entity);

    /**
     * @param entity
     * @return affected rows
     */
    @Delete
    int delete(MGachaCountry entity);
}