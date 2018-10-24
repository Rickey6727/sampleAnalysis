package com.example.sample.repository;

import com.example.sample.entity.TPresentBox32;
import org.seasar.doma.Dao;
import org.seasar.doma.Delete;
import org.seasar.doma.Insert;
import org.seasar.doma.Select;
import org.seasar.doma.Update;

/**
 */
@Dao(config = ${configClassName}.class)
public interface TPresentBox32Dao {

    /**
     * @param accountId
     * @param accountOrderId
     * @return the TPresentBox32 entity
     */
    @Select
    TPresentBox32 selectById(Integer accountId, Integer accountOrderId);

    /**
     * @param entity
     * @return affected rows
     */
    @Insert
    int insert(TPresentBox32 entity);

    /**
     * @param entity
     * @return affected rows
     */
    @Update
    int update(TPresentBox32 entity);

    /**
     * @param entity
     * @return affected rows
     */
    @Delete
    int delete(TPresentBox32 entity);
}