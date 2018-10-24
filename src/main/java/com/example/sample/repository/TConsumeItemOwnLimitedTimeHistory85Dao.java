package com.example.sample.repository;

import com.example.sample.entity.TConsumeItemOwnLimitedTimeHistory85;
import org.seasar.doma.Dao;
import org.seasar.doma.Delete;
import org.seasar.doma.Insert;
import org.seasar.doma.Select;
import org.seasar.doma.Update;

/**
 */
@Dao(config = ${configClassName}.class)
public interface TConsumeItemOwnLimitedTimeHistory85Dao {

    /**
     * @param serialId
     * @return the TConsumeItemOwnLimitedTimeHistory85 entity
     */
    @Select
    TConsumeItemOwnLimitedTimeHistory85 selectById(Long serialId);

    /**
     * @param entity
     * @return affected rows
     */
    @Insert
    int insert(TConsumeItemOwnLimitedTimeHistory85 entity);

    /**
     * @param entity
     * @return affected rows
     */
    @Update
    int update(TConsumeItemOwnLimitedTimeHistory85 entity);

    /**
     * @param entity
     * @return affected rows
     */
    @Delete
    int delete(TConsumeItemOwnLimitedTimeHistory85 entity);
}