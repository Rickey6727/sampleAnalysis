package com.example.sample.repository;

import com.example.sample.entity.TPresentBox5;
import org.seasar.doma.Dao;
import org.seasar.doma.Delete;
import org.seasar.doma.Insert;
import org.seasar.doma.Select;
import org.seasar.doma.Update;

/**
 */
@Dao(config = ${configClassName}.class)
public interface TPresentBox5Dao {

    /**
     * @param accountId
     * @param accountOrderId
     * @return the TPresentBox5 entity
     */
    @Select
    TPresentBox5 selectById(Integer accountId, Integer accountOrderId);

    /**
     * @param entity
     * @return affected rows
     */
    @Insert
    int insert(TPresentBox5 entity);

    /**
     * @param entity
     * @return affected rows
     */
    @Update
    int update(TPresentBox5 entity);

    /**
     * @param entity
     * @return affected rows
     */
    @Delete
    int delete(TPresentBox5 entity);
}