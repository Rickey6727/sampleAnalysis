package com.example.sample.repository;

import com.example.sample.entity.TBonusState71;
import org.seasar.doma.Dao;
import org.seasar.doma.Delete;
import org.seasar.doma.Insert;
import org.seasar.doma.Select;
import org.seasar.doma.Update;

/**
 */
@Dao(config = ${configClassName}.class)
public interface TBonusState71Dao {

    /**
     * @param accountId
     * @param bonusId
     * @return the TBonusState71 entity
     */
    @Select
    TBonusState71 selectById(Integer accountId, Integer bonusId);

    /**
     * @param entity
     * @return affected rows
     */
    @Insert
    int insert(TBonusState71 entity);

    /**
     * @param entity
     * @return affected rows
     */
    @Update
    int update(TBonusState71 entity);

    /**
     * @param entity
     * @return affected rows
     */
    @Delete
    int delete(TBonusState71 entity);
}