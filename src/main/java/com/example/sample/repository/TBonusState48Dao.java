package com.example.sample.repository;

import com.example.sample.entity.TBonusState48;
import org.seasar.doma.Dao;
import org.seasar.doma.Delete;
import org.seasar.doma.Insert;
import org.seasar.doma.Select;
import org.seasar.doma.Update;

/**
 */
@Dao(config = ${configClassName}.class)
public interface TBonusState48Dao {

    /**
     * @param accountId
     * @param bonusId
     * @return the TBonusState48 entity
     */
    @Select
    TBonusState48 selectById(Integer accountId, Integer bonusId);

    /**
     * @param entity
     * @return affected rows
     */
    @Insert
    int insert(TBonusState48 entity);

    /**
     * @param entity
     * @return affected rows
     */
    @Update
    int update(TBonusState48 entity);

    /**
     * @param entity
     * @return affected rows
     */
    @Delete
    int delete(TBonusState48 entity);
}