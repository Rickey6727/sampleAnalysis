package com.example.sample.repository;

import com.example.sample.entity.TBonusState49;
import org.seasar.doma.Dao;
import org.seasar.doma.Delete;
import org.seasar.doma.Insert;
import org.seasar.doma.Select;
import org.seasar.doma.Update;

/**
 */
@Dao(config = ${configClassName}.class)
public interface TBonusState49Dao {

    /**
     * @param accountId
     * @param bonusId
     * @return the TBonusState49 entity
     */
    @Select
    TBonusState49 selectById(Integer accountId, Integer bonusId);

    /**
     * @param entity
     * @return affected rows
     */
    @Insert
    int insert(TBonusState49 entity);

    /**
     * @param entity
     * @return affected rows
     */
    @Update
    int update(TBonusState49 entity);

    /**
     * @param entity
     * @return affected rows
     */
    @Delete
    int delete(TBonusState49 entity);
}