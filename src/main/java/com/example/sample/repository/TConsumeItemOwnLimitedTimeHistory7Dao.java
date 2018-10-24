package com.example.sample.repository;

import com.example.sample.entity.TConsumeItemOwnLimitedTimeHistory7;
import org.seasar.doma.Dao;
import org.seasar.doma.Delete;
import org.seasar.doma.Insert;
import org.seasar.doma.Select;
import org.seasar.doma.Update;

/**
 */
@Dao(config = ${configClassName}.class)
public interface TConsumeItemOwnLimitedTimeHistory7Dao {

    /**
     * @param serialId
     * @return the TConsumeItemOwnLimitedTimeHistory7 entity
     */
    @Select
    TConsumeItemOwnLimitedTimeHistory7 selectById(Long serialId);

    /**
     * @param entity
     * @return affected rows
     */
    @Insert
    int insert(TConsumeItemOwnLimitedTimeHistory7 entity);

    /**
     * @param entity
     * @return affected rows
     */
    @Update
    int update(TConsumeItemOwnLimitedTimeHistory7 entity);

    /**
     * @param entity
     * @return affected rows
     */
    @Delete
    int delete(TConsumeItemOwnLimitedTimeHistory7 entity);
}