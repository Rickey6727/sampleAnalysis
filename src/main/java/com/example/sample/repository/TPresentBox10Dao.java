package com.example.sample.repository;

import com.example.sample.entity.TPresentBox10;
import org.seasar.doma.Dao;
import org.seasar.doma.Delete;
import org.seasar.doma.Insert;
import org.seasar.doma.Select;
import org.seasar.doma.Update;

/**
 */
@Dao(config = ${configClassName}.class)
public interface TPresentBox10Dao {

    /**
     * @param accountId
     * @param accountOrderId
     * @return the TPresentBox10 entity
     */
    @Select
    TPresentBox10 selectById(Integer accountId, Integer accountOrderId);

    /**
     * @param entity
     * @return affected rows
     */
    @Insert
    int insert(TPresentBox10 entity);

    /**
     * @param entity
     * @return affected rows
     */
    @Update
    int update(TPresentBox10 entity);

    /**
     * @param entity
     * @return affected rows
     */
    @Delete
    int delete(TPresentBox10 entity);
}