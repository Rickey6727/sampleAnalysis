package com.example.sample.repository;

import com.example.sample.entity.TConsumeItemOwnLimitedTimeHistory95;
import org.seasar.doma.Dao;
import org.seasar.doma.Delete;
import org.seasar.doma.Insert;
import org.seasar.doma.Select;
import org.seasar.doma.Update;

/**
 */
@Dao(config = ${configClassName}.class)
public interface TConsumeItemOwnLimitedTimeHistory95Dao {

    /**
     * @param serialId
     * @return the TConsumeItemOwnLimitedTimeHistory95 entity
     */
    @Select
    TConsumeItemOwnLimitedTimeHistory95 selectById(Long serialId);

    /**
     * @param entity
     * @return affected rows
     */
    @Insert
    int insert(TConsumeItemOwnLimitedTimeHistory95 entity);

    /**
     * @param entity
     * @return affected rows
     */
    @Update
    int update(TConsumeItemOwnLimitedTimeHistory95 entity);

    /**
     * @param entity
     * @return affected rows
     */
    @Delete
    int delete(TConsumeItemOwnLimitedTimeHistory95 entity);
}