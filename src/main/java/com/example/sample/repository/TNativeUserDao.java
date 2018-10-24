package com.example.sample.repository;

import com.example.sample.entity.TNativeUser;
import org.seasar.doma.Dao;
import org.seasar.doma.Delete;
import org.seasar.doma.Insert;
import org.seasar.doma.Select;
import org.seasar.doma.Update;

/**
 */
@Dao(config = ${configClassName}.class)
public interface TNativeUserDao {

    /**
     * @param accountId
     * @return the TNativeUser entity
     */
    @Select
    TNativeUser selectById(Integer accountId);

    /**
     * @param entity
     * @return affected rows
     */
    @Insert
    int insert(TNativeUser entity);

    /**
     * @param entity
     * @return affected rows
     */
    @Update
    int update(TNativeUser entity);

    /**
     * @param entity
     * @return affected rows
     */
    @Delete
    int delete(TNativeUser entity);
}