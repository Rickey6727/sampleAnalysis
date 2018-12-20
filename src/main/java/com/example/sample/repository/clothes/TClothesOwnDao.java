package com.example.sample.repository.clothes;

import java.util.Collection;
import java.util.Optional;
import java.util.List;


import com.example.sample.config.ClothesConfig;
import com.example.sample.entity.clothes.TClothesOwn;
import org.seasar.doma.Dao;
import org.seasar.doma.Delete;
import org.seasar.doma.Insert;
import org.seasar.doma.Select;
import org.seasar.doma.Update;
import org.seasar.doma.boot.ConfigAutowireable;
import org.springframework.context.annotation.Profile;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.boot.context.properties.ConfigurationProperties;

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
        @Annotation(target = AnnotationTarget.CONSTRUCTOR_PARAMETER, type = Qualifier.class, elements = "\"ClothesConfig\"")
    })
@Dao

public interface TClothesOwnDao {

    /**
     * @param accountId
     * @param serialId
     * @return the TClothesOwn entity
     */
    @Select
    Optional<TClothesOwn> selectById(Integer accountId, Long serialId);
    
    /**
     * @param i
     * @param clothesId
     * @return the TClothesOwn entity
     */
    @Select
    List<Integer> selectAccountIdByClothesId(Integer i, Integer clothesId);

    /**
     * @param entity
     * @return affected rows
     */
    @Insert
    int insert(TClothesOwn entity);

    /**
     * @param entity
     * @return affected rows
     */
    @Update
    int update(TClothesOwn entity);

    /**
     * @param entity
     * @return affected rows
     */
    @Delete
    int delete(TClothesOwn entity);
}