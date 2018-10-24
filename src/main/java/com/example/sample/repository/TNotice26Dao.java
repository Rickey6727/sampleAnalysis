package com.example.sample.repository;

import com.example.sample.entity.TNotice26;
import org.seasar.doma.Dao;
import org.seasar.doma.Delete;
import org.seasar.doma.Insert;
import org.seasar.doma.Select;
import org.seasar.doma.Update;

/**
 */
@Dao(config = ${configClassName}.class)
public interface TNotice26Dao {

    /**
     * @param noticeId
     * @param accountId
     * @return the TNotice26 entity
     */
    @Select
    TNotice26 selectById(Long noticeId, Integer accountId);

    /**
     * @param entity
     * @return affected rows
     */
    @Insert
    int insert(TNotice26 entity);

    /**
     * @param entity
     * @return affected rows
     */
    @Update
    int update(TNotice26 entity);

    /**
     * @param entity
     * @return affected rows
     */
    @Delete
    int delete(TNotice26 entity);
}