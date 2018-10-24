package com.example.sample.repository;

import com.example.sample.entity.TPresentBox96;
import org.seasar.doma.Dao;
import org.seasar.doma.Delete;
import org.seasar.doma.Insert;
import org.seasar.doma.Select;
import org.seasar.doma.Update;

/**
 */
@Dao(config = ${configClassName}.class)
public interface TPresentBox96Dao {

    /**
     * @param accountId
     * @param accountOrderId
     * @return the TPresentBox96 entity
     */
    @Select
    TPresentBox96 selectById(Integer accountId, Integer accountOrderId);

    /**
     * @param entity
     * @return affected rows
     */
    @Insert
    int insert(TPresentBox96 entity);

    /**
     * @param entity
     * @return affected rows
     */
    @Update
    int update(TPresentBox96 entity);

    /**
     * @param entity
     * @return affected rows
     */
    @Delete
    int delete(TPresentBox96 entity);
}