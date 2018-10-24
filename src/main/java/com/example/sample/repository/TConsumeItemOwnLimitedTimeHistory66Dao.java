package com.example.sample.repository;

import com.example.sample.entity.TConsumeItemOwnLimitedTimeHistory66;
import org.seasar.doma.Dao;
import org.seasar.doma.Delete;
import org.seasar.doma.Insert;
import org.seasar.doma.Select;
import org.seasar.doma.Update;

/**
 */
@Dao(config = ${configClassName}.class)
public interface TConsumeItemOwnLimitedTimeHistory66Dao {

    /**
     * @param serialId
     * @return the TConsumeItemOwnLimitedTimeHistory66 entity
     */
    @Select
    TConsumeItemOwnLimitedTimeHistory66 selectById(Long serialId);

    /**
     * @param entity
     * @return affected rows
     */
    @Insert
    int insert(TConsumeItemOwnLimitedTimeHistory66 entity);

    /**
     * @param entity
     * @return affected rows
     */
    @Update
    int update(TConsumeItemOwnLimitedTimeHistory66 entity);

    /**
     * @param entity
     * @return affected rows
     */
    @Delete
    int delete(TConsumeItemOwnLimitedTimeHistory66 entity);
}