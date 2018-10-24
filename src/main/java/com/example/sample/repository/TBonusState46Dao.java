package com.example.sample.repository;

import com.example.sample.entity.TBonusState46;
import org.seasar.doma.Dao;
import org.seasar.doma.Delete;
import org.seasar.doma.Insert;
import org.seasar.doma.Select;
import org.seasar.doma.Update;

/**
 */
@Dao(config = ${configClassName}.class)
public interface TBonusState46Dao {

    /**
     * @param accountId
     * @param bonusId
     * @return the TBonusState46 entity
     */
    @Select
    TBonusState46 selectById(Integer accountId, Integer bonusId);

    /**
     * @param entity
     * @return affected rows
     */
    @Insert
    int insert(TBonusState46 entity);

    /**
     * @param entity
     * @return affected rows
     */
    @Update
    int update(TBonusState46 entity);

    /**
     * @param entity
     * @return affected rows
     */
    @Delete
    int delete(TBonusState46 entity);
}