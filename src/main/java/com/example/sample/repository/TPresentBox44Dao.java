package com.example.sample.repository;

import com.example.sample.entity.TPresentBox44;
import org.seasar.doma.Dao;
import org.seasar.doma.Delete;
import org.seasar.doma.Insert;
import org.seasar.doma.Select;
import org.seasar.doma.Update;

/**
 */
@Dao(config = ${configClassName}.class)
public interface TPresentBox44Dao {

    /**
     * @param accountId
     * @param accountOrderId
     * @return the TPresentBox44 entity
     */
    @Select
    TPresentBox44 selectById(Integer accountId, Integer accountOrderId);

    /**
     * @param entity
     * @return affected rows
     */
    @Insert
    int insert(TPresentBox44 entity);

    /**
     * @param entity
     * @return affected rows
     */
    @Update
    int update(TPresentBox44 entity);

    /**
     * @param entity
     * @return affected rows
     */
    @Delete
    int delete(TPresentBox44 entity);
}