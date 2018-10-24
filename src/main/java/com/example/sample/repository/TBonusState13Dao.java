package com.example.sample.repository;

import com.example.sample.entity.TBonusState13;
import org.seasar.doma.Dao;
import org.seasar.doma.Delete;
import org.seasar.doma.Insert;
import org.seasar.doma.Select;
import org.seasar.doma.Update;

/**
 */
@Dao(config = ${configClassName}.class)
public interface TBonusState13Dao {

    /**
     * @param accountId
     * @param bonusId
     * @return the TBonusState13 entity
     */
    @Select
    TBonusState13 selectById(Integer accountId, Integer bonusId);

    /**
     * @param entity
     * @return affected rows
     */
    @Insert
    int insert(TBonusState13 entity);

    /**
     * @param entity
     * @return affected rows
     */
    @Update
    int update(TBonusState13 entity);

    /**
     * @param entity
     * @return affected rows
     */
    @Delete
    int delete(TBonusState13 entity);
}