package com.example.sample.repository;

import com.example.sample.entity.TBonusState9;
import org.seasar.doma.Dao;
import org.seasar.doma.Delete;
import org.seasar.doma.Insert;
import org.seasar.doma.Select;
import org.seasar.doma.Update;

/**
 */
@Dao(config = ${configClassName}.class)
public interface TBonusState9Dao {

    /**
     * @param accountId
     * @param bonusId
     * @return the TBonusState9 entity
     */
    @Select
    TBonusState9 selectById(Integer accountId, Integer bonusId);

    /**
     * @param entity
     * @return affected rows
     */
    @Insert
    int insert(TBonusState9 entity);

    /**
     * @param entity
     * @return affected rows
     */
    @Update
    int update(TBonusState9 entity);

    /**
     * @param entity
     * @return affected rows
     */
    @Delete
    int delete(TBonusState9 entity);
}