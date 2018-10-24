package com.example.sample.repository;

import com.example.sample.entity.TPresentBox84;
import org.seasar.doma.Dao;
import org.seasar.doma.Delete;
import org.seasar.doma.Insert;
import org.seasar.doma.Select;
import org.seasar.doma.Update;

/**
 */
@Dao(config = ${configClassName}.class)
public interface TPresentBox84Dao {

    /**
     * @param accountId
     * @param accountOrderId
     * @return the TPresentBox84 entity
     */
    @Select
    TPresentBox84 selectById(Integer accountId, Integer accountOrderId);

    /**
     * @param entity
     * @return affected rows
     */
    @Insert
    int insert(TPresentBox84 entity);

    /**
     * @param entity
     * @return affected rows
     */
    @Update
    int update(TPresentBox84 entity);

    /**
     * @param entity
     * @return affected rows
     */
    @Delete
    int delete(TPresentBox84 entity);
}