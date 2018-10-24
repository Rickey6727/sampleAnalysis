package com.example.sample.repository;

import com.example.sample.entity.TConsumeItemOwnLimitedTimeHistory98;
import org.seasar.doma.Dao;
import org.seasar.doma.Delete;
import org.seasar.doma.Insert;
import org.seasar.doma.Select;
import org.seasar.doma.Update;

/**
 */
@Dao(config = ${configClassName}.class)
public interface TConsumeItemOwnLimitedTimeHistory98Dao {

    /**
     * @param serialId
     * @return the TConsumeItemOwnLimitedTimeHistory98 entity
     */
    @Select
    TConsumeItemOwnLimitedTimeHistory98 selectById(Long serialId);

    /**
     * @param entity
     * @return affected rows
     */
    @Insert
    int insert(TConsumeItemOwnLimitedTimeHistory98 entity);

    /**
     * @param entity
     * @return affected rows
     */
    @Update
    int update(TConsumeItemOwnLimitedTimeHistory98 entity);

    /**
     * @param entity
     * @return affected rows
     */
    @Delete
    int delete(TConsumeItemOwnLimitedTimeHistory98 entity);
}