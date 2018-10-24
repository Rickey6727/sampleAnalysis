package com.example.sample.repository;

import com.example.sample.entity.TConsumeItemOwnLimitedTimeHistory25;
import org.seasar.doma.Dao;
import org.seasar.doma.Delete;
import org.seasar.doma.Insert;
import org.seasar.doma.Select;
import org.seasar.doma.Update;

/**
 */
@Dao(config = ${configClassName}.class)
public interface TConsumeItemOwnLimitedTimeHistory25Dao {

    /**
     * @param serialId
     * @return the TConsumeItemOwnLimitedTimeHistory25 entity
     */
    @Select
    TConsumeItemOwnLimitedTimeHistory25 selectById(Long serialId);

    /**
     * @param entity
     * @return affected rows
     */
    @Insert
    int insert(TConsumeItemOwnLimitedTimeHistory25 entity);

    /**
     * @param entity
     * @return affected rows
     */
    @Update
    int update(TConsumeItemOwnLimitedTimeHistory25 entity);

    /**
     * @param entity
     * @return affected rows
     */
    @Delete
    int delete(TConsumeItemOwnLimitedTimeHistory25 entity);
}