package com.example.sample.repository;

import com.example.sample.entity.TBonusState68;
import org.seasar.doma.Dao;
import org.seasar.doma.Delete;
import org.seasar.doma.Insert;
import org.seasar.doma.Select;
import org.seasar.doma.Update;

/**
 */
@Dao(config = ${configClassName}.class)
public interface TBonusState68Dao {

    /**
     * @param accountId
     * @param bonusId
     * @return the TBonusState68 entity
     */
    @Select
    TBonusState68 selectById(Integer accountId, Integer bonusId);

    /**
     * @param entity
     * @return affected rows
     */
    @Insert
    int insert(TBonusState68 entity);

    /**
     * @param entity
     * @return affected rows
     */
    @Update
    int update(TBonusState68 entity);

    /**
     * @param entity
     * @return affected rows
     */
    @Delete
    int delete(TBonusState68 entity);
}