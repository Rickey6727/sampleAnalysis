package com.example.sample.entity.sales;

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
public class MGachaListener implements EntityListener<MGacha> {

    @Override
    public void preInsert(MGacha entity, PreInsertContext<MGacha> context) {
    }

    @Override
    public void preUpdate(MGacha entity, PreUpdateContext<MGacha> context) {
    }

    @Override
    public void preDelete(MGacha entity, PreDeleteContext<MGacha> context) {
    }

    @Override
    public void postInsert(MGacha entity, PostInsertContext<MGacha> context) {
    }

    @Override
    public void postUpdate(MGacha entity, PostUpdateContext<MGacha> context) {
    }

    @Override
    public void postDelete(MGacha entity, PostDeleteContext<MGacha> context) {
    }
}