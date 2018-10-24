package com.example.sample.repository;

import com.example.sample.entity.TConsumeItemOwnLimitedTimeHistory52;
import org.seasar.doma.Dao;
import org.seasar.doma.Delete;
import org.seasar.doma.Insert;
import org.seasar.doma.Select;
import org.seasar.doma.Update;

/**
 */
@Dao(config = ${configClassName}.class)
public interface TConsumeItemOwnLimitedTimeHistory52Dao {

    /**
     * @param serialId
     * @return the TConsumeItemOwnLimitedTimeHistory52 entity
     */
    @Select
    TConsumeItemOwnLimitedTimeHistory52 selectById(Long serialId);

    /**
     * @param entity
     * @return affected rows
     */
    @Insert
    int insert(TConsumeItemOwnLimitedTimeHistory52 entity);

    /**
     * @param entity
     * @return affected rows
     */
    @Update
    int update(TConsumeItemOwnLimitedTimeHistory52 entity);

    /**
     * @param entity
     * @return affected rows
     */
    @Delete
    int delete(TConsumeItemOwnLimitedTimeHistory52 entity);
}