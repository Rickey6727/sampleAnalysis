package com.example.sample.repository.operation;

import java.util.Optional;

import com.example.sample.config.OperationConfig;
import com.example.sample.entity.operation.MNpcAccount;
import org.seasar.doma.Dao;
import org.seasar.doma.Delete;
import org.seasar.doma.Insert;
import org.seasar.doma.Update;
import org.seasar.doma.boot.ConfigAutowireable;

/**
 */
@ConfigAutowireable
@Dao(config = OperationConfig.class)
public interface MNpcAccountDao {

    /**
     * @param entity
     * @return affected rows
     */
    @Insert
    int insert(MNpcAccount entity);

    /**
     * @param entity
     * @return affected rows
     */
    @Update
    int update(MNpcAccount entity);

    /**
     * @param entity
     * @return affected rows
     */
    @Delete
    int delete(MNpcAccount entity);
}