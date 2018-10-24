package com.example.sample.repository;

import com.example.sample.entity.TPresentBox34;
import org.seasar.doma.Dao;
import org.seasar.doma.Delete;
import org.seasar.doma.Insert;
import org.seasar.doma.Select;
import org.seasar.doma.Update;

/**
 */
@Dao(config = ${configClassName}.class)
public interface TPresentBox34Dao {

    /**
     * @param accountId
     * @param accountOrderId
     * @return the TPresentBox34 entity
     */
    @Select
    TPresentBox34 selectById(Integer accountId, Integer accountOrderId);

    /**
     * @param entity
     * @return affected rows
     */
    @Insert
    int insert(TPresentBox34 entity);

    /**
     * @param entity
     * @return affected rows
     */
    @Update
    int update(TPresentBox34 entity);

    /**
     * @param entity
     * @return affected rows
     */
    @Delete
    int delete(TPresentBox34 entity);
}