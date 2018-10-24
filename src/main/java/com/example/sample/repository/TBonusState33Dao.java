package com.example.sample.repository;

import com.example.sample.entity.TBonusState33;
import org.seasar.doma.Dao;
import org.seasar.doma.Delete;
import org.seasar.doma.Insert;
import org.seasar.doma.Select;
import org.seasar.doma.Update;

/**
 */
@Dao(config = ${configClassName}.class)
public interface TBonusState33Dao {

    /**
     * @param accountId
     * @param bonusId
     * @return the TBonusState33 entity
     */
    @Select
    TBonusState33 selectById(Integer accountId, Integer bonusId);

    /**
     * @param entity
     * @return affected rows
     */
    @Insert
    int insert(TBonusState33 entity);

    /**
     * @param entity
     * @return affected rows
     */
    @Update
    int update(TBonusState33 entity);

    /**
     * @param entity
     * @return affected rows
     */
    @Delete
    int delete(TBonusState33 entity);
}