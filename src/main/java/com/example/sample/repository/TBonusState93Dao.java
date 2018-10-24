package com.example.sample.repository;

import com.example.sample.entity.TBonusState93;
import org.seasar.doma.Dao;
import org.seasar.doma.Delete;
import org.seasar.doma.Insert;
import org.seasar.doma.Select;
import org.seasar.doma.Update;

/**
 */
@Dao(config = ${configClassName}.class)
public interface TBonusState93Dao {

    /**
     * @param accountId
     * @param bonusId
     * @return the TBonusState93 entity
     */
    @Select
    TBonusState93 selectById(Integer accountId, Integer bonusId);

    /**
     * @param entity
     * @return affected rows
     */
    @Insert
    int insert(TBonusState93 entity);

    /**
     * @param entity
     * @return affected rows
     */
    @Update
    int update(TBonusState93 entity);

    /**
     * @param entity
     * @return affected rows
     */
    @Delete
    int delete(TBonusState93 entity);
}