package com.example.sample.repository;

import com.example.sample.entity.TPresentBox77;
import org.seasar.doma.Dao;
import org.seasar.doma.Delete;
import org.seasar.doma.Insert;
import org.seasar.doma.Select;
import org.seasar.doma.Update;

/**
 */
@Dao(config = ${configClassName}.class)
public interface TPresentBox77Dao {

    /**
     * @param accountId
     * @param accountOrderId
     * @return the TPresentBox77 entity
     */
    @Select
    TPresentBox77 selectById(Integer accountId, Integer accountOrderId);

    /**
     * @param entity
     * @return affected rows
     */
    @Insert
    int insert(TPresentBox77 entity);

    /**
     * @param entity
     * @return affected rows
     */
    @Update
    int update(TPresentBox77 entity);

    /**
     * @param entity
     * @return affected rows
     */
    @Delete
    int delete(TPresentBox77 entity);
}