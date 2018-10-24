package com.example.sample.repository;

import com.example.sample.entity.TCheerNotice;
import org.seasar.doma.Dao;
import org.seasar.doma.Delete;
import org.seasar.doma.Insert;
import org.seasar.doma.Select;
import org.seasar.doma.Update;

/**
 */
@Dao(config = ${configClassName}.class)
public interface TCheerNoticeDao {

    /**
     * @param accountId
     * @return the TCheerNotice entity
     */
    @Select
    TCheerNotice selectById(Integer accountId);

    /**
     * @param entity
     * @return affected rows
     */
    @Insert
    int insert(TCheerNotice entity);

    /**
     * @param entity
     * @return affected rows
     */
    @Update
    int update(TCheerNotice entity);

    /**
     * @param entity
     * @return affected rows
     */
    @Delete
    int delete(TCheerNotice entity);
}