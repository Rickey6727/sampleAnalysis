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
public class TPaidBallListener implements EntityListener<TPaidBall> {

    @Override
    public void preInsert(TPaidBall entity, PreInsertContext<TPaidBall> context) {
    }

    @Override
    public void preUpdate(TPaidBall entity, PreUpdateContext<TPaidBall> context) {
    }

    @Override
    public void preDelete(TPaidBall entity, PreDeleteContext<TPaidBall> context) {
    }

    @Override
    public void postInsert(TPaidBall entity, PostInsertContext<TPaidBall> context) {
    }

    @Override
    public void postUpdate(TPaidBall entity, PostUpdateContext<TPaidBall> context) {
    }

    @Override
    public void postDelete(TPaidBall entity, PostDeleteContext<TPaidBall> context) {
    }
}