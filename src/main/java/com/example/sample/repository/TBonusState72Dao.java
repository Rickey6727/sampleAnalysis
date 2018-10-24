package com.example.sample.repository;

import com.example.sample.entity.TBonusState72;
import org.seasar.doma.Dao;
import org.seasar.doma.Delete;
import org.seasar.doma.Insert;
import org.seasar.doma.Select;
import org.seasar.doma.Update;

/**
 */
@Dao(config = ${configClassName}.class)
public interface TBonusState72Dao {

    /**
     * @param accountId
     * @param bonusId
     * @return the TBonusState72 entity
     */
    @Select
    TBonusState72 selectById(Integer accountId, Integer bonusId);

    /**
     * @param entity
     * @return affected rows
     */
    @Insert
    int insert(TBonusState72 entity);

    /**
     * @param entity
     * @return affected rows
     */
    @Update
    int update(TBonusState72 entity);

    /**
     * @param entity
     * @return affected rows
     */
    @Delete
    int delete(TBonusState72 entity);
}