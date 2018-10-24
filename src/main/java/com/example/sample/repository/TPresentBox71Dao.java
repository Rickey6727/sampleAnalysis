package com.example.sample.repository;

import com.example.sample.entity.TPresentBox71;
import org.seasar.doma.Dao;
import org.seasar.doma.Delete;
import org.seasar.doma.Insert;
import org.seasar.doma.Select;
import org.seasar.doma.Update;

/**
 */
@Dao(config = ${configClassName}.class)
public interface TPresentBox71Dao {

    /**
     * @param accountId
     * @param accountOrderId
     * @return the TPresentBox71 entity
     */
    @Select
    TPresentBox71 selectById(Integer accountId, Integer accountOrderId);

    /**
     * @param entity
     * @return affected rows
     */
    @Insert
    int insert(TPresentBox71 entity);

    /**
     * @param entity
     * @return affected rows
     */
    @Update
    int update(TPresentBox71 entity);

    /**
     * @param entity
     * @return affected rows
     */
    @Delete
    int delete(TPresentBox71 entity);
}