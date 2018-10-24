package com.example.sample.repository;

import com.example.sample.entity.TBonusState26;
import org.seasar.doma.Dao;
import org.seasar.doma.Delete;
import org.seasar.doma.Insert;
import org.seasar.doma.Select;
import org.seasar.doma.Update;

/**
 */
@Dao(config = ${configClassName}.class)
public interface TBonusState26Dao {

    /**
     * @param accountId
     * @param bonusId
     * @return the TBonusState26 entity
     */
    @Select
    TBonusState26 selectById(Integer accountId, Integer bonusId);

    /**
     * @param entity
     * @return affected rows
     */
    @Insert
    int insert(TBonusState26 entity);

    /**
     * @param entity
     * @return affected rows
     */
    @Update
    int update(TBonusState26 entity);

    /**
     * @param entity
     * @return affected rows
     */
    @Delete
    int delete(TBonusState26 entity);
}