package com.example.sample.repository;

import com.example.sample.entity.TPresentBox76;
import org.seasar.doma.Dao;
import org.seasar.doma.Delete;
import org.seasar.doma.Insert;
import org.seasar.doma.Select;
import org.seasar.doma.Update;

/**
 */
@Dao(config = ${configClassName}.class)
public interface TPresentBox76Dao {

    /**
     * @param accountId
     * @param accountOrderId
     * @return the TPresentBox76 entity
     */
    @Select
    TPresentBox76 selectById(Integer accountId, Integer accountOrderId);

    /**
     * @param entity
     * @return affected rows
     */
    @Insert
    int insert(TPresentBox76 entity);

    /**
     * @param entity
     * @return affected rows
     */
    @Update
    int update(TPresentBox76 entity);

    /**
     * @param entity
     * @return affected rows
     */
    @Delete
    int delete(TPresentBox76 entity);
}