package com.example.sample.repository;

import com.example.sample.entity.TPresentBox35;
import org.seasar.doma.Dao;
import org.seasar.doma.Delete;
import org.seasar.doma.Insert;
import org.seasar.doma.Select;
import org.seasar.doma.Update;

/**
 */
@Dao(config = ${configClassName}.class)
public interface TPresentBox35Dao {

    /**
     * @param accountId
     * @param accountOrderId
     * @return the TPresentBox35 entity
     */
    @Select
    TPresentBox35 selectById(Integer accountId, Integer accountOrderId);

    /**
     * @param entity
     * @return affected rows
     */
    @Insert
    int insert(TPresentBox35 entity);

    /**
     * @param entity
     * @return affected rows
     */
    @Update
    int update(TPresentBox35 entity);

    /**
     * @param entity
     * @return affected rows
     */
    @Delete
    int delete(TPresentBox35 entity);
}