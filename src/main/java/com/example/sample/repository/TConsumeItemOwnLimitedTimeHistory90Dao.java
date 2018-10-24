package com.example.sample.repository;

import com.example.sample.entity.TConsumeItemOwnLimitedTimeHistory90;
import org.seasar.doma.Dao;
import org.seasar.doma.Delete;
import org.seasar.doma.Insert;
import org.seasar.doma.Select;
import org.seasar.doma.Update;

/**
 */
@Dao(config = ${configClassName}.class)
public interface TConsumeItemOwnLimitedTimeHistory90Dao {

    /**
     * @param serialId
     * @return the TConsumeItemOwnLimitedTimeHistory90 entity
     */
    @Select
    TConsumeItemOwnLimitedTimeHistory90 selectById(Long serialId);

    /**
     * @param entity
     * @return affected rows
     */
    @Insert
    int insert(TConsumeItemOwnLimitedTimeHistory90 entity);

    /**
     * @param entity
     * @return affected rows
     */
    @Update
    int update(TConsumeItemOwnLimitedTimeHistory90 entity);

    /**
     * @param entity
     * @return affected rows
     */
    @Delete
    int delete(TConsumeItemOwnLimitedTimeHistory90 entity);
}