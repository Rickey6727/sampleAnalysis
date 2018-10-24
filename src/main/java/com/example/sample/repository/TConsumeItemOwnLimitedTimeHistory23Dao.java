package com.example.sample.repository;

import com.example.sample.entity.TConsumeItemOwnLimitedTimeHistory23;
import org.seasar.doma.Dao;
import org.seasar.doma.Delete;
import org.seasar.doma.Insert;
import org.seasar.doma.Select;
import org.seasar.doma.Update;

/**
 */
@Dao(config = ${configClassName}.class)
public interface TConsumeItemOwnLimitedTimeHistory23Dao {

    /**
     * @param serialId
     * @return the TConsumeItemOwnLimitedTimeHistory23 entity
     */
    @Select
    TConsumeItemOwnLimitedTimeHistory23 selectById(Long serialId);

    /**
     * @param entity
     * @return affected rows
     */
    @Insert
    int insert(TConsumeItemOwnLimitedTimeHistory23 entity);

    /**
     * @param entity
     * @return affected rows
     */
    @Update
    int update(TConsumeItemOwnLimitedTimeHistory23 entity);

    /**
     * @param entity
     * @return affected rows
     */
    @Delete
    int delete(TConsumeItemOwnLimitedTimeHistory23 entity);
}