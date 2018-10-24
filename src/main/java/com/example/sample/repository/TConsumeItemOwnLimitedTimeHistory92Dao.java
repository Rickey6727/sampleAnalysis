package com.example.sample.repository;

import com.example.sample.entity.TConsumeItemOwnLimitedTimeHistory92;
import org.seasar.doma.Dao;
import org.seasar.doma.Delete;
import org.seasar.doma.Insert;
import org.seasar.doma.Select;
import org.seasar.doma.Update;

/**
 */
@Dao(config = ${configClassName}.class)
public interface TConsumeItemOwnLimitedTimeHistory92Dao {

    /**
     * @param serialId
     * @return the TConsumeItemOwnLimitedTimeHistory92 entity
     */
    @Select
    TConsumeItemOwnLimitedTimeHistory92 selectById(Long serialId);

    /**
     * @param entity
     * @return affected rows
     */
    @Insert
    int insert(TConsumeItemOwnLimitedTimeHistory92 entity);

    /**
     * @param entity
     * @return affected rows
     */
    @Update
    int update(TConsumeItemOwnLimitedTimeHistory92 entity);

    /**
     * @param entity
     * @return affected rows
     */
    @Delete
    int delete(TConsumeItemOwnLimitedTimeHistory92 entity);
}