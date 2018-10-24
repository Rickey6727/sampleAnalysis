package com.example.sample.repository;

import com.example.sample.entity.TBonusState41;
import org.seasar.doma.Dao;
import org.seasar.doma.Delete;
import org.seasar.doma.Insert;
import org.seasar.doma.Select;
import org.seasar.doma.Update;

/**
 */
@Dao(config = ${configClassName}.class)
public interface TBonusState41Dao {

    /**
     * @param accountId
     * @param bonusId
     * @return the TBonusState41 entity
     */
    @Select
    TBonusState41 selectById(Integer accountId, Integer bonusId);

    /**
     * @param entity
     * @return affected rows
     */
    @Insert
    int insert(TBonusState41 entity);

    /**
     * @param entity
     * @return affected rows
     */
    @Update
    int update(TBonusState41 entity);

    /**
     * @param entity
     * @return affected rows
     */
    @Delete
    int delete(TBonusState41 entity);
}