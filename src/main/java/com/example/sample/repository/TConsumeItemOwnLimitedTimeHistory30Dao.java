package com.example.sample.repository;

import com.example.sample.entity.TConsumeItemOwnLimitedTimeHistory30;
import org.seasar.doma.Dao;
import org.seasar.doma.Delete;
import org.seasar.doma.Insert;
import org.seasar.doma.Select;
import org.seasar.doma.Update;

/**
 */
@Dao(config = ${configClassName}.class)
public interface TConsumeItemOwnLimitedTimeHistory30Dao {

    /**
     * @param serialId
     * @return the TConsumeItemOwnLimitedTimeHistory30 entity
     */
    @Select
    TConsumeItemOwnLimitedTimeHistory30 selectById(Long serialId);

    /**
     * @param entity
     * @return affected rows
     */
    @Insert
    int insert(TConsumeItemOwnLimitedTimeHistory30 entity);

    /**
     * @param entity
     * @return affected rows
     */
    @Update
    int update(TConsumeItemOwnLimitedTimeHistory30 entity);

    /**
     * @param entity
     * @return affected rows
     */
    @Delete
    int delete(TConsumeItemOwnLimitedTimeHistory30 entity);
}