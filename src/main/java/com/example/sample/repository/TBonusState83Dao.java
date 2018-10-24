package com.example.sample.repository;

import com.example.sample.entity.TBonusState83;
import org.seasar.doma.Dao;
import org.seasar.doma.Delete;
import org.seasar.doma.Insert;
import org.seasar.doma.Select;
import org.seasar.doma.Update;

/**
 */
@Dao(config = ${configClassName}.class)
public interface TBonusState83Dao {

    /**
     * @param accountId
     * @param bonusId
     * @return the TBonusState83 entity
     */
    @Select
    TBonusState83 selectById(Integer accountId, Integer bonusId);

    /**
     * @param entity
     * @return affected rows
     */
    @Insert
    int insert(TBonusState83 entity);

    /**
     * @param entity
     * @return affected rows
     */
    @Update
    int update(TBonusState83 entity);

    /**
     * @param entity
     * @return affected rows
     */
    @Delete
    int delete(TBonusState83 entity);
}