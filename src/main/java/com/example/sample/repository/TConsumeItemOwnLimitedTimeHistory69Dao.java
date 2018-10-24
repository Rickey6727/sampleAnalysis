package com.example.sample.repository;

import com.example.sample.entity.TConsumeItemOwnLimitedTimeHistory69;
import org.seasar.doma.Dao;
import org.seasar.doma.Delete;
import org.seasar.doma.Insert;
import org.seasar.doma.Select;
import org.seasar.doma.Update;

/**
 */
@Dao(config = ${configClassName}.class)
public interface TConsumeItemOwnLimitedTimeHistory69Dao {

    /**
     * @param serialId
     * @return the TConsumeItemOwnLimitedTimeHistory69 entity
     */
    @Select
    TConsumeItemOwnLimitedTimeHistory69 selectById(Long serialId);

    /**
     * @param entity
     * @return affected rows
     */
    @Insert
    int insert(TConsumeItemOwnLimitedTimeHistory69 entity);

    /**
     * @param entity
     * @return affected rows
     */
    @Update
    int update(TConsumeItemOwnLimitedTimeHistory69 entity);

    /**
     * @param entity
     * @return affected rows
     */
    @Delete
    int delete(TConsumeItemOwnLimitedTimeHistory69 entity);
}