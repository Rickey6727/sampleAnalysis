package com.example.sample.repository;

import com.example.sample.entity.TBonusState15;
import org.seasar.doma.Dao;
import org.seasar.doma.Delete;
import org.seasar.doma.Insert;
import org.seasar.doma.Select;
import org.seasar.doma.Update;

/**
 */
@Dao(config = ${configClassName}.class)
public interface TBonusState15Dao {

    /**
     * @param accountId
     * @param bonusId
     * @return the TBonusState15 entity
     */
    @Select
    TBonusState15 selectById(Integer accountId, Integer bonusId);

    /**
     * @param entity
     * @return affected rows
     */
    @Insert
    int insert(TBonusState15 entity);

    /**
     * @param entity
     * @return affected rows
     */
    @Update
    int update(TBonusState15 entity);

    /**
     * @param entity
     * @return affected rows
     */
    @Delete
    int delete(TBonusState15 entity);
}