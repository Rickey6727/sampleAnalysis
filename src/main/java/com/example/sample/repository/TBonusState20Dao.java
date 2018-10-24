package com.example.sample.repository;

import com.example.sample.entity.TBonusState20;
import org.seasar.doma.Dao;
import org.seasar.doma.Delete;
import org.seasar.doma.Insert;
import org.seasar.doma.Select;
import org.seasar.doma.Update;

/**
 */
@Dao(config = ${configClassName}.class)
public interface TBonusState20Dao {

    /**
     * @param accountId
     * @param bonusId
     * @return the TBonusState20 entity
     */
    @Select
    TBonusState20 selectById(Integer accountId, Integer bonusId);

    /**
     * @param entity
     * @return affected rows
     */
    @Insert
    int insert(TBonusState20 entity);

    /**
     * @param entity
     * @return affected rows
     */
    @Update
    int update(TBonusState20 entity);

    /**
     * @param entity
     * @return affected rows
     */
    @Delete
    int delete(TBonusState20 entity);
}