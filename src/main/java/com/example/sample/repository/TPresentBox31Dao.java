package com.example.sample.repository;

import com.example.sample.entity.TPresentBox31;
import org.seasar.doma.Dao;
import org.seasar.doma.Delete;
import org.seasar.doma.Insert;
import org.seasar.doma.Select;
import org.seasar.doma.Update;

/**
 */
@Dao(config = ${configClassName}.class)
public interface TPresentBox31Dao {

    /**
     * @param accountId
     * @param accountOrderId
     * @return the TPresentBox31 entity
     */
    @Select
    TPresentBox31 selectById(Integer accountId, Integer accountOrderId);

    /**
     * @param entity
     * @return affected rows
     */
    @Insert
    int insert(TPresentBox31 entity);

    /**
     * @param entity
     * @return affected rows
     */
    @Update
    int update(TPresentBox31 entity);

    /**
     * @param entity
     * @return affected rows
     */
    @Delete
    int delete(TPresentBox31 entity);
}