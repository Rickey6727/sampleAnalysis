package com.example.sample.repository;

import com.example.sample.entity.TPresentBoxLimitedTime25;
import org.seasar.doma.Dao;
import org.seasar.doma.Delete;
import org.seasar.doma.Insert;
import org.seasar.doma.Select;
import org.seasar.doma.Update;

/**
 */
@Dao(config = ${configClassName}.class)
public interface TPresentBoxLimitedTime25Dao {

    /**
     * @param accountId
     * @param accountOrderId
     * @return the TPresentBoxLimitedTime25 entity
     */
    @Select
    TPresentBoxLimitedTime25 selectById(Integer accountId, Integer accountOrderId);

    /**
     * @param entity
     * @return affected rows
     */
    @Insert
    int insert(TPresentBoxLimitedTime25 entity);

    /**
     * @param entity
     * @return affected rows
     */
    @Update
    int update(TPresentBoxLimitedTime25 entity);

    /**
     * @param entity
     * @return affected rows
     */
    @Delete
    int delete(TPresentBoxLimitedTime25 entity);
}