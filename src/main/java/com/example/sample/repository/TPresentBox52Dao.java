package com.example.sample.repository;

import com.example.sample.entity.TPresentBox52;
import org.seasar.doma.Dao;
import org.seasar.doma.Delete;
import org.seasar.doma.Insert;
import org.seasar.doma.Select;
import org.seasar.doma.Update;

/**
 */
@Dao(config = ${configClassName}.class)
public interface TPresentBox52Dao {

    /**
     * @param accountId
     * @param accountOrderId
     * @return the TPresentBox52 entity
     */
    @Select
    TPresentBox52 selectById(Integer accountId, Integer accountOrderId);

    /**
     * @param entity
     * @return affected rows
     */
    @Insert
    int insert(TPresentBox52 entity);

    /**
     * @param entity
     * @return affected rows
     */
    @Update
    int update(TPresentBox52 entity);

    /**
     * @param entity
     * @return affected rows
     */
    @Delete
    int delete(TPresentBox52 entity);
}