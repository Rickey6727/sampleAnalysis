package com.example.sample.repository;

import com.example.sample.entity.TNotice54;
import org.seasar.doma.Dao;
import org.seasar.doma.Delete;
import org.seasar.doma.Insert;
import org.seasar.doma.Select;
import org.seasar.doma.Update;

/**
 */
@Dao(config = ${configClassName}.class)
public interface TNotice54Dao {

    /**
     * @param noticeId
     * @param accountId
     * @return the TNotice54 entity
     */
    @Select
    TNotice54 selectById(Long noticeId, Integer accountId);

    /**
     * @param entity
     * @return affected rows
     */
    @Insert
    int insert(TNotice54 entity);

    /**
     * @param entity
     * @return affected rows
     */
    @Update
    int update(TNotice54 entity);

    /**
     * @param entity
     * @return affected rows
     */
    @Delete
    int delete(TNotice54 entity);
}