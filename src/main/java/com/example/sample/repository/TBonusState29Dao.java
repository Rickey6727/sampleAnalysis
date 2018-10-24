package com.example.sample.repository;

import com.example.sample.entity.TBonusState29;
import org.seasar.doma.Dao;
import org.seasar.doma.Delete;
import org.seasar.doma.Insert;
import org.seasar.doma.Select;
import org.seasar.doma.Update;

/**
 */
@Dao(config = ${configClassName}.class)
public interface TBonusState29Dao {

    /**
     * @param accountId
     * @param bonusId
     * @return the TBonusState29 entity
     */
    @Select
    TBonusState29 selectById(Integer accountId, Integer bonusId);

    /**
     * @param entity
     * @return affected rows
     */
    @Insert
    int insert(TBonusState29 entity);

    /**
     * @param entity
     * @return affected rows
     */
    @Update
    int update(TBonusState29 entity);

    /**
     * @param entity
     * @return affected rows
     */
    @Delete
    int delete(TBonusState29 entity);
}