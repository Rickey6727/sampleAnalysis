package com.example.sample.repository;

import com.example.sample.entity.TPresentBox56;
import org.seasar.doma.Dao;
import org.seasar.doma.Delete;
import org.seasar.doma.Insert;
import org.seasar.doma.Select;
import org.seasar.doma.Update;

/**
 */
@Dao(config = ${configClassName}.class)
public interface TPresentBox56Dao {

    /**
     * @param accountId
     * @param accountOrderId
     * @return the TPresentBox56 entity
     */
    @Select
    TPresentBox56 selectById(Integer accountId, Integer accountOrderId);

    /**
     * @param entity
     * @return affected rows
     */
    @Insert
    int insert(TPresentBox56 entity);

    /**
     * @param entity
     * @return affected rows
     */
    @Update
    int update(TPresentBox56 entity);

    /**
     * @param entity
     * @return affected rows
     */
    @Delete
    int delete(TPresentBox56 entity);
}