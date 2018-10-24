package com.example.sample.repository;

import com.example.sample.entity.TPresentBox62;
import org.seasar.doma.Dao;
import org.seasar.doma.Delete;
import org.seasar.doma.Insert;
import org.seasar.doma.Select;
import org.seasar.doma.Update;

/**
 */
@Dao(config = ${configClassName}.class)
public interface TPresentBox62Dao {

    /**
     * @param accountId
     * @param accountOrderId
     * @return the TPresentBox62 entity
     */
    @Select
    TPresentBox62 selectById(Integer accountId, Integer accountOrderId);

    /**
     * @param entity
     * @return affected rows
     */
    @Insert
    int insert(TPresentBox62 entity);

    /**
     * @param entity
     * @return affected rows
     */
    @Update
    int update(TPresentBox62 entity);

    /**
     * @param entity
     * @return affected rows
     */
    @Delete
    int delete(TPresentBox62 entity);
}