package com.example.sample.repository;

import com.example.sample.entity.TNewMarkState19;
import org.seasar.doma.Dao;
import org.seasar.doma.Delete;
import org.seasar.doma.Insert;
import org.seasar.doma.Select;
import org.seasar.doma.Update;

/**
 */
@Dao(config = ${configClassName}.class)
public interface TNewMarkState19Dao {

    /**
     * @param accountId
     * @param screenId
     * @param tabId
     * @return the TNewMarkState19 entity
     */
    @Select
    TNewMarkState19 selectById(Integer accountId, Integer screenId, Integer tabId);

    /**
     * @param entity
     * @return affected rows
     */
    @Insert
    int insert(TNewMarkState19 entity);

    /**
     * @param entity
     * @return affected rows
     */
    @Update
    int update(TNewMarkState19 entity);

    /**
     * @param entity
     * @return affected rows
     */
    @Delete
    int delete(TNewMarkState19 entity);
}