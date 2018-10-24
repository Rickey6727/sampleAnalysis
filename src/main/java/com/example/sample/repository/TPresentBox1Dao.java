package com.example.sample.repository;

import com.example.sample.entity.TPresentBox1;
import org.seasar.doma.Dao;
import org.seasar.doma.Delete;
import org.seasar.doma.Insert;
import org.seasar.doma.Select;
import org.seasar.doma.Update;

/**
 */
@Dao(config = ${configClassName}.class)
public interface TPresentBox1Dao {

    /**
     * @param accountId
     * @param accountOrderId
     * @return the TPresentBox1 entity
     */
    @Select
    TPresentBox1 selectById(Integer accountId, Integer accountOrderId);

    /**
     * @param entity
     * @return affected rows
     */
    @Insert
    int insert(TPresentBox1 entity);

    /**
     * @param entity
     * @return affected rows
     */
    @Update
    int update(TPresentBox1 entity);

    /**
     * @param entity
     * @return affected rows
     */
    @Delete
    int delete(TPresentBox1 entity);
}