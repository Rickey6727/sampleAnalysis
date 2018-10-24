package com.example.sample.repository;

import com.example.sample.entity.TBonusState18;
import org.seasar.doma.Dao;
import org.seasar.doma.Delete;
import org.seasar.doma.Insert;
import org.seasar.doma.Select;
import org.seasar.doma.Update;

/**
 */
@Dao(config = ${configClassName}.class)
public interface TBonusState18Dao {

    /**
     * @param accountId
     * @param bonusId
     * @return the TBonusState18 entity
     */
    @Select
    TBonusState18 selectById(Integer accountId, Integer bonusId);

    /**
     * @param entity
     * @return affected rows
     */
    @Insert
    int insert(TBonusState18 entity);

    /**
     * @param entity
     * @return affected rows
     */
    @Update
    int update(TBonusState18 entity);

    /**
     * @param entity
     * @return affected rows
     */
    @Delete
    int delete(TBonusState18 entity);
}