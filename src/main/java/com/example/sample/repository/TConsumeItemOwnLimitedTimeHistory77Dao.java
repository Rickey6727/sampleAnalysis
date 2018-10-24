package com.example.sample.repository;

import com.example.sample.entity.TConsumeItemOwnLimitedTimeHistory77;
import org.seasar.doma.Dao;
import org.seasar.doma.Delete;
import org.seasar.doma.Insert;
import org.seasar.doma.Select;
import org.seasar.doma.Update;

/**
 */
@Dao(config = ${configClassName}.class)
public interface TConsumeItemOwnLimitedTimeHistory77Dao {

    /**
     * @param serialId
     * @return the TConsumeItemOwnLimitedTimeHistory77 entity
     */
    @Select
    TConsumeItemOwnLimitedTimeHistory77 selectById(Long serialId);

    /**
     * @param entity
     * @return affected rows
     */
    @Insert
    int insert(TConsumeItemOwnLimitedTimeHistory77 entity);

    /**
     * @param entity
     * @return affected rows
     */
    @Update
    int update(TConsumeItemOwnLimitedTimeHistory77 entity);

    /**
     * @param entity
     * @return affected rows
     */
    @Delete
    int delete(TConsumeItemOwnLimitedTimeHistory77 entity);
}