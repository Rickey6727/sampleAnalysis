package com.example.sample.repository;

import com.example.sample.entity.TPresentBox29;
import org.seasar.doma.Dao;
import org.seasar.doma.Delete;
import org.seasar.doma.Insert;
import org.seasar.doma.Select;
import org.seasar.doma.Update;

/**
 */
@Dao(config = ${configClassName}.class)
public interface TPresentBox29Dao {

    /**
     * @param accountId
     * @param accountOrderId
     * @return the TPresentBox29 entity
     */
    @Select
    TPresentBox29 selectById(Integer accountId, Integer accountOrderId);

    /**
     * @param entity
     * @return affected rows
     */
    @Insert
    int insert(TPresentBox29 entity);

    /**
     * @param entity
     * @return affected rows
     */
    @Update
    int update(TPresentBox29 entity);

    /**
     * @param entity
     * @return affected rows
     */
    @Delete
    int delete(TPresentBox29 entity);
}