package com.example.sample.repository;

import com.example.sample.entity.TPresentBox43;
import org.seasar.doma.Dao;
import org.seasar.doma.Delete;
import org.seasar.doma.Insert;
import org.seasar.doma.Select;
import org.seasar.doma.Update;

/**
 */
@Dao(config = ${configClassName}.class)
public interface TPresentBox43Dao {

    /**
     * @param accountId
     * @param accountOrderId
     * @return the TPresentBox43 entity
     */
    @Select
    TPresentBox43 selectById(Integer accountId, Integer accountOrderId);

    /**
     * @param entity
     * @return affected rows
     */
    @Insert
    int insert(TPresentBox43 entity);

    /**
     * @param entity
     * @return affected rows
     */
    @Update
    int update(TPresentBox43 entity);

    /**
     * @param entity
     * @return affected rows
     */
    @Delete
    int delete(TPresentBox43 entity);
}