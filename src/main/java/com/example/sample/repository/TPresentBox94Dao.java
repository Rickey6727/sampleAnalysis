package com.example.sample.repository;

import com.example.sample.entity.TPresentBox94;
import org.seasar.doma.Dao;
import org.seasar.doma.Delete;
import org.seasar.doma.Insert;
import org.seasar.doma.Select;
import org.seasar.doma.Update;

/**
 */
@Dao(config = ${configClassName}.class)
public interface TPresentBox94Dao {

    /**
     * @param accountId
     * @param accountOrderId
     * @return the TPresentBox94 entity
     */
    @Select
    TPresentBox94 selectById(Integer accountId, Integer accountOrderId);

    /**
     * @param entity
     * @return affected rows
     */
    @Insert
    int insert(TPresentBox94 entity);

    /**
     * @param entity
     * @return affected rows
     */
    @Update
    int update(TPresentBox94 entity);

    /**
     * @param entity
     * @return affected rows
     */
    @Delete
    int delete(TPresentBox94 entity);
}