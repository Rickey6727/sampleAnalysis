package com.example.sample.repository;

import com.example.sample.entity.TPresentBox50;
import org.seasar.doma.Dao;
import org.seasar.doma.Delete;
import org.seasar.doma.Insert;
import org.seasar.doma.Select;
import org.seasar.doma.Update;

/**
 */
@Dao(config = ${configClassName}.class)
public interface TPresentBox50Dao {

    /**
     * @param accountId
     * @param accountOrderId
     * @return the TPresentBox50 entity
     */
    @Select
    TPresentBox50 selectById(Integer accountId, Integer accountOrderId);

    /**
     * @param entity
     * @return affected rows
     */
    @Insert
    int insert(TPresentBox50 entity);

    /**
     * @param entity
     * @return affected rows
     */
    @Update
    int update(TPresentBox50 entity);

    /**
     * @param entity
     * @return affected rows
     */
    @Delete
    int delete(TPresentBox50 entity);
}