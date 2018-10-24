package com.example.sample.repository;

import com.example.sample.entity.TPresentBox21;
import org.seasar.doma.Dao;
import org.seasar.doma.Delete;
import org.seasar.doma.Insert;
import org.seasar.doma.Select;
import org.seasar.doma.Update;

/**
 */
@Dao(config = ${configClassName}.class)
public interface TPresentBox21Dao {

    /**
     * @param accountId
     * @param accountOrderId
     * @return the TPresentBox21 entity
     */
    @Select
    TPresentBox21 selectById(Integer accountId, Integer accountOrderId);

    /**
     * @param entity
     * @return affected rows
     */
    @Insert
    int insert(TPresentBox21 entity);

    /**
     * @param entity
     * @return affected rows
     */
    @Update
    int update(TPresentBox21 entity);

    /**
     * @param entity
     * @return affected rows
     */
    @Delete
    int delete(TPresentBox21 entity);
}