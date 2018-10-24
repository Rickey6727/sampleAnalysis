package com.example.sample.repository;

import com.example.sample.entity.TBonusState39;
import org.seasar.doma.Dao;
import org.seasar.doma.Delete;
import org.seasar.doma.Insert;
import org.seasar.doma.Select;
import org.seasar.doma.Update;

/**
 */
@Dao(config = ${configClassName}.class)
public interface TBonusState39Dao {

    /**
     * @param accountId
     * @param bonusId
     * @return the TBonusState39 entity
     */
    @Select
    TBonusState39 selectById(Integer accountId, Integer bonusId);

    /**
     * @param entity
     * @return affected rows
     */
    @Insert
    int insert(TBonusState39 entity);

    /**
     * @param entity
     * @return affected rows
     */
    @Update
    int update(TBonusState39 entity);

    /**
     * @param entity
     * @return affected rows
     */
    @Delete
    int delete(TBonusState39 entity);
}