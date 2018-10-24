package com.example.sample.repository;

import com.example.sample.entity.TBlockAccount;
import org.seasar.doma.Dao;
import org.seasar.doma.Delete;
import org.seasar.doma.Insert;
import org.seasar.doma.Select;
import org.seasar.doma.Update;

/**
 */
@Dao(config = ${configClassName}.class)
public interface TBlockAccountDao {

    /**
     * @param blockerAccountId
     * @param blockedAccountId
     * @return the TBlockAccount entity
     */
    @Select
    TBlockAccount selectById(Integer blockerAccountId, Integer blockedAccountId);

    /**
     * @param entity
     * @return affected rows
     */
    @Insert
    int insert(TBlockAccount entity);

    /**
     * @param entity
     * @return affected rows
     */
    @Update
    int update(TBlockAccount entity);

    /**
     * @param entity
     * @return affected rows
     */
    @Delete
    int delete(TBlockAccount entity);
}