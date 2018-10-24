package com.example.sample.repository;

import com.example.sample.entity.TLogin;
import org.seasar.doma.Dao;
import org.seasar.doma.Delete;
import org.seasar.doma.Insert;
import org.seasar.doma.Select;
import org.seasar.doma.Update;

/**
 */
@Dao(config = ${configClassName}.class)
public interface TLoginDao {

    /**
     * @param accountId
     * @return the TLogin entity
     */
    @Select
    TLogin selectById(Integer accountId);

    /**
     * @param entity
     * @return affected rows
     */
    @Insert
    int insert(TLogin entity);

    /**
     * @param entity
     * @return affected rows
     */
    @Update
    int update(TLogin entity);

    /**
     * @param entity
     * @return affected rows
     */
    @Delete
    int delete(TLogin entity);
}