package com.example.sample.repository;

import com.example.sample.entity.TPresentBox91;
import org.seasar.doma.Dao;
import org.seasar.doma.Delete;
import org.seasar.doma.Insert;
import org.seasar.doma.Select;
import org.seasar.doma.Update;

/**
 */
@Dao(config = ${configClassName}.class)
public interface TPresentBox91Dao {

    /**
     * @param accountId
     * @param accountOrderId
     * @return the TPresentBox91 entity
     */
    @Select
    TPresentBox91 selectById(Integer accountId, Integer accountOrderId);

    /**
     * @param entity
     * @return affected rows
     */
    @Insert
    int insert(TPresentBox91 entity);

    /**
     * @param entity
     * @return affected rows
     */
    @Update
    int update(TPresentBox91 entity);

    /**
     * @param entity
     * @return affected rows
     */
    @Delete
    int delete(TPresentBox91 entity);
}