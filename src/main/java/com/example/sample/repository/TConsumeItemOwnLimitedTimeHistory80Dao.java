package com.example.sample.repository;

import com.example.sample.entity.TConsumeItemOwnLimitedTimeHistory80;
import org.seasar.doma.Dao;
import org.seasar.doma.Delete;
import org.seasar.doma.Insert;
import org.seasar.doma.Select;
import org.seasar.doma.Update;

/**
 */
@Dao(config = ${configClassName}.class)
public interface TConsumeItemOwnLimitedTimeHistory80Dao {

    /**
     * @param serialId
     * @return the TConsumeItemOwnLimitedTimeHistory80 entity
     */
    @Select
    TConsumeItemOwnLimitedTimeHistory80 selectById(Long serialId);

    /**
     * @param entity
     * @return affected rows
     */
    @Insert
    int insert(TConsumeItemOwnLimitedTimeHistory80 entity);

    /**
     * @param entity
     * @return affected rows
     */
    @Update
    int update(TConsumeItemOwnLimitedTimeHistory80 entity);

    /**
     * @param entity
     * @return affected rows
     */
    @Delete
    int delete(TConsumeItemOwnLimitedTimeHistory80 entity);
}