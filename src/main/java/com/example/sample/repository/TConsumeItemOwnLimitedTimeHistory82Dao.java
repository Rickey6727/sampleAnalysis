package com.example.sample.repository;

import com.example.sample.entity.TConsumeItemOwnLimitedTimeHistory82;
import org.seasar.doma.Dao;
import org.seasar.doma.Delete;
import org.seasar.doma.Insert;
import org.seasar.doma.Select;
import org.seasar.doma.Update;

/**
 */
@Dao(config = ${configClassName}.class)
public interface TConsumeItemOwnLimitedTimeHistory82Dao {

    /**
     * @param serialId
     * @return the TConsumeItemOwnLimitedTimeHistory82 entity
     */
    @Select
    TConsumeItemOwnLimitedTimeHistory82 selectById(Long serialId);

    /**
     * @param entity
     * @return affected rows
     */
    @Insert
    int insert(TConsumeItemOwnLimitedTimeHistory82 entity);

    /**
     * @param entity
     * @return affected rows
     */
    @Update
    int update(TConsumeItemOwnLimitedTimeHistory82 entity);

    /**
     * @param entity
     * @return affected rows
     */
    @Delete
    int delete(TConsumeItemOwnLimitedTimeHistory82 entity);
}