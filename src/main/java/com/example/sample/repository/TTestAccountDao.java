package com.example.sample.repository;

import com.example.sample.entity.TTestAccount;
import org.seasar.doma.Dao;
import org.seasar.doma.Delete;
import org.seasar.doma.Insert;
import org.seasar.doma.Select;
import org.seasar.doma.Update;

/**
 */
@Dao(config = ${configClassName}.class)
public interface TTestAccountDao {

    /**
     * @param accountId
     * @return the TTestAccount entity
     */
    @Select
    TTestAccount selectById(Integer accountId);

    /**
     * @param entity
     * @return affected rows
     */
    @Insert
    int insert(TTestAccount entity);

    /**
     * @param entity
     * @return affected rows
     */
    @Update
    int update(TTestAccount entity);

    /**
     * @param entity
     * @return affected rows
     */
    @Delete
    int delete(TTestAccount entity);
}