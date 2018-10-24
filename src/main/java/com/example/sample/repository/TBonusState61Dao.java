package com.example.sample.repository;

import com.example.sample.entity.TBonusState61;
import org.seasar.doma.Dao;
import org.seasar.doma.Delete;
import org.seasar.doma.Insert;
import org.seasar.doma.Select;
import org.seasar.doma.Update;

/**
 */
@Dao(config = ${configClassName}.class)
public interface TBonusState61Dao {

    /**
     * @param accountId
     * @param bonusId
     * @return the TBonusState61 entity
     */
    @Select
    TBonusState61 selectById(Integer accountId, Integer bonusId);

    /**
     * @param entity
     * @return affected rows
     */
    @Insert
    int insert(TBonusState61 entity);

    /**
     * @param entity
     * @return affected rows
     */
    @Update
    int update(TBonusState61 entity);

    /**
     * @param entity
     * @return affected rows
     */
    @Delete
    int delete(TBonusState61 entity);
}