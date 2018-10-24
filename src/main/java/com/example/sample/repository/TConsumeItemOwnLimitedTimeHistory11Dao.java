package com.example.sample.repository;

import com.example.sample.entity.TConsumeItemOwnLimitedTimeHistory11;
import org.seasar.doma.Dao;
import org.seasar.doma.Delete;
import org.seasar.doma.Insert;
import org.seasar.doma.Select;
import org.seasar.doma.Update;

/**
 */
@Dao(config = ${configClassName}.class)
public interface TConsumeItemOwnLimitedTimeHistory11Dao {

    /**
     * @param serialId
     * @return the TConsumeItemOwnLimitedTimeHistory11 entity
     */
    @Select
    TConsumeItemOwnLimitedTimeHistory11 selectById(Long serialId);

    /**
     * @param entity
     * @return affected rows
     */
    @Insert
    int insert(TConsumeItemOwnLimitedTimeHistory11 entity);

    /**
     * @param entity
     * @return affected rows
     */
    @Update
    int update(TConsumeItemOwnLimitedTimeHistory11 entity);

    /**
     * @param entity
     * @return affected rows
     */
    @Delete
    int delete(TConsumeItemOwnLimitedTimeHistory11 entity);
}