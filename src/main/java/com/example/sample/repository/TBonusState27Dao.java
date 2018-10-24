package com.example.sample.repository;

import com.example.sample.entity.TBonusState27;
import org.seasar.doma.Dao;
import org.seasar.doma.Delete;
import org.seasar.doma.Insert;
import org.seasar.doma.Select;
import org.seasar.doma.Update;

/**
 */
@Dao(config = ${configClassName}.class)
public interface TBonusState27Dao {

    /**
     * @param accountId
     * @param bonusId
     * @return the TBonusState27 entity
     */
    @Select
    TBonusState27 selectById(Integer accountId, Integer bonusId);

    /**
     * @param entity
     * @return affected rows
     */
    @Insert
    int insert(TBonusState27 entity);

    /**
     * @param entity
     * @return affected rows
     */
    @Update
    int update(TBonusState27 entity);

    /**
     * @param entity
     * @return affected rows
     */
    @Delete
    int delete(TBonusState27 entity);
}