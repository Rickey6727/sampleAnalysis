package com.example.sample.entity.game;

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
public class MStableListener implements EntityListener<MStable> {

    @Override
    public void preInsert(MStable entity, PreInsertContext<MStable> context) {
    }

    @Override
    public void preUpdate(MStable entity, PreUpdateContext<MStable> context) {
    }

    @Override
    public void preDelete(MStable entity, PreDeleteContext<MStable> context) {
    }

    @Override
    public void postInsert(MStable entity, PostInsertContext<MStable> context) {
    }

    @Override
    public void postUpdate(MStable entity, PostUpdateContext<MStable> context) {
    }

    @Override
    public void postDelete(MStable entity, PostDeleteContext<MStable> context) {
    }
}