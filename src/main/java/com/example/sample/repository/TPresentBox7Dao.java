package com.example.sample.repository;

import com.example.sample.entity.TPresentBox7;
import org.seasar.doma.Dao;
import org.seasar.doma.Delete;
import org.seasar.doma.Insert;
import org.seasar.doma.Select;
import org.seasar.doma.Update;

/**
 */
@Dao(config = ${configClassName}.class)
public interface TPresentBox7Dao {

    /**
     * @param accountId
     * @param accountOrderId
     * @return the TPresentBox7 entity
     */
    @Select
    TPresentBox7 selectById(Integer accountId, Integer accountOrderId);

    /**
     * @param entity
     * @return affected rows
     */
    @Insert
    int insert(TPresentBox7 entity);

    /**
     * @param entity
     * @return affected rows
     */
    @Update
    int update(TPresentBox7 entity);

    /**
     * @param entity
     * @return affected rows
     */
    @Delete
    int delete(TPresentBox7 entity);
}