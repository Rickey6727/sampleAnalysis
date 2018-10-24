package com.example.sample.repository;

import com.example.sample.entity.TBonusState11;
import org.seasar.doma.Dao;
import org.seasar.doma.Delete;
import org.seasar.doma.Insert;
import org.seasar.doma.Select;
import org.seasar.doma.Update;

/**
 */
@Dao(config = ${configClassName}.class)
public interface TBonusState11Dao {

    /**
     * @param accountId
     * @param bonusId
     * @return the TBonusState11 entity
     */
    @Select
    TBonusState11 selectById(Integer accountId, Integer bonusId);

    /**
     * @param entity
     * @return affected rows
     */
    @Insert
    int insert(TBonusState11 entity);

    /**
     * @param entity
     * @return affected rows
     */
    @Update
    int update(TBonusState11 entity);

    /**
     * @param entity
     * @return affected rows
     */
    @Delete
    int delete(TBonusState11 entity);
}