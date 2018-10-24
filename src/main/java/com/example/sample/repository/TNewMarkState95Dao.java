package com.example.sample.repository;

import com.example.sample.entity.TNewMarkState95;
import org.seasar.doma.Dao;
import org.seasar.doma.Delete;
import org.seasar.doma.Insert;
import org.seasar.doma.Select;
import org.seasar.doma.Update;

/**
 */
@Dao(config = ${configClassName}.class)
public interface TNewMarkState95Dao {

    /**
     * @param accountId
     * @param screenId
     * @param tabId
     * @return the TNewMarkState95 entity
     */
    @Select
    TNewMarkState95 selectById(Integer accountId, Integer screenId, Integer tabId);

    /**
     * @param entity
     * @return affected rows
     */
    @Insert
    int insert(TNewMarkState95 entity);

    /**
     * @param entity
     * @return affected rows
     */
    @Update
    int update(TNewMarkState95 entity);

    /**
     * @param entity
     * @return affected rows
     */
    @Delete
    int delete(TNewMarkState95 entity);
}