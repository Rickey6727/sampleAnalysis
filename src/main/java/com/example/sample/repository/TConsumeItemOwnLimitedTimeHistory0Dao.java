package com.example.sample.repository;

import com.example.sample.entity.TConsumeItemOwnLimitedTimeHistory0;
import org.seasar.doma.Dao;
import org.seasar.doma.Delete;
import org.seasar.doma.Insert;
import org.seasar.doma.Select;
import org.seasar.doma.Update;

/**
 */
@Dao(config = ${configClassName}.class)
public interface TConsumeItemOwnLimitedTimeHistory0Dao {

    /**
     * @param serialId
     * @return the TConsumeItemOwnLimitedTimeHistory0 entity
     */
    @Select
    TConsumeItemOwnLimitedTimeHistory0 selectById(Long serialId);

    /**
     * @param entity
     * @return affected rows
     */
    @Insert
    int insert(TConsumeItemOwnLimitedTimeHistory0 entity);

    /**
     * @param entity
     * @return affected rows
     */
    @Update
    int update(TConsumeItemOwnLimitedTimeHistory0 entity);

    /**
     * @param entity
     * @return affected rows
     */
    @Delete
    int delete(TConsumeItemOwnLimitedTimeHistory0 entity);
}