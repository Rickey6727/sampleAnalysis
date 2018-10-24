package com.example.sample.repository;

import com.example.sample.entity.TBonusState59;
import org.seasar.doma.Dao;
import org.seasar.doma.Delete;
import org.seasar.doma.Insert;
import org.seasar.doma.Select;
import org.seasar.doma.Update;

/**
 */
@Dao(config = ${configClassName}.class)
public interface TBonusState59Dao {

    /**
     * @param accountId
     * @param bonusId
     * @return the TBonusState59 entity
     */
    @Select
    TBonusState59 selectById(Integer accountId, Integer bonusId);

    /**
     * @param entity
     * @return affected rows
     */
    @Insert
    int insert(TBonusState59 entity);

    /**
     * @param entity
     * @return affected rows
     */
    @Update
    int update(TBonusState59 entity);

    /**
     * @param entity
     * @return affected rows
     */
    @Delete
    int delete(TBonusState59 entity);
}