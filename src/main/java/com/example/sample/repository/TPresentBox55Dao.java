package com.example.sample.repository;

import com.example.sample.entity.TPresentBox55;
import org.seasar.doma.Dao;
import org.seasar.doma.Delete;
import org.seasar.doma.Insert;
import org.seasar.doma.Select;
import org.seasar.doma.Update;

/**
 */
@Dao(config = ${configClassName}.class)
public interface TPresentBox55Dao {

    /**
     * @param accountId
     * @param accountOrderId
     * @return the TPresentBox55 entity
     */
    @Select
    TPresentBox55 selectById(Integer accountId, Integer accountOrderId);

    /**
     * @param entity
     * @return affected rows
     */
    @Insert
    int insert(TPresentBox55 entity);

    /**
     * @param entity
     * @return affected rows
     */
    @Update
    int update(TPresentBox55 entity);

    /**
     * @param entity
     * @return affected rows
     */
    @Delete
    int delete(TPresentBox55 entity);
}