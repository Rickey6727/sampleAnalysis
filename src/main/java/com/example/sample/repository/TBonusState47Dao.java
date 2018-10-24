package com.example.sample.repository;

import com.example.sample.entity.TBonusState47;
import org.seasar.doma.Dao;
import org.seasar.doma.Delete;
import org.seasar.doma.Insert;
import org.seasar.doma.Select;
import org.seasar.doma.Update;

/**
 */
@Dao(config = ${configClassName}.class)
public interface TBonusState47Dao {

    /**
     * @param accountId
     * @param bonusId
     * @return the TBonusState47 entity
     */
    @Select
    TBonusState47 selectById(Integer accountId, Integer bonusId);

    /**
     * @param entity
     * @return affected rows
     */
    @Insert
    int insert(TBonusState47 entity);

    /**
     * @param entity
     * @return affected rows
     */
    @Update
    int update(TBonusState47 entity);

    /**
     * @param entity
     * @return affected rows
     */
    @Delete
    int delete(TBonusState47 entity);
}