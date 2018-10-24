package com.example.sample.repository;

import com.example.sample.entity.TPresentBox65;
import org.seasar.doma.Dao;
import org.seasar.doma.Delete;
import org.seasar.doma.Insert;
import org.seasar.doma.Select;
import org.seasar.doma.Update;

/**
 */
@Dao(config = ${configClassName}.class)
public interface TPresentBox65Dao {

    /**
     * @param accountId
     * @param accountOrderId
     * @return the TPresentBox65 entity
     */
    @Select
    TPresentBox65 selectById(Integer accountId, Integer accountOrderId);

    /**
     * @param entity
     * @return affected rows
     */
    @Insert
    int insert(TPresentBox65 entity);

    /**
     * @param entity
     * @return affected rows
     */
    @Update
    int update(TPresentBox65 entity);

    /**
     * @param entity
     * @return affected rows
     */
    @Delete
    int delete(TPresentBox65 entity);
}