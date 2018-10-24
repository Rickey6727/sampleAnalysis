package com.example.sample.repository;

import com.example.sample.entity.TBonusState38;
import org.seasar.doma.Dao;
import org.seasar.doma.Delete;
import org.seasar.doma.Insert;
import org.seasar.doma.Select;
import org.seasar.doma.Update;

/**
 */
@Dao(config = ${configClassName}.class)
public interface TBonusState38Dao {

    /**
     * @param accountId
     * @param bonusId
     * @return the TBonusState38 entity
     */
    @Select
    TBonusState38 selectById(Integer accountId, Integer bonusId);

    /**
     * @param entity
     * @return affected rows
     */
    @Insert
    int insert(TBonusState38 entity);

    /**
     * @param entity
     * @return affected rows
     */
    @Update
    int update(TBonusState38 entity);

    /**
     * @param entity
     * @return affected rows
     */
    @Delete
    int delete(TBonusState38 entity);
}