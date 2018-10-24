package com.example.sample.repository;

import com.example.sample.entity.TPresentBox88;
import org.seasar.doma.Dao;
import org.seasar.doma.Delete;
import org.seasar.doma.Insert;
import org.seasar.doma.Select;
import org.seasar.doma.Update;

/**
 */
@Dao(config = ${configClassName}.class)
public interface TPresentBox88Dao {

    /**
     * @param accountId
     * @param accountOrderId
     * @return the TPresentBox88 entity
     */
    @Select
    TPresentBox88 selectById(Integer accountId, Integer accountOrderId);

    /**
     * @param entity
     * @return affected rows
     */
    @Insert
    int insert(TPresentBox88 entity);

    /**
     * @param entity
     * @return affected rows
     */
    @Update
    int update(TPresentBox88 entity);

    /**
     * @param entity
     * @return affected rows
     */
    @Delete
    int delete(TPresentBox88 entity);
}