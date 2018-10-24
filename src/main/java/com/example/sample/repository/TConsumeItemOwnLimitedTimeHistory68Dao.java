package com.example.sample.repository;

import com.example.sample.entity.TConsumeItemOwnLimitedTimeHistory68;
import org.seasar.doma.Dao;
import org.seasar.doma.Delete;
import org.seasar.doma.Insert;
import org.seasar.doma.Select;
import org.seasar.doma.Update;

/**
 */
@Dao(config = ${configClassName}.class)
public interface TConsumeItemOwnLimitedTimeHistory68Dao {

    /**
     * @param serialId
     * @return the TConsumeItemOwnLimitedTimeHistory68 entity
     */
    @Select
    TConsumeItemOwnLimitedTimeHistory68 selectById(Long serialId);

    /**
     * @param entity
     * @return affected rows
     */
    @Insert
    int insert(TConsumeItemOwnLimitedTimeHistory68 entity);

    /**
     * @param entity
     * @return affected rows
     */
    @Update
    int update(TConsumeItemOwnLimitedTimeHistory68 entity);

    /**
     * @param entity
     * @return affected rows
     */
    @Delete
    int delete(TConsumeItemOwnLimitedTimeHistory68 entity);
}