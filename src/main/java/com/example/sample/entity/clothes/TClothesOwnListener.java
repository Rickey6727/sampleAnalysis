package com.example.sample.entity.clothes;

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
public class TClothesOwnListener implements EntityListener<TClothesOwn> {

    @Override
    public void preInsert(TClothesOwn entity, PreInsertContext<TClothesOwn> context) {
    }

    @Override
    public void preUpdate(TClothesOwn entity, PreUpdateContext<TClothesOwn> context) {
    }

    @Override
    public void preDelete(TClothesOwn entity, PreDeleteContext<TClothesOwn> context) {
    }

    @Override
    public void postInsert(TClothesOwn entity, PostInsertContext<TClothesOwn> context) {
    }

    @Override
    public void postUpdate(TClothesOwn entity, PostUpdateContext<TClothesOwn> context) {
    }

    @Override
    public void postDelete(TClothesOwn entity, PostDeleteContext<TClothesOwn> context) {
    }
}