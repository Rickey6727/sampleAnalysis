package com.example.sample.repository;

import com.example.sample.entity.TPresentBox42;
import org.seasar.doma.Dao;
import org.seasar.doma.Delete;
import org.seasar.doma.Insert;
import org.seasar.doma.Select;
import org.seasar.doma.Update;

/**
 */
@Dao(config = ${configClassName}.class)
public interface TPresentBox42Dao {

    /**
     * @param accountId
     * @param accountOrderId
     * @return the TPresentBox42 entity
     */
    @Select
    TPresentBox42 selectById(Integer accountId, Integer accountOrderId);

    /**
     * @param entity
     * @return affected rows
     */
    @Insert
    int insert(TPresentBox42 entity);

    /**
     * @param entity
     * @return affected rows
     */
    @Update
    int update(TPresentBox42 entity);

    /**
     * @param entity
     * @return affected rows
     */
    @Delete
    int delete(TPresentBox42 entity);
}