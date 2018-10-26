package com.example.sample.entity.operation;

import java.time.LocalDateTime;
import org.seasar.doma.Column;
import org.seasar.doma.Entity;
import org.seasar.doma.GeneratedValue;
import org.seasar.doma.GenerationType;
import org.seasar.doma.Id;
import org.seasar.doma.Table;

/**
 */
@Entity(listener = MNgWordListener.class)
@Table(name = "m_ng_word")
public class MNgWord {

    /** */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "serial_id")
    Long serialId;

    /** */
    @Column(name = "ng_word")
    String ngWord;

    /** */
    @Column(name = "del_flg")
    Integer delFlg;

    /** */
    @Column(name = "create_date")
    LocalDateTime createDate;

    /** 
     * Returns the serialId.
     * 
     * @return the serialId
     */
    public Long getSerialId() {
        return serialId;
    }

    /** 
     * Sets the serialId.
     * 
     * @param serialId the serialId
     */
    public void setSerialId(Long serialId) {
        this.serialId = serialId;
    }

    /** 
     * Returns the ngWord.
     * 
     * @return the ngWord
     */
    public String getNgWord() {
        return ngWord;
    }

    /** 
     * Sets the ngWord.
     * 
     * @param ngWord the ngWord
     */
    public void setNgWord(String ngWord) {
        this.ngWord = ngWord;
    }

    /** 
     * Returns the delFlg.
     * 
     * @return the delFlg
     */
    public Integer getDelFlg() {
        return delFlg;
    }

    /** 
     * Sets the delFlg.
     * 
     * @param delFlg the delFlg
     */
    public void setDelFlg(Integer delFlg) {
        this.delFlg = delFlg;
    }

    /** 
     * Returns the createDate.
     * 
     * @return the createDate
     */
    public LocalDateTime getCreateDate() {
        return createDate;
    }

    /** 
     * Sets the createDate.
     * 
     * @param createDate the createDate
     */
    public void setCreateDate(LocalDateTime createDate) {
        this.createDate = createDate;
    }
}