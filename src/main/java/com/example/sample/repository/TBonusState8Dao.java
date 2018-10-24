package com.example.sample.repository;

import com.example.sample.entity.TBonusState8;
import org.seasar.doma.Dao;
import org.seasar.doma.Delete;
import org.seasar.doma.Insert;
import org.seasar.doma.Select;
import org.seasar.doma.Update;

/**
 */
@Dao(config = ${configClassName}.class)
public interface TBonusState8Dao {

    /**
     * @param accountId
     * @param bonusId
     * @return the TBonusState8 entity
     */
    @Select
    TBonusState8 selectById(Integer accountId, Integer bonusId);

    /**
     * @param entity
     * @return affected rows
     */
    @Insert
    int insert(TBonusState8 entity);

    /**
     * @param entity
     * @return affected rows
     */
    @Update
    int update(TBonusState8 entity);

    /**
     * @param entity
     * @return affected rows
     */
    @Delete
    int delete(TBonusState8 entity);
}