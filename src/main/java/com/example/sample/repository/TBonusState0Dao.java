package com.example.sample.repository;

import com.example.sample.entity.TBonusState0;
import org.seasar.doma.Dao;
import org.seasar.doma.Delete;
import org.seasar.doma.Insert;
import org.seasar.doma.Select;
import org.seasar.doma.Update;

/**
 */
@Dao(config = ${configClassName}.class)
public interface TBonusState0Dao {

    /**
     * @param accountId
     * @param bonusId
     * @return the TBonusState0 entity
     */
    @Select
    TBonusState0 selectById(Integer accountId, Integer bonusId);

    /**
     * @param entity
     * @return affected rows
     */
    @Insert
    int insert(TBonusState0 entity);

    /**
     * @param entity
     * @return affected rows
     */
    @Update
    int update(TBonusState0 entity);

    /**
     * @param entity
     * @return affected rows
     */
    @Delete
    int delete(TBonusState0 entity);
}