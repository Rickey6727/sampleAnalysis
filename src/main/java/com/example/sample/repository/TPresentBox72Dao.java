package com.example.sample.repository;

import com.example.sample.entity.TPresentBox72;
import org.seasar.doma.Dao;
import org.seasar.doma.Delete;
import org.seasar.doma.Insert;
import org.seasar.doma.Select;
import org.seasar.doma.Update;

/**
 */
@Dao(config = ${configClassName}.class)
public interface TPresentBox72Dao {

    /**
     * @param accountId
     * @param accountOrderId
     * @return the TPresentBox72 entity
     */
    @Select
    TPresentBox72 selectById(Integer accountId, Integer accountOrderId);

    /**
     * @param entity
     * @return affected rows
     */
    @Insert
    int insert(TPresentBox72 entity);

    /**
     * @param entity
     * @return affected rows
     */
    @Update
    int update(TPresentBox72 entity);

    /**
     * @param entity
     * @return affected rows
     */
    @Delete
    int delete(TPresentBox72 entity);
}