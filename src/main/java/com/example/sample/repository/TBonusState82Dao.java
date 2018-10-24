package com.example.sample.repository;

import com.example.sample.entity.TBonusState82;
import org.seasar.doma.Dao;
import org.seasar.doma.Delete;
import org.seasar.doma.Insert;
import org.seasar.doma.Select;
import org.seasar.doma.Update;

/**
 */
@Dao(config = ${configClassName}.class)
public interface TBonusState82Dao {

    /**
     * @param accountId
     * @param bonusId
     * @return the TBonusState82 entity
     */
    @Select
    TBonusState82 selectById(Integer accountId, Integer bonusId);

    /**
     * @param entity
     * @return affected rows
     */
    @Insert
    int insert(TBonusState82 entity);

    /**
     * @param entity
     * @return affected rows
     */
    @Update
    int update(TBonusState82 entity);

    /**
     * @param entity
     * @return affected rows
     */
    @Delete
    int delete(TBonusState82 entity);
}