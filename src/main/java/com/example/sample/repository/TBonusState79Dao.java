package com.example.sample.repository;

import com.example.sample.entity.TBonusState79;
import org.seasar.doma.Dao;
import org.seasar.doma.Delete;
import org.seasar.doma.Insert;
import org.seasar.doma.Select;
import org.seasar.doma.Update;

/**
 */
@Dao(config = ${configClassName}.class)
public interface TBonusState79Dao {

    /**
     * @param accountId
     * @param bonusId
     * @return the TBonusState79 entity
     */
    @Select
    TBonusState79 selectById(Integer accountId, Integer bonusId);

    /**
     * @param entity
     * @return affected rows
     */
    @Insert
    int insert(TBonusState79 entity);

    /**
     * @param entity
     * @return affected rows
     */
    @Update
    int update(TBonusState79 entity);

    /**
     * @param entity
     * @return affected rows
     */
    @Delete
    int delete(TBonusState79 entity);
}