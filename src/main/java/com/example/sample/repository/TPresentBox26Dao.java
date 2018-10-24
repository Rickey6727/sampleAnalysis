package com.example.sample.repository;

import com.example.sample.entity.TPresentBox26;
import org.seasar.doma.Dao;
import org.seasar.doma.Delete;
import org.seasar.doma.Insert;
import org.seasar.doma.Select;
import org.seasar.doma.Update;

/**
 */
@Dao(config = ${configClassName}.class)
public interface TPresentBox26Dao {

    /**
     * @param accountId
     * @param accountOrderId
     * @return the TPresentBox26 entity
     */
    @Select
    TPresentBox26 selectById(Integer accountId, Integer accountOrderId);

    /**
     * @param entity
     * @return affected rows
     */
    @Insert
    int insert(TPresentBox26 entity);

    /**
     * @param entity
     * @return affected rows
     */
    @Update
    int update(TPresentBox26 entity);

    /**
     * @param entity
     * @return affected rows
     */
    @Delete
    int delete(TPresentBox26 entity);
}