package com.example.sample.repository;

import com.example.sample.entity.TConsumeItemOwnLimitedTimeHistory5;
import org.seasar.doma.Dao;
import org.seasar.doma.Delete;
import org.seasar.doma.Insert;
import org.seasar.doma.Select;
import org.seasar.doma.Update;

/**
 */
@Dao(config = ${configClassName}.class)
public interface TConsumeItemOwnLimitedTimeHistory5Dao {

    /**
     * @param serialId
     * @return the TConsumeItemOwnLimitedTimeHistory5 entity
     */
    @Select
    TConsumeItemOwnLimitedTimeHistory5 selectById(Long serialId);

    /**
     * @param entity
     * @return affected rows
     */
    @Insert
    int insert(TConsumeItemOwnLimitedTimeHistory5 entity);

    /**
     * @param entity
     * @return affected rows
     */
    @Update
    int update(TConsumeItemOwnLimitedTimeHistory5 entity);

    /**
     * @param entity
     * @return affected rows
     */
    @Delete
    int delete(TConsumeItemOwnLimitedTimeHistory5 entity);
}