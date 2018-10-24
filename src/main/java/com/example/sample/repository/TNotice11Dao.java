package com.example.sample.repository;

import com.example.sample.entity.TNotice11;
import org.seasar.doma.Dao;
import org.seasar.doma.Delete;
import org.seasar.doma.Insert;
import org.seasar.doma.Select;
import org.seasar.doma.Update;

/**
 */
@Dao(config = ${configClassName}.class)
public interface TNotice11Dao {

    /**
     * @param noticeId
     * @param accountId
     * @return the TNotice11 entity
     */
    @Select
    TNotice11 selectById(Long noticeId, Integer accountId);

    /**
     * @param entity
     * @return affected rows
     */
    @Insert
    int insert(TNotice11 entity);

    /**
     * @param entity
     * @return affected rows
     */
    @Update
    int update(TNotice11 entity);

    /**
     * @param entity
     * @return affected rows
     */
    @Delete
    int delete(TNotice11 entity);
}