package com.example.sample.entity.sales;

import org.seasar.doma.Column;
import org.seasar.doma.Entity;
import org.seasar.doma.Id;
import org.seasar.doma.Table;

/**
 */
@Entity(listener = FooListener.class)
@Table(name = "Foo")
public class Foo {

    /** */
    @Id
    @Column(name = "f1")
    Integer f1;

    /** */
    @Id
    @Column(name = "f2")
    String f2;

    /** */
    @Column(name = "f3")
    String f3;

    /** 
     * Returns the f1.
     * 
     * @return the f1
     */
    public Integer getF1() {
        return f1;
    }

    /** 
     * Sets the f1.
     * 
     * @param f1 the f1
     */
    public void setF1(Integer f1) {
        this.f1 = f1;
    }

    /** 
     * Returns the f2.
     * 
     * @return the f2
     */
    public String getF2() {
        return f2;
    }

    /** 
     * Sets the f2.
     * 
     * @param f2 the f2
     */
    public void setF2(String f2) {
        this.f2 = f2;
    }

    /** 
     * Returns the f3.
     * 
     * @return the f3
     */
    public String getF3() {
        return f3;
    }

    /** 
     * Sets the f3.
     * 
     * @param f3 the f3
     */
    public void setF3(String f3) {
        this.f3 = f3;
    }
}