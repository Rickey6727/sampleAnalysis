package com.example.sample.repository;

import com.example.sample.entity.TPresentBox93;
import org.seasar.doma.Dao;
import org.seasar.doma.Delete;
import org.seasar.doma.Insert;
import org.seasar.doma.Select;
import org.seasar.doma.Update;

/**
 */
@Dao(config = ${configClassName}.class)
public interface TPresentBox93Dao {

    /**
     * @param accountId
     * @param accountOrderId
     * @return the TPresentBox93 entity
     */
    @Select
    TPresentBox93 selectById(Integer accountId, Integer accountOrderId);

    /**
     * @param entity
     * @return affected rows
     */
    @Insert
    int insert(TPresentBox93 entity);

    /**
     * @param entity
     * @return affected rows
     */
    @Update
    int update(TPresentBox93 entity);

    /**
     * @param entity
     * @return affected rows
     */
    @Delete
    int delete(TPresentBox93 entity);
}