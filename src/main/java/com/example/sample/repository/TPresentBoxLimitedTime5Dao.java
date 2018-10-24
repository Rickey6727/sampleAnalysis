package com.example.sample.repository;

import com.example.sample.entity.TPresentBoxLimitedTime5;
import org.seasar.doma.Dao;
import org.seasar.doma.Delete;
import org.seasar.doma.Insert;
import org.seasar.doma.Select;
import org.seasar.doma.Update;

/**
 */
@Dao(config = ${configClassName}.class)
public interface TPresentBoxLimitedTime5Dao {

    /**
     * @param accountId
     * @param accountOrderId
     * @return the TPresentBoxLimitedTime5 entity
     */
    @Select
    TPresentBoxLimitedTime5 selectById(Integer accountId, Integer accountOrderId);

    /**
     * @param entity
     * @return affected rows
     */
    @Insert
    int insert(TPresentBoxLimitedTime5 entity);

    /**
     * @param entity
     * @return affected rows
     */
    @Update
    int update(TPresentBoxLimitedTime5 entity);

    /**
     * @param entity
     * @return affected rows
     */
    @Delete
    int delete(TPresentBoxLimitedTime5 entity);
}