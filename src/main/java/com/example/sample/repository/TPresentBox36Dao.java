package com.example.sample.repository;

import com.example.sample.entity.TPresentBox36;
import org.seasar.doma.Dao;
import org.seasar.doma.Delete;
import org.seasar.doma.Insert;
import org.seasar.doma.Select;
import org.seasar.doma.Update;

/**
 */
@Dao(config = ${configClassName}.class)
public interface TPresentBox36Dao {

    /**
     * @param accountId
     * @param accountOrderId
     * @return the TPresentBox36 entity
     */
    @Select
    TPresentBox36 selectById(Integer accountId, Integer accountOrderId);

    /**
     * @param entity
     * @return affected rows
     */
    @Insert
    int insert(TPresentBox36 entity);

    /**
     * @param entity
     * @return affected rows
     */
    @Update
    int update(TPresentBox36 entity);

    /**
     * @param entity
     * @return affected rows
     */
    @Delete
    int delete(TPresentBox36 entity);
}