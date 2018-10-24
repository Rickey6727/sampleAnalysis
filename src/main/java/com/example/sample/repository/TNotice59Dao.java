package com.example.sample.repository;

import com.example.sample.entity.TNotice59;
import org.seasar.doma.Dao;
import org.seasar.doma.Delete;
import org.seasar.doma.Insert;
import org.seasar.doma.Select;
import org.seasar.doma.Update;

/**
 */
@Dao(config = ${configClassName}.class)
public interface TNotice59Dao {

    /**
     * @param noticeId
     * @param accountId
     * @return the TNotice59 entity
     */
    @Select
    TNotice59 selectById(Long noticeId, Integer accountId);

    /**
     * @param entity
     * @return affected rows
     */
    @Insert
    int insert(TNotice59 entity);

    /**
     * @param entity
     * @return affected rows
     */
    @Update
    int update(TNotice59 entity);

    /**
     * @param entity
     * @return affected rows
     */
    @Delete
    int delete(TNotice59 entity);
}