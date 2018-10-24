package com.example.sample.repository;

import com.example.sample.entity.TPresentBox45;
import org.seasar.doma.Dao;
import org.seasar.doma.Delete;
import org.seasar.doma.Insert;
import org.seasar.doma.Select;
import org.seasar.doma.Update;

/**
 */
@Dao(config = ${configClassName}.class)
public interface TPresentBox45Dao {

    /**
     * @param accountId
     * @param accountOrderId
     * @return the TPresentBox45 entity
     */
    @Select
    TPresentBox45 selectById(Integer accountId, Integer accountOrderId);

    /**
     * @param entity
     * @return affected rows
     */
    @Insert
    int insert(TPresentBox45 entity);

    /**
     * @param entity
     * @return affected rows
     */
    @Update
    int update(TPresentBox45 entity);

    /**
     * @param entity
     * @return affected rows
     */
    @Delete
    int delete(TPresentBox45 entity);
}