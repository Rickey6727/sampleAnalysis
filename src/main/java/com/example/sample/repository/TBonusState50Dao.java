package com.example.sample.repository;

import com.example.sample.entity.TBonusState50;
import org.seasar.doma.Dao;
import org.seasar.doma.Delete;
import org.seasar.doma.Insert;
import org.seasar.doma.Select;
import org.seasar.doma.Update;

/**
 */
@Dao(config = ${configClassName}.class)
public interface TBonusState50Dao {

    /**
     * @param accountId
     * @param bonusId
     * @return the TBonusState50 entity
     */
    @Select
    TBonusState50 selectById(Integer accountId, Integer bonusId);

    /**
     * @param entity
     * @return affected rows
     */
    @Insert
    int insert(TBonusState50 entity);

    /**
     * @param entity
     * @return affected rows
     */
    @Update
    int update(TBonusState50 entity);

    /**
     * @param entity
     * @return affected rows
     */
    @Delete
    int delete(TBonusState50 entity);
}