package com.example.sample.repository;

import com.example.sample.entity.TBonusState35;
import org.seasar.doma.Dao;
import org.seasar.doma.Delete;
import org.seasar.doma.Insert;
import org.seasar.doma.Select;
import org.seasar.doma.Update;

/**
 */
@Dao(config = ${configClassName}.class)
public interface TBonusState35Dao {

    /**
     * @param accountId
     * @param bonusId
     * @return the TBonusState35 entity
     */
    @Select
    TBonusState35 selectById(Integer accountId, Integer bonusId);

    /**
     * @param entity
     * @return affected rows
     */
    @Insert
    int insert(TBonusState35 entity);

    /**
     * @param entity
     * @return affected rows
     */
    @Update
    int update(TBonusState35 entity);

    /**
     * @param entity
     * @return affected rows
     */
    @Delete
    int delete(TBonusState35 entity);
}