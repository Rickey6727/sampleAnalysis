package com.example.sample.repository;

import com.example.sample.entity.TBonusState66;
import org.seasar.doma.Dao;
import org.seasar.doma.Delete;
import org.seasar.doma.Insert;
import org.seasar.doma.Select;
import org.seasar.doma.Update;

/**
 */
@Dao(config = ${configClassName}.class)
public interface TBonusState66Dao {

    /**
     * @param accountId
     * @param bonusId
     * @return the TBonusState66 entity
     */
    @Select
    TBonusState66 selectById(Integer accountId, Integer bonusId);

    /**
     * @param entity
     * @return affected rows
     */
    @Insert
    int insert(TBonusState66 entity);

    /**
     * @param entity
     * @return affected rows
     */
    @Update
    int update(TBonusState66 entity);

    /**
     * @param entity
     * @return affected rows
     */
    @Delete
    int delete(TBonusState66 entity);
}