package com.example.sample.repository;

import com.example.sample.entity.TBonusState84;
import org.seasar.doma.Dao;
import org.seasar.doma.Delete;
import org.seasar.doma.Insert;
import org.seasar.doma.Select;
import org.seasar.doma.Update;

/**
 */
@Dao(config = ${configClassName}.class)
public interface TBonusState84Dao {

    /**
     * @param accountId
     * @param bonusId
     * @return the TBonusState84 entity
     */
    @Select
    TBonusState84 selectById(Integer accountId, Integer bonusId);

    /**
     * @param entity
     * @return affected rows
     */
    @Insert
    int insert(TBonusState84 entity);

    /**
     * @param entity
     * @return affected rows
     */
    @Update
    int update(TBonusState84 entity);

    /**
     * @param entity
     * @return affected rows
     */
    @Delete
    int delete(TBonusState84 entity);
}