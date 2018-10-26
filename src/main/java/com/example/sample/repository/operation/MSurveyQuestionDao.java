package com.example.sample.repository.operation;

import com.example.sample.config.DomaConfig;
import com.example.sample.entity.operation.MSurveyQuestion;
import org.seasar.doma.Dao;
import org.seasar.doma.Delete;
import org.seasar.doma.Insert;
import org.seasar.doma.Select;
import org.seasar.doma.Update;

/**
 */
@Dao(config = DomaConfig.class)
public interface MSurveyQuestionDao {

    /**
     * @param surveyQuestionId
     * @return the MSurveyQuestion entity
     */
    @Select
    MSurveyQuestion selectById(Integer surveyQuestionId);

    /**
     * @param entity
     * @return affected rows
     */
    @Insert
    int insert(MSurveyQuestion entity);

    /**
     * @param entity
     * @return affected rows
     */
    @Update
    int update(MSurveyQuestion entity);

    /**
     * @param entity
     * @return affected rows
     */
    @Delete
    int delete(MSurveyQuestion entity);
}