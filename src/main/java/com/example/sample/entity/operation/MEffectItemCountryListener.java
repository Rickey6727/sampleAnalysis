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
public class MEffectItemCountryListener implements EntityListener<MEffectItemCountry> {

    @Override
    public void preInsert(MEffectItemCountry entity, PreInsertContext<MEffectItemCountry> context) {
    }

    @Override
    public void preUpdate(MEffectItemCountry entity, PreUpdateContext<MEffectItemCountry> context) {
    }

    @Override
    public void preDelete(MEffectItemCountry entity, PreDeleteContext<MEffectItemCountry> context) {
    }

    @Override
    public void postInsert(MEffectItemCountry entity, PostInsertContext<MEffectItemCountry> context) {
    }

    @Override
    public void postUpdate(MEffectItemCountry entity, PostUpdateContext<MEffectItemCountry> context) {
    }

    @Override
    public void postDelete(MEffectItemCountry entity, PostDeleteContext<MEffectItemCountry> context) {
    }
}