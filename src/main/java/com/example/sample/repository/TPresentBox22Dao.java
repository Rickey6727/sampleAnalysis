package com.example.sample.repository;

import com.example.sample.entity.TPresentBox22;
import org.seasar.doma.Dao;
import org.seasar.doma.Delete;
import org.seasar.doma.Insert;
import org.seasar.doma.Select;
import org.seasar.doma.Update;

/**
 */
@Dao(config = ${configClassName}.class)
public interface TPresentBox22Dao {

    /**
     * @param accountId
     * @param accountOrderId
     * @return the TPresentBox22 entity
     */
    @Select
    TPresentBox22 selectById(Integer accountId, Integer accountOrderId);

    /**
     * @param entity
     * @return affected rows
     */
    @Insert
    int insert(TPresentBox22 entity);

    /**
     * @param entity
     * @return affected rows
     */
    @Update
    int update(TPresentBox22 entity);

    /**
     * @param entity
     * @return affected rows
     */
    @Delete
    int delete(TPresentBox22 entity);
}