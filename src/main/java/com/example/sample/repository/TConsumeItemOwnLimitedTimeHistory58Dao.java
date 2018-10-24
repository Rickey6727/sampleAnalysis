package com.example.sample.repository;

import com.example.sample.entity.TConsumeItemOwnLimitedTimeHistory58;
import org.seasar.doma.Dao;
import org.seasar.doma.Delete;
import org.seasar.doma.Insert;
import org.seasar.doma.Select;
import org.seasar.doma.Update;

/**
 */
@Dao(config = ${configClassName}.class)
public interface TConsumeItemOwnLimitedTimeHistory58Dao {

    /**
     * @param serialId
     * @return the TConsumeItemOwnLimitedTimeHistory58 entity
     */
    @Select
    TConsumeItemOwnLimitedTimeHistory58 selectById(Long serialId);

    /**
     * @param entity
     * @return affected rows
     */
    @Insert
    int insert(TConsumeItemOwnLimitedTimeHistory58 entity);

    /**
     * @param entity
     * @return affected rows
     */
    @Update
    int update(TConsumeItemOwnLimitedTimeHistory58 entity);

    /**
     * @param entity
     * @return affected rows
     */
    @Delete
    int delete(TConsumeItemOwnLimitedTimeHistory58 entity);
}