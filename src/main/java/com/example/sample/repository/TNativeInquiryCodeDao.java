package com.example.sample.repository;

import com.example.sample.entity.TNativeInquiryCode;
import org.seasar.doma.Dao;
import org.seasar.doma.Delete;
import org.seasar.doma.Insert;
import org.seasar.doma.Select;
import org.seasar.doma.Update;

/**
 */
@Dao(config = ${configClassName}.class)
public interface TNativeInquiryCodeDao {

    /**
     * @param accountId
     * @return the TNativeInquiryCode entity
     */
    @Select
    TNativeInquiryCode selectById(Integer accountId);

    /**
     * @param entity
     * @return affected rows
     */
    @Insert
    int insert(TNativeInquiryCode entity);

    /**
     * @param entity
     * @return affected rows
     */
    @Update
    int update(TNativeInquiryCode entity);

    /**
     * @param entity
     * @return affected rows
     */
    @Delete
    int delete(TNativeInquiryCode entity);
}