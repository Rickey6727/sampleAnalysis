package com.example.sample.repository;

import com.example.sample.entity.TConsumeItemOwnLimitedTimeHistory46;
import org.seasar.doma.Dao;
import org.seasar.doma.Delete;
import org.seasar.doma.Insert;
import org.seasar.doma.Select;
import org.seasar.doma.Update;

/**
 */
@Dao(config = ${configClassName}.class)
public interface TConsumeItemOwnLimitedTimeHistory46Dao {

    /**
     * @param serialId
     * @return the TConsumeItemOwnLimitedTimeHistory46 entity
     */
    @Select
    TConsumeItemOwnLimitedTimeHistory46 selectById(Long serialId);

    /**
     * @param entity
     * @return affected rows
     */
    @Insert
    int insert(TConsumeItemOwnLimitedTimeHistory46 entity);

    /**
     * @param entity
     * @return affected rows
     */
    @Update
    int update(TConsumeItemOwnLimitedTimeHistory46 entity);

    /**
     * @param entity
     * @return affected rows
     */
    @Delete
    int delete(TConsumeItemOwnLimitedTimeHistory46 entity);
}