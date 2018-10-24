package com.example.sample.repository;

import com.example.sample.entity.TBonusState57;
import org.seasar.doma.Dao;
import org.seasar.doma.Delete;
import org.seasar.doma.Insert;
import org.seasar.doma.Select;
import org.seasar.doma.Update;

/**
 */
@Dao(config = ${configClassName}.class)
public interface TBonusState57Dao {

    /**
     * @param accountId
     * @param bonusId
     * @return the TBonusState57 entity
     */
    @Select
    TBonusState57 selectById(Integer accountId, Integer bonusId);

    /**
     * @param entity
     * @return affected rows
     */
    @Insert
    int insert(TBonusState57 entity);

    /**
     * @param entity
     * @return affected rows
     */
    @Update
    int update(TBonusState57 entity);

    /**
     * @param entity
     * @return affected rows
     */
    @Delete
    int delete(TBonusState57 entity);
}