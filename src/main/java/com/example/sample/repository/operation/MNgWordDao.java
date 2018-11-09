package com.example.sample.repository.operation;

import java.util.Optional;

import com.example.sample.config.DomaConfig;
import com.example.sample.entity.operation.MNgWord;
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
public interface MNgWordDao {

    /**
     * @param serialId
     * @return the MNgWord entity
     */
    @Select
    Optional<MNgWord> selectById(Long serialId);

    /**
     * @param entity
     * @return affected rows
     */
    @Insert
    int insert(MNgWord entity);

    /**
     * @param entity
     * @return affected rows
     */
    @Update
    int update(MNgWord entity);

    /**
     * @param entity
     * @return affected rows
     */
    @Delete
    int delete(MNgWord entity);
}