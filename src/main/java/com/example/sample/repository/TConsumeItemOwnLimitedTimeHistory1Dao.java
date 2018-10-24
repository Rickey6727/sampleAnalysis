package com.example.sample.repository;

import com.example.sample.entity.TConsumeItemOwnLimitedTimeHistory1;
import org.seasar.doma.Dao;
import org.seasar.doma.Delete;
import org.seasar.doma.Insert;
import org.seasar.doma.Select;
import org.seasar.doma.Update;

/**
 */
@Dao(config = ${configClassName}.class)
public interface TConsumeItemOwnLimitedTimeHistory1Dao {

    /**
     * @param serialId
     * @return the TConsumeItemOwnLimitedTimeHistory1 entity
     */
    @Select
    TConsumeItemOwnLimitedTimeHistory1 selectById(Long serialId);

    /**
     * @param entity
     * @return affected rows
     */
    @Insert
    int insert(TConsumeItemOwnLimitedTimeHistory1 entity);

    /**
     * @param entity
     * @return affected rows
     */
    @Update
    int update(TConsumeItemOwnLimitedTimeHistory1 entity);

    /**
     * @param entity
     * @return affected rows
     */
    @Delete
    int delete(TConsumeItemOwnLimitedTimeHistory1 entity);
}