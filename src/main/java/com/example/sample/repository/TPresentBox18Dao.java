package com.example.sample.repository;

import com.example.sample.entity.TPresentBox18;
import org.seasar.doma.Dao;
import org.seasar.doma.Delete;
import org.seasar.doma.Insert;
import org.seasar.doma.Select;
import org.seasar.doma.Update;

/**
 */
@Dao(config = ${configClassName}.class)
public interface TPresentBox18Dao {

    /**
     * @param accountId
     * @param accountOrderId
     * @return the TPresentBox18 entity
     */
    @Select
    TPresentBox18 selectById(Integer accountId, Integer accountOrderId);

    /**
     * @param entity
     * @return affected rows
     */
    @Insert
    int insert(TPresentBox18 entity);

    /**
     * @param entity
     * @return affected rows
     */
    @Update
    int update(TPresentBox18 entity);

    /**
     * @param entity
     * @return affected rows
     */
    @Delete
    int delete(TPresentBox18 entity);
}