package com.example.sample.repository;

import com.example.sample.entity.TConsumeItemOwnLimitedTimeHistory94;
import org.seasar.doma.Dao;
import org.seasar.doma.Delete;
import org.seasar.doma.Insert;
import org.seasar.doma.Select;
import org.seasar.doma.Update;

/**
 */
@Dao(config = ${configClassName}.class)
public interface TConsumeItemOwnLimitedTimeHistory94Dao {

    /**
     * @param serialId
     * @return the TConsumeItemOwnLimitedTimeHistory94 entity
     */
    @Select
    TConsumeItemOwnLimitedTimeHistory94 selectById(Long serialId);

    /**
     * @param entity
     * @return affected rows
     */
    @Insert
    int insert(TConsumeItemOwnLimitedTimeHistory94 entity);

    /**
     * @param entity
     * @return affected rows
     */
    @Update
    int update(TConsumeItemOwnLimitedTimeHistory94 entity);

    /**
     * @param entity
     * @return affected rows
     */
    @Delete
    int delete(TConsumeItemOwnLimitedTimeHistory94 entity);
}