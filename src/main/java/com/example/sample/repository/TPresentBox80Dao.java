package com.example.sample.repository;

import com.example.sample.entity.TPresentBox80;
import org.seasar.doma.Dao;
import org.seasar.doma.Delete;
import org.seasar.doma.Insert;
import org.seasar.doma.Select;
import org.seasar.doma.Update;

/**
 */
@Dao(config = ${configClassName}.class)
public interface TPresentBox80Dao {

    /**
     * @param accountId
     * @param accountOrderId
     * @return the TPresentBox80 entity
     */
    @Select
    TPresentBox80 selectById(Integer accountId, Integer accountOrderId);

    /**
     * @param entity
     * @return affected rows
     */
    @Insert
    int insert(TPresentBox80 entity);

    /**
     * @param entity
     * @return affected rows
     */
    @Update
    int update(TPresentBox80 entity);

    /**
     * @param entity
     * @return affected rows
     */
    @Delete
    int delete(TPresentBox80 entity);
}