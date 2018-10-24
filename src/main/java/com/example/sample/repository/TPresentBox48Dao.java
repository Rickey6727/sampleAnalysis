package com.example.sample.repository;

import com.example.sample.entity.TPresentBox48;
import org.seasar.doma.Dao;
import org.seasar.doma.Delete;
import org.seasar.doma.Insert;
import org.seasar.doma.Select;
import org.seasar.doma.Update;

/**
 */
@Dao(config = ${configClassName}.class)
public interface TPresentBox48Dao {

    /**
     * @param accountId
     * @param accountOrderId
     * @return the TPresentBox48 entity
     */
    @Select
    TPresentBox48 selectById(Integer accountId, Integer accountOrderId);

    /**
     * @param entity
     * @return affected rows
     */
    @Insert
    int insert(TPresentBox48 entity);

    /**
     * @param entity
     * @return affected rows
     */
    @Update
    int update(TPresentBox48 entity);

    /**
     * @param entity
     * @return affected rows
     */
    @Delete
    int delete(TPresentBox48 entity);
}