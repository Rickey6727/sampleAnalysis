package com.example.sample.repository;

import com.example.sample.entity.TAdCode;
import org.seasar.doma.Dao;
import org.seasar.doma.Delete;
import org.seasar.doma.Insert;
import org.seasar.doma.Select;
import org.seasar.doma.Update;

/**
 */
@Dao(config = ${configClassName}.class)
public interface TAdCodeDao {

    /**
     * @param accountId
     * @return the TAdCode entity
     */
    @Select
    TAdCode selectById(Integer accountId);

    /**
     * @param entity
     * @return affected rows
     */
    @Insert
    int insert(TAdCode entity);

    /**
     * @param entity
     * @return affected rows
     */
    @Update
    int update(TAdCode entity);

    /**
     * @param entity
     * @return affected rows
     */
    @Delete
    int delete(TAdCode entity);
}