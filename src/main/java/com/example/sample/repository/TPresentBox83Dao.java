package com.example.sample.repository;

import com.example.sample.entity.TPresentBox83;
import org.seasar.doma.Dao;
import org.seasar.doma.Delete;
import org.seasar.doma.Insert;
import org.seasar.doma.Select;
import org.seasar.doma.Update;

/**
 */
@Dao(config = ${configClassName}.class)
public interface TPresentBox83Dao {

    /**
     * @param accountId
     * @param accountOrderId
     * @return the TPresentBox83 entity
     */
    @Select
    TPresentBox83 selectById(Integer accountId, Integer accountOrderId);

    /**
     * @param entity
     * @return affected rows
     */
    @Insert
    int insert(TPresentBox83 entity);

    /**
     * @param entity
     * @return affected rows
     */
    @Update
    int update(TPresentBox83 entity);

    /**
     * @param entity
     * @return affected rows
     */
    @Delete
    int delete(TPresentBox83 entity);
}