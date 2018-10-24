package com.example.sample.repository;

import com.example.sample.entity.TConsumeItemOwnLimitedTime54;
import org.seasar.doma.Dao;
import org.seasar.doma.Delete;
import org.seasar.doma.Insert;
import org.seasar.doma.Select;
import org.seasar.doma.Update;

/**
 */
@Dao(config = ${configClassName}.class)
public interface TConsumeItemOwnLimitedTime54Dao {

    /**
     * @param serialId
     * @return the TConsumeItemOwnLimitedTime54 entity
     */
    @Select
    TConsumeItemOwnLimitedTime54 selectById(Long serialId);

    /**
     * @param entity
     * @return affected rows
     */
    @Insert
    int insert(TConsumeItemOwnLimitedTime54 entity);

    /**
     * @param entity
     * @return affected rows
     */
    @Update
    int update(TConsumeItemOwnLimitedTime54 entity);

    /**
     * @param entity
     * @return affected rows
     */
    @Delete
    int delete(TConsumeItemOwnLimitedTime54 entity);
}