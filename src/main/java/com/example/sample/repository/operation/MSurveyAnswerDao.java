package com.example.sample.repository.operation;

import java.util.Optional;

import com.example.sample.config.DomaConfig;
import com.example.sample.entity.operation.MSurveyAnswer;
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
public interface MSurveyAnswerDao {

    /**
     * @param surveyAnswerId
     * @param index
     * @return the MSurveyAnswer entity
     */
    @Select
    Optional<MSurveyAnswer> selectById(Integer surveyAnswerId, Integer index);

    /**
     * @param entity
     * @return affected rows
     */
    @Insert
    int insert(MSurveyAnswer entity);

    /**
     * @param entity
     * @return affected rows
     */
    @Update
    int update(MSurveyAnswer entity);

    /**
     * @param entity
     * @return affected rows
     */
    @Delete
    int delete(MSurveyAnswer entity);
}