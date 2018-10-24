package com.example.sample.repository;

import com.example.sample.entity.TPresentBox23;
import org.seasar.doma.Dao;
import org.seasar.doma.Delete;
import org.seasar.doma.Insert;
import org.seasar.doma.Select;
import org.seasar.doma.Update;

/**
 */
@Dao(config = ${configClassName}.class)
public interface TPresentBox23Dao {

    /**
     * @param accountId
     * @param accountOrderId
     * @return the TPresentBox23 entity
     */
    @Select
    TPresentBox23 selectById(Integer accountId, Integer accountOrderId);

    /**
     * @param entity
     * @return affected rows
     */
    @Insert
    int insert(TPresentBox23 entity);

    /**
     * @param entity
     * @return affected rows
     */
    @Update
    int update(TPresentBox23 entity);

    /**
     * @param entity
     * @return affected rows
     */
    @Delete
    int delete(TPresentBox23 entity);
}