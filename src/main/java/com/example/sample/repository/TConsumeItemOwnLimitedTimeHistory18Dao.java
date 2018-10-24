package com.example.sample.repository;

import com.example.sample.entity.TConsumeItemOwnLimitedTimeHistory18;
import org.seasar.doma.Dao;
import org.seasar.doma.Delete;
import org.seasar.doma.Insert;
import org.seasar.doma.Select;
import org.seasar.doma.Update;

/**
 */
@Dao(config = ${configClassName}.class)
public interface TConsumeItemOwnLimitedTimeHistory18Dao {

    /**
     * @param serialId
     * @return the TConsumeItemOwnLimitedTimeHistory18 entity
     */
    @Select
    TConsumeItemOwnLimitedTimeHistory18 selectById(Long serialId);

    /**
     * @param entity
     * @return affected rows
     */
    @Insert
    int insert(TConsumeItemOwnLimitedTimeHistory18 entity);

    /**
     * @param entity
     * @return affected rows
     */
    @Update
    int update(TConsumeItemOwnLimitedTimeHistory18 entity);

    /**
     * @param entity
     * @return affected rows
     */
    @Delete
    int delete(TConsumeItemOwnLimitedTimeHistory18 entity);
}