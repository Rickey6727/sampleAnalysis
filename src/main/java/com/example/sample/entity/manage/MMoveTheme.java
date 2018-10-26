package com.example.sample.entity.manage;

import org.seasar.doma.Column;
import org.seasar.doma.Entity;
import org.seasar.doma.Table;

/**
 */
@Entity(listener = MMoveThemeListener.class)
@Table(name = "m_move_theme")
public class MMoveTheme {

    /** */
    @Column(name = "before_theme_id")
    Integer beforeThemeId;

    /** */
    @Column(name = "after_theme_id")
    Integer afterThemeId;

    /** 
     * Returns the beforeThemeId.
     * 
     * @return the beforeThemeId
     */
    public Integer getBeforeThemeId() {
        return beforeThemeId;
    }

    /** 
     * Sets the beforeThemeId.
     * 
     * @param beforeThemeId the beforeThemeId
     */
    public void setBeforeThemeId(Integer beforeThemeId) {
        this.beforeThemeId = beforeThemeId;
    }

    /** 
     * Returns the afterThemeId.
     * 
     * @return the afterThemeId
     */
    public Integer getAfterThemeId() {
        return afterThemeId;
    }

    /** 
     * Sets the afterThemeId.
     * 
     * @param afterThemeId the afterThemeId
     */
    public void setAfterThemeId(Integer afterThemeId) {
        this.afterThemeId = afterThemeId;
    }
}