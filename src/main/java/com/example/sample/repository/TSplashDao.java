package com.example.sample.repository;

import com.example.sample.entity.TSplash;
import org.seasar.doma.Dao;
import org.seasar.doma.Delete;
import org.seasar.doma.Insert;
import org.seasar.doma.Select;
import org.seasar.doma.Update;

/**
 */
@Dao(config = ${configClassName}.class)
public interface TSplashDao {

    /**
     * @param accountId
     * @return the TSplash entity
     */
    @Select
    TSplash selectById(Integer accountId);

    /**
     * @param entity
     * @return affected rows
     */
    @Insert
    int insert(TSplash entity);

    /**
     * @param entity
     * @return affected rows
     */
    @Update
    int update(TSplash entity);

    /**
     * @param entity
     * @return affected rows
     */
    @Delete
    int delete(TSplash entity);
}