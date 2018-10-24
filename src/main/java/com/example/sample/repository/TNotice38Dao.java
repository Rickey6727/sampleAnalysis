package com.example.sample.repository;

import com.example.sample.entity.TNotice38;
import org.seasar.doma.Dao;
import org.seasar.doma.Delete;
import org.seasar.doma.Insert;
import org.seasar.doma.Select;
import org.seasar.doma.Update;

/**
 */
@Dao(config = ${configClassName}.class)
public interface TNotice38Dao {

    /**
     * @param noticeId
     * @param accountId
     * @return the TNotice38 entity
     */
    @Select
    TNotice38 selectById(Long noticeId, Integer accountId);

    /**
     * @param entity
     * @return affected rows
     */
    @Insert
    int insert(TNotice38 entity);

    /**
     * @param entity
     * @return affected rows
     */
    @Update
    int update(TNotice38 entity);

    /**
     * @param entity
     * @return affected rows
     */
    @Delete
    int delete(TNotice38 entity);
}