package com.example.sample.repository;

import com.example.sample.entity.TConsumeItemOwnLimitedTimeHistory83;
import org.seasar.doma.Dao;
import org.seasar.doma.Delete;
import org.seasar.doma.Insert;
import org.seasar.doma.Select;
import org.seasar.doma.Update;

/**
 */
@Dao(config = ${configClassName}.class)
public interface TConsumeItemOwnLimitedTimeHistory83Dao {

    /**
     * @param serialId
     * @return the TConsumeItemOwnLimitedTimeHistory83 entity
     */
    @Select
    TConsumeItemOwnLimitedTimeHistory83 selectById(Long serialId);

    /**
     * @param entity
     * @return affected rows
     */
    @Insert
    int insert(TConsumeItemOwnLimitedTimeHistory83 entity);

    /**
     * @param entity
     * @return affected rows
     */
    @Update
    int update(TConsumeItemOwnLimitedTimeHistory83 entity);

    /**
     * @param entity
     * @return affected rows
     */
    @Delete
    int delete(TConsumeItemOwnLimitedTimeHistory83 entity);
}