package com.example.sample.repository;

import com.example.sample.entity.TBonusState85;
import org.seasar.doma.Dao;
import org.seasar.doma.Delete;
import org.seasar.doma.Insert;
import org.seasar.doma.Select;
import org.seasar.doma.Update;

/**
 */
@Dao(config = ${configClassName}.class)
public interface TBonusState85Dao {

    /**
     * @param accountId
     * @param bonusId
     * @return the TBonusState85 entity
     */
    @Select
    TBonusState85 selectById(Integer accountId, Integer bonusId);

    /**
     * @param entity
     * @return affected rows
     */
    @Insert
    int insert(TBonusState85 entity);

    /**
     * @param entity
     * @return affected rows
     */
    @Update
    int update(TBonusState85 entity);

    /**
     * @param entity
     * @return affected rows
     */
    @Delete
    int delete(TBonusState85 entity);
}