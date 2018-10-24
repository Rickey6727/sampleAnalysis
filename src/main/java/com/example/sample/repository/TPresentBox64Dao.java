package com.example.sample.repository;

import com.example.sample.entity.TPresentBox64;
import org.seasar.doma.Dao;
import org.seasar.doma.Delete;
import org.seasar.doma.Insert;
import org.seasar.doma.Select;
import org.seasar.doma.Update;

/**
 */
@Dao(config = ${configClassName}.class)
public interface TPresentBox64Dao {

    /**
     * @param accountId
     * @param accountOrderId
     * @return the TPresentBox64 entity
     */
    @Select
    TPresentBox64 selectById(Integer accountId, Integer accountOrderId);

    /**
     * @param entity
     * @return affected rows
     */
    @Insert
    int insert(TPresentBox64 entity);

    /**
     * @param entity
     * @return affected rows
     */
    @Update
    int update(TPresentBox64 entity);

    /**
     * @param entity
     * @return affected rows
     */
    @Delete
    int delete(TPresentBox64 entity);
}