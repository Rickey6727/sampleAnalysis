package com.example.sample.repository;

import com.example.sample.entity.TBonusState88;
import org.seasar.doma.Dao;
import org.seasar.doma.Delete;
import org.seasar.doma.Insert;
import org.seasar.doma.Select;
import org.seasar.doma.Update;

/**
 */
@Dao(config = ${configClassName}.class)
public interface TBonusState88Dao {

    /**
     * @param accountId
     * @param bonusId
     * @return the TBonusState88 entity
     */
    @Select
    TBonusState88 selectById(Integer accountId, Integer bonusId);

    /**
     * @param entity
     * @return affected rows
     */
    @Insert
    int insert(TBonusState88 entity);

    /**
     * @param entity
     * @return affected rows
     */
    @Update
    int update(TBonusState88 entity);

    /**
     * @param entity
     * @return affected rows
     */
    @Delete
    int delete(TBonusState88 entity);
}