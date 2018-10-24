package com.example.sample.repository;

import com.example.sample.entity.TConsumeItemOwnLimitedTimeHistory20;
import org.seasar.doma.Dao;
import org.seasar.doma.Delete;
import org.seasar.doma.Insert;
import org.seasar.doma.Select;
import org.seasar.doma.Update;

/**
 */
@Dao(config = ${configClassName}.class)
public interface TConsumeItemOwnLimitedTimeHistory20Dao {

    /**
     * @param serialId
     * @return the TConsumeItemOwnLimitedTimeHistory20 entity
     */
    @Select
    TConsumeItemOwnLimitedTimeHistory20 selectById(Long serialId);

    /**
     * @param entity
     * @return affected rows
     */
    @Insert
    int insert(TConsumeItemOwnLimitedTimeHistory20 entity);

    /**
     * @param entity
     * @return affected rows
     */
    @Update
    int update(TConsumeItemOwnLimitedTimeHistory20 entity);

    /**
     * @param entity
     * @return affected rows
     */
    @Delete
    int delete(TConsumeItemOwnLimitedTimeHistory20 entity);
}