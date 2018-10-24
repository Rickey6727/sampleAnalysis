package com.example.sample.repository;

import com.example.sample.entity.TPresentBoxLimitedTime96;
import org.seasar.doma.Dao;
import org.seasar.doma.Delete;
import org.seasar.doma.Insert;
import org.seasar.doma.Select;
import org.seasar.doma.Update;

/**
 */
@Dao(config = ${configClassName}.class)
public interface TPresentBoxLimitedTime96Dao {

    /**
     * @param accountId
     * @param accountOrderId
     * @return the TPresentBoxLimitedTime96 entity
     */
    @Select
    TPresentBoxLimitedTime96 selectById(Integer accountId, Integer accountOrderId);

    /**
     * @param entity
     * @return affected rows
     */
    @Insert
    int insert(TPresentBoxLimitedTime96 entity);

    /**
     * @param entity
     * @return affected rows
     */
    @Update
    int update(TPresentBoxLimitedTime96 entity);

    /**
     * @param entity
     * @return affected rows
     */
    @Delete
    int delete(TPresentBoxLimitedTime96 entity);
}