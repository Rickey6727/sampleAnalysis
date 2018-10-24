package com.example.sample.repository;

import com.example.sample.entity.TPresentBox63;
import org.seasar.doma.Dao;
import org.seasar.doma.Delete;
import org.seasar.doma.Insert;
import org.seasar.doma.Select;
import org.seasar.doma.Update;

/**
 */
@Dao(config = ${configClassName}.class)
public interface TPresentBox63Dao {

    /**
     * @param accountId
     * @param accountOrderId
     * @return the TPresentBox63 entity
     */
    @Select
    TPresentBox63 selectById(Integer accountId, Integer accountOrderId);

    /**
     * @param entity
     * @return affected rows
     */
    @Insert
    int insert(TPresentBox63 entity);

    /**
     * @param entity
     * @return affected rows
     */
    @Update
    int update(TPresentBox63 entity);

    /**
     * @param entity
     * @return affected rows
     */
    @Delete
    int delete(TPresentBox63 entity);
}