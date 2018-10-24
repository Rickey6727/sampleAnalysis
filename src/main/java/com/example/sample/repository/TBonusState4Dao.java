package com.example.sample.repository;

import com.example.sample.entity.TBonusState4;
import org.seasar.doma.Dao;
import org.seasar.doma.Delete;
import org.seasar.doma.Insert;
import org.seasar.doma.Select;
import org.seasar.doma.Update;

/**
 */
@Dao(config = ${configClassName}.class)
public interface TBonusState4Dao {

    /**
     * @param accountId
     * @param bonusId
     * @return the TBonusState4 entity
     */
    @Select
    TBonusState4 selectById(Integer accountId, Integer bonusId);

    /**
     * @param entity
     * @return affected rows
     */
    @Insert
    int insert(TBonusState4 entity);

    /**
     * @param entity
     * @return affected rows
     */
    @Update
    int update(TBonusState4 entity);

    /**
     * @param entity
     * @return affected rows
     */
    @Delete
    int delete(TBonusState4 entity);
}