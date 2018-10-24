package com.example.sample.repository;

import com.example.sample.entity.TBonusState92;
import org.seasar.doma.Dao;
import org.seasar.doma.Delete;
import org.seasar.doma.Insert;
import org.seasar.doma.Select;
import org.seasar.doma.Update;

/**
 */
@Dao(config = ${configClassName}.class)
public interface TBonusState92Dao {

    /**
     * @param accountId
     * @param bonusId
     * @return the TBonusState92 entity
     */
    @Select
    TBonusState92 selectById(Integer accountId, Integer bonusId);

    /**
     * @param entity
     * @return affected rows
     */
    @Insert
    int insert(TBonusState92 entity);

    /**
     * @param entity
     * @return affected rows
     */
    @Update
    int update(TBonusState92 entity);

    /**
     * @param entity
     * @return affected rows
     */
    @Delete
    int delete(TBonusState92 entity);
}