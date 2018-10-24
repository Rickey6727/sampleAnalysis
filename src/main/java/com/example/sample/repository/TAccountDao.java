package com.example.sample.repository;

import com.example.sample.entity.TAccount;
import org.seasar.doma.Dao;
import org.seasar.doma.Delete;
import org.seasar.doma.Insert;
import org.seasar.doma.Select;
import org.seasar.doma.Update;

/**
 */
@Dao(config = ${configClassName}.class)
public interface TAccountDao {

    /**
     * @param accountId
     * @return the TAccount entity
     */
    @Select
    TAccount selectById(Integer accountId);

    /**
     * @param entity
     * @return affected rows
     */
    @Insert
    int insert(TAccount entity);

    /**
     * @param entity
     * @return affected rows
     */
    @Update
    int update(TAccount entity);

    /**
     * @param entity
     * @return affected rows
     */
    @Delete
    int delete(TAccount entity);
}