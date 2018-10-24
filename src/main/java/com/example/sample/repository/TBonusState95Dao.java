package com.example.sample.repository;

import com.example.sample.entity.TBonusState95;
import org.seasar.doma.Dao;
import org.seasar.doma.Delete;
import org.seasar.doma.Insert;
import org.seasar.doma.Select;
import org.seasar.doma.Update;

/**
 */
@Dao(config = ${configClassName}.class)
public interface TBonusState95Dao {

    /**
     * @param accountId
     * @param bonusId
     * @return the TBonusState95 entity
     */
    @Select
    TBonusState95 selectById(Integer accountId, Integer bonusId);

    /**
     * @param entity
     * @return affected rows
     */
    @Insert
    int insert(TBonusState95 entity);

    /**
     * @param entity
     * @return affected rows
     */
    @Update
    int update(TBonusState95 entity);

    /**
     * @param entity
     * @return affected rows
     */
    @Delete
    int delete(TBonusState95 entity);
}