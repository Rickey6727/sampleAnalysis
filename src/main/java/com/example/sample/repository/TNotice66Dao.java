package com.example.sample.repository;

import com.example.sample.entity.TNotice66;
import org.seasar.doma.Dao;
import org.seasar.doma.Delete;
import org.seasar.doma.Insert;
import org.seasar.doma.Select;
import org.seasar.doma.Update;

/**
 */
@Dao(config = ${configClassName}.class)
public interface TNotice66Dao {

    /**
     * @param noticeId
     * @param accountId
     * @return the TNotice66 entity
     */
    @Select
    TNotice66 selectById(Long noticeId, Integer accountId);

    /**
     * @param entity
     * @return affected rows
     */
    @Insert
    int insert(TNotice66 entity);

    /**
     * @param entity
     * @return affected rows
     */
    @Update
    int update(TNotice66 entity);

    /**
     * @param entity
     * @return affected rows
     */
    @Delete
    int delete(TNotice66 entity);
}