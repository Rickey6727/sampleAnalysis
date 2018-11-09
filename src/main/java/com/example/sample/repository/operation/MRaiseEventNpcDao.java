package com.example.sample.repository.operation;

import java.util.Optional;

import com.example.sample.config.DomaConfig;
import com.example.sample.entity.operation.MRaiseEventNpc;
import org.seasar.doma.Dao;
import org.seasar.doma.Delete;
import org.seasar.doma.Insert;
import org.seasar.doma.Select;
import org.seasar.doma.Update;
import org.seasar.doma.boot.ConfigAutowireable;

/**
 */
@ConfigAutowireable
@Dao(config = DomaConfig.class)
public interface MRaiseEventNpcDao {

    /**
     * @param eventId
     * @param rare
     * @return the MRaiseEventNpc entity
     */
    @Select
    Optional<MRaiseEventNpc> selectById(Integer eventId, Short rare);

    /**
     * @param entity
     * @return affected rows
     */
    @Insert
    int insert(MRaiseEventNpc entity);

    /**
     * @param entity
     * @return affected rows
     */
    @Update
    int update(MRaiseEventNpc entity);

    /**
     * @param entity
     * @return affected rows
     */
    @Delete
    int delete(MRaiseEventNpc entity);
}