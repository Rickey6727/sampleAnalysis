package com.example.sample.repository;

import com.example.sample.entity.TPresentEventMessageHistory;
import org.seasar.doma.Dao;
import org.seasar.doma.Delete;
import org.seasar.doma.Insert;
import org.seasar.doma.Select;
import org.seasar.doma.Update;

/**
 */
@Dao(config = ${configClassName}.class)
public interface TPresentEventMessageHistoryDao {

    /**
     * @param serialId
     * @return the TPresentEventMessageHistory entity
     */
    @Select
    TPresentEventMessageHistory selectById(Long serialId);

    /**
     * @param entity
     * @return affected rows
     */
    @Insert
    int insert(TPresentEventMessageHistory entity);

    /**
     * @param entity
     * @return affected rows
     */
    @Update
    int update(TPresentEventMessageHistory entity);

    /**
     * @param entity
     * @return affected rows
     */
    @Delete
    int delete(TPresentEventMessageHistory entity);
}