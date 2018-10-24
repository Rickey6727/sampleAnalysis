package com.example.sample.repository;

import com.example.sample.entity.TBonusState91;
import org.seasar.doma.Dao;
import org.seasar.doma.Delete;
import org.seasar.doma.Insert;
import org.seasar.doma.Select;
import org.seasar.doma.Update;

/**
 */
@Dao(config = ${configClassName}.class)
public interface TBonusState91Dao {

    /**
     * @param accountId
     * @param bonusId
     * @return the TBonusState91 entity
     */
    @Select
    TBonusState91 selectById(Integer accountId, Integer bonusId);

    /**
     * @param entity
     * @return affected rows
     */
    @Insert
    int insert(TBonusState91 entity);

    /**
     * @param entity
     * @return affected rows
     */
    @Update
    int update(TBonusState91 entity);

    /**
     * @param entity
     * @return affected rows
     */
    @Delete
    int delete(TBonusState91 entity);
}