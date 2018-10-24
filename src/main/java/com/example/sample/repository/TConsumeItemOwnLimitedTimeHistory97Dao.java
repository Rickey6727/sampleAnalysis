package com.example.sample.repository;

import com.example.sample.entity.TConsumeItemOwnLimitedTimeHistory97;
import org.seasar.doma.Dao;
import org.seasar.doma.Delete;
import org.seasar.doma.Insert;
import org.seasar.doma.Select;
import org.seasar.doma.Update;

/**
 */
@Dao(config = ${configClassName}.class)
public interface TConsumeItemOwnLimitedTimeHistory97Dao {

    /**
     * @param serialId
     * @return the TConsumeItemOwnLimitedTimeHistory97 entity
     */
    @Select
    TConsumeItemOwnLimitedTimeHistory97 selectById(Long serialId);

    /**
     * @param entity
     * @return affected rows
     */
    @Insert
    int insert(TConsumeItemOwnLimitedTimeHistory97 entity);

    /**
     * @param entity
     * @return affected rows
     */
    @Update
    int update(TConsumeItemOwnLimitedTimeHistory97 entity);

    /**
     * @param entity
     * @return affected rows
     */
    @Delete
    int delete(TConsumeItemOwnLimitedTimeHistory97 entity);
}