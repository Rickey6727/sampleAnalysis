package com.example.sample.repository;

import com.example.sample.entity.TSmilePoint;
import org.seasar.doma.Dao;
import org.seasar.doma.Delete;
import org.seasar.doma.Insert;
import org.seasar.doma.Select;
import org.seasar.doma.Update;

/**
 */
@Dao(config = ${configClassName}.class)
public interface TSmilePointDao {

    /**
     * @param accountId
     * @return the TSmilePoint entity
     */
    @Select
    TSmilePoint selectById(Integer accountId);

    /**
     * @param entity
     * @return affected rows
     */
    @Insert
    int insert(TSmilePoint entity);

    /**
     * @param entity
     * @return affected rows
     */
    @Update
    int update(TSmilePoint entity);

    /**
     * @param entity
     * @return affected rows
     */
    @Delete
    int delete(TSmilePoint entity);
}