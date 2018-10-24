package com.example.sample.repository;

import com.example.sample.entity.TBonusState14;
import org.seasar.doma.Dao;
import org.seasar.doma.Delete;
import org.seasar.doma.Insert;
import org.seasar.doma.Select;
import org.seasar.doma.Update;

/**
 */
@Dao(config = ${configClassName}.class)
public interface TBonusState14Dao {

    /**
     * @param accountId
     * @param bonusId
     * @return the TBonusState14 entity
     */
    @Select
    TBonusState14 selectById(Integer accountId, Integer bonusId);

    /**
     * @param entity
     * @return affected rows
     */
    @Insert
    int insert(TBonusState14 entity);

    /**
     * @param entity
     * @return affected rows
     */
    @Update
    int update(TBonusState14 entity);

    /**
     * @param entity
     * @return affected rows
     */
    @Delete
    int delete(TBonusState14 entity);
}