package com.example.sample.repository;

import com.example.sample.entity.TPresentBox15;
import org.seasar.doma.Dao;
import org.seasar.doma.Delete;
import org.seasar.doma.Insert;
import org.seasar.doma.Select;
import org.seasar.doma.Update;

/**
 */
@Dao(config = ${configClassName}.class)
public interface TPresentBox15Dao {

    /**
     * @param accountId
     * @param accountOrderId
     * @return the TPresentBox15 entity
     */
    @Select
    TPresentBox15 selectById(Integer accountId, Integer accountOrderId);

    /**
     * @param entity
     * @return affected rows
     */
    @Insert
    int insert(TPresentBox15 entity);

    /**
     * @param entity
     * @return affected rows
     */
    @Update
    int update(TPresentBox15 entity);

    /**
     * @param entity
     * @return affected rows
     */
    @Delete
    int delete(TPresentBox15 entity);
}