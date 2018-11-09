package com.example.sample.repository.operation;

import java.util.Optional;

import com.example.sample.config.DomaConfig;
import com.example.sample.entity.operation.MSurvey;
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
public interface MSurveyDao {

    /**
     * @param surveyId
     * @return the MSurvey entity
     */
    @Select
    Optional<MSurvey> selectById(Integer surveyId);

    /**
     * @param entity
     * @return affected rows
     */
    @Insert
    int insert(MSurvey entity);

    /**
     * @param entity
     * @return affected rows
     */
    @Update
    int update(MSurvey entity);

    /**
     * @param entity
     * @return affected rows
     */
    @Delete
    int delete(MSurvey entity);
}