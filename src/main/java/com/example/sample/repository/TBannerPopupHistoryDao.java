package com.example.sample.repository;

import com.example.sample.entity.TBannerPopupHistory;
import org.seasar.doma.Dao;
import org.seasar.doma.Delete;
import org.seasar.doma.Insert;
import org.seasar.doma.Select;
import org.seasar.doma.Update;

/**
 */
@Dao(config = ${configClassName}.class)
public interface TBannerPopupHistoryDao {

    /**
     * @param bannerId
     * @param accountId
     * @return the TBannerPopupHistory entity
     */
    @Select
    TBannerPopupHistory selectById(Integer bannerId, Integer accountId);

    /**
     * @param entity
     * @return affected rows
     */
    @Insert
    int insert(TBannerPopupHistory entity);

    /**
     * @param entity
     * @return affected rows
     */
    @Update
    int update(TBannerPopupHistory entity);

    /**
     * @param entity
     * @return affected rows
     */
    @Delete
    int delete(TBannerPopupHistory entity);
}