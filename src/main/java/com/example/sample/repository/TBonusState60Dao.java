package com.example.sample.repository;

import com.example.sample.entity.TBonusState60;
import org.seasar.doma.Dao;
import org.seasar.doma.Delete;
import org.seasar.doma.Insert;
import org.seasar.doma.Select;
import org.seasar.doma.Update;

/**
 */
@Dao(config = ${configClassName}.class)
public interface TBonusState60Dao {

    /**
     * @param accountId
     * @param bonusId
     * @return the TBonusState60 entity
     */
    @Select
    TBonusState60 selectById(Integer accountId, Integer bonusId);

    /**
     * @param entity
     * @return affected rows
     */
    @Insert
    int insert(TBonusState60 entity);

    /**
     * @param entity
     * @return affected rows
     */
    @Update
    int update(TBonusState60 entity);

    /**
     * @param entity
     * @return affected rows
     */
    @Delete
    int delete(TBonusState60 entity);
}