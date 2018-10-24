package com.example.sample.repository;

import com.example.sample.entity.TPresentBox81;
import org.seasar.doma.Dao;
import org.seasar.doma.Delete;
import org.seasar.doma.Insert;
import org.seasar.doma.Select;
import org.seasar.doma.Update;

/**
 */
@Dao(config = ${configClassName}.class)
public interface TPresentBox81Dao {

    /**
     * @param accountId
     * @param accountOrderId
     * @return the TPresentBox81 entity
     */
    @Select
    TPresentBox81 selectById(Integer accountId, Integer accountOrderId);

    /**
     * @param entity
     * @return affected rows
     */
    @Insert
    int insert(TPresentBox81 entity);

    /**
     * @param entity
     * @return affected rows
     */
    @Update
    int update(TPresentBox81 entity);

    /**
     * @param entity
     * @return affected rows
     */
    @Delete
    int delete(TPresentBox81 entity);
}