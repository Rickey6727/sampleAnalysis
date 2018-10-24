package com.example.sample.repository;

import com.example.sample.entity.TPresentBox8;
import org.seasar.doma.Dao;
import org.seasar.doma.Delete;
import org.seasar.doma.Insert;
import org.seasar.doma.Select;
import org.seasar.doma.Update;

/**
 */
@Dao(config = ${configClassName}.class)
public interface TPresentBox8Dao {

    /**
     * @param accountId
     * @param accountOrderId
     * @return the TPresentBox8 entity
     */
    @Select
    TPresentBox8 selectById(Integer accountId, Integer accountOrderId);

    /**
     * @param entity
     * @return affected rows
     */
    @Insert
    int insert(TPresentBox8 entity);

    /**
     * @param entity
     * @return affected rows
     */
    @Update
    int update(TPresentBox8 entity);

    /**
     * @param entity
     * @return affected rows
     */
    @Delete
    int delete(TPresentBox8 entity);
}