package com.example.sample.repository;

import com.example.sample.entity.TPresentHistory;
import org.seasar.doma.Dao;
import org.seasar.doma.Delete;
import org.seasar.doma.Insert;
import org.seasar.doma.Select;
import org.seasar.doma.Update;

/**
 */
@Dao(config = ${configClassName}.class)
public interface TPresentHistoryDao {

    /**
     * @param serialId
     * @return the TPresentHistory entity
     */
    @Select
    TPresentHistory selectById(Long serialId);

    /**
     * @param entity
     * @return affected rows
     */
    @Insert
    int insert(TPresentHistory entity);

    /**
     * @param entity
     * @return affected rows
     */
    @Update
    int update(TPresentHistory entity);

    /**
     * @param entity
     * @return affected rows
     */
    @Delete
    int delete(TPresentHistory entity);
}