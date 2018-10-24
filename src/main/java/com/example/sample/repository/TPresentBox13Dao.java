package com.example.sample.repository;

import com.example.sample.entity.TPresentBox13;
import org.seasar.doma.Dao;
import org.seasar.doma.Delete;
import org.seasar.doma.Insert;
import org.seasar.doma.Select;
import org.seasar.doma.Update;

/**
 */
@Dao(config = ${configClassName}.class)
public interface TPresentBox13Dao {

    /**
     * @param accountId
     * @param accountOrderId
     * @return the TPresentBox13 entity
     */
    @Select
    TPresentBox13 selectById(Integer accountId, Integer accountOrderId);

    /**
     * @param entity
     * @return affected rows
     */
    @Insert
    int insert(TPresentBox13 entity);

    /**
     * @param entity
     * @return affected rows
     */
    @Update
    int update(TPresentBox13 entity);

    /**
     * @param entity
     * @return affected rows
     */
    @Delete
    int delete(TPresentBox13 entity);
}