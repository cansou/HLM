package com.lj.business.weixin.domain;

import java.io.Serializable;
import java.util.Date;
/**
 * 
 * 类说明：朋友圈提示周期
 * <p>
 * 详细描述：
 * @Company: 扬恩科技有限公司
 * @author 李端强
 * CreateDate: 2018年1月26日16:49:16
 */
public class FriendPointCycle implements Serializable {
	/**
	 * 主键
	 */
    private String code;
    /**
     * 客户编号
     */
    private String memberNo;
    /**
     * 提示周期--天
     */
    private Integer cycle;

    /**
     * 上次操作时间
     */
    private Date lastTime;

    /**
     * 下次操作时间
     */
    private Date nextTime;

    /**
     * 创建人ID
     */
    private String createId;

    /**
     * 创建时间
     */
    private Date createDate;

    /**
     * 备注
     */
    private String remark;

    /**
     * 备注
     */
    private String remark2;

    /**
     * 备注
     */
    private String remark3;

    /**
     * 备注
     */
    private String remark4;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table friend_point_cycle
     *
     * @mbggenerated
     */
    private static final long serialVersionUID = 1L;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column friend_point_cycle.CODE
     *
     * @return the value of friend_point_cycle.CODE
     *
     * @mbggenerated
     */
    public String getCode() {
        return code;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column friend_point_cycle.CODE
     *
     * @param code the value for friend_point_cycle.CODE
     *
     * @mbggenerated
     */
    public void setCode(String code) {
        this.code = code == null ? null : code.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column friend_point_cycle.MEMBER_NO
     *
     * @return the value of friend_point_cycle.MEMBER_NO
     *
     * @mbggenerated
     */
    public String getMemberNo() {
        return memberNo;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column friend_point_cycle.MEMBER_NO
     *
     * @param memberNo the value for friend_point_cycle.MEMBER_NO
     *
     * @mbggenerated
     */
    public void setMemberNo(String memberNo) {
        this.memberNo = memberNo == null ? null : memberNo.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column friend_point_cycle.CYCLE
     *
     * @return the value of friend_point_cycle.CYCLE
     *
     * @mbggenerated
     */
    public Integer getCycle() {
        return cycle;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column friend_point_cycle.CYCLE
     *
     * @param cycle the value for friend_point_cycle.CYCLE
     *
     * @mbggenerated
     */
    public void setCycle(Integer cycle) {
        this.cycle = cycle;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column friend_point_cycle.LAST_TIME
     *
     * @return the value of friend_point_cycle.LAST_TIME
     *
     * @mbggenerated
     */
    public Date getLastTime() {
        return lastTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column friend_point_cycle.LAST_TIME
     *
     * @param lastTime the value for friend_point_cycle.LAST_TIME
     *
     * @mbggenerated
     */
    public void setLastTime(Date lastTime) {
        this.lastTime = lastTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column friend_point_cycle.NEXT_TIME
     *
     * @return the value of friend_point_cycle.NEXT_TIME
     *
     * @mbggenerated
     */
    public Date getNextTime() {
        return nextTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column friend_point_cycle.NEXT_TIME
     *
     * @param nextTime the value for friend_point_cycle.NEXT_TIME
     *
     * @mbggenerated
     */
    public void setNextTime(Date nextTime) {
        this.nextTime = nextTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column friend_point_cycle.CREATE_ID
     *
     * @return the value of friend_point_cycle.CREATE_ID
     *
     * @mbggenerated
     */
    public String getCreateId() {
        return createId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column friend_point_cycle.CREATE_ID
     *
     * @param createId the value for friend_point_cycle.CREATE_ID
     *
     * @mbggenerated
     */
    public void setCreateId(String createId) {
        this.createId = createId == null ? null : createId.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column friend_point_cycle.CREATE_DATE
     *
     * @return the value of friend_point_cycle.CREATE_DATE
     *
     * @mbggenerated
     */
    public Date getCreateDate() {
        return createDate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column friend_point_cycle.CREATE_DATE
     *
     * @param createDate the value for friend_point_cycle.CREATE_DATE
     *
     * @mbggenerated
     */
    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column friend_point_cycle.REMARK
     *
     * @return the value of friend_point_cycle.REMARK
     *
     * @mbggenerated
     */
    public String getRemark() {
        return remark;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column friend_point_cycle.REMARK
     *
     * @param remark the value for friend_point_cycle.REMARK
     *
     * @mbggenerated
     */
    public void setRemark(String remark) {
        this.remark = remark == null ? null : remark.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column friend_point_cycle.REMARK2
     *
     * @return the value of friend_point_cycle.REMARK2
     *
     * @mbggenerated
     */
    public String getRemark2() {
        return remark2;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column friend_point_cycle.REMARK2
     *
     * @param remark2 the value for friend_point_cycle.REMARK2
     *
     * @mbggenerated
     */
    public void setRemark2(String remark2) {
        this.remark2 = remark2 == null ? null : remark2.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column friend_point_cycle.REMARK3
     *
     * @return the value of friend_point_cycle.REMARK3
     *
     * @mbggenerated
     */
    public String getRemark3() {
        return remark3;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column friend_point_cycle.REMARK3
     *
     * @param remark3 the value for friend_point_cycle.REMARK3
     *
     * @mbggenerated
     */
    public void setRemark3(String remark3) {
        this.remark3 = remark3 == null ? null : remark3.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column friend_point_cycle.REMARK4
     *
     * @return the value of friend_point_cycle.REMARK4
     *
     * @mbggenerated
     */
    public String getRemark4() {
        return remark4;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column friend_point_cycle.REMARK4
     *
     * @param remark4 the value for friend_point_cycle.REMARK4
     *
     * @mbggenerated
     */
    public void setRemark4(String remark4) {
        this.remark4 = remark4 == null ? null : remark4.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table friend_point_cycle
     *
     * @mbggenerated
     */
    @Override
    public boolean equals(Object that) {
        if (this == that) {
            return true;
        }
        if (that == null) {
            return false;
        }
        if (getClass() != that.getClass()) {
            return false;
        }
        FriendPointCycle other = (FriendPointCycle) that;
        return (this.getCode() == null ? other.getCode() == null : this.getCode().equals(other.getCode()))
            && (this.getMemberNo() == null ? other.getMemberNo() == null : this.getMemberNo().equals(other.getMemberNo()))
            && (this.getCycle() == null ? other.getCycle() == null : this.getCycle().equals(other.getCycle()))
            && (this.getLastTime() == null ? other.getLastTime() == null : this.getLastTime().equals(other.getLastTime()))
            && (this.getNextTime() == null ? other.getNextTime() == null : this.getNextTime().equals(other.getNextTime()))
            && (this.getCreateId() == null ? other.getCreateId() == null : this.getCreateId().equals(other.getCreateId()))
            && (this.getCreateDate() == null ? other.getCreateDate() == null : this.getCreateDate().equals(other.getCreateDate()))
            && (this.getRemark() == null ? other.getRemark() == null : this.getRemark().equals(other.getRemark()))
            && (this.getRemark2() == null ? other.getRemark2() == null : this.getRemark2().equals(other.getRemark2()))
            && (this.getRemark3() == null ? other.getRemark3() == null : this.getRemark3().equals(other.getRemark3()))
            && (this.getRemark4() == null ? other.getRemark4() == null : this.getRemark4().equals(other.getRemark4()));
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table friend_point_cycle
     *
     * @mbggenerated
     */
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getCode() == null) ? 0 : getCode().hashCode());
        result = prime * result + ((getMemberNo() == null) ? 0 : getMemberNo().hashCode());
        result = prime * result + ((getCycle() == null) ? 0 : getCycle().hashCode());
        result = prime * result + ((getLastTime() == null) ? 0 : getLastTime().hashCode());
        result = prime * result + ((getNextTime() == null) ? 0 : getNextTime().hashCode());
        result = prime * result + ((getCreateId() == null) ? 0 : getCreateId().hashCode());
        result = prime * result + ((getCreateDate() == null) ? 0 : getCreateDate().hashCode());
        result = prime * result + ((getRemark() == null) ? 0 : getRemark().hashCode());
        result = prime * result + ((getRemark2() == null) ? 0 : getRemark2().hashCode());
        result = prime * result + ((getRemark3() == null) ? 0 : getRemark3().hashCode());
        result = prime * result + ((getRemark4() == null) ? 0 : getRemark4().hashCode());
        return result;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table friend_point_cycle
     *
     * @mbggenerated
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", code=").append(code);
        sb.append(", memberNo=").append(memberNo);
        sb.append(", cycle=").append(cycle);
        sb.append(", lastTime=").append(lastTime);
        sb.append(", nextTime=").append(nextTime);
        sb.append(", createId=").append(createId);
        sb.append(", createDate=").append(createDate);
        sb.append(", remark=").append(remark);
        sb.append(", remark2=").append(remark2);
        sb.append(", remark3=").append(remark3);
        sb.append(", remark4=").append(remark4);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}