package com.example.sample.repository;

import com.example.sample.entity.TConsumeItemOwnLimitedTimeHistory81;
import org.seasar.doma.Dao;
import org.seasar.doma.Delete;
import org.seasar.doma.Insert;
import org.seasar.doma.Select;
import org.seasar.doma.Update;

/**
 */
@Dao(config = ${configClassName}.class)
public interface TConsumeItemOwnLimitedTimeHistory81Dao {

    /**
     * @param serialId
     * @return the TConsumeItemOwnLimitedTimeHistory81 entity
     */
    @Select
    TConsumeItemOwnLimitedTimeHistory81 selectById(Long serialId);

    /**
     * @param entity
     * @return affected rows
     */
    @Insert
    int insert(TConsumeItemOwnLimitedTimeHistory81 entity);

    /**
     * @param entity
     * @return affected rows
     */
    @Update
    int update(TConsumeItemOwnLimitedTimeHistory81 entity);

    /**
     * @param entity
     * @return affected rows
     */
    @Delete
    int delete(TConsumeItemOwnLimitedTimeHistory81 entity);
}