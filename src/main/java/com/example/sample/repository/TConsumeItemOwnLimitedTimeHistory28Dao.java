package com.example.sample.repository;

import com.example.sample.entity.TConsumeItemOwnLimitedTimeHistory28;
import org.seasar.doma.Dao;
import org.seasar.doma.Delete;
import org.seasar.doma.Insert;
import org.seasar.doma.Select;
import org.seasar.doma.Update;

/**
 */
@Dao(config = ${configClassName}.class)
public interface TConsumeItemOwnLimitedTimeHistory28Dao {

    /**
     * @param serialId
     * @return the TConsumeItemOwnLimitedTimeHistory28 entity
     */
    @Select
    TConsumeItemOwnLimitedTimeHistory28 selectById(Long serialId);

    /**
     * @param entity
     * @return affected rows
     */
    @Insert
    int insert(TConsumeItemOwnLimitedTimeHistory28 entity);

    /**
     * @param entity
     * @return affected rows
     */
    @Update
    int update(TConsumeItemOwnLimitedTimeHistory28 entity);

    /**
     * @param entity
     * @return affected rows
     */
    @Delete
    int delete(TConsumeItemOwnLimitedTimeHistory28 entity);
}