package com.example.sample.repository;

import com.example.sample.entity.TConsumeItemOwnLimitedTimeHistory10;
import org.seasar.doma.Dao;
import org.seasar.doma.Delete;
import org.seasar.doma.Insert;
import org.seasar.doma.Select;
import org.seasar.doma.Update;

/**
 */
@Dao(config = ${configClassName}.class)
public interface TConsumeItemOwnLimitedTimeHistory10Dao {

    /**
     * @param serialId
     * @return the TConsumeItemOwnLimitedTimeHistory10 entity
     */
    @Select
    TConsumeItemOwnLimitedTimeHistory10 selectById(Long serialId);

    /**
     * @param entity
     * @return affected rows
     */
    @Insert
    int insert(TConsumeItemOwnLimitedTimeHistory10 entity);

    /**
     * @param entity
     * @return affected rows
     */
    @Update
    int update(TConsumeItemOwnLimitedTimeHistory10 entity);

    /**
     * @param entity
     * @return affected rows
     */
    @Delete
    int delete(TConsumeItemOwnLimitedTimeHistory10 entity);
}