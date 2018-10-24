package com.example.sample.repository;

import com.example.sample.entity.TConsumeItemOwnLimitedTimeHistory54;
import org.seasar.doma.Dao;
import org.seasar.doma.Delete;
import org.seasar.doma.Insert;
import org.seasar.doma.Select;
import org.seasar.doma.Update;

/**
 */
@Dao(config = ${configClassName}.class)
public interface TConsumeItemOwnLimitedTimeHistory54Dao {

    /**
     * @param serialId
     * @return the TConsumeItemOwnLimitedTimeHistory54 entity
     */
    @Select
    TConsumeItemOwnLimitedTimeHistory54 selectById(Long serialId);

    /**
     * @param entity
     * @return affected rows
     */
    @Insert
    int insert(TConsumeItemOwnLimitedTimeHistory54 entity);

    /**
     * @param entity
     * @return affected rows
     */
    @Update
    int update(TConsumeItemOwnLimitedTimeHistory54 entity);

    /**
     * @param entity
     * @return affected rows
     */
    @Delete
    int delete(TConsumeItemOwnLimitedTimeHistory54 entity);
}