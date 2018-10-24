package com.example.sample.repository;

import com.example.sample.entity.TConsumeItemOwnLimitedTimeHistory59;
import org.seasar.doma.Dao;
import org.seasar.doma.Delete;
import org.seasar.doma.Insert;
import org.seasar.doma.Select;
import org.seasar.doma.Update;

/**
 */
@Dao(config = ${configClassName}.class)
public interface TConsumeItemOwnLimitedTimeHistory59Dao {

    /**
     * @param serialId
     * @return the TConsumeItemOwnLimitedTimeHistory59 entity
     */
    @Select
    TConsumeItemOwnLimitedTimeHistory59 selectById(Long serialId);

    /**
     * @param entity
     * @return affected rows
     */
    @Insert
    int insert(TConsumeItemOwnLimitedTimeHistory59 entity);

    /**
     * @param entity
     * @return affected rows
     */
    @Update
    int update(TConsumeItemOwnLimitedTimeHistory59 entity);

    /**
     * @param entity
     * @return affected rows
     */
    @Delete
    int delete(TConsumeItemOwnLimitedTimeHistory59 entity);
}