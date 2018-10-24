package com.example.sample.repository;

import com.example.sample.entity.TBonusState24;
import org.seasar.doma.Dao;
import org.seasar.doma.Delete;
import org.seasar.doma.Insert;
import org.seasar.doma.Select;
import org.seasar.doma.Update;

/**
 */
@Dao(config = ${configClassName}.class)
public interface TBonusState24Dao {

    /**
     * @param accountId
     * @param bonusId
     * @return the TBonusState24 entity
     */
    @Select
    TBonusState24 selectById(Integer accountId, Integer bonusId);

    /**
     * @param entity
     * @return affected rows
     */
    @Insert
    int insert(TBonusState24 entity);

    /**
     * @param entity
     * @return affected rows
     */
    @Update
    int update(TBonusState24 entity);

    /**
     * @param entity
     * @return affected rows
     */
    @Delete
    int delete(TBonusState24 entity);
}