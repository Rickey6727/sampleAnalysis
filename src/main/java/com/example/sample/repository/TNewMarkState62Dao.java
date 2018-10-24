package com.example.sample.repository;

import com.example.sample.entity.TNewMarkState62;
import org.seasar.doma.Dao;
import org.seasar.doma.Delete;
import org.seasar.doma.Insert;
import org.seasar.doma.Select;
import org.seasar.doma.Update;

/**
 */
@Dao(config = ${configClassName}.class)
public interface TNewMarkState62Dao {

    /**
     * @param accountId
     * @param screenId
     * @param tabId
     * @return the TNewMarkState62 entity
     */
    @Select
    TNewMarkState62 selectById(Integer accountId, Integer screenId, Integer tabId);

    /**
     * @param entity
     * @return affected rows
     */
    @Insert
    int insert(TNewMarkState62 entity);

    /**
     * @param entity
     * @return affected rows
     */
    @Update
    int update(TNewMarkState62 entity);

    /**
     * @param entity
     * @return affected rows
     */
    @Delete
    int delete(TNewMarkState62 entity);
}