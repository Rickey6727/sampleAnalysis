package com.example.sample.repository;

import com.example.sample.entity.TBonusState6;
import org.seasar.doma.Dao;
import org.seasar.doma.Delete;
import org.seasar.doma.Insert;
import org.seasar.doma.Select;
import org.seasar.doma.Update;

/**
 */
@Dao(config = ${configClassName}.class)
public interface TBonusState6Dao {

    /**
     * @param accountId
     * @param bonusId
     * @return the TBonusState6 entity
     */
    @Select
    TBonusState6 selectById(Integer accountId, Integer bonusId);

    /**
     * @param entity
     * @return affected rows
     */
    @Insert
    int insert(TBonusState6 entity);

    /**
     * @param entity
     * @return affected rows
     */
    @Update
    int update(TBonusState6 entity);

    /**
     * @param entity
     * @return affected rows
     */
    @Delete
    int delete(TBonusState6 entity);
}