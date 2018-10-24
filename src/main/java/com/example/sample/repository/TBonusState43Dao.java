package com.example.sample.repository;

import com.example.sample.entity.TBonusState43;
import org.seasar.doma.Dao;
import org.seasar.doma.Delete;
import org.seasar.doma.Insert;
import org.seasar.doma.Select;
import org.seasar.doma.Update;

/**
 */
@Dao(config = ${configClassName}.class)
public interface TBonusState43Dao {

    /**
     * @param accountId
     * @param bonusId
     * @return the TBonusState43 entity
     */
    @Select
    TBonusState43 selectById(Integer accountId, Integer bonusId);

    /**
     * @param entity
     * @return affected rows
     */
    @Insert
    int insert(TBonusState43 entity);

    /**
     * @param entity
     * @return affected rows
     */
    @Update
    int update(TBonusState43 entity);

    /**
     * @param entity
     * @return affected rows
     */
    @Delete
    int delete(TBonusState43 entity);
}