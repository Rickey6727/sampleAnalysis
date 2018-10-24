package com.example.sample.repository;

import com.example.sample.entity.TPresentBox38;
import org.seasar.doma.Dao;
import org.seasar.doma.Delete;
import org.seasar.doma.Insert;
import org.seasar.doma.Select;
import org.seasar.doma.Update;

/**
 */
@Dao(config = ${configClassName}.class)
public interface TPresentBox38Dao {

    /**
     * @param accountId
     * @param accountOrderId
     * @return the TPresentBox38 entity
     */
    @Select
    TPresentBox38 selectById(Integer accountId, Integer accountOrderId);

    /**
     * @param entity
     * @return affected rows
     */
    @Insert
    int insert(TPresentBox38 entity);

    /**
     * @param entity
     * @return affected rows
     */
    @Update
    int update(TPresentBox38 entity);

    /**
     * @param entity
     * @return affected rows
     */
    @Delete
    int delete(TPresentBox38 entity);
}