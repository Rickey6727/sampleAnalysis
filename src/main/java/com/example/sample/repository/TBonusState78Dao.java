package com.example.sample.repository;

import com.example.sample.entity.TBonusState78;
import org.seasar.doma.Dao;
import org.seasar.doma.Delete;
import org.seasar.doma.Insert;
import org.seasar.doma.Select;
import org.seasar.doma.Update;

/**
 */
@Dao(config = ${configClassName}.class)
public interface TBonusState78Dao {

    /**
     * @param accountId
     * @param bonusId
     * @return the TBonusState78 entity
     */
    @Select
    TBonusState78 selectById(Integer accountId, Integer bonusId);

    /**
     * @param entity
     * @return affected rows
     */
    @Insert
    int insert(TBonusState78 entity);

    /**
     * @param entity
     * @return affected rows
     */
    @Update
    int update(TBonusState78 entity);

    /**
     * @param entity
     * @return affected rows
     */
    @Delete
    int delete(TBonusState78 entity);
}