package com.example.sample.repository;

import com.example.sample.entity.TBonusState64;
import org.seasar.doma.Dao;
import org.seasar.doma.Delete;
import org.seasar.doma.Insert;
import org.seasar.doma.Select;
import org.seasar.doma.Update;

/**
 */
@Dao(config = ${configClassName}.class)
public interface TBonusState64Dao {

    /**
     * @param accountId
     * @param bonusId
     * @return the TBonusState64 entity
     */
    @Select
    TBonusState64 selectById(Integer accountId, Integer bonusId);

    /**
     * @param entity
     * @return affected rows
     */
    @Insert
    int insert(TBonusState64 entity);

    /**
     * @param entity
     * @return affected rows
     */
    @Update
    int update(TBonusState64 entity);

    /**
     * @param entity
     * @return affected rows
     */
    @Delete
    int delete(TBonusState64 entity);
}