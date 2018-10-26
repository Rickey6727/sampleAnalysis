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
public class MRubyPointGrantListener implements EntityListener<MRubyPointGrant> {

    @Override
    public void preInsert(MRubyPointGrant entity, PreInsertContext<MRubyPointGrant> context) {
    }

    @Override
    public void preUpdate(MRubyPointGrant entity, PreUpdateContext<MRubyPointGrant> context) {
    }

    @Override
    public void preDelete(MRubyPointGrant entity, PreDeleteContext<MRubyPointGrant> context) {
    }

    @Override
    public void postInsert(MRubyPointGrant entity, PostInsertContext<MRubyPointGrant> context) {
    }

    @Override
    public void postUpdate(MRubyPointGrant entity, PostUpdateContext<MRubyPointGrant> context) {
    }

    @Override
    public void postDelete(MRubyPointGrant entity, PostDeleteContext<MRubyPointGrant> context) {
    }
}