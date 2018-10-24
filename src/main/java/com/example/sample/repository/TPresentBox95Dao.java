package com.example.sample.repository;

import com.example.sample.entity.TPresentBox95;
import org.seasar.doma.Dao;
import org.seasar.doma.Delete;
import org.seasar.doma.Insert;
import org.seasar.doma.Select;
import org.seasar.doma.Update;

/**
 */
@Dao(config = ${configClassName}.class)
public interface TPresentBox95Dao {

    /**
     * @param accountId
     * @param accountOrderId
     * @return the TPresentBox95 entity
     */
    @Select
    TPresentBox95 selectById(Integer accountId, Integer accountOrderId);

    /**
     * @param entity
     * @return affected rows
     */
    @Insert
    int insert(TPresentBox95 entity);

    /**
     * @param entity
     * @return affected rows
     */
    @Update
    int update(TPresentBox95 entity);

    /**
     * @param entity
     * @return affected rows
     */
    @Delete
    int delete(TPresentBox95 entity);
}