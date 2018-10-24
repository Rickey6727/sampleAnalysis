package com.example.sample.repository;

import com.example.sample.entity.TPresentBox12;
import org.seasar.doma.Dao;
import org.seasar.doma.Delete;
import org.seasar.doma.Insert;
import org.seasar.doma.Select;
import org.seasar.doma.Update;

/**
 */
@Dao(config = ${configClassName}.class)
public interface TPresentBox12Dao {

    /**
     * @param accountId
     * @param accountOrderId
     * @return the TPresentBox12 entity
     */
    @Select
    TPresentBox12 selectById(Integer accountId, Integer accountOrderId);

    /**
     * @param entity
     * @return affected rows
     */
    @Insert
    int insert(TPresentBox12 entity);

    /**
     * @param entity
     * @return affected rows
     */
    @Update
    int update(TPresentBox12 entity);

    /**
     * @param entity
     * @return affected rows
     */
    @Delete
    int delete(TPresentBox12 entity);
}