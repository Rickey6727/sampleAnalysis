package com.example.sample.repository;

import com.example.sample.entity.TBonusState99;
import org.seasar.doma.Dao;
import org.seasar.doma.Delete;
import org.seasar.doma.Insert;
import org.seasar.doma.Select;
import org.seasar.doma.Update;

/**
 */
@Dao(config = ${configClassName}.class)
public interface TBonusState99Dao {

    /**
     * @param accountId
     * @param bonusId
     * @return the TBonusState99 entity
     */
    @Select
    TBonusState99 selectById(Integer accountId, Integer bonusId);

    /**
     * @param entity
     * @return affected rows
     */
    @Insert
    int insert(TBonusState99 entity);

    /**
     * @param entity
     * @return affected rows
     */
    @Update
    int update(TBonusState99 entity);

    /**
     * @param entity
     * @return affected rows
     */
    @Delete
    int delete(TBonusState99 entity);
}