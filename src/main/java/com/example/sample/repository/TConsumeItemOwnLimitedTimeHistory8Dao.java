package com.example.sample.repository;

import com.example.sample.entity.TConsumeItemOwnLimitedTimeHistory8;
import org.seasar.doma.Dao;
import org.seasar.doma.Delete;
import org.seasar.doma.Insert;
import org.seasar.doma.Select;
import org.seasar.doma.Update;

/**
 */
@Dao(config = ${configClassName}.class)
public interface TConsumeItemOwnLimitedTimeHistory8Dao {

    /**
     * @param serialId
     * @return the TConsumeItemOwnLimitedTimeHistory8 entity
     */
    @Select
    TConsumeItemOwnLimitedTimeHistory8 selectById(Long serialId);

    /**
     * @param entity
     * @return affected rows
     */
    @Insert
    int insert(TConsumeItemOwnLimitedTimeHistory8 entity);

    /**
     * @param entity
     * @return affected rows
     */
    @Update
    int update(TConsumeItemOwnLimitedTimeHistory8 entity);

    /**
     * @param entity
     * @return affected rows
     */
    @Delete
    int delete(TConsumeItemOwnLimitedTimeHistory8 entity);
}