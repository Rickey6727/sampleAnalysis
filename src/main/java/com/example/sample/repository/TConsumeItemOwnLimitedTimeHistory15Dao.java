package com.example.sample.repository;

import com.example.sample.entity.TConsumeItemOwnLimitedTimeHistory15;
import org.seasar.doma.Dao;
import org.seasar.doma.Delete;
import org.seasar.doma.Insert;
import org.seasar.doma.Select;
import org.seasar.doma.Update;

/**
 */
@Dao(config = ${configClassName}.class)
public interface TConsumeItemOwnLimitedTimeHistory15Dao {

    /**
     * @param serialId
     * @return the TConsumeItemOwnLimitedTimeHistory15 entity
     */
    @Select
    TConsumeItemOwnLimitedTimeHistory15 selectById(Long serialId);

    /**
     * @param entity
     * @return affected rows
     */
    @Insert
    int insert(TConsumeItemOwnLimitedTimeHistory15 entity);

    /**
     * @param entity
     * @return affected rows
     */
    @Update
    int update(TConsumeItemOwnLimitedTimeHistory15 entity);

    /**
     * @param entity
     * @return affected rows
     */
    @Delete
    int delete(TConsumeItemOwnLimitedTimeHistory15 entity);
}