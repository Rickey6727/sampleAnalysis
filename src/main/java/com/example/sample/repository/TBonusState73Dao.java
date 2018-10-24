package com.example.sample.repository;

import com.example.sample.entity.TBonusState73;
import org.seasar.doma.Dao;
import org.seasar.doma.Delete;
import org.seasar.doma.Insert;
import org.seasar.doma.Select;
import org.seasar.doma.Update;

/**
 */
@Dao(config = ${configClassName}.class)
public interface TBonusState73Dao {

    /**
     * @param accountId
     * @param bonusId
     * @return the TBonusState73 entity
     */
    @Select
    TBonusState73 selectById(Integer accountId, Integer bonusId);

    /**
     * @param entity
     * @return affected rows
     */
    @Insert
    int insert(TBonusState73 entity);

    /**
     * @param entity
     * @return affected rows
     */
    @Update
    int update(TBonusState73 entity);

    /**
     * @param entity
     * @return affected rows
     */
    @Delete
    int delete(TBonusState73 entity);
}