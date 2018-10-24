package com.example.sample.repository;

import com.example.sample.entity.TBonusState5;
import org.seasar.doma.Dao;
import org.seasar.doma.Delete;
import org.seasar.doma.Insert;
import org.seasar.doma.Select;
import org.seasar.doma.Update;

/**
 */
@Dao(config = ${configClassName}.class)
public interface TBonusState5Dao {

    /**
     * @param accountId
     * @param bonusId
     * @return the TBonusState5 entity
     */
    @Select
    TBonusState5 selectById(Integer accountId, Integer bonusId);

    /**
     * @param entity
     * @return affected rows
     */
    @Insert
    int insert(TBonusState5 entity);

    /**
     * @param entity
     * @return affected rows
     */
    @Update
    int update(TBonusState5 entity);

    /**
     * @param entity
     * @return affected rows
     */
    @Delete
    int delete(TBonusState5 entity);
}