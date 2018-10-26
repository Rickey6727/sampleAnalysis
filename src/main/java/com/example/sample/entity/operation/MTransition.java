package com.example.sample.entity.operation;

import org.seasar.doma.Column;
import org.seasar.doma.Entity;
import org.seasar.doma.Id;
import org.seasar.doma.Table;

/**
 */
@Entity(listener = MTransitionListener.class)
@Table(name = "m_transition")
public class MTransition {

    /** */
    @Id
    @Column(name = "id")
    Integer id;

    /** */
    @Column(name = "path")
    String path;

    /** 
     * Returns the id.
     * 
     * @return the id
     */
    public Integer getId() {
        return id;
    }

    /** 
     * Sets the id.
     * 
     * @param id the id
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /** 
     * Returns the path.
     * 
     * @return the path
     */
    public String getPath() {
        return path;
    }

    /** 
     * Sets the path.
     * 
     * @param path the path
     */
    public void setPath(String path) {
        this.path = path;
    }
}