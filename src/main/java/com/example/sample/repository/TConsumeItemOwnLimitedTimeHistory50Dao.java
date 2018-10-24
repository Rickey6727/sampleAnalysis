package com.example.sample.repository;

import com.example.sample.entity.TConsumeItemOwnLimitedTimeHistory50;
import org.seasar.doma.Dao;
import org.seasar.doma.Delete;
import org.seasar.doma.Insert;
import org.seasar.doma.Select;
import org.seasar.doma.Update;

/**
 */
@Dao(config = ${configClassName}.class)
public interface TConsumeItemOwnLimitedTimeHistory50Dao {

    /**
     * @param serialId
     * @return the TConsumeItemOwnLimitedTimeHistory50 entity
     */
    @Select
    TConsumeItemOwnLimitedTimeHistory50 selectById(Long serialId);

    /**
     * @param entity
     * @return affected rows
     */
    @Insert
    int insert(TConsumeItemOwnLimitedTimeHistory50 entity);

    /**
     * @param entity
     * @return affected rows
     */
    @Update
    int update(TConsumeItemOwnLimitedTimeHistory50 entity);

    /**
     * @param entity
     * @return affected rows
     */
    @Delete
    int delete(TConsumeItemOwnLimitedTimeHistory50 entity);
}