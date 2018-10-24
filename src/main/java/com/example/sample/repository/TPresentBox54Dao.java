package com.example.sample.repository;

import com.example.sample.entity.TPresentBox54;
import org.seasar.doma.Dao;
import org.seasar.doma.Delete;
import org.seasar.doma.Insert;
import org.seasar.doma.Select;
import org.seasar.doma.Update;

/**
 */
@Dao(config = ${configClassName}.class)
public interface TPresentBox54Dao {

    /**
     * @param accountId
     * @param accountOrderId
     * @return the TPresentBox54 entity
     */
    @Select
    TPresentBox54 selectById(Integer accountId, Integer accountOrderId);

    /**
     * @param entity
     * @return affected rows
     */
    @Insert
    int insert(TPresentBox54 entity);

    /**
     * @param entity
     * @return affected rows
     */
    @Update
    int update(TPresentBox54 entity);

    /**
     * @param entity
     * @return affected rows
     */
    @Delete
    int delete(TPresentBox54 entity);
}