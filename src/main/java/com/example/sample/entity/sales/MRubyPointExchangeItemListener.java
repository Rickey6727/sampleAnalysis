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
public class MRubyPointExchangeItemListener implements EntityListener<MRubyPointExchangeItem> {

    @Override
    public void preInsert(MRubyPointExchangeItem entity, PreInsertContext<MRubyPointExchangeItem> context) {
    }

    @Override
    public void preUpdate(MRubyPointExchangeItem entity, PreUpdateContext<MRubyPointExchangeItem> context) {
    }

    @Override
    public void preDelete(MRubyPointExchangeItem entity, PreDeleteContext<MRubyPointExchangeItem> context) {
    }

    @Override
    public void postInsert(MRubyPointExchangeItem entity, PostInsertContext<MRubyPointExchangeItem> context) {
    }

    @Override
    public void postUpdate(MRubyPointExchangeItem entity, PostUpdateContext<MRubyPointExchangeItem> context) {
    }

    @Override
    public void postDelete(MRubyPointExchangeItem entity, PostDeleteContext<MRubyPointExchangeItem> context) {
    }
}