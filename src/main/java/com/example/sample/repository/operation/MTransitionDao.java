package com.example.sample.repository.operation;

import java.util.Optional;

import com.example.sample.config.DomaConfig;
import com.example.sample.entity.operation.MTransition;
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
public interface MTransitionDao {

    /**
     * @param id
     * @return the MTransition entity
     */
    @Select
    Optional<MTransition> selectById(Integer id);

    /**
     * @param entity
     * @return affected rows
     */
    @Insert
    int insert(MTransition entity);

    /**
     * @param entity
     * @return affected rows
     */
    @Update
    int update(MTransition entity);

    /**
     * @param entity
     * @return affected rows
     */
    @Delete
    int delete(MTransition entity);
}