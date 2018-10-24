package com.example.sample.repository;

import com.example.sample.entity.TBonusState44;
import org.seasar.doma.Dao;
import org.seasar.doma.Delete;
import org.seasar.doma.Insert;
import org.seasar.doma.Select;
import org.seasar.doma.Update;

/**
 */
@Dao(config = ${configClassName}.class)
public interface TBonusState44Dao {

    /**
     * @param accountId
     * @param bonusId
     * @return the TBonusState44 entity
     */
    @Select
    TBonusState44 selectById(Integer accountId, Integer bonusId);

    /**
     * @param entity
     * @return affected rows
     */
    @Insert
    int insert(TBonusState44 entity);

    /**
     * @param entity
     * @return affected rows
     */
    @Update
    int update(TBonusState44 entity);

    /**
     * @param entity
     * @return affected rows
     */
    @Delete
    int delete(TBonusState44 entity);
}