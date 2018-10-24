package com.example.sample.repository;

import com.example.sample.entity.TBonusState30;
import org.seasar.doma.Dao;
import org.seasar.doma.Delete;
import org.seasar.doma.Insert;
import org.seasar.doma.Select;
import org.seasar.doma.Update;

/**
 */
@Dao(config = ${configClassName}.class)
public interface TBonusState30Dao {

    /**
     * @param accountId
     * @param bonusId
     * @return the TBonusState30 entity
     */
    @Select
    TBonusState30 selectById(Integer accountId, Integer bonusId);

    /**
     * @param entity
     * @return affected rows
     */
    @Insert
    int insert(TBonusState30 entity);

    /**
     * @param entity
     * @return affected rows
     */
    @Update
    int update(TBonusState30 entity);

    /**
     * @param entity
     * @return affected rows
     */
    @Delete
    int delete(TBonusState30 entity);
}