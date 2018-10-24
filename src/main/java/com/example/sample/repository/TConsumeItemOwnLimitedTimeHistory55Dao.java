package com.example.sample.repository;

import com.example.sample.entity.TConsumeItemOwnLimitedTimeHistory55;
import org.seasar.doma.Dao;
import org.seasar.doma.Delete;
import org.seasar.doma.Insert;
import org.seasar.doma.Select;
import org.seasar.doma.Update;

/**
 */
@Dao(config = ${configClassName}.class)
public interface TConsumeItemOwnLimitedTimeHistory55Dao {

    /**
     * @param serialId
     * @return the TConsumeItemOwnLimitedTimeHistory55 entity
     */
    @Select
    TConsumeItemOwnLimitedTimeHistory55 selectById(Long serialId);

    /**
     * @param entity
     * @return affected rows
     */
    @Insert
    int insert(TConsumeItemOwnLimitedTimeHistory55 entity);

    /**
     * @param entity
     * @return affected rows
     */
    @Update
    int update(TConsumeItemOwnLimitedTimeHistory55 entity);

    /**
     * @param entity
     * @return affected rows
     */
    @Delete
    int delete(TConsumeItemOwnLimitedTimeHistory55 entity);
}