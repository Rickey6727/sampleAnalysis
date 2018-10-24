package com.example.sample.repository;

import com.example.sample.entity.TConsumeItemOwnLimitedTimeHistory53;
import org.seasar.doma.Dao;
import org.seasar.doma.Delete;
import org.seasar.doma.Insert;
import org.seasar.doma.Select;
import org.seasar.doma.Update;

/**
 */
@Dao(config = ${configClassName}.class)
public interface TConsumeItemOwnLimitedTimeHistory53Dao {

    /**
     * @param serialId
     * @return the TConsumeItemOwnLimitedTimeHistory53 entity
     */
    @Select
    TConsumeItemOwnLimitedTimeHistory53 selectById(Long serialId);

    /**
     * @param entity
     * @return affected rows
     */
    @Insert
    int insert(TConsumeItemOwnLimitedTimeHistory53 entity);

    /**
     * @param entity
     * @return affected rows
     */
    @Update
    int update(TConsumeItemOwnLimitedTimeHistory53 entity);

    /**
     * @param entity
     * @return affected rows
     */
    @Delete
    int delete(TConsumeItemOwnLimitedTimeHistory53 entity);
}