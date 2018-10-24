package com.example.sample.repository;

import com.example.sample.entity.TBonusState45;
import org.seasar.doma.Dao;
import org.seasar.doma.Delete;
import org.seasar.doma.Insert;
import org.seasar.doma.Select;
import org.seasar.doma.Update;

/**
 */
@Dao(config = ${configClassName}.class)
public interface TBonusState45Dao {

    /**
     * @param accountId
     * @param bonusId
     * @return the TBonusState45 entity
     */
    @Select
    TBonusState45 selectById(Integer accountId, Integer bonusId);

    /**
     * @param entity
     * @return affected rows
     */
    @Insert
    int insert(TBonusState45 entity);

    /**
     * @param entity
     * @return affected rows
     */
    @Update
    int update(TBonusState45 entity);

    /**
     * @param entity
     * @return affected rows
     */
    @Delete
    int delete(TBonusState45 entity);
}