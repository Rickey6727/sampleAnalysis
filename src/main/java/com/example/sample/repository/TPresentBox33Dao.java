package com.example.sample.repository;

import com.example.sample.entity.TPresentBox33;
import org.seasar.doma.Dao;
import org.seasar.doma.Delete;
import org.seasar.doma.Insert;
import org.seasar.doma.Select;
import org.seasar.doma.Update;

/**
 */
@Dao(config = ${configClassName}.class)
public interface TPresentBox33Dao {

    /**
     * @param accountId
     * @param accountOrderId
     * @return the TPresentBox33 entity
     */
    @Select
    TPresentBox33 selectById(Integer accountId, Integer accountOrderId);

    /**
     * @param entity
     * @return affected rows
     */
    @Insert
    int insert(TPresentBox33 entity);

    /**
     * @param entity
     * @return affected rows
     */
    @Update
    int update(TPresentBox33 entity);

    /**
     * @param entity
     * @return affected rows
     */
    @Delete
    int delete(TPresentBox33 entity);
}