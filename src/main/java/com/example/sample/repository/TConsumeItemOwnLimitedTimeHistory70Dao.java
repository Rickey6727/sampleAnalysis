package com.example.sample.repository;

import com.example.sample.entity.TConsumeItemOwnLimitedTimeHistory70;
import org.seasar.doma.Dao;
import org.seasar.doma.Delete;
import org.seasar.doma.Insert;
import org.seasar.doma.Select;
import org.seasar.doma.Update;

/**
 */
@Dao(config = ${configClassName}.class)
public interface TConsumeItemOwnLimitedTimeHistory70Dao {

    /**
     * @param serialId
     * @return the TConsumeItemOwnLimitedTimeHistory70 entity
     */
    @Select
    TConsumeItemOwnLimitedTimeHistory70 selectById(Long serialId);

    /**
     * @param entity
     * @return affected rows
     */
    @Insert
    int insert(TConsumeItemOwnLimitedTimeHistory70 entity);

    /**
     * @param entity
     * @return affected rows
     */
    @Update
    int update(TConsumeItemOwnLimitedTimeHistory70 entity);

    /**
     * @param entity
     * @return affected rows
     */
    @Delete
    int delete(TConsumeItemOwnLimitedTimeHistory70 entity);
}