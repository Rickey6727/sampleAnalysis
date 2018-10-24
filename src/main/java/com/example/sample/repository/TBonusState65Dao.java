package com.example.sample.repository;

import com.example.sample.entity.TBonusState65;
import org.seasar.doma.Dao;
import org.seasar.doma.Delete;
import org.seasar.doma.Insert;
import org.seasar.doma.Select;
import org.seasar.doma.Update;

/**
 */
@Dao(config = ${configClassName}.class)
public interface TBonusState65Dao {

    /**
     * @param accountId
     * @param bonusId
     * @return the TBonusState65 entity
     */
    @Select
    TBonusState65 selectById(Integer accountId, Integer bonusId);

    /**
     * @param entity
     * @return affected rows
     */
    @Insert
    int insert(TBonusState65 entity);

    /**
     * @param entity
     * @return affected rows
     */
    @Update
    int update(TBonusState65 entity);

    /**
     * @param entity
     * @return affected rows
     */
    @Delete
    int delete(TBonusState65 entity);
}