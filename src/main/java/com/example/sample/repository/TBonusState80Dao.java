package com.example.sample.repository;

import com.example.sample.entity.TBonusState80;
import org.seasar.doma.Dao;
import org.seasar.doma.Delete;
import org.seasar.doma.Insert;
import org.seasar.doma.Select;
import org.seasar.doma.Update;

/**
 */
@Dao(config = ${configClassName}.class)
public interface TBonusState80Dao {

    /**
     * @param accountId
     * @param bonusId
     * @return the TBonusState80 entity
     */
    @Select
    TBonusState80 selectById(Integer accountId, Integer bonusId);

    /**
     * @param entity
     * @return affected rows
     */
    @Insert
    int insert(TBonusState80 entity);

    /**
     * @param entity
     * @return affected rows
     */
    @Update
    int update(TBonusState80 entity);

    /**
     * @param entity
     * @return affected rows
     */
    @Delete
    int delete(TBonusState80 entity);
}