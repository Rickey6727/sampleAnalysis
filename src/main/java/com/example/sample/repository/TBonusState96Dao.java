package com.example.sample.repository;

import com.example.sample.entity.TBonusState96;
import org.seasar.doma.Dao;
import org.seasar.doma.Delete;
import org.seasar.doma.Insert;
import org.seasar.doma.Select;
import org.seasar.doma.Update;

/**
 */
@Dao(config = ${configClassName}.class)
public interface TBonusState96Dao {

    /**
     * @param accountId
     * @param bonusId
     * @return the TBonusState96 entity
     */
    @Select
    TBonusState96 selectById(Integer accountId, Integer bonusId);

    /**
     * @param entity
     * @return affected rows
     */
    @Insert
    int insert(TBonusState96 entity);

    /**
     * @param entity
     * @return affected rows
     */
    @Update
    int update(TBonusState96 entity);

    /**
     * @param entity
     * @return affected rows
     */
    @Delete
    int delete(TBonusState96 entity);
}