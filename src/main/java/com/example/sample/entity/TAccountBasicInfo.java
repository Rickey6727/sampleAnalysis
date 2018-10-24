package com.example.sample.entity;

import java.time.LocalDateTime;
import org.seasar.doma.Column;
import org.seasar.doma.Entity;
import org.seasar.doma.Id;
import org.seasar.doma.Table;

/**
 * アカウント基本情報テーブル
 */
@Entity(listener = TAccountBasicInfoListener.class)
@Table(name = "t_account_basic_info")
public class TAccountBasicInfo {

    /** アカウントID */
    @Id
    @Column(name = "account_id")
    Integer accountId;

    /** ニックネーム */
    @Column(name = "nickname")
    String nickname;

    /** 性別 */
    @Column(name = "sex")
    Integer sex;

    /** 国ID */
    @Column(name = "country_id")
    Integer countryId;

    /** 誕生日(年/西暦) */
    @Column(name = "birth_year")
    Integer birthYear;

    /** 誕生日(月) */
    @Column(name = "birth_month")
    Integer birthMonth;

    /** 誕生日(日) */
    @Column(name = "birth_day")
    Integer birthDay;

    /** ストーンID */
    @Column(name = "stone_id")
    Integer stoneId;

    /** 招待コード */
    @Column(name = "invite_cd")
    String inviteCd;

    /** 一言 */
    @Column(name = "one_word")
    String oneWord;

    /** レビュー起動フラグ */
    @Column(name = "review_activation_flg")
    Integer reviewActivationFlg;

    /** 登録日時 */
    @Column(name = "create_date")
    LocalDateTime createDate;

    /** 更新日時 */
    @Column(name = "update_date")
    LocalDateTime updateDate;

    /** 
     * Returns the accountId.
     * 
     * @return the accountId
     */
    public Integer getAccountId() {
        return accountId;
    }

    /** 
     * Sets the accountId.
     * 
     * @param accountId the accountId
     */
    public void setAccountId(Integer accountId) {
        this.accountId = accountId;
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
     * Returns the sex.
     * 
     * @return the sex
     */
    public Integer getSex() {
        return sex;
    }

    /** 
     * Sets the sex.
     * 
     * @param sex the sex
     */
    public void setSex(Integer sex) {
        this.sex = sex;
    }

    /** 
     * Returns the countryId.
     * 
     * @return the countryId
     */
    public Integer getCountryId() {
        return countryId;
    }

    /** 
     * Sets the countryId.
     * 
     * @param countryId the countryId
     */
    public void setCountryId(Integer countryId) {
        this.countryId = countryId;
    }

    /** 
     * Returns the birthYear.
     * 
     * @return the birthYear
     */
    public Integer getBirthYear() {
        return birthYear;
    }

    /** 
     * Sets the birthYear.
     * 
     * @param birthYear the birthYear
     */
    public void setBirthYear(Integer birthYear) {
        this.birthYear = birthYear;
    }

    /** 
     * Returns the birthMonth.
     * 
     * @return the birthMonth
     */
    public Integer getBirthMonth() {
        return birthMonth;
    }

    /** 
     * Sets the birthMonth.
     * 
     * @param birthMonth the birthMonth
     */
    public void setBirthMonth(Integer birthMonth) {
        this.birthMonth = birthMonth;
    }

    /** 
     * Returns the birthDay.
     * 
     * @return the birthDay
     */
    public Integer getBirthDay() {
        return birthDay;
    }

    /** 
     * Sets the birthDay.
     * 
     * @param birthDay the birthDay
     */
    public void setBirthDay(Integer birthDay) {
        this.birthDay = birthDay;
    }

    /** 
     * Returns the stoneId.
     * 
     * @return the stoneId
     */
    public Integer getStoneId() {
        return stoneId;
    }

    /** 
     * Sets the stoneId.
     * 
     * @param stoneId the stoneId
     */
    public void setStoneId(Integer stoneId) {
        this.stoneId = stoneId;
    }

    /** 
     * Returns the inviteCd.
     * 
     * @return the inviteCd
     */
    public String getInviteCd() {
        return inviteCd;
    }

    /** 
     * Sets the inviteCd.
     * 
     * @param inviteCd the inviteCd
     */
    public void setInviteCd(String inviteCd) {
        this.inviteCd = inviteCd;
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
     * Returns the reviewActivationFlg.
     * 
     * @return the reviewActivationFlg
     */
    public Integer getReviewActivationFlg() {
        return reviewActivationFlg;
    }

    /** 
     * Sets the reviewActivationFlg.
     * 
     * @param reviewActivationFlg the reviewActivationFlg
     */
    public void setReviewActivationFlg(Integer reviewActivationFlg) {
        this.reviewActivationFlg = reviewActivationFlg;
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