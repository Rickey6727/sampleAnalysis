package com.example.sample.repository;

import com.example.sample.entity.TPresentBox20;
import org.seasar.doma.Dao;
import org.seasar.doma.Delete;
import org.seasar.doma.Insert;
import org.seasar.doma.Select;
import org.seasar.doma.Update;

/**
 */
@Dao(config = ${configClassName}.class)
public interface TPresentBox20Dao {

    /**
     * @param accountId
     * @param accountOrderId
     * @return the TPresentBox20 entity
     */
    @Select
    TPresentBox20 selectById(Integer accountId, Integer accountOrderId);

    /**
     * @param entity
     * @return affected rows
     */
    @Insert
    int insert(TPresentBox20 entity);

    /**
     * @param entity
     * @return affected rows
     */
    @Update
    int update(TPresentBox20 entity);

    /**
     * @param entity
     * @return affected rows
     */
    @Delete
    int delete(TPresentBox20 entity);
}