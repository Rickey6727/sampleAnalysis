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
public class MInitialClothesListener implements EntityListener<MInitialClothes> {

    @Override
    public void preInsert(MInitialClothes entity, PreInsertContext<MInitialClothes> context) {
    }

    @Override
    public void preUpdate(MInitialClothes entity, PreUpdateContext<MInitialClothes> context) {
    }

    @Override
    public void preDelete(MInitialClothes entity, PreDeleteContext<MInitialClothes> context) {
    }

    @Override
    public void postInsert(MInitialClothes entity, PostInsertContext<MInitialClothes> context) {
    }

    @Override
    public void postUpdate(MInitialClothes entity, PostUpdateContext<MInitialClothes> context) {
    }

    @Override
    public void postDelete(MInitialClothes entity, PostDeleteContext<MInitialClothes> context) {
    }
}