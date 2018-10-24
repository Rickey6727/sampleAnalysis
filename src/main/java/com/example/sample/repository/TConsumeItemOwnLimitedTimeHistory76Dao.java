package com.example.sample.repository;

import com.example.sample.entity.TConsumeItemOwnLimitedTimeHistory76;
import org.seasar.doma.Dao;
import org.seasar.doma.Delete;
import org.seasar.doma.Insert;
import org.seasar.doma.Select;
import org.seasar.doma.Update;

/**
 */
@Dao(config = ${configClassName}.class)
public interface TConsumeItemOwnLimitedTimeHistory76Dao {

    /**
     * @param serialId
     * @return the TConsumeItemOwnLimitedTimeHistory76 entity
     */
    @Select
    TConsumeItemOwnLimitedTimeHistory76 selectById(Long serialId);

    /**
     * @param entity
     * @return affected rows
     */
    @Insert
    int insert(TConsumeItemOwnLimitedTimeHistory76 entity);

    /**
     * @param entity
     * @return affected rows
     */
    @Update
    int update(TConsumeItemOwnLimitedTimeHistory76 entity);

    /**
     * @param entity
     * @return affected rows
     */
    @Delete
    int delete(TConsumeItemOwnLimitedTimeHistory76 entity);
}