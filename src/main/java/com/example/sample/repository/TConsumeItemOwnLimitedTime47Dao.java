package com.example.sample.repository;

import com.example.sample.entity.TConsumeItemOwnLimitedTime47;
import org.seasar.doma.Dao;
import org.seasar.doma.Delete;
import org.seasar.doma.Insert;
import org.seasar.doma.Select;
import org.seasar.doma.Update;

/**
 */
@Dao(config = ${configClassName}.class)
public interface TConsumeItemOwnLimitedTime47Dao {

    /**
     * @param serialId
     * @return the TConsumeItemOwnLimitedTime47 entity
     */
    @Select
    TConsumeItemOwnLimitedTime47 selectById(Long serialId);

    /**
     * @param entity
     * @return affected rows
     */
    @Insert
    int insert(TConsumeItemOwnLimitedTime47 entity);

    /**
     * @param entity
     * @return affected rows
     */
    @Update
    int update(TConsumeItemOwnLimitedTime47 entity);

    /**
     * @param entity
     * @return affected rows
     */
    @Delete
    int delete(TConsumeItemOwnLimitedTime47 entity);
}