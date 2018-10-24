package com.example.sample.repository;

import com.example.sample.entity.TBonusState54;
import org.seasar.doma.Dao;
import org.seasar.doma.Delete;
import org.seasar.doma.Insert;
import org.seasar.doma.Select;
import org.seasar.doma.Update;

/**
 */
@Dao(config = ${configClassName}.class)
public interface TBonusState54Dao {

    /**
     * @param accountId
     * @param bonusId
     * @return the TBonusState54 entity
     */
    @Select
    TBonusState54 selectById(Integer accountId, Integer bonusId);

    /**
     * @param entity
     * @return affected rows
     */
    @Insert
    int insert(TBonusState54 entity);

    /**
     * @param entity
     * @return affected rows
     */
    @Update
    int update(TBonusState54 entity);

    /**
     * @param entity
     * @return affected rows
     */
    @Delete
    int delete(TBonusState54 entity);
}