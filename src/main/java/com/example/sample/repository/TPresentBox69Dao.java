package com.example.sample.repository;

import com.example.sample.entity.TPresentBox69;
import org.seasar.doma.Dao;
import org.seasar.doma.Delete;
import org.seasar.doma.Insert;
import org.seasar.doma.Select;
import org.seasar.doma.Update;

/**
 */
@Dao(config = ${configClassName}.class)
public interface TPresentBox69Dao {

    /**
     * @param accountId
     * @param accountOrderId
     * @return the TPresentBox69 entity
     */
    @Select
    TPresentBox69 selectById(Integer accountId, Integer accountOrderId);

    /**
     * @param entity
     * @return affected rows
     */
    @Insert
    int insert(TPresentBox69 entity);

    /**
     * @param entity
     * @return affected rows
     */
    @Update
    int update(TPresentBox69 entity);

    /**
     * @param entity
     * @return affected rows
     */
    @Delete
    int delete(TPresentBox69 entity);
}