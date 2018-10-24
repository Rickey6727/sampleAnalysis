package com.example.sample.repository;

import com.example.sample.entity.TPresentBox16;
import org.seasar.doma.Dao;
import org.seasar.doma.Delete;
import org.seasar.doma.Insert;
import org.seasar.doma.Select;
import org.seasar.doma.Update;

/**
 */
@Dao(config = ${configClassName}.class)
public interface TPresentBox16Dao {

    /**
     * @param accountId
     * @param accountOrderId
     * @return the TPresentBox16 entity
     */
    @Select
    TPresentBox16 selectById(Integer accountId, Integer accountOrderId);

    /**
     * @param entity
     * @return affected rows
     */
    @Insert
    int insert(TPresentBox16 entity);

    /**
     * @param entity
     * @return affected rows
     */
    @Update
    int update(TPresentBox16 entity);

    /**
     * @param entity
     * @return affected rows
     */
    @Delete
    int delete(TPresentBox16 entity);
}