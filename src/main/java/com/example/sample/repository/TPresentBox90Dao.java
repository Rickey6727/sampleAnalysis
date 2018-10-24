package com.example.sample.repository;

import com.example.sample.entity.TPresentBox90;
import org.seasar.doma.Dao;
import org.seasar.doma.Delete;
import org.seasar.doma.Insert;
import org.seasar.doma.Select;
import org.seasar.doma.Update;

/**
 */
@Dao(config = ${configClassName}.class)
public interface TPresentBox90Dao {

    /**
     * @param accountId
     * @param accountOrderId
     * @return the TPresentBox90 entity
     */
    @Select
    TPresentBox90 selectById(Integer accountId, Integer accountOrderId);

    /**
     * @param entity
     * @return affected rows
     */
    @Insert
    int insert(TPresentBox90 entity);

    /**
     * @param entity
     * @return affected rows
     */
    @Update
    int update(TPresentBox90 entity);

    /**
     * @param entity
     * @return affected rows
     */
    @Delete
    int delete(TPresentBox90 entity);
}