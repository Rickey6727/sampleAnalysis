package com.example.sample.repository.operation;

import java.util.Optional;

import com.example.sample.config.DomaConfig;
import com.example.sample.entity.operation.MInformationSimpleText;
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
public interface MInformationSimpleTextDao {

    /**
     * @param infoId
     * @param countryCd
     * @return the MInformationSimpleText entity
     */
    @Select
    Optional<MInformationSimpleText> selectById(Integer infoId, Integer countryCd);

    /**
     * @param entity
     * @return affected rows
     */
    @Insert
    int insert(MInformationSimpleText entity);

    /**
     * @param entity
     * @return affected rows
     */
    @Update
    int update(MInformationSimpleText entity);

    /**
     * @param entity
     * @return affected rows
     */
    @Delete
    int delete(MInformationSimpleText entity);
}