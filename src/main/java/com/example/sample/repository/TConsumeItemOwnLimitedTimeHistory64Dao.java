package com.example.sample.repository;

import com.example.sample.entity.TConsumeItemOwnLimitedTimeHistory64;
import org.seasar.doma.Dao;
import org.seasar.doma.Delete;
import org.seasar.doma.Insert;
import org.seasar.doma.Select;
import org.seasar.doma.Update;

/**
 */
@Dao(config = ${configClassName}.class)
public interface TConsumeItemOwnLimitedTimeHistory64Dao {

    /**
     * @param serialId
     * @return the TConsumeItemOwnLimitedTimeHistory64 entity
     */
    @Select
    TConsumeItemOwnLimitedTimeHistory64 selectById(Long serialId);

    /**
     * @param entity
     * @return affected rows
     */
    @Insert
    int insert(TConsumeItemOwnLimitedTimeHistory64 entity);

    /**
     * @param entity
     * @return affected rows
     */
    @Update
    int update(TConsumeItemOwnLimitedTimeHistory64 entity);

    /**
     * @param entity
     * @return affected rows
     */
    @Delete
    int delete(TConsumeItemOwnLimitedTimeHistory64 entity);
}