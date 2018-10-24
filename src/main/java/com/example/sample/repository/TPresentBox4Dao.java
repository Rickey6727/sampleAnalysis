package com.example.sample.repository;

import com.example.sample.entity.TPresentBox4;
import org.seasar.doma.Dao;
import org.seasar.doma.Delete;
import org.seasar.doma.Insert;
import org.seasar.doma.Select;
import org.seasar.doma.Update;

/**
 */
@Dao(config = ${configClassName}.class)
public interface TPresentBox4Dao {

    /**
     * @param accountId
     * @param accountOrderId
     * @return the TPresentBox4 entity
     */
    @Select
    TPresentBox4 selectById(Integer accountId, Integer accountOrderId);

    /**
     * @param entity
     * @return affected rows
     */
    @Insert
    int insert(TPresentBox4 entity);

    /**
     * @param entity
     * @return affected rows
     */
    @Update
    int update(TPresentBox4 entity);

    /**
     * @param entity
     * @return affected rows
     */
    @Delete
    int delete(TPresentBox4 entity);
}