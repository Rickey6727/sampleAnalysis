package com.example.sample.repository;

import com.example.sample.entity.TPresentBox53;
import org.seasar.doma.Dao;
import org.seasar.doma.Delete;
import org.seasar.doma.Insert;
import org.seasar.doma.Select;
import org.seasar.doma.Update;

/**
 */
@Dao(config = ${configClassName}.class)
public interface TPresentBox53Dao {

    /**
     * @param accountId
     * @param accountOrderId
     * @return the TPresentBox53 entity
     */
    @Select
    TPresentBox53 selectById(Integer accountId, Integer accountOrderId);

    /**
     * @param entity
     * @return affected rows
     */
    @Insert
    int insert(TPresentBox53 entity);

    /**
     * @param entity
     * @return affected rows
     */
    @Update
    int update(TPresentBox53 entity);

    /**
     * @param entity
     * @return affected rows
     */
    @Delete
    int delete(TPresentBox53 entity);
}