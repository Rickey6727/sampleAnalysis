package com.example.sample.repository.manage;

import com.example.sample.config.DomaConfig;
import com.example.sample.entity.manage.TGuildChatHistory;
import org.seasar.doma.Dao;
import org.seasar.doma.Delete;
import org.seasar.doma.Insert;
import org.seasar.doma.Update;

/**
 */
@Dao(config = DomaConfig.class)
public interface TGuildChatHistoryDao {

    /**
     * @param entity
     * @return affected rows
     */
    @Insert
    int insert(TGuildChatHistory entity);

    /**
     * @param entity
     * @return affected rows
     */
    @Update
    int update(TGuildChatHistory entity);

    /**
     * @param entity
     * @return affected rows
     */
    @Delete
    int delete(TGuildChatHistory entity);
}