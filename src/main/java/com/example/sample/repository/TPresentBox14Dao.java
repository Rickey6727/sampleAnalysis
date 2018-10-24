package com.example.sample.repository;

import com.example.sample.entity.TPresentBox14;
import org.seasar.doma.Dao;
import org.seasar.doma.Delete;
import org.seasar.doma.Insert;
import org.seasar.doma.Select;
import org.seasar.doma.Update;

/**
 */
@Dao(config = ${configClassName}.class)
public interface TPresentBox14Dao {

    /**
     * @param accountId
     * @param accountOrderId
     * @return the TPresentBox14 entity
     */
    @Select
    TPresentBox14 selectById(Integer accountId, Integer accountOrderId);

    /**
     * @param entity
     * @return affected rows
     */
    @Insert
    int insert(TPresentBox14 entity);

    /**
     * @param entity
     * @return affected rows
     */
    @Update
    int update(TPresentBox14 entity);

    /**
     * @param entity
     * @return affected rows
     */
    @Delete
    int delete(TPresentBox14 entity);
}