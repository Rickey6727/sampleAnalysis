package com.example.sample.repository;

import com.example.sample.entity.TPresentBoxLimitedTime66;
import org.seasar.doma.Dao;
import org.seasar.doma.Delete;
import org.seasar.doma.Insert;
import org.seasar.doma.Select;
import org.seasar.doma.Update;

/**
 */
@Dao(config = ${configClassName}.class)
public interface TPresentBoxLimitedTime66Dao {

    /**
     * @param accountId
     * @param accountOrderId
     * @return the TPresentBoxLimitedTime66 entity
     */
    @Select
    TPresentBoxLimitedTime66 selectById(Integer accountId, Integer accountOrderId);

    /**
     * @param entity
     * @return affected rows
     */
    @Insert
    int insert(TPresentBoxLimitedTime66 entity);

    /**
     * @param entity
     * @return affected rows
     */
    @Update
    int update(TPresentBoxLimitedTime66 entity);

    /**
     * @param entity
     * @return affected rows
     */
    @Delete
    int delete(TPresentBoxLimitedTime66 entity);
}