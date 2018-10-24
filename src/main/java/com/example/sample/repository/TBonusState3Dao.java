package com.example.sample.repository;

import com.example.sample.entity.TBonusState3;
import org.seasar.doma.Dao;
import org.seasar.doma.Delete;
import org.seasar.doma.Insert;
import org.seasar.doma.Select;
import org.seasar.doma.Update;

/**
 */
@Dao(config = ${configClassName}.class)
public interface TBonusState3Dao {

    /**
     * @param accountId
     * @param bonusId
     * @return the TBonusState3 entity
     */
    @Select
    TBonusState3 selectById(Integer accountId, Integer bonusId);

    /**
     * @param entity
     * @return affected rows
     */
    @Insert
    int insert(TBonusState3 entity);

    /**
     * @param entity
     * @return affected rows
     */
    @Update
    int update(TBonusState3 entity);

    /**
     * @param entity
     * @return affected rows
     */
    @Delete
    int delete(TBonusState3 entity);
}