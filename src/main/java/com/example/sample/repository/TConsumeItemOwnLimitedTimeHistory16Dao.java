package com.example.sample.repository;

import com.example.sample.entity.TConsumeItemOwnLimitedTimeHistory16;
import org.seasar.doma.Dao;
import org.seasar.doma.Delete;
import org.seasar.doma.Insert;
import org.seasar.doma.Select;
import org.seasar.doma.Update;

/**
 */
@Dao(config = ${configClassName}.class)
public interface TConsumeItemOwnLimitedTimeHistory16Dao {

    /**
     * @param serialId
     * @return the TConsumeItemOwnLimitedTimeHistory16 entity
     */
    @Select
    TConsumeItemOwnLimitedTimeHistory16 selectById(Long serialId);

    /**
     * @param entity
     * @return affected rows
     */
    @Insert
    int insert(TConsumeItemOwnLimitedTimeHistory16 entity);

    /**
     * @param entity
     * @return affected rows
     */
    @Update
    int update(TConsumeItemOwnLimitedTimeHistory16 entity);

    /**
     * @param entity
     * @return affected rows
     */
    @Delete
    int delete(TConsumeItemOwnLimitedTimeHistory16 entity);
}