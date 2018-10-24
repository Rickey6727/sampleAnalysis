package com.example.sample.repository;

import com.example.sample.entity.TBonusState7;
import org.seasar.doma.Dao;
import org.seasar.doma.Delete;
import org.seasar.doma.Insert;
import org.seasar.doma.Select;
import org.seasar.doma.Update;

/**
 */
@Dao(config = ${configClassName}.class)
public interface TBonusState7Dao {

    /**
     * @param accountId
     * @param bonusId
     * @return the TBonusState7 entity
     */
    @Select
    TBonusState7 selectById(Integer accountId, Integer bonusId);

    /**
     * @param entity
     * @return affected rows
     */
    @Insert
    int insert(TBonusState7 entity);

    /**
     * @param entity
     * @return affected rows
     */
    @Update
    int update(TBonusState7 entity);

    /**
     * @param entity
     * @return affected rows
     */
    @Delete
    int delete(TBonusState7 entity);
}