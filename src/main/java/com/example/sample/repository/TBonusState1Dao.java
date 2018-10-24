package com.example.sample.repository;

import com.example.sample.entity.TBonusState1;
import org.seasar.doma.Dao;
import org.seasar.doma.Delete;
import org.seasar.doma.Insert;
import org.seasar.doma.Select;
import org.seasar.doma.Update;

/**
 */
@Dao(config = ${configClassName}.class)
public interface TBonusState1Dao {

    /**
     * @param accountId
     * @param bonusId
     * @return the TBonusState1 entity
     */
    @Select
    TBonusState1 selectById(Integer accountId, Integer bonusId);

    /**
     * @param entity
     * @return affected rows
     */
    @Insert
    int insert(TBonusState1 entity);

    /**
     * @param entity
     * @return affected rows
     */
    @Update
    int update(TBonusState1 entity);

    /**
     * @param entity
     * @return affected rows
     */
    @Delete
    int delete(TBonusState1 entity);
}