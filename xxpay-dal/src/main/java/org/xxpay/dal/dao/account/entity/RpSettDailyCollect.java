package org.xxpay.dal.dao.account.entity;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

public class RpSettDailyCollect implements Serializable {
    /**
     * id
     *
     * @mbggenerated
     */
    private String id;

    /**
     * 版本号
     *
     * @mbggenerated
     */
    private Integer version;

    /**
     * 创建时间
     *
     * @mbggenerated
     */
    private Date create_time;

    /**
     * 修改时间
     *
     * @mbggenerated
     */
    private Date edit_time;

    /**
     * 账户编号
     *
     * @mbggenerated
     */
    private String account_no;

    /**
     * 用户姓名
     *
     * @mbggenerated
     */
    private String user_name;

    /**
     * 汇总日期
     *
     * @mbggenerated
     */
    private Date collect_date;

    /**
     * 汇总类型(参考枚举:settdailycollecttypeenum)
     *
     * @mbggenerated
     */
    private String collect_type;

    /**
     * 交易总金额
     *
     * @mbggenerated
     */
    private BigDecimal total_amount;

    /**
     * 交易总笔数
     *
     * @mbggenerated
     */
    private Integer total_count;

    /**
     * 结算状态(参考枚举:settdailycollectstatusenum)
     *
     * @mbggenerated
     */
    private String sett_status;

    /**
     * 备注
     *
     * @mbggenerated
     */
    private String remark;

    /**
     * 风险预存期天数
     *
     * @mbggenerated
     */
    private Integer risk_day;

    private static final long serialVersionUID = 1L;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Integer getVersion() {
        return version;
    }

    public void setVersion(Integer version) {
        this.version = version;
    }

    public Date getCreate_time() {
        return create_time;
    }

    public void setCreate_time(Date create_time) {
        this.create_time = create_time;
    }

    public Date getEdit_time() {
        return edit_time;
    }

    public void setEdit_time(Date edit_time) {
        this.edit_time = edit_time;
    }

    public String getAccount_no() {
        return account_no;
    }

    public void setAccount_no(String account_no) {
        this.account_no = account_no;
    }

    public String getUser_name() {
        return user_name;
    }

    public void setUser_name(String user_name) {
        this.user_name = user_name;
    }

    public Date getCollect_date() {
        return collect_date;
    }

    public void setCollect_date(Date collect_date) {
        this.collect_date = collect_date;
    }

    public String getCollect_type() {
        return collect_type;
    }

    public void setCollect_type(String collect_type) {
        this.collect_type = collect_type;
    }

    public BigDecimal getTotal_amount() {
        return total_amount;
    }

    public void setTotal_amount(BigDecimal total_amount) {
        this.total_amount = total_amount;
    }

    public Integer getTotal_count() {
        return total_count;
    }

    public void setTotal_count(Integer total_count) {
        this.total_count = total_count;
    }

    public String getSett_status() {
        return sett_status;
    }

    public void setSett_status(String sett_status) {
        this.sett_status = sett_status;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public Integer getRisk_day() {
        return risk_day;
    }

    public void setRisk_day(Integer risk_day) {
        this.risk_day = risk_day;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", version=").append(version);
        sb.append(", create_time=").append(create_time);
        sb.append(", edit_time=").append(edit_time);
        sb.append(", account_no=").append(account_no);
        sb.append(", user_name=").append(user_name);
        sb.append(", collect_date=").append(collect_date);
        sb.append(", collect_type=").append(collect_type);
        sb.append(", total_amount=").append(total_amount);
        sb.append(", total_count=").append(total_count);
        sb.append(", sett_status=").append(sett_status);
        sb.append(", remark=").append(remark);
        sb.append(", risk_day=").append(risk_day);
        sb.append("]");
        return sb.toString();
    }

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
        RpSettDailyCollect other = (RpSettDailyCollect) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getVersion() == null ? other.getVersion() == null : this.getVersion().equals(other.getVersion()))
            && (this.getCreate_time() == null ? other.getCreate_time() == null : this.getCreate_time().equals(other.getCreate_time()))
            && (this.getEdit_time() == null ? other.getEdit_time() == null : this.getEdit_time().equals(other.getEdit_time()))
            && (this.getAccount_no() == null ? other.getAccount_no() == null : this.getAccount_no().equals(other.getAccount_no()))
            && (this.getUser_name() == null ? other.getUser_name() == null : this.getUser_name().equals(other.getUser_name()))
            && (this.getCollect_date() == null ? other.getCollect_date() == null : this.getCollect_date().equals(other.getCollect_date()))
            && (this.getCollect_type() == null ? other.getCollect_type() == null : this.getCollect_type().equals(other.getCollect_type()))
            && (this.getTotal_amount() == null ? other.getTotal_amount() == null : this.getTotal_amount().equals(other.getTotal_amount()))
            && (this.getTotal_count() == null ? other.getTotal_count() == null : this.getTotal_count().equals(other.getTotal_count()))
            && (this.getSett_status() == null ? other.getSett_status() == null : this.getSett_status().equals(other.getSett_status()))
            && (this.getRemark() == null ? other.getRemark() == null : this.getRemark().equals(other.getRemark()))
            && (this.getRisk_day() == null ? other.getRisk_day() == null : this.getRisk_day().equals(other.getRisk_day()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getVersion() == null) ? 0 : getVersion().hashCode());
        result = prime * result + ((getCreate_time() == null) ? 0 : getCreate_time().hashCode());
        result = prime * result + ((getEdit_time() == null) ? 0 : getEdit_time().hashCode());
        result = prime * result + ((getAccount_no() == null) ? 0 : getAccount_no().hashCode());
        result = prime * result + ((getUser_name() == null) ? 0 : getUser_name().hashCode());
        result = prime * result + ((getCollect_date() == null) ? 0 : getCollect_date().hashCode());
        result = prime * result + ((getCollect_type() == null) ? 0 : getCollect_type().hashCode());
        result = prime * result + ((getTotal_amount() == null) ? 0 : getTotal_amount().hashCode());
        result = prime * result + ((getTotal_count() == null) ? 0 : getTotal_count().hashCode());
        result = prime * result + ((getSett_status() == null) ? 0 : getSett_status().hashCode());
        result = prime * result + ((getRemark() == null) ? 0 : getRemark().hashCode());
        result = prime * result + ((getRisk_day() == null) ? 0 : getRisk_day().hashCode());
        return result;
    }
}