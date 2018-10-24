package com.example.sample.repository;

import com.example.sample.entity.TConsumeItemOwnLimitedTime93;
import org.seasar.doma.Dao;
import org.seasar.doma.Delete;
import org.seasar.doma.Insert;
import org.seasar.doma.Select;
import org.seasar.doma.Update;

/**
 */
@Dao(config = ${configClassName}.class)
public interface TConsumeItemOwnLimitedTime93Dao {

    /**
     * @param serialId
     * @return the TConsumeItemOwnLimitedTime93 entity
     */
    @Select
    TConsumeItemOwnLimitedTime93 selectById(Long serialId);

    /**
     * @param entity
     * @return affected rows
     */
    @Insert
    int insert(TConsumeItemOwnLimitedTime93 entity);

    /**
     * @param entity
     * @return affected rows
     */
    @Update
    int update(TConsumeItemOwnLimitedTime93 entity);

    /**
     * @param entity
     * @return affected rows
     */
    @Delete
    int delete(TConsumeItemOwnLimitedTime93 entity);
}