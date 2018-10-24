package com.example.sample.repository;

import com.example.sample.entity.TBonusState52;
import org.seasar.doma.Dao;
import org.seasar.doma.Delete;
import org.seasar.doma.Insert;
import org.seasar.doma.Select;
import org.seasar.doma.Update;

/**
 */
@Dao(config = ${configClassName}.class)
public interface TBonusState52Dao {

    /**
     * @param accountId
     * @param bonusId
     * @return the TBonusState52 entity
     */
    @Select
    TBonusState52 selectById(Integer accountId, Integer bonusId);

    /**
     * @param entity
     * @return affected rows
     */
    @Insert
    int insert(TBonusState52 entity);

    /**
     * @param entity
     * @return affected rows
     */
    @Update
    int update(TBonusState52 entity);

    /**
     * @param entity
     * @return affected rows
     */
    @Delete
    int delete(TBonusState52 entity);
}