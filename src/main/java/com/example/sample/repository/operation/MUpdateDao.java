package com.example.sample.repository.operation;

import java.util.Optional;

import com.example.sample.config.DomaConfig;
import com.example.sample.entity.operation.MUpdate;
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
public interface MUpdateDao {

    /**
     * @param updateId
     * @return the MUpdate entity
     */
    @Select
    Optional<MUpdate> selectById(Integer updateId);

    /**
     * @param entity
     * @return affected rows
     */
    @Insert
    int insert(MUpdate entity);

    /**
     * @param entity
     * @return affected rows
     */
    @Update
    int update(MUpdate entity);

    /**
     * @param entity
     * @return affected rows
     */
    @Delete
    int delete(MUpdate entity);
}