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
public class MAppearanceListener implements EntityListener<MAppearance> {

    @Override
    public void preInsert(MAppearance entity, PreInsertContext<MAppearance> context) {
    }

    @Override
    public void preUpdate(MAppearance entity, PreUpdateContext<MAppearance> context) {
    }

    @Override
    public void preDelete(MAppearance entity, PreDeleteContext<MAppearance> context) {
    }

    @Override
    public void postInsert(MAppearance entity, PostInsertContext<MAppearance> context) {
    }

    @Override
    public void postUpdate(MAppearance entity, PostUpdateContext<MAppearance> context) {
    }

    @Override
    public void postDelete(MAppearance entity, PostDeleteContext<MAppearance> context) {
    }
}