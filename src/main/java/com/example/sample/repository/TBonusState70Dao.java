package com.example.sample.repository;

import com.example.sample.entity.TBonusState70;
import org.seasar.doma.Dao;
import org.seasar.doma.Delete;
import org.seasar.doma.Insert;
import org.seasar.doma.Select;
import org.seasar.doma.Update;

/**
 */
@Dao(config = ${configClassName}.class)
public interface TBonusState70Dao {

    /**
     * @param accountId
     * @param bonusId
     * @return the TBonusState70 entity
     */
    @Select
    TBonusState70 selectById(Integer accountId, Integer bonusId);

    /**
     * @param entity
     * @return affected rows
     */
    @Insert
    int insert(TBonusState70 entity);

    /**
     * @param entity
     * @return affected rows
     */
    @Update
    int update(TBonusState70 entity);

    /**
     * @param entity
     * @return affected rows
     */
    @Delete
    int delete(TBonusState70 entity);
}