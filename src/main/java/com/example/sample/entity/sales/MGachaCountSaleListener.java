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
public class MGachaCountSaleListener implements EntityListener<MGachaCountSale> {

    @Override
    public void preInsert(MGachaCountSale entity, PreInsertContext<MGachaCountSale> context) {
    }

    @Override
    public void preUpdate(MGachaCountSale entity, PreUpdateContext<MGachaCountSale> context) {
    }

    @Override
    public void preDelete(MGachaCountSale entity, PreDeleteContext<MGachaCountSale> context) {
    }

    @Override
    public void postInsert(MGachaCountSale entity, PostInsertContext<MGachaCountSale> context) {
    }

    @Override
    public void postUpdate(MGachaCountSale entity, PostUpdateContext<MGachaCountSale> context) {
    }

    @Override
    public void postDelete(MGachaCountSale entity, PostDeleteContext<MGachaCountSale> context) {
    }
}