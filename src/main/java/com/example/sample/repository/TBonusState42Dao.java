package com.example.sample.repository;

import com.example.sample.entity.TBonusState42;
import org.seasar.doma.Dao;
import org.seasar.doma.Delete;
import org.seasar.doma.Insert;
import org.seasar.doma.Select;
import org.seasar.doma.Update;

/**
 */
@Dao(config = ${configClassName}.class)
public interface TBonusState42Dao {

    /**
     * @param accountId
     * @param bonusId
     * @return the TBonusState42 entity
     */
    @Select
    TBonusState42 selectById(Integer accountId, Integer bonusId);

    /**
     * @param entity
     * @return affected rows
     */
    @Insert
    int insert(TBonusState42 entity);

    /**
     * @param entity
     * @return affected rows
     */
    @Update
    int update(TBonusState42 entity);

    /**
     * @param entity
     * @return affected rows
     */
    @Delete
    int delete(TBonusState42 entity);
}