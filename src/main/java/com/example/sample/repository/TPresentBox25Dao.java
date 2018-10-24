package com.example.sample.repository;

import com.example.sample.entity.TPresentBox25;
import org.seasar.doma.Dao;
import org.seasar.doma.Delete;
import org.seasar.doma.Insert;
import org.seasar.doma.Select;
import org.seasar.doma.Update;

/**
 */
@Dao(config = ${configClassName}.class)
public interface TPresentBox25Dao {

    /**
     * @param accountId
     * @param accountOrderId
     * @return the TPresentBox25 entity
     */
    @Select
    TPresentBox25 selectById(Integer accountId, Integer accountOrderId);

    /**
     * @param entity
     * @return affected rows
     */
    @Insert
    int insert(TPresentBox25 entity);

    /**
     * @param entity
     * @return affected rows
     */
    @Update
    int update(TPresentBox25 entity);

    /**
     * @param entity
     * @return affected rows
     */
    @Delete
    int delete(TPresentBox25 entity);
}