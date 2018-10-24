package com.example.sample.repository;

import com.example.sample.entity.TConsumeItemOwnLimitedTimeHistory88;
import org.seasar.doma.Dao;
import org.seasar.doma.Delete;
import org.seasar.doma.Insert;
import org.seasar.doma.Select;
import org.seasar.doma.Update;

/**
 */
@Dao(config = ${configClassName}.class)
public interface TConsumeItemOwnLimitedTimeHistory88Dao {

    /**
     * @param serialId
     * @return the TConsumeItemOwnLimitedTimeHistory88 entity
     */
    @Select
    TConsumeItemOwnLimitedTimeHistory88 selectById(Long serialId);

    /**
     * @param entity
     * @return affected rows
     */
    @Insert
    int insert(TConsumeItemOwnLimitedTimeHistory88 entity);

    /**
     * @param entity
     * @return affected rows
     */
    @Update
    int update(TConsumeItemOwnLimitedTimeHistory88 entity);

    /**
     * @param entity
     * @return affected rows
     */
    @Delete
    int delete(TConsumeItemOwnLimitedTimeHistory88 entity);
}