package com.example.sample.repository;

import com.example.sample.entity.TConsumeItemOwnLimitedTimeHistory87;
import org.seasar.doma.Dao;
import org.seasar.doma.Delete;
import org.seasar.doma.Insert;
import org.seasar.doma.Select;
import org.seasar.doma.Update;

/**
 */
@Dao(config = ${configClassName}.class)
public interface TConsumeItemOwnLimitedTimeHistory87Dao {

    /**
     * @param serialId
     * @return the TConsumeItemOwnLimitedTimeHistory87 entity
     */
    @Select
    TConsumeItemOwnLimitedTimeHistory87 selectById(Long serialId);

    /**
     * @param entity
     * @return affected rows
     */
    @Insert
    int insert(TConsumeItemOwnLimitedTimeHistory87 entity);

    /**
     * @param entity
     * @return affected rows
     */
    @Update
    int update(TConsumeItemOwnLimitedTimeHistory87 entity);

    /**
     * @param entity
     * @return affected rows
     */
    @Delete
    int delete(TConsumeItemOwnLimitedTimeHistory87 entity);
}