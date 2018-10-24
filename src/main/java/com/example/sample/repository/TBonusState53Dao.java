package com.example.sample.repository;

import com.example.sample.entity.TBonusState53;
import org.seasar.doma.Dao;
import org.seasar.doma.Delete;
import org.seasar.doma.Insert;
import org.seasar.doma.Select;
import org.seasar.doma.Update;

/**
 */
@Dao(config = ${configClassName}.class)
public interface TBonusState53Dao {

    /**
     * @param accountId
     * @param bonusId
     * @return the TBonusState53 entity
     */
    @Select
    TBonusState53 selectById(Integer accountId, Integer bonusId);

    /**
     * @param entity
     * @return affected rows
     */
    @Insert
    int insert(TBonusState53 entity);

    /**
     * @param entity
     * @return affected rows
     */
    @Update
    int update(TBonusState53 entity);

    /**
     * @param entity
     * @return affected rows
     */
    @Delete
    int delete(TBonusState53 entity);
}