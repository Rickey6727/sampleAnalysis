package com.example.sample.entity.operation;

import java.time.LocalDateTime;
import org.seasar.doma.Column;
import org.seasar.doma.Entity;
import org.seasar.doma.Id;
import org.seasar.doma.Table;

/**
 */
@Entity(listener = MNpcNameCountryListener.class)
@Table(name = "m_npc_name_country")
public class MNpcNameCountry {

    /** */
    @Id
    @Column(name = "npc_id")
    Integer npcId;

    /** */
    @Id
    @Column(name = "country_cd")
    Integer countryCd;

    /** */
    @Column(name = "nickname")
    String nickname;

    /** */
    @Column(name = "one_word")
    String oneWord;

    /** */
    @Column(name = "create_date")
    LocalDateTime createDate;

    /** */
    @Column(name = "update_date")
    LocalDateTime updateDate;

    /** 
     * Returns the npcId.
     * 
     * @return the npcId
     */
    public Integer getNpcId() {
        return npcId;
    }

    /** 
     * Sets the npcId.
     * 
     * @param npcId the npcId
     */
    public void setNpcId(Integer npcId) {
        this.npcId = npcId;
    }

    /** 
     * Returns the countryCd.
     * 
     * @return the countryCd
     */
    public Integer getCountryCd() {
        return countryCd;
    }

    /** 
     * Sets the countryCd.
     * 
     * @param countryCd the countryCd
     */
    public void setCountryCd(Integer countryCd) {
        this.countryCd = countryCd;
    }

    /** 
     * Returns the nickname.
     * 
     * @return the nickname
     */
    public String getNickname() {
        return nickname;
    }

    /** 
     * Sets the nickname.
     * 
     * @param nickname the nickname
     */
    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    /** 
     * Returns the oneWord.
     * 
     * @return the oneWord
     */
    public String getOneWord() {
        return oneWord;
    }

    /** 
     * Sets the oneWord.
     * 
     * @param oneWord the oneWord
     */
    public void setOneWord(String oneWord) {
        this.oneWord = oneWord;
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

    /** 
     * Returns the updateDate.
     * 
     * @return the updateDate
     */
    public LocalDateTime getUpdateDate() {
        return updateDate;
    }

    /** 
     * Sets the updateDate.
     * 
     * @param updateDate the updateDate
     */
    public void setUpdateDate(LocalDateTime updateDate) {
        this.updateDate = updateDate;
    }
}