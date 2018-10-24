package com.example.sample.repository;

import com.example.sample.entity.TConsumeItemOwnLimitedTimeHistory72;
import org.seasar.doma.Dao;
import org.seasar.doma.Delete;
import org.seasar.doma.Insert;
import org.seasar.doma.Select;
import org.seasar.doma.Update;

/**
 */
@Dao(config = ${configClassName}.class)
public interface TConsumeItemOwnLimitedTimeHistory72Dao {

    /**
     * @param serialId
     * @return the TConsumeItemOwnLimitedTimeHistory72 entity
     */
    @Select
    TConsumeItemOwnLimitedTimeHistory72 selectById(Long serialId);

    /**
     * @param entity
     * @return affected rows
     */
    @Insert
    int insert(TConsumeItemOwnLimitedTimeHistory72 entity);

    /**
     * @param entity
     * @return affected rows
     */
    @Update
    int update(TConsumeItemOwnLimitedTimeHistory72 entity);

    /**
     * @param entity
     * @return affected rows
     */
    @Delete
    int delete(TConsumeItemOwnLimitedTimeHistory72 entity);
}