package com.example.sample.repository;

import com.example.sample.entity.TConsumeItemOwnLimitedTimeHistory86;
import org.seasar.doma.Dao;
import org.seasar.doma.Delete;
import org.seasar.doma.Insert;
import org.seasar.doma.Select;
import org.seasar.doma.Update;

/**
 */
@Dao(config = ${configClassName}.class)
public interface TConsumeItemOwnLimitedTimeHistory86Dao {

    /**
     * @param serialId
     * @return the TConsumeItemOwnLimitedTimeHistory86 entity
     */
    @Select
    TConsumeItemOwnLimitedTimeHistory86 selectById(Long serialId);

    /**
     * @param entity
     * @return affected rows
     */
    @Insert
    int insert(TConsumeItemOwnLimitedTimeHistory86 entity);

    /**
     * @param entity
     * @return affected rows
     */
    @Update
    int update(TConsumeItemOwnLimitedTimeHistory86 entity);

    /**
     * @param entity
     * @return affected rows
     */
    @Delete
    int delete(TConsumeItemOwnLimitedTimeHistory86 entity);
}