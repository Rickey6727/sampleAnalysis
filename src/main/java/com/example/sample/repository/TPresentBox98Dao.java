package com.example.sample.repository;

import com.example.sample.entity.TPresentBox98;
import org.seasar.doma.Dao;
import org.seasar.doma.Delete;
import org.seasar.doma.Insert;
import org.seasar.doma.Select;
import org.seasar.doma.Update;

/**
 */
@Dao(config = ${configClassName}.class)
public interface TPresentBox98Dao {

    /**
     * @param accountId
     * @param accountOrderId
     * @return the TPresentBox98 entity
     */
    @Select
    TPresentBox98 selectById(Integer accountId, Integer accountOrderId);

    /**
     * @param entity
     * @return affected rows
     */
    @Insert
    int insert(TPresentBox98 entity);

    /**
     * @param entity
     * @return affected rows
     */
    @Update
    int update(TPresentBox98 entity);

    /**
     * @param entity
     * @return affected rows
     */
    @Delete
    int delete(TPresentBox98 entity);
}