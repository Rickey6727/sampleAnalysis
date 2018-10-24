package com.example.sample.repository;

import com.example.sample.entity.TConsumeItemOwnLimitedTimeHistory13;
import org.seasar.doma.Dao;
import org.seasar.doma.Delete;
import org.seasar.doma.Insert;
import org.seasar.doma.Select;
import org.seasar.doma.Update;

/**
 */
@Dao(config = ${configClassName}.class)
public interface TConsumeItemOwnLimitedTimeHistory13Dao {

    /**
     * @param serialId
     * @return the TConsumeItemOwnLimitedTimeHistory13 entity
     */
    @Select
    TConsumeItemOwnLimitedTimeHistory13 selectById(Long serialId);

    /**
     * @param entity
     * @return affected rows
     */
    @Insert
    int insert(TConsumeItemOwnLimitedTimeHistory13 entity);

    /**
     * @param entity
     * @return affected rows
     */
    @Update
    int update(TConsumeItemOwnLimitedTimeHistory13 entity);

    /**
     * @param entity
     * @return affected rows
     */
    @Delete
    int delete(TConsumeItemOwnLimitedTimeHistory13 entity);
}