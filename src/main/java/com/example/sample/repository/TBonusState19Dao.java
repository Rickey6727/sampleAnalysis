package com.example.sample.repository;

import com.example.sample.entity.TBonusState19;
import org.seasar.doma.Dao;
import org.seasar.doma.Delete;
import org.seasar.doma.Insert;
import org.seasar.doma.Select;
import org.seasar.doma.Update;

/**
 */
@Dao(config = ${configClassName}.class)
public interface TBonusState19Dao {

    /**
     * @param accountId
     * @param bonusId
     * @return the TBonusState19 entity
     */
    @Select
    TBonusState19 selectById(Integer accountId, Integer bonusId);

    /**
     * @param entity
     * @return affected rows
     */
    @Insert
    int insert(TBonusState19 entity);

    /**
     * @param entity
     * @return affected rows
     */
    @Update
    int update(TBonusState19 entity);

    /**
     * @param entity
     * @return affected rows
     */
    @Delete
    int delete(TBonusState19 entity);
}