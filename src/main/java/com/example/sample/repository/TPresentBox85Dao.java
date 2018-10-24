package com.example.sample.repository;

import com.example.sample.entity.TPresentBox85;
import org.seasar.doma.Dao;
import org.seasar.doma.Delete;
import org.seasar.doma.Insert;
import org.seasar.doma.Select;
import org.seasar.doma.Update;

/**
 */
@Dao(config = ${configClassName}.class)
public interface TPresentBox85Dao {

    /**
     * @param accountId
     * @param accountOrderId
     * @return the TPresentBox85 entity
     */
    @Select
    TPresentBox85 selectById(Integer accountId, Integer accountOrderId);

    /**
     * @param entity
     * @return affected rows
     */
    @Insert
    int insert(TPresentBox85 entity);

    /**
     * @param entity
     * @return affected rows
     */
    @Update
    int update(TPresentBox85 entity);

    /**
     * @param entity
     * @return affected rows
     */
    @Delete
    int delete(TPresentBox85 entity);
}