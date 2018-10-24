package com.example.sample.repository;

import com.example.sample.entity.TBonusState58;
import org.seasar.doma.Dao;
import org.seasar.doma.Delete;
import org.seasar.doma.Insert;
import org.seasar.doma.Select;
import org.seasar.doma.Update;

/**
 */
@Dao(config = ${configClassName}.class)
public interface TBonusState58Dao {

    /**
     * @param accountId
     * @param bonusId
     * @return the TBonusState58 entity
     */
    @Select
    TBonusState58 selectById(Integer accountId, Integer bonusId);

    /**
     * @param entity
     * @return affected rows
     */
    @Insert
    int insert(TBonusState58 entity);

    /**
     * @param entity
     * @return affected rows
     */
    @Update
    int update(TBonusState58 entity);

    /**
     * @param entity
     * @return affected rows
     */
    @Delete
    int delete(TBonusState58 entity);
}