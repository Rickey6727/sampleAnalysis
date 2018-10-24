package com.example.sample.repository;

import com.example.sample.entity.TPresentBox39;
import org.seasar.doma.Dao;
import org.seasar.doma.Delete;
import org.seasar.doma.Insert;
import org.seasar.doma.Select;
import org.seasar.doma.Update;

/**
 */
@Dao(config = ${configClassName}.class)
public interface TPresentBox39Dao {

    /**
     * @param accountId
     * @param accountOrderId
     * @return the TPresentBox39 entity
     */
    @Select
    TPresentBox39 selectById(Integer accountId, Integer accountOrderId);

    /**
     * @param entity
     * @return affected rows
     */
    @Insert
    int insert(TPresentBox39 entity);

    /**
     * @param entity
     * @return affected rows
     */
    @Update
    int update(TPresentBox39 entity);

    /**
     * @param entity
     * @return affected rows
     */
    @Delete
    int delete(TPresentBox39 entity);
}