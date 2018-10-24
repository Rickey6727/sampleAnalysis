package com.example.sample.repository;

import com.example.sample.entity.TConsumeItemOwnLimitedTimeHistory32;
import org.seasar.doma.Dao;
import org.seasar.doma.Delete;
import org.seasar.doma.Insert;
import org.seasar.doma.Select;
import org.seasar.doma.Update;

/**
 */
@Dao(config = ${configClassName}.class)
public interface TConsumeItemOwnLimitedTimeHistory32Dao {

    /**
     * @param serialId
     * @return the TConsumeItemOwnLimitedTimeHistory32 entity
     */
    @Select
    TConsumeItemOwnLimitedTimeHistory32 selectById(Long serialId);

    /**
     * @param entity
     * @return affected rows
     */
    @Insert
    int insert(TConsumeItemOwnLimitedTimeHistory32 entity);

    /**
     * @param entity
     * @return affected rows
     */
    @Update
    int update(TConsumeItemOwnLimitedTimeHistory32 entity);

    /**
     * @param entity
     * @return affected rows
     */
    @Delete
    int delete(TConsumeItemOwnLimitedTimeHistory32 entity);
}