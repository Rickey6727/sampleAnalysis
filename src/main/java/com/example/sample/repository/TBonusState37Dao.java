package com.example.sample.repository;

import com.example.sample.entity.TBonusState37;
import org.seasar.doma.Dao;
import org.seasar.doma.Delete;
import org.seasar.doma.Insert;
import org.seasar.doma.Select;
import org.seasar.doma.Update;

/**
 */
@Dao(config = ${configClassName}.class)
public interface TBonusState37Dao {

    /**
     * @param accountId
     * @param bonusId
     * @return the TBonusState37 entity
     */
    @Select
    TBonusState37 selectById(Integer accountId, Integer bonusId);

    /**
     * @param entity
     * @return affected rows
     */
    @Insert
    int insert(TBonusState37 entity);

    /**
     * @param entity
     * @return affected rows
     */
    @Update
    int update(TBonusState37 entity);

    /**
     * @param entity
     * @return affected rows
     */
    @Delete
    int delete(TBonusState37 entity);
}