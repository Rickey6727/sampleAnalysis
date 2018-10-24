package com.example.sample.repository;

import com.example.sample.entity.TSurveyAnswer;
import org.seasar.doma.Dao;
import org.seasar.doma.Delete;
import org.seasar.doma.Insert;
import org.seasar.doma.Select;
import org.seasar.doma.Update;

/**
 */
@Dao(config = ${configClassName}.class)
public interface TSurveyAnswerDao {

    /**
     * @param accountId
     * @param surveyId
     * @param answerId
     * @param index
     * @return the TSurveyAnswer entity
     */
    @Select
    TSurveyAnswer selectById(Integer accountId, Integer surveyId, Integer answerId, Integer index);

    /**
     * @param entity
     * @return affected rows
     */
    @Insert
    int insert(TSurveyAnswer entity);

    /**
     * @param entity
     * @return affected rows
     */
    @Update
    int update(TSurveyAnswer entity);

    /**
     * @param entity
     * @return affected rows
     */
    @Delete
    int delete(TSurveyAnswer entity);
}