package com.example.sample.repository;

import com.example.sample.entity.TBonusState90;
import org.seasar.doma.Dao;
import org.seasar.doma.Delete;
import org.seasar.doma.Insert;
import org.seasar.doma.Select;
import org.seasar.doma.Update;

/**
 */
@Dao(config = ${configClassName}.class)
public interface TBonusState90Dao {

    /**
     * @param accountId
     * @param bonusId
     * @return the TBonusState90 entity
     */
    @Select
    TBonusState90 selectById(Integer accountId, Integer bonusId);

    /**
     * @param entity
     * @return affected rows
     */
    @Insert
    int insert(TBonusState90 entity);

    /**
     * @param entity
     * @return affected rows
     */
    @Update
    int update(TBonusState90 entity);

    /**
     * @param entity
     * @return affected rows
     */
    @Delete
    int delete(TBonusState90 entity);
}