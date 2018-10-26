package com.example.sample.entity.manage;

import java.time.LocalDateTime;
import org.seasar.doma.Column;
import org.seasar.doma.Entity;
import org.seasar.doma.Id;
import org.seasar.doma.Table;

/**
 */
@Entity(listener = TManageUserListener.class)
@Table(name = "t_manage_user")
public class TManageUser {

    /** */
    @Id
    @Column(name = "user_id")
    String userId;

    /** */
    @Column(name = "user_name")
    String userName;

    /** */
    @Column(name = "password")
    String password;

    /** */
    @Column(name = "role_type")
    Integer roleType;

    /** */
    @Column(name = "add_user_id")
    String addUserId;

    /** */
    @Column(name = "create_date")
    LocalDateTime createDate;

    /** */
    @Column(name = "update_date")
    LocalDateTime updateDate;

    /** 
     * Returns the userId.
     * 
     * @return the userId
     */
    public String getUserId() {
        return userId;
    }

    /** 
     * Sets the userId.
     * 
     * @param userId the userId
     */
    public void setUserId(String userId) {
        this.userId = userId;
    }

    /** 
     * Returns the userName.
     * 
     * @return the userName
     */
    public String getUserName() {
        return userName;
    }

    /** 
     * Sets the userName.
     * 
     * @param userName the userName
     */
    public void setUserName(String userName) {
        this.userName = userName;
    }

    /** 
     * Returns the password.
     * 
     * @return the password
     */
    public String getPassword() {
        return password;
    }

    /** 
     * Sets the password.
     * 
     * @param password the password
     */
    public void setPassword(String password) {
        this.password = password;
    }

    /** 
     * Returns the roleType.
     * 
     * @return the roleType
     */
    public Integer getRoleType() {
        return roleType;
    }

    /** 
     * Sets the roleType.
     * 
     * @param roleType the roleType
     */
    public void setRoleType(Integer roleType) {
        this.roleType = roleType;
    }

    /** 
     * Returns the addUserId.
     * 
     * @return the addUserId
     */
    public String getAddUserId() {
        return addUserId;
    }

    /** 
     * Sets the addUserId.
     * 
     * @param addUserId the addUserId
     */
    public void setAddUserId(String addUserId) {
        this.addUserId = addUserId;
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