package com.example.sample.repository;

import com.example.sample.entity.TBonusState12;
import org.seasar.doma.Dao;
import org.seasar.doma.Delete;
import org.seasar.doma.Insert;
import org.seasar.doma.Select;
import org.seasar.doma.Update;

/**
 */
@Dao(config = ${configClassName}.class)
public interface TBonusState12Dao {

    /**
     * @param accountId
     * @param bonusId
     * @return the TBonusState12 entity
     */
    @Select
    TBonusState12 selectById(Integer accountId, Integer bonusId);

    /**
     * @param entity
     * @return affected rows
     */
    @Insert
    int insert(TBonusState12 entity);

    /**
     * @param entity
     * @return affected rows
     */
    @Update
    int update(TBonusState12 entity);

    /**
     * @param entity
     * @return affected rows
     */
    @Delete
    int delete(TBonusState12 entity);
}