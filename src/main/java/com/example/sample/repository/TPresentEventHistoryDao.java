package com.example.sample.repository;

import com.example.sample.entity.TPresentEventHistory;
import org.seasar.doma.Dao;
import org.seasar.doma.Delete;
import org.seasar.doma.Insert;
import org.seasar.doma.Select;
import org.seasar.doma.Update;

/**
 */
@Dao(config = ${configClassName}.class)
public interface TPresentEventHistoryDao {

    /**
     * @param eventId
     * @param tAccountId
     * @param fAccountId
     * @return the TPresentEventHistory entity
     */
    @Select
    TPresentEventHistory selectById(Integer eventId, Integer tAccountId, Integer fAccountId);

    /**
     * @param entity
     * @return affected rows
     */
    @Insert
    int insert(TPresentEventHistory entity);

    /**
     * @param entity
     * @return affected rows
     */
    @Update
    int update(TPresentEventHistory entity);

    /**
     * @param entity
     * @return affected rows
     */
    @Delete
    int delete(TPresentEventHistory entity);
}