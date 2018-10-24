package com.example.sample.repository;

import com.example.sample.entity.TBonusState34;
import org.seasar.doma.Dao;
import org.seasar.doma.Delete;
import org.seasar.doma.Insert;
import org.seasar.doma.Select;
import org.seasar.doma.Update;

/**
 */
@Dao(config = ${configClassName}.class)
public interface TBonusState34Dao {

    /**
     * @param accountId
     * @param bonusId
     * @return the TBonusState34 entity
     */
    @Select
    TBonusState34 selectById(Integer accountId, Integer bonusId);

    /**
     * @param entity
     * @return affected rows
     */
    @Insert
    int insert(TBonusState34 entity);

    /**
     * @param entity
     * @return affected rows
     */
    @Update
    int update(TBonusState34 entity);

    /**
     * @param entity
     * @return affected rows
     */
    @Delete
    int delete(TBonusState34 entity);
}