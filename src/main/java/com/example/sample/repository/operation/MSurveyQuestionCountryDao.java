package com.example.sample.repository.operation;

import java.util.Optional;

import com.example.sample.config.DomaConfig;
import com.example.sample.entity.operation.MSurveyQuestionCountry;
import org.seasar.doma.Dao;
import org.seasar.doma.Delete;
import org.seasar.doma.Insert;
import org.seasar.doma.Select;
import org.seasar.doma.Update;
import org.seasar.doma.boot.ConfigAutowireable;

/**
 */
@ConfigAutowireable
@Dao(config = DomaConfig.class)
public interface MSurveyQuestionCountryDao {

    /**
     * @param surveyQuestionId
     * @param countryCd
     * @return the MSurveyQuestionCountry entity
     */
    @Select
    Optional<MSurveyQuestionCountry> selectById(Integer surveyQuestionId, Integer countryCd);

    /**
     * @param entity
     * @return affected rows
     */
    @Insert
    int insert(MSurveyQuestionCountry entity);

    /**
     * @param entity
     * @return affected rows
     */
    @Update
    int update(MSurveyQuestionCountry entity);

    /**
     * @param entity
     * @return affected rows
     */
    @Delete
    int delete(MSurveyQuestionCountry entity);
}