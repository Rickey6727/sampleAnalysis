package com.example.sample.repository;

import com.example.sample.entity.TBonusState51;
import org.seasar.doma.Dao;
import org.seasar.doma.Delete;
import org.seasar.doma.Insert;
import org.seasar.doma.Select;
import org.seasar.doma.Update;

/**
 */
@Dao(config = ${configClassName}.class)
public interface TBonusState51Dao {

    /**
     * @param accountId
     * @param bonusId
     * @return the TBonusState51 entity
     */
    @Select
    TBonusState51 selectById(Integer accountId, Integer bonusId);

    /**
     * @param entity
     * @return affected rows
     */
    @Insert
    int insert(TBonusState51 entity);

    /**
     * @param entity
     * @return affected rows
     */
    @Update
    int update(TBonusState51 entity);

    /**
     * @param entity
     * @return affected rows
     */
    @Delete
    int delete(TBonusState51 entity);
}