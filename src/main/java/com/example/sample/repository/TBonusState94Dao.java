package com.example.sample.repository;

import com.example.sample.entity.TBonusState94;
import org.seasar.doma.Dao;
import org.seasar.doma.Delete;
import org.seasar.doma.Insert;
import org.seasar.doma.Select;
import org.seasar.doma.Update;

/**
 */
@Dao(config = ${configClassName}.class)
public interface TBonusState94Dao {

    /**
     * @param accountId
     * @param bonusId
     * @return the TBonusState94 entity
     */
    @Select
    TBonusState94 selectById(Integer accountId, Integer bonusId);

    /**
     * @param entity
     * @return affected rows
     */
    @Insert
    int insert(TBonusState94 entity);

    /**
     * @param entity
     * @return affected rows
     */
    @Update
    int update(TBonusState94 entity);

    /**
     * @param entity
     * @return affected rows
     */
    @Delete
    int delete(TBonusState94 entity);
}