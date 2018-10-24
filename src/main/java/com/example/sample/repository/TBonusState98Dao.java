package com.example.sample.repository;

import com.example.sample.entity.TBonusState98;
import org.seasar.doma.Dao;
import org.seasar.doma.Delete;
import org.seasar.doma.Insert;
import org.seasar.doma.Select;
import org.seasar.doma.Update;

/**
 */
@Dao(config = ${configClassName}.class)
public interface TBonusState98Dao {

    /**
     * @param accountId
     * @param bonusId
     * @return the TBonusState98 entity
     */
    @Select
    TBonusState98 selectById(Integer accountId, Integer bonusId);

    /**
     * @param entity
     * @return affected rows
     */
    @Insert
    int insert(TBonusState98 entity);

    /**
     * @param entity
     * @return affected rows
     */
    @Update
    int update(TBonusState98 entity);

    /**
     * @param entity
     * @return affected rows
     */
    @Delete
    int delete(TBonusState98 entity);
}