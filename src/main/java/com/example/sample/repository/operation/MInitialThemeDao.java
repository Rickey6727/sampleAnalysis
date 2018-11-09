package com.example.sample.repository.operation;

import java.util.Optional;

import com.example.sample.config.DomaConfig;
import com.example.sample.entity.operation.MInitialTheme;
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
public interface MInitialThemeDao {

    /**
     * @param themeId
     * @param orderNo
     * @return the MInitialTheme entity
     */
    @Select
    Optional<MInitialTheme> selectById(Integer themeId, Integer orderNo);

    /**
     * @param entity
     * @return affected rows
     */
    @Insert
    int insert(MInitialTheme entity);

    /**
     * @param entity
     * @return affected rows
     */
    @Update
    int update(MInitialTheme entity);

    /**
     * @param entity
     * @return affected rows
     */
    @Delete
    int delete(MInitialTheme entity);
}