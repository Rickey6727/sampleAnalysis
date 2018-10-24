package com.example.sample.repository;

import com.example.sample.entity.TPresentBox59;
import org.seasar.doma.Dao;
import org.seasar.doma.Delete;
import org.seasar.doma.Insert;
import org.seasar.doma.Select;
import org.seasar.doma.Update;

/**
 */
@Dao(config = ${configClassName}.class)
public interface TPresentBox59Dao {

    /**
     * @param accountId
     * @param accountOrderId
     * @return the TPresentBox59 entity
     */
    @Select
    TPresentBox59 selectById(Integer accountId, Integer accountOrderId);

    /**
     * @param entity
     * @return affected rows
     */
    @Insert
    int insert(TPresentBox59 entity);

    /**
     * @param entity
     * @return affected rows
     */
    @Update
    int update(TPresentBox59 entity);

    /**
     * @param entity
     * @return affected rows
     */
    @Delete
    int delete(TPresentBox59 entity);
}