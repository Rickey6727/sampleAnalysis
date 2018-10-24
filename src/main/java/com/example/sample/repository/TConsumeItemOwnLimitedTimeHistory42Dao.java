package com.example.sample.repository;

import com.example.sample.entity.TConsumeItemOwnLimitedTimeHistory42;
import org.seasar.doma.Dao;
import org.seasar.doma.Delete;
import org.seasar.doma.Insert;
import org.seasar.doma.Select;
import org.seasar.doma.Update;

/**
 */
@Dao(config = ${configClassName}.class)
public interface TConsumeItemOwnLimitedTimeHistory42Dao {

    /**
     * @param serialId
     * @return the TConsumeItemOwnLimitedTimeHistory42 entity
     */
    @Select
    TConsumeItemOwnLimitedTimeHistory42 selectById(Long serialId);

    /**
     * @param entity
     * @return affected rows
     */
    @Insert
    int insert(TConsumeItemOwnLimitedTimeHistory42 entity);

    /**
     * @param entity
     * @return affected rows
     */
    @Update
    int update(TConsumeItemOwnLimitedTimeHistory42 entity);

    /**
     * @param entity
     * @return affected rows
     */
    @Delete
    int delete(TConsumeItemOwnLimitedTimeHistory42 entity);
}