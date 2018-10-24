package com.example.sample.repository;

import com.example.sample.entity.TBonusState63;
import org.seasar.doma.Dao;
import org.seasar.doma.Delete;
import org.seasar.doma.Insert;
import org.seasar.doma.Select;
import org.seasar.doma.Update;

/**
 */
@Dao(config = ${configClassName}.class)
public interface TBonusState63Dao {

    /**
     * @param accountId
     * @param bonusId
     * @return the TBonusState63 entity
     */
    @Select
    TBonusState63 selectById(Integer accountId, Integer bonusId);

    /**
     * @param entity
     * @return affected rows
     */
    @Insert
    int insert(TBonusState63 entity);

    /**
     * @param entity
     * @return affected rows
     */
    @Update
    int update(TBonusState63 entity);

    /**
     * @param entity
     * @return affected rows
     */
    @Delete
    int delete(TBonusState63 entity);
}