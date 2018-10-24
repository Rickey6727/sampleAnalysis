package com.example.sample.repository;

import com.example.sample.entity.TBonusState67;
import org.seasar.doma.Dao;
import org.seasar.doma.Delete;
import org.seasar.doma.Insert;
import org.seasar.doma.Select;
import org.seasar.doma.Update;

/**
 */
@Dao(config = ${configClassName}.class)
public interface TBonusState67Dao {

    /**
     * @param accountId
     * @param bonusId
     * @return the TBonusState67 entity
     */
    @Select
    TBonusState67 selectById(Integer accountId, Integer bonusId);

    /**
     * @param entity
     * @return affected rows
     */
    @Insert
    int insert(TBonusState67 entity);

    /**
     * @param entity
     * @return affected rows
     */
    @Update
    int update(TBonusState67 entity);

    /**
     * @param entity
     * @return affected rows
     */
    @Delete
    int delete(TBonusState67 entity);
}