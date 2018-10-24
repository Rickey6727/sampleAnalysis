package com.example.sample.repository;

import com.example.sample.entity.TNewMarkState98;
import org.seasar.doma.Dao;
import org.seasar.doma.Delete;
import org.seasar.doma.Insert;
import org.seasar.doma.Select;
import org.seasar.doma.Update;

/**
 */
@Dao(config = ${configClassName}.class)
public interface TNewMarkState98Dao {

    /**
     * @param accountId
     * @param screenId
     * @param tabId
     * @return the TNewMarkState98 entity
     */
    @Select
    TNewMarkState98 selectById(Integer accountId, Integer screenId, Integer tabId);

    /**
     * @param entity
     * @return affected rows
     */
    @Insert
    int insert(TNewMarkState98 entity);

    /**
     * @param entity
     * @return affected rows
     */
    @Update
    int update(TNewMarkState98 entity);

    /**
     * @param entity
     * @return affected rows
     */
    @Delete
    int delete(TNewMarkState98 entity);
}