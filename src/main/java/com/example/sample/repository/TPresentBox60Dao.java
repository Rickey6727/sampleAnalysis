package com.example.sample.repository;

import com.example.sample.entity.TPresentBox60;
import org.seasar.doma.Dao;
import org.seasar.doma.Delete;
import org.seasar.doma.Insert;
import org.seasar.doma.Select;
import org.seasar.doma.Update;

/**
 */
@Dao(config = ${configClassName}.class)
public interface TPresentBox60Dao {

    /**
     * @param accountId
     * @param accountOrderId
     * @return the TPresentBox60 entity
     */
    @Select
    TPresentBox60 selectById(Integer accountId, Integer accountOrderId);

    /**
     * @param entity
     * @return affected rows
     */
    @Insert
    int insert(TPresentBox60 entity);

    /**
     * @param entity
     * @return affected rows
     */
    @Update
    int update(TPresentBox60 entity);

    /**
     * @param entity
     * @return affected rows
     */
    @Delete
    int delete(TPresentBox60 entity);
}