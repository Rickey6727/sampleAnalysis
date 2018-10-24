package com.example.sample.repository;

import com.example.sample.entity.TPresentBox70;
import org.seasar.doma.Dao;
import org.seasar.doma.Delete;
import org.seasar.doma.Insert;
import org.seasar.doma.Select;
import org.seasar.doma.Update;

/**
 */
@Dao(config = ${configClassName}.class)
public interface TPresentBox70Dao {

    /**
     * @param accountId
     * @param accountOrderId
     * @return the TPresentBox70 entity
     */
    @Select
    TPresentBox70 selectById(Integer accountId, Integer accountOrderId);

    /**
     * @param entity
     * @return affected rows
     */
    @Insert
    int insert(TPresentBox70 entity);

    /**
     * @param entity
     * @return affected rows
     */
    @Update
    int update(TPresentBox70 entity);

    /**
     * @param entity
     * @return affected rows
     */
    @Delete
    int delete(TPresentBox70 entity);
}