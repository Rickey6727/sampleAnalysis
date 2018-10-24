package com.example.sample.repository;

import com.example.sample.entity.TConsumeItemOwnLimitedTimeHistory93;
import org.seasar.doma.Dao;
import org.seasar.doma.Delete;
import org.seasar.doma.Insert;
import org.seasar.doma.Select;
import org.seasar.doma.Update;

/**
 */
@Dao(config = ${configClassName}.class)
public interface TConsumeItemOwnLimitedTimeHistory93Dao {

    /**
     * @param serialId
     * @return the TConsumeItemOwnLimitedTimeHistory93 entity
     */
    @Select
    TConsumeItemOwnLimitedTimeHistory93 selectById(Long serialId);

    /**
     * @param entity
     * @return affected rows
     */
    @Insert
    int insert(TConsumeItemOwnLimitedTimeHistory93 entity);

    /**
     * @param entity
     * @return affected rows
     */
    @Update
    int update(TConsumeItemOwnLimitedTimeHistory93 entity);

    /**
     * @param entity
     * @return affected rows
     */
    @Delete
    int delete(TConsumeItemOwnLimitedTimeHistory93 entity);
}