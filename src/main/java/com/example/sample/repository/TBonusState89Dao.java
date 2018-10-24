package com.example.sample.repository;

import com.example.sample.entity.TBonusState89;
import org.seasar.doma.Dao;
import org.seasar.doma.Delete;
import org.seasar.doma.Insert;
import org.seasar.doma.Select;
import org.seasar.doma.Update;

/**
 */
@Dao(config = ${configClassName}.class)
public interface TBonusState89Dao {

    /**
     * @param accountId
     * @param bonusId
     * @return the TBonusState89 entity
     */
    @Select
    TBonusState89 selectById(Integer accountId, Integer bonusId);

    /**
     * @param entity
     * @return affected rows
     */
    @Insert
    int insert(TBonusState89 entity);

    /**
     * @param entity
     * @return affected rows
     */
    @Update
    int update(TBonusState89 entity);

    /**
     * @param entity
     * @return affected rows
     */
    @Delete
    int delete(TBonusState89 entity);
}