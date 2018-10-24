package com.example.sample.repository;

import com.example.sample.entity.TPresentBox11;
import org.seasar.doma.Dao;
import org.seasar.doma.Delete;
import org.seasar.doma.Insert;
import org.seasar.doma.Select;
import org.seasar.doma.Update;

/**
 */
@Dao(config = ${configClassName}.class)
public interface TPresentBox11Dao {

    /**
     * @param accountId
     * @param accountOrderId
     * @return the TPresentBox11 entity
     */
    @Select
    TPresentBox11 selectById(Integer accountId, Integer accountOrderId);

    /**
     * @param entity
     * @return affected rows
     */
    @Insert
    int insert(TPresentBox11 entity);

    /**
     * @param entity
     * @return affected rows
     */
    @Update
    int update(TPresentBox11 entity);

    /**
     * @param entity
     * @return affected rows
     */
    @Delete
    int delete(TPresentBox11 entity);
}