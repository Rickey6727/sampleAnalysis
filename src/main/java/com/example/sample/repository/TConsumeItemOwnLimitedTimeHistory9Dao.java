package com.example.sample.repository;

import com.example.sample.entity.TConsumeItemOwnLimitedTimeHistory9;
import org.seasar.doma.Dao;
import org.seasar.doma.Delete;
import org.seasar.doma.Insert;
import org.seasar.doma.Select;
import org.seasar.doma.Update;

/**
 */
@Dao(config = ${configClassName}.class)
public interface TConsumeItemOwnLimitedTimeHistory9Dao {

    /**
     * @param serialId
     * @return the TConsumeItemOwnLimitedTimeHistory9 entity
     */
    @Select
    TConsumeItemOwnLimitedTimeHistory9 selectById(Long serialId);

    /**
     * @param entity
     * @return affected rows
     */
    @Insert
    int insert(TConsumeItemOwnLimitedTimeHistory9 entity);

    /**
     * @param entity
     * @return affected rows
     */
    @Update
    int update(TConsumeItemOwnLimitedTimeHistory9 entity);

    /**
     * @param entity
     * @return affected rows
     */
    @Delete
    int delete(TConsumeItemOwnLimitedTimeHistory9 entity);
}