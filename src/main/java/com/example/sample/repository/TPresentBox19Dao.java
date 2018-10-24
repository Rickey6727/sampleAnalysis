package com.example.sample.repository;

import com.example.sample.entity.TPresentBox19;
import org.seasar.doma.Dao;
import org.seasar.doma.Delete;
import org.seasar.doma.Insert;
import org.seasar.doma.Select;
import org.seasar.doma.Update;

/**
 */
@Dao(config = ${configClassName}.class)
public interface TPresentBox19Dao {

    /**
     * @param accountId
     * @param accountOrderId
     * @return the TPresentBox19 entity
     */
    @Select
    TPresentBox19 selectById(Integer accountId, Integer accountOrderId);

    /**
     * @param entity
     * @return affected rows
     */
    @Insert
    int insert(TPresentBox19 entity);

    /**
     * @param entity
     * @return affected rows
     */
    @Update
    int update(TPresentBox19 entity);

    /**
     * @param entity
     * @return affected rows
     */
    @Delete
    int delete(TPresentBox19 entity);
}