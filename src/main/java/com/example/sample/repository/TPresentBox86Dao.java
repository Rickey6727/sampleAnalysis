package com.example.sample.repository;

import com.example.sample.entity.TPresentBox86;
import org.seasar.doma.Dao;
import org.seasar.doma.Delete;
import org.seasar.doma.Insert;
import org.seasar.doma.Select;
import org.seasar.doma.Update;

/**
 */
@Dao(config = ${configClassName}.class)
public interface TPresentBox86Dao {

    /**
     * @param accountId
     * @param accountOrderId
     * @return the TPresentBox86 entity
     */
    @Select
    TPresentBox86 selectById(Integer accountId, Integer accountOrderId);

    /**
     * @param entity
     * @return affected rows
     */
    @Insert
    int insert(TPresentBox86 entity);

    /**
     * @param entity
     * @return affected rows
     */
    @Update
    int update(TPresentBox86 entity);

    /**
     * @param entity
     * @return affected rows
     */
    @Delete
    int delete(TPresentBox86 entity);
}