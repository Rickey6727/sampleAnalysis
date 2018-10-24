package com.example.sample.repository;

import com.example.sample.entity.TTitleOwn;
import org.seasar.doma.Dao;
import org.seasar.doma.Delete;
import org.seasar.doma.Insert;
import org.seasar.doma.Select;
import org.seasar.doma.Update;

/**
 */
@Dao(config = ${configClassName}.class)
public interface TTitleOwnDao {

    /**
     * @param accountId
     * @param titleId
     * @return the TTitleOwn entity
     */
    @Select
    TTitleOwn selectById(Integer accountId, Integer titleId);

    /**
     * @param entity
     * @return affected rows
     */
    @Insert
    int insert(TTitleOwn entity);

    /**
     * @param entity
     * @return affected rows
     */
    @Update
    int update(TTitleOwn entity);

    /**
     * @param entity
     * @return affected rows
     */
    @Delete
    int delete(TTitleOwn entity);
}