package com.example.sample.repository;

import com.example.sample.entity.TPresentBoxLimitedTime59;
import org.seasar.doma.Dao;
import org.seasar.doma.Delete;
import org.seasar.doma.Insert;
import org.seasar.doma.Select;
import org.seasar.doma.Update;

/**
 */
@Dao(config = ${configClassName}.class)
public interface TPresentBoxLimitedTime59Dao {

    /**
     * @param accountId
     * @param accountOrderId
     * @return the TPresentBoxLimitedTime59 entity
     */
    @Select
    TPresentBoxLimitedTime59 selectById(Integer accountId, Integer accountOrderId);

    /**
     * @param entity
     * @return affected rows
     */
    @Insert
    int insert(TPresentBoxLimitedTime59 entity);

    /**
     * @param entity
     * @return affected rows
     */
    @Update
    int update(TPresentBoxLimitedTime59 entity);

    /**
     * @param entity
     * @return affected rows
     */
    @Delete
    int delete(TPresentBoxLimitedTime59 entity);
}