package com.example.sample.repository;

import com.example.sample.entity.TConsumeItemOwnLimitedTimeHistory62;
import org.seasar.doma.Dao;
import org.seasar.doma.Delete;
import org.seasar.doma.Insert;
import org.seasar.doma.Select;
import org.seasar.doma.Update;

/**
 */
@Dao(config = ${configClassName}.class)
public interface TConsumeItemOwnLimitedTimeHistory62Dao {

    /**
     * @param serialId
     * @return the TConsumeItemOwnLimitedTimeHistory62 entity
     */
    @Select
    TConsumeItemOwnLimitedTimeHistory62 selectById(Long serialId);

    /**
     * @param entity
     * @return affected rows
     */
    @Insert
    int insert(TConsumeItemOwnLimitedTimeHistory62 entity);

    /**
     * @param entity
     * @return affected rows
     */
    @Update
    int update(TConsumeItemOwnLimitedTimeHistory62 entity);

    /**
     * @param entity
     * @return affected rows
     */
    @Delete
    int delete(TConsumeItemOwnLimitedTimeHistory62 entity);
}