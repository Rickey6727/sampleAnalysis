package com.example.sample.repository;

import com.example.sample.entity.TConsumeItemOwnLimitedTimeHistory2;
import org.seasar.doma.Dao;
import org.seasar.doma.Delete;
import org.seasar.doma.Insert;
import org.seasar.doma.Select;
import org.seasar.doma.Update;

/**
 */
@Dao(config = ${configClassName}.class)
public interface TConsumeItemOwnLimitedTimeHistory2Dao {

    /**
     * @param serialId
     * @return the TConsumeItemOwnLimitedTimeHistory2 entity
     */
    @Select
    TConsumeItemOwnLimitedTimeHistory2 selectById(Long serialId);

    /**
     * @param entity
     * @return affected rows
     */
    @Insert
    int insert(TConsumeItemOwnLimitedTimeHistory2 entity);

    /**
     * @param entity
     * @return affected rows
     */
    @Update
    int update(TConsumeItemOwnLimitedTimeHistory2 entity);

    /**
     * @param entity
     * @return affected rows
     */
    @Delete
    int delete(TConsumeItemOwnLimitedTimeHistory2 entity);
}