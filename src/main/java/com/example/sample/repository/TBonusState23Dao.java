package com.example.sample.repository;

import com.example.sample.entity.TBonusState23;
import org.seasar.doma.Dao;
import org.seasar.doma.Delete;
import org.seasar.doma.Insert;
import org.seasar.doma.Select;
import org.seasar.doma.Update;

/**
 */
@Dao(config = ${configClassName}.class)
public interface TBonusState23Dao {

    /**
     * @param accountId
     * @param bonusId
     * @return the TBonusState23 entity
     */
    @Select
    TBonusState23 selectById(Integer accountId, Integer bonusId);

    /**
     * @param entity
     * @return affected rows
     */
    @Insert
    int insert(TBonusState23 entity);

    /**
     * @param entity
     * @return affected rows
     */
    @Update
    int update(TBonusState23 entity);

    /**
     * @param entity
     * @return affected rows
     */
    @Delete
    int delete(TBonusState23 entity);
}