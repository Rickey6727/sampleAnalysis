package com.example.sample.repository;

import com.example.sample.entity.TPresentBox58;
import org.seasar.doma.Dao;
import org.seasar.doma.Delete;
import org.seasar.doma.Insert;
import org.seasar.doma.Select;
import org.seasar.doma.Update;

/**
 */
@Dao(config = ${configClassName}.class)
public interface TPresentBox58Dao {

    /**
     * @param accountId
     * @param accountOrderId
     * @return the TPresentBox58 entity
     */
    @Select
    TPresentBox58 selectById(Integer accountId, Integer accountOrderId);

    /**
     * @param entity
     * @return affected rows
     */
    @Insert
    int insert(TPresentBox58 entity);

    /**
     * @param entity
     * @return affected rows
     */
    @Update
    int update(TPresentBox58 entity);

    /**
     * @param entity
     * @return affected rows
     */
    @Delete
    int delete(TPresentBox58 entity);
}