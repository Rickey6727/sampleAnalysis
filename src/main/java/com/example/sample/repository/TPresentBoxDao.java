package com.example.sample.repository;

import com.example.sample.entity.TPresentBox;
import org.seasar.doma.Dao;
import org.seasar.doma.Delete;
import org.seasar.doma.Insert;
import org.seasar.doma.Select;
import org.seasar.doma.Update;

/**
 */
@Dao(config = ${configClassName}.class)
public interface TPresentBoxDao {

    /**
     * @param accountId
     * @param accountOrderId
     * @return the TPresentBox entity
     */
    @Select
    TPresentBox selectById(Integer accountId, Integer accountOrderId);

    /**
     * @param entity
     * @return affected rows
     */
    @Insert
    int insert(TPresentBox entity);

    /**
     * @param entity
     * @return affected rows
     */
    @Update
    int update(TPresentBox entity);

    /**
     * @param entity
     * @return affected rows
     */
    @Delete
    int delete(TPresentBox entity);
}