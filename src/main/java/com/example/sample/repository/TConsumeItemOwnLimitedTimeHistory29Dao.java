package com.example.sample.repository;

import com.example.sample.entity.TConsumeItemOwnLimitedTimeHistory29;
import org.seasar.doma.Dao;
import org.seasar.doma.Delete;
import org.seasar.doma.Insert;
import org.seasar.doma.Select;
import org.seasar.doma.Update;

/**
 */
@Dao(config = ${configClassName}.class)
public interface TConsumeItemOwnLimitedTimeHistory29Dao {

    /**
     * @param serialId
     * @return the TConsumeItemOwnLimitedTimeHistory29 entity
     */
    @Select
    TConsumeItemOwnLimitedTimeHistory29 selectById(Long serialId);

    /**
     * @param entity
     * @return affected rows
     */
    @Insert
    int insert(TConsumeItemOwnLimitedTimeHistory29 entity);

    /**
     * @param entity
     * @return affected rows
     */
    @Update
    int update(TConsumeItemOwnLimitedTimeHistory29 entity);

    /**
     * @param entity
     * @return affected rows
     */
    @Delete
    int delete(TConsumeItemOwnLimitedTimeHistory29 entity);
}