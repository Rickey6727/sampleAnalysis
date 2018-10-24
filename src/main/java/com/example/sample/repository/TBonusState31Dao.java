package com.example.sample.repository;

import com.example.sample.entity.TBonusState31;
import org.seasar.doma.Dao;
import org.seasar.doma.Delete;
import org.seasar.doma.Insert;
import org.seasar.doma.Select;
import org.seasar.doma.Update;

/**
 */
@Dao(config = ${configClassName}.class)
public interface TBonusState31Dao {

    /**
     * @param accountId
     * @param bonusId
     * @return the TBonusState31 entity
     */
    @Select
    TBonusState31 selectById(Integer accountId, Integer bonusId);

    /**
     * @param entity
     * @return affected rows
     */
    @Insert
    int insert(TBonusState31 entity);

    /**
     * @param entity
     * @return affected rows
     */
    @Update
    int update(TBonusState31 entity);

    /**
     * @param entity
     * @return affected rows
     */
    @Delete
    int delete(TBonusState31 entity);
}