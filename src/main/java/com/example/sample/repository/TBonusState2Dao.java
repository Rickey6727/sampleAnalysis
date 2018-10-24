package com.example.sample.repository;

import com.example.sample.entity.TBonusState2;
import org.seasar.doma.Dao;
import org.seasar.doma.Delete;
import org.seasar.doma.Insert;
import org.seasar.doma.Select;
import org.seasar.doma.Update;

/**
 */
@Dao(config = ${configClassName}.class)
public interface TBonusState2Dao {

    /**
     * @param accountId
     * @param bonusId
     * @return the TBonusState2 entity
     */
    @Select
    TBonusState2 selectById(Integer accountId, Integer bonusId);

    /**
     * @param entity
     * @return affected rows
     */
    @Insert
    int insert(TBonusState2 entity);

    /**
     * @param entity
     * @return affected rows
     */
    @Update
    int update(TBonusState2 entity);

    /**
     * @param entity
     * @return affected rows
     */
    @Delete
    int delete(TBonusState2 entity);
}