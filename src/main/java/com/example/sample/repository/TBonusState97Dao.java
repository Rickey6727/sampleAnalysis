package com.example.sample.repository;

import com.example.sample.entity.TBonusState97;
import org.seasar.doma.Dao;
import org.seasar.doma.Delete;
import org.seasar.doma.Insert;
import org.seasar.doma.Select;
import org.seasar.doma.Update;

/**
 */
@Dao(config = ${configClassName}.class)
public interface TBonusState97Dao {

    /**
     * @param accountId
     * @param bonusId
     * @return the TBonusState97 entity
     */
    @Select
    TBonusState97 selectById(Integer accountId, Integer bonusId);

    /**
     * @param entity
     * @return affected rows
     */
    @Insert
    int insert(TBonusState97 entity);

    /**
     * @param entity
     * @return affected rows
     */
    @Update
    int update(TBonusState97 entity);

    /**
     * @param entity
     * @return affected rows
     */
    @Delete
    int delete(TBonusState97 entity);
}