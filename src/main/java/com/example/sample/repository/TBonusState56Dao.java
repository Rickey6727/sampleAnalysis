package com.example.sample.repository;

import com.example.sample.entity.TBonusState56;
import org.seasar.doma.Dao;
import org.seasar.doma.Delete;
import org.seasar.doma.Insert;
import org.seasar.doma.Select;
import org.seasar.doma.Update;

/**
 */
@Dao(config = ${configClassName}.class)
public interface TBonusState56Dao {

    /**
     * @param accountId
     * @param bonusId
     * @return the TBonusState56 entity
     */
    @Select
    TBonusState56 selectById(Integer accountId, Integer bonusId);

    /**
     * @param entity
     * @return affected rows
     */
    @Insert
    int insert(TBonusState56 entity);

    /**
     * @param entity
     * @return affected rows
     */
    @Update
    int update(TBonusState56 entity);

    /**
     * @param entity
     * @return affected rows
     */
    @Delete
    int delete(TBonusState56 entity);
}