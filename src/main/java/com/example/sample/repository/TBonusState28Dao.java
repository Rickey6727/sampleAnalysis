package com.example.sample.repository;

import com.example.sample.entity.TBonusState28;
import org.seasar.doma.Dao;
import org.seasar.doma.Delete;
import org.seasar.doma.Insert;
import org.seasar.doma.Select;
import org.seasar.doma.Update;

/**
 */
@Dao(config = ${configClassName}.class)
public interface TBonusState28Dao {

    /**
     * @param accountId
     * @param bonusId
     * @return the TBonusState28 entity
     */
    @Select
    TBonusState28 selectById(Integer accountId, Integer bonusId);

    /**
     * @param entity
     * @return affected rows
     */
    @Insert
    int insert(TBonusState28 entity);

    /**
     * @param entity
     * @return affected rows
     */
    @Update
    int update(TBonusState28 entity);

    /**
     * @param entity
     * @return affected rows
     */
    @Delete
    int delete(TBonusState28 entity);
}