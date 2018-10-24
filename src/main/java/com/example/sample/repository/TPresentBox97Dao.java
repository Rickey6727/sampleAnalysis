package com.example.sample.repository;

import com.example.sample.entity.TPresentBox97;
import org.seasar.doma.Dao;
import org.seasar.doma.Delete;
import org.seasar.doma.Insert;
import org.seasar.doma.Select;
import org.seasar.doma.Update;

/**
 */
@Dao(config = ${configClassName}.class)
public interface TPresentBox97Dao {

    /**
     * @param accountId
     * @param accountOrderId
     * @return the TPresentBox97 entity
     */
    @Select
    TPresentBox97 selectById(Integer accountId, Integer accountOrderId);

    /**
     * @param entity
     * @return affected rows
     */
    @Insert
    int insert(TPresentBox97 entity);

    /**
     * @param entity
     * @return affected rows
     */
    @Update
    int update(TPresentBox97 entity);

    /**
     * @param entity
     * @return affected rows
     */
    @Delete
    int delete(TPresentBox97 entity);
}