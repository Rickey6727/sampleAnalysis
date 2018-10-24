package com.example.sample.repository;

import com.example.sample.entity.TPresentBox6;
import org.seasar.doma.Dao;
import org.seasar.doma.Delete;
import org.seasar.doma.Insert;
import org.seasar.doma.Select;
import org.seasar.doma.Update;

/**
 */
@Dao(config = ${configClassName}.class)
public interface TPresentBox6Dao {

    /**
     * @param accountId
     * @param accountOrderId
     * @return the TPresentBox6 entity
     */
    @Select
    TPresentBox6 selectById(Integer accountId, Integer accountOrderId);

    /**
     * @param entity
     * @return affected rows
     */
    @Insert
    int insert(TPresentBox6 entity);

    /**
     * @param entity
     * @return affected rows
     */
    @Update
    int update(TPresentBox6 entity);

    /**
     * @param entity
     * @return affected rows
     */
    @Delete
    int delete(TPresentBox6 entity);
}