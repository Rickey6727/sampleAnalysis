package com.example.sample.repository;

import com.example.sample.entity.TConsumeItemOwnLimitedTimeHistory34;
import org.seasar.doma.Dao;
import org.seasar.doma.Delete;
import org.seasar.doma.Insert;
import org.seasar.doma.Select;
import org.seasar.doma.Update;

/**
 */
@Dao(config = ${configClassName}.class)
public interface TConsumeItemOwnLimitedTimeHistory34Dao {

    /**
     * @param serialId
     * @return the TConsumeItemOwnLimitedTimeHistory34 entity
     */
    @Select
    TConsumeItemOwnLimitedTimeHistory34 selectById(Long serialId);

    /**
     * @param entity
     * @return affected rows
     */
    @Insert
    int insert(TConsumeItemOwnLimitedTimeHistory34 entity);

    /**
     * @param entity
     * @return affected rows
     */
    @Update
    int update(TConsumeItemOwnLimitedTimeHistory34 entity);

    /**
     * @param entity
     * @return affected rows
     */
    @Delete
    int delete(TConsumeItemOwnLimitedTimeHistory34 entity);
}