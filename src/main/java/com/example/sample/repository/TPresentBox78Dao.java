package com.example.sample.repository;

import com.example.sample.entity.TPresentBox78;
import org.seasar.doma.Dao;
import org.seasar.doma.Delete;
import org.seasar.doma.Insert;
import org.seasar.doma.Select;
import org.seasar.doma.Update;

/**
 */
@Dao(config = ${configClassName}.class)
public interface TPresentBox78Dao {

    /**
     * @param accountId
     * @param accountOrderId
     * @return the TPresentBox78 entity
     */
    @Select
    TPresentBox78 selectById(Integer accountId, Integer accountOrderId);

    /**
     * @param entity
     * @return affected rows
     */
    @Insert
    int insert(TPresentBox78 entity);

    /**
     * @param entity
     * @return affected rows
     */
    @Update
    int update(TPresentBox78 entity);

    /**
     * @param entity
     * @return affected rows
     */
    @Delete
    int delete(TPresentBox78 entity);
}