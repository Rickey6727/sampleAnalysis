package com.example.sample.repository;

import com.example.sample.entity.TConsumeItemOwnLimitedTime80;
import org.seasar.doma.Dao;
import org.seasar.doma.Delete;
import org.seasar.doma.Insert;
import org.seasar.doma.Select;
import org.seasar.doma.Update;

/**
 */
@Dao(config = ${configClassName}.class)
public interface TConsumeItemOwnLimitedTime80Dao {

    /**
     * @param serialId
     * @return the TConsumeItemOwnLimitedTime80 entity
     */
    @Select
    TConsumeItemOwnLimitedTime80 selectById(Long serialId);

    /**
     * @param entity
     * @return affected rows
     */
    @Insert
    int insert(TConsumeItemOwnLimitedTime80 entity);

    /**
     * @param entity
     * @return affected rows
     */
    @Update
    int update(TConsumeItemOwnLimitedTime80 entity);

    /**
     * @param entity
     * @return affected rows
     */
    @Delete
    int delete(TConsumeItemOwnLimitedTime80 entity);
}