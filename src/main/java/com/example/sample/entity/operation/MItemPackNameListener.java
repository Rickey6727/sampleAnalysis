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
public class MItemPackNameListener implements EntityListener<MItemPackName> {

    @Override
    public void preInsert(MItemPackName entity, PreInsertContext<MItemPackName> context) {
    }

    @Override
    public void preUpdate(MItemPackName entity, PreUpdateContext<MItemPackName> context) {
    }

    @Override
    public void preDelete(MItemPackName entity, PreDeleteContext<MItemPackName> context) {
    }

    @Override
    public void postInsert(MItemPackName entity, PostInsertContext<MItemPackName> context) {
    }

    @Override
    public void postUpdate(MItemPackName entity, PostUpdateContext<MItemPackName> context) {
    }

    @Override
    public void postDelete(MItemPackName entity, PostDeleteContext<MItemPackName> context) {
    }
}