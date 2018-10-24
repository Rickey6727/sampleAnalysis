package com.example.sample.repository;

import com.example.sample.entity.TPresentBox47;
import org.seasar.doma.Dao;
import org.seasar.doma.Delete;
import org.seasar.doma.Insert;
import org.seasar.doma.Select;
import org.seasar.doma.Update;

/**
 */
@Dao(config = ${configClassName}.class)
public interface TPresentBox47Dao {

    /**
     * @param accountId
     * @param accountOrderId
     * @return the TPresentBox47 entity
     */
    @Select
    TPresentBox47 selectById(Integer accountId, Integer accountOrderId);

    /**
     * @param entity
     * @return affected rows
     */
    @Insert
    int insert(TPresentBox47 entity);

    /**
     * @param entity
     * @return affected rows
     */
    @Update
    int update(TPresentBox47 entity);

    /**
     * @param entity
     * @return affected rows
     */
    @Delete
    int delete(TPresentBox47 entity);
}