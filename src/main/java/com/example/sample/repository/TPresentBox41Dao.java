package com.example.sample.repository;

import com.example.sample.entity.TPresentBox41;
import org.seasar.doma.Dao;
import org.seasar.doma.Delete;
import org.seasar.doma.Insert;
import org.seasar.doma.Select;
import org.seasar.doma.Update;

/**
 */
@Dao(config = ${configClassName}.class)
public interface TPresentBox41Dao {

    /**
     * @param accountId
     * @param accountOrderId
     * @return the TPresentBox41 entity
     */
    @Select
    TPresentBox41 selectById(Integer accountId, Integer accountOrderId);

    /**
     * @param entity
     * @return affected rows
     */
    @Insert
    int insert(TPresentBox41 entity);

    /**
     * @param entity
     * @return affected rows
     */
    @Update
    int update(TPresentBox41 entity);

    /**
     * @param entity
     * @return affected rows
     */
    @Delete
    int delete(TPresentBox41 entity);
}