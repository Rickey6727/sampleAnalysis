package com.example.sample.repository;

import com.example.sample.entity.TConsumeItemOwnLimitedTimeHistory61;
import org.seasar.doma.Dao;
import org.seasar.doma.Delete;
import org.seasar.doma.Insert;
import org.seasar.doma.Select;
import org.seasar.doma.Update;

/**
 */
@Dao(config = ${configClassName}.class)
public interface TConsumeItemOwnLimitedTimeHistory61Dao {

    /**
     * @param serialId
     * @return the TConsumeItemOwnLimitedTimeHistory61 entity
     */
    @Select
    TConsumeItemOwnLimitedTimeHistory61 selectById(Long serialId);

    /**
     * @param entity
     * @return affected rows
     */
    @Insert
    int insert(TConsumeItemOwnLimitedTimeHistory61 entity);

    /**
     * @param entity
     * @return affected rows
     */
    @Update
    int update(TConsumeItemOwnLimitedTimeHistory61 entity);

    /**
     * @param entity
     * @return affected rows
     */
    @Delete
    int delete(TConsumeItemOwnLimitedTimeHistory61 entity);
}