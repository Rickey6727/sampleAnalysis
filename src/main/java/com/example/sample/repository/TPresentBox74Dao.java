package com.example.sample.repository;

import com.example.sample.entity.TPresentBox74;
import org.seasar.doma.Dao;
import org.seasar.doma.Delete;
import org.seasar.doma.Insert;
import org.seasar.doma.Select;
import org.seasar.doma.Update;

/**
 */
@Dao(config = ${configClassName}.class)
public interface TPresentBox74Dao {

    /**
     * @param accountId
     * @param accountOrderId
     * @return the TPresentBox74 entity
     */
    @Select
    TPresentBox74 selectById(Integer accountId, Integer accountOrderId);

    /**
     * @param entity
     * @return affected rows
     */
    @Insert
    int insert(TPresentBox74 entity);

    /**
     * @param entity
     * @return affected rows
     */
    @Update
    int update(TPresentBox74 entity);

    /**
     * @param entity
     * @return affected rows
     */
    @Delete
    int delete(TPresentBox74 entity);
}