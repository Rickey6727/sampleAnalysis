package com.example.sample.repository;

import com.example.sample.entity.TConsumeItemOwnLimitedTimeHistory24;
import org.seasar.doma.Dao;
import org.seasar.doma.Delete;
import org.seasar.doma.Insert;
import org.seasar.doma.Select;
import org.seasar.doma.Update;

/**
 */
@Dao(config = ${configClassName}.class)
public interface TConsumeItemOwnLimitedTimeHistory24Dao {

    /**
     * @param serialId
     * @return the TConsumeItemOwnLimitedTimeHistory24 entity
     */
    @Select
    TConsumeItemOwnLimitedTimeHistory24 selectById(Long serialId);

    /**
     * @param entity
     * @return affected rows
     */
    @Insert
    int insert(TConsumeItemOwnLimitedTimeHistory24 entity);

    /**
     * @param entity
     * @return affected rows
     */
    @Update
    int update(TConsumeItemOwnLimitedTimeHistory24 entity);

    /**
     * @param entity
     * @return affected rows
     */
    @Delete
    int delete(TConsumeItemOwnLimitedTimeHistory24 entity);
}