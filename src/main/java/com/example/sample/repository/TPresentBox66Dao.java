package com.example.sample.repository;

import com.example.sample.entity.TPresentBox66;
import org.seasar.doma.Dao;
import org.seasar.doma.Delete;
import org.seasar.doma.Insert;
import org.seasar.doma.Select;
import org.seasar.doma.Update;

/**
 */
@Dao(config = ${configClassName}.class)
public interface TPresentBox66Dao {

    /**
     * @param accountId
     * @param accountOrderId
     * @return the TPresentBox66 entity
     */
    @Select
    TPresentBox66 selectById(Integer accountId, Integer accountOrderId);

    /**
     * @param entity
     * @return affected rows
     */
    @Insert
    int insert(TPresentBox66 entity);

    /**
     * @param entity
     * @return affected rows
     */
    @Update
    int update(TPresentBox66 entity);

    /**
     * @param entity
     * @return affected rows
     */
    @Delete
    int delete(TPresentBox66 entity);
}