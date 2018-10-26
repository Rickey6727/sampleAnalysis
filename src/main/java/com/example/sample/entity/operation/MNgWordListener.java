package com.example.sample.entity.operation;

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
public class MNgWordListener implements EntityListener<MNgWord> {

    @Override
    public void preInsert(MNgWord entity, PreInsertContext<MNgWord> context) {
    }

    @Override
    public void preUpdate(MNgWord entity, PreUpdateContext<MNgWord> context) {
    }

    @Override
    public void preDelete(MNgWord entity, PreDeleteContext<MNgWord> context) {
    }

    @Override
    public void postInsert(MNgWord entity, PostInsertContext<MNgWord> context) {
    }

    @Override
    public void postUpdate(MNgWord entity, PostUpdateContext<MNgWord> context) {
    }

    @Override
    public void postDelete(MNgWord entity, PostDeleteContext<MNgWord> context) {
    }
}