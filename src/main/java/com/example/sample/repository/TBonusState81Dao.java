package com.example.sample.repository;

import com.example.sample.entity.TBonusState81;
import org.seasar.doma.Dao;
import org.seasar.doma.Delete;
import org.seasar.doma.Insert;
import org.seasar.doma.Select;
import org.seasar.doma.Update;

/**
 */
@Dao(config = ${configClassName}.class)
public interface TBonusState81Dao {

    /**
     * @param accountId
     * @param bonusId
     * @return the TBonusState81 entity
     */
    @Select
    TBonusState81 selectById(Integer accountId, Integer bonusId);

    /**
     * @param entity
     * @return affected rows
     */
    @Insert
    int insert(TBonusState81 entity);

    /**
     * @param entity
     * @return affected rows
     */
    @Update
    int update(TBonusState81 entity);

    /**
     * @param entity
     * @return affected rows
     */
    @Delete
    int delete(TBonusState81 entity);
}