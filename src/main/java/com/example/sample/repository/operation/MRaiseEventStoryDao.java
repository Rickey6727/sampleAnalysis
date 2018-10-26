package com.example.sample.repository.operation;

import com.example.sample.config.DomaConfig;
import com.example.sample.entity.operation.MRaiseEventStory;
import org.seasar.doma.Dao;
import org.seasar.doma.Delete;
import org.seasar.doma.Insert;
import org.seasar.doma.Select;
import org.seasar.doma.Update;

/**
 */
@Dao(config = DomaConfig.class)
public interface MRaiseEventStoryDao {

    /**
     * @param eventId
     * @return the MRaiseEventStory entity
     */
    @Select
    MRaiseEventStory selectById(Integer eventId);

    /**
     * @param entity
     * @return affected rows
     */
    @Insert
    int insert(MRaiseEventStory entity);

    /**
     * @param entity
     * @return affected rows
     */
    @Update
    int update(MRaiseEventStory entity);

    /**
     * @param entity
     * @return affected rows
     */
    @Delete
    int delete(MRaiseEventStory entity);
}