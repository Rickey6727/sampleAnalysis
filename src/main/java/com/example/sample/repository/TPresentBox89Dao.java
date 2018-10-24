package com.example.sample.repository;

import com.example.sample.entity.TPresentBox89;
import org.seasar.doma.Dao;
import org.seasar.doma.Delete;
import org.seasar.doma.Insert;
import org.seasar.doma.Select;
import org.seasar.doma.Update;

/**
 */
@Dao(config = ${configClassName}.class)
public interface TPresentBox89Dao {

    /**
     * @param accountId
     * @param accountOrderId
     * @return the TPresentBox89 entity
     */
    @Select
    TPresentBox89 selectById(Integer accountId, Integer accountOrderId);

    /**
     * @param entity
     * @return affected rows
     */
    @Insert
    int insert(TPresentBox89 entity);

    /**
     * @param entity
     * @return affected rows
     */
    @Update
    int update(TPresentBox89 entity);

    /**
     * @param entity
     * @return affected rows
     */
    @Delete
    int delete(TPresentBox89 entity);
}