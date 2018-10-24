package com.example.sample.repository;

import com.example.sample.entity.TBonusState21;
import org.seasar.doma.Dao;
import org.seasar.doma.Delete;
import org.seasar.doma.Insert;
import org.seasar.doma.Select;
import org.seasar.doma.Update;

/**
 */
@Dao(config = ${configClassName}.class)
public interface TBonusState21Dao {

    /**
     * @param accountId
     * @param bonusId
     * @return the TBonusState21 entity
     */
    @Select
    TBonusState21 selectById(Integer accountId, Integer bonusId);

    /**
     * @param entity
     * @return affected rows
     */
    @Insert
    int insert(TBonusState21 entity);

    /**
     * @param entity
     * @return affected rows
     */
    @Update
    int update(TBonusState21 entity);

    /**
     * @param entity
     * @return affected rows
     */
    @Delete
    int delete(TBonusState21 entity);
}