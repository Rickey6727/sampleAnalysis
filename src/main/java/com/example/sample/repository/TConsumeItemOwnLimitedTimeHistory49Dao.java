package com.example.sample.repository;

import com.example.sample.entity.TConsumeItemOwnLimitedTimeHistory49;
import org.seasar.doma.Dao;
import org.seasar.doma.Delete;
import org.seasar.doma.Insert;
import org.seasar.doma.Select;
import org.seasar.doma.Update;

/**
 */
@Dao(config = ${configClassName}.class)
public interface TConsumeItemOwnLimitedTimeHistory49Dao {

    /**
     * @param serialId
     * @return the TConsumeItemOwnLimitedTimeHistory49 entity
     */
    @Select
    TConsumeItemOwnLimitedTimeHistory49 selectById(Long serialId);

    /**
     * @param entity
     * @return affected rows
     */
    @Insert
    int insert(TConsumeItemOwnLimitedTimeHistory49 entity);

    /**
     * @param entity
     * @return affected rows
     */
    @Update
    int update(TConsumeItemOwnLimitedTimeHistory49 entity);

    /**
     * @param entity
     * @return affected rows
     */
    @Delete
    int delete(TConsumeItemOwnLimitedTimeHistory49 entity);
}