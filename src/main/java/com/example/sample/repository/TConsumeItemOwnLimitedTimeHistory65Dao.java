package com.example.sample.repository;

import com.example.sample.entity.TConsumeItemOwnLimitedTimeHistory65;
import org.seasar.doma.Dao;
import org.seasar.doma.Delete;
import org.seasar.doma.Insert;
import org.seasar.doma.Select;
import org.seasar.doma.Update;

/**
 */
@Dao(config = ${configClassName}.class)
public interface TConsumeItemOwnLimitedTimeHistory65Dao {

    /**
     * @param serialId
     * @return the TConsumeItemOwnLimitedTimeHistory65 entity
     */
    @Select
    TConsumeItemOwnLimitedTimeHistory65 selectById(Long serialId);

    /**
     * @param entity
     * @return affected rows
     */
    @Insert
    int insert(TConsumeItemOwnLimitedTimeHistory65 entity);

    /**
     * @param entity
     * @return affected rows
     */
    @Update
    int update(TConsumeItemOwnLimitedTimeHistory65 entity);

    /**
     * @param entity
     * @return affected rows
     */
    @Delete
    int delete(TConsumeItemOwnLimitedTimeHistory65 entity);
}