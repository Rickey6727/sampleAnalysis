package com.example.sample.repository;

import com.example.sample.entity.TPresentBox82;
import org.seasar.doma.Dao;
import org.seasar.doma.Delete;
import org.seasar.doma.Insert;
import org.seasar.doma.Select;
import org.seasar.doma.Update;

/**
 */
@Dao(config = ${configClassName}.class)
public interface TPresentBox82Dao {

    /**
     * @param accountId
     * @param accountOrderId
     * @return the TPresentBox82 entity
     */
    @Select
    TPresentBox82 selectById(Integer accountId, Integer accountOrderId);

    /**
     * @param entity
     * @return affected rows
     */
    @Insert
    int insert(TPresentBox82 entity);

    /**
     * @param entity
     * @return affected rows
     */
    @Update
    int update(TPresentBox82 entity);

    /**
     * @param entity
     * @return affected rows
     */
    @Delete
    int delete(TPresentBox82 entity);
}