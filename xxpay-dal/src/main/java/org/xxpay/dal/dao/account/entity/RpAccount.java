package org.xxpay.dal.dao.account.entity;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

public class RpAccount implements Serializable {
    private String id;

    private Date create_time;

    private Date edit_time;

    private Long version;

    private String remark;

    private String account_no;

    private BigDecimal balance;

    private BigDecimal unbalance;

    private BigDecimal security_money;

    private String status;

    private BigDecimal total_income;

    private BigDecimal total_expend;

    private BigDecimal today_income;

    private BigDecimal today_expend;

    private String account_type;

    private BigDecimal sett_amount;

    private String user_no;

    private static final long serialVersionUID = 1L;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
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

    public Long getVersion() {
        return version;
    }

    public void setVersion(Long version) {
        this.version = version;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public String getAccount_no() {
        return account_no;
    }

    public void setAccount_no(String account_no) {
        this.account_no = account_no;
    }

    public BigDecimal getBalance() {
        return balance;
    }

    public void setBalance(BigDecimal balance) {
        this.balance = balance;
    }

    public BigDecimal getUnbalance() {
        return unbalance;
    }

    public void setUnbalance(BigDecimal unbalance) {
        this.unbalance = unbalance;
    }

    public BigDecimal getSecurity_money() {
        return security_money;
    }

    public void setSecurity_money(BigDecimal security_money) {
        this.security_money = security_money;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public BigDecimal getTotal_income() {
        return total_income;
    }

    public void setTotal_income(BigDecimal total_income) {
        this.total_income = total_income;
    }

    public BigDecimal getTotal_expend() {
        return total_expend;
    }

    public void setTotal_expend(BigDecimal total_expend) {
        this.total_expend = total_expend;
    }

    public BigDecimal getToday_income() {
        return today_income;
    }

    public void setToday_income(BigDecimal today_income) {
        this.today_income = today_income;
    }

    public BigDecimal getToday_expend() {
        return today_expend;
    }

    public void setToday_expend(BigDecimal today_expend) {
        this.today_expend = today_expend;
    }

    public String getAccount_type() {
        return account_type;
    }

    public void setAccount_type(String account_type) {
        this.account_type = account_type;
    }

    public BigDecimal getSett_amount() {
        return sett_amount;
    }

    public void setSett_amount(BigDecimal sett_amount) {
        this.sett_amount = sett_amount;
    }

    public String getUser_no() {
        return user_no;
    }

    public void setUser_no(String user_no) {
        this.user_no = user_no;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", create_time=").append(create_time);
        sb.append(", edit_time=").append(edit_time);
        sb.append(", version=").append(version);
        sb.append(", remark=").append(remark);
        sb.append(", account_no=").append(account_no);
        sb.append(", balance=").append(balance);
        sb.append(", unbalance=").append(unbalance);
        sb.append(", security_money=").append(security_money);
        sb.append(", status=").append(status);
        sb.append(", total_income=").append(total_income);
        sb.append(", total_expend=").append(total_expend);
        sb.append(", today_income=").append(today_income);
        sb.append(", today_expend=").append(today_expend);
        sb.append(", account_type=").append(account_type);
        sb.append(", sett_amount=").append(sett_amount);
        sb.append(", user_no=").append(user_no);
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
        RpAccount other = (RpAccount) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getCreate_time() == null ? other.getCreate_time() == null : this.getCreate_time().equals(other.getCreate_time()))
            && (this.getEdit_time() == null ? other.getEdit_time() == null : this.getEdit_time().equals(other.getEdit_time()))
            && (this.getVersion() == null ? other.getVersion() == null : this.getVersion().equals(other.getVersion()))
            && (this.getRemark() == null ? other.getRemark() == null : this.getRemark().equals(other.getRemark()))
            && (this.getAccount_no() == null ? other.getAccount_no() == null : this.getAccount_no().equals(other.getAccount_no()))
            && (this.getBalance() == null ? other.getBalance() == null : this.getBalance().equals(other.getBalance()))
            && (this.getUnbalance() == null ? other.getUnbalance() == null : this.getUnbalance().equals(other.getUnbalance()))
            && (this.getSecurity_money() == null ? other.getSecurity_money() == null : this.getSecurity_money().equals(other.getSecurity_money()))
            && (this.getStatus() == null ? other.getStatus() == null : this.getStatus().equals(other.getStatus()))
            && (this.getTotal_income() == null ? other.getTotal_income() == null : this.getTotal_income().equals(other.getTotal_income()))
            && (this.getTotal_expend() == null ? other.getTotal_expend() == null : this.getTotal_expend().equals(other.getTotal_expend()))
            && (this.getToday_income() == null ? other.getToday_income() == null : this.getToday_income().equals(other.getToday_income()))
            && (this.getToday_expend() == null ? other.getToday_expend() == null : this.getToday_expend().equals(other.getToday_expend()))
            && (this.getAccount_type() == null ? other.getAccount_type() == null : this.getAccount_type().equals(other.getAccount_type()))
            && (this.getSett_amount() == null ? other.getSett_amount() == null : this.getSett_amount().equals(other.getSett_amount()))
            && (this.getUser_no() == null ? other.getUser_no() == null : this.getUser_no().equals(other.getUser_no()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getCreate_time() == null) ? 0 : getCreate_time().hashCode());
        result = prime * result + ((getEdit_time() == null) ? 0 : getEdit_time().hashCode());
        result = prime * result + ((getVersion() == null) ? 0 : getVersion().hashCode());
        result = prime * result + ((getRemark() == null) ? 0 : getRemark().hashCode());
        result = prime * result + ((getAccount_no() == null) ? 0 : getAccount_no().hashCode());
        result = prime * result + ((getBalance() == null) ? 0 : getBalance().hashCode());
        result = prime * result + ((getUnbalance() == null) ? 0 : getUnbalance().hashCode());
        result = prime * result + ((getSecurity_money() == null) ? 0 : getSecurity_money().hashCode());
        result = prime * result + ((getStatus() == null) ? 0 : getStatus().hashCode());
        result = prime * result + ((getTotal_income() == null) ? 0 : getTotal_income().hashCode());
        result = prime * result + ((getTotal_expend() == null) ? 0 : getTotal_expend().hashCode());
        result = prime * result + ((getToday_income() == null) ? 0 : getToday_income().hashCode());
        result = prime * result + ((getToday_expend() == null) ? 0 : getToday_expend().hashCode());
        result = prime * result + ((getAccount_type() == null) ? 0 : getAccount_type().hashCode());
        result = prime * result + ((getSett_amount() == null) ? 0 : getSett_amount().hashCode());
        result = prime * result + ((getUser_no() == null) ? 0 : getUser_no().hashCode());
        return result;
    }
}