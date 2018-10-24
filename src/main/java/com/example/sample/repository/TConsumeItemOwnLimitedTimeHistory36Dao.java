package com.example.sample.repository;

import com.example.sample.entity.TConsumeItemOwnLimitedTimeHistory36;
import org.seasar.doma.Dao;
import org.seasar.doma.Delete;
import org.seasar.doma.Insert;
import org.seasar.doma.Select;
import org.seasar.doma.Update;

/**
 */
@Dao(config = ${configClassName}.class)
public interface TConsumeItemOwnLimitedTimeHistory36Dao {

    /**
     * @param serialId
     * @return the TConsumeItemOwnLimitedTimeHistory36 entity
     */
    @Select
    TConsumeItemOwnLimitedTimeHistory36 selectById(Long serialId);

    /**
     * @param entity
     * @return affected rows
     */
    @Insert
    int insert(TConsumeItemOwnLimitedTimeHistory36 entity);

    /**
     * @param entity
     * @return affected rows
     */
    @Update
    int update(TConsumeItemOwnLimitedTimeHistory36 entity);

    /**
     * @param entity
     * @return affected rows
     */
    @Delete
    int delete(TConsumeItemOwnLimitedTimeHistory36 entity);
}