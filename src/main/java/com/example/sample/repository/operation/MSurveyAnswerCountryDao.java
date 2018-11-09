package com.example.sample.repository.operation;

import java.util.Optional;

import com.example.sample.config.DomaConfig;
import com.example.sample.entity.operation.MSurveyAnswerCountry;
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
public interface MSurveyAnswerCountryDao {

    /**
     * @param surveyAnswerId
     * @param index
     * @param countryCd
     * @return the MSurveyAnswerCountry entity
     */
    @Select
    Optional<MSurveyAnswerCountry> selectById(Integer surveyAnswerId, Integer index, Integer countryCd);

    /**
     * @param entity
     * @return affected rows
     */
    @Insert
    int insert(MSurveyAnswerCountry entity);

    /**
     * @param entity
     * @return affected rows
     */
    @Update
    int update(MSurveyAnswerCountry entity);

    /**
     * @param entity
     * @return affected rows
     */
    @Delete
    int delete(MSurveyAnswerCountry entity);
}