package com.example.sample.entity;

import org.seasar.doma.jdbc.entity.EntityListener;
import org.seasar.doma.jdbc.entity.PostDeleteContext;
import org.seasar.doma.jdbc.entity.PostInsertContext;
import org.seasar.doma.jdbc.entity.PostUpdateContext;
import org.seasar.doma.jdbc.entity.PreDeleteContext;
import org.seasar.doma.jdbc.entity.PreInsertContext;
import org.seasar.doma.jdbc.entity.PreUpdateContext;

/**
 * 
 */
public class TConsumeItemOwnLimitedTime4Listener implements EntityListener<TConsumeItemOwnLimitedTime4> {

    @Override
    public void preInsert(TConsumeItemOwnLimitedTime4 entity, PreInsertContext<TConsumeItemOwnLimitedTime4> context) {
    }

    @Override
    public void preUpdate(TConsumeItemOwnLimitedTime4 entity, PreUpdateContext<TConsumeItemOwnLimitedTime4> context) {
    }

    @Override
    public void preDelete(TConsumeItemOwnLimitedTime4 entity, PreDeleteContext<TConsumeItemOwnLimitedTime4> context) {
    }

    @Override
    public void postInsert(TConsumeItemOwnLimitedTime4 entity, PostInsertContext<TConsumeItemOwnLimitedTime4> context) {
    }

    @Override
    public void postUpdate(TConsumeItemOwnLimitedTime4 entity, PostUpdateContext<TConsumeItemOwnLimitedTime4> context) {
    }

    @Override
    public void postDelete(TConsumeItemOwnLimitedTime4 entity, PostDeleteContext<TConsumeItemOwnLimitedTime4> context) {
    }
}