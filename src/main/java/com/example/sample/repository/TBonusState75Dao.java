package com.example.sample.repository;

import com.example.sample.entity.TBonusState75;
import org.seasar.doma.Dao;
import org.seasar.doma.Delete;
import org.seasar.doma.Insert;
import org.seasar.doma.Select;
import org.seasar.doma.Update;

/**
 */
@Dao(config = ${configClassName}.class)
public interface TBonusState75Dao {

    /**
     * @param accountId
     * @param bonusId
     * @return the TBonusState75 entity
     */
    @Select
    TBonusState75 selectById(Integer accountId, Integer bonusId);

    /**
     * @param entity
     * @return affected rows
     */
    @Insert
    int insert(TBonusState75 entity);

    /**
     * @param entity
     * @return affected rows
     */
    @Update
    int update(TBonusState75 entity);

    /**
     * @param entity
     * @return affected rows
     */
    @Delete
    int delete(TBonusState75 entity);
}