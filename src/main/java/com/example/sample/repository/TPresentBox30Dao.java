package com.example.sample.repository;

import com.example.sample.entity.TPresentBox30;
import org.seasar.doma.Dao;
import org.seasar.doma.Delete;
import org.seasar.doma.Insert;
import org.seasar.doma.Select;
import org.seasar.doma.Update;

/**
 */
@Dao(config = ${configClassName}.class)
public interface TPresentBox30Dao {

    /**
     * @param accountId
     * @param accountOrderId
     * @return the TPresentBox30 entity
     */
    @Select
    TPresentBox30 selectById(Integer accountId, Integer accountOrderId);

    /**
     * @param entity
     * @return affected rows
     */
    @Insert
    int insert(TPresentBox30 entity);

    /**
     * @param entity
     * @return affected rows
     */
    @Update
    int update(TPresentBox30 entity);

    /**
     * @param entity
     * @return affected rows
     */
    @Delete
    int delete(TPresentBox30 entity);
}