package com.example.sample.repository;

import com.example.sample.entity.TPresentBox0;
import org.seasar.doma.Dao;
import org.seasar.doma.Delete;
import org.seasar.doma.Insert;
import org.seasar.doma.Select;
import org.seasar.doma.Update;

/**
 */
@Dao(config = ${configClassName}.class)
public interface TPresentBox0Dao {

    /**
     * @param accountId
     * @param accountOrderId
     * @return the TPresentBox0 entity
     */
    @Select
    TPresentBox0 selectById(Integer accountId, Integer accountOrderId);

    /**
     * @param entity
     * @return affected rows
     */
    @Insert
    int insert(TPresentBox0 entity);

    /**
     * @param entity
     * @return affected rows
     */
    @Update
    int update(TPresentBox0 entity);

    /**
     * @param entity
     * @return affected rows
     */
    @Delete
    int delete(TPresentBox0 entity);
}