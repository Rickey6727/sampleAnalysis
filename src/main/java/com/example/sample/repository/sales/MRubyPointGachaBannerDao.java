package com.example.sample.repository.sales;

import java.util.Optional;

import com.example.sample.config.DomaConfig;
import com.example.sample.entity.sales.MRubyPointGachaBanner;
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
public interface MRubyPointGachaBannerDao {

    /**
     * @param rubyId
     * @param gachaId
     * @param countryCd
     * @return the MRubyPointGachaBanner entity
     */
    @Select
    Optional<MRubyPointGachaBanner> selectById(Integer rubyId, Integer gachaId, Integer countryCd);

    /**
     * @param entity
     * @return affected rows
     */
    @Insert
    int insert(MRubyPointGachaBanner entity);

    /**
     * @param entity
     * @return affected rows
     */
    @Update
    int update(MRubyPointGachaBanner entity);

    /**
     * @param entity
     * @return affected rows
     */
    @Delete
    int delete(MRubyPointGachaBanner entity);
}