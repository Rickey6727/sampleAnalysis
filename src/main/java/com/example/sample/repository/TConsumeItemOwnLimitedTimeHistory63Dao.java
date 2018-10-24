package com.example.sample.repository;

import com.example.sample.entity.TConsumeItemOwnLimitedTimeHistory63;
import org.seasar.doma.Dao;
import org.seasar.doma.Delete;
import org.seasar.doma.Insert;
import org.seasar.doma.Select;
import org.seasar.doma.Update;

/**
 */
@Dao(config = ${configClassName}.class)
public interface TConsumeItemOwnLimitedTimeHistory63Dao {

    /**
     * @param serialId
     * @return the TConsumeItemOwnLimitedTimeHistory63 entity
     */
    @Select
    TConsumeItemOwnLimitedTimeHistory63 selectById(Long serialId);

    /**
     * @param entity
     * @return affected rows
     */
    @Insert
    int insert(TConsumeItemOwnLimitedTimeHistory63 entity);

    /**
     * @param entity
     * @return affected rows
     */
    @Update
    int update(TConsumeItemOwnLimitedTimeHistory63 entity);

    /**
     * @param entity
     * @return affected rows
     */
    @Delete
    int delete(TConsumeItemOwnLimitedTimeHistory63 entity);
}