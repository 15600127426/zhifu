package org.xxpay.dal.dao.account.entity;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

public class RpAccountHistory implements Serializable {
    private String id;

    private Date create_time;

    private Date edit_time;

    private Long version;

    private String remark;

    private String account_no;

    private BigDecimal amount;

    private BigDecimal balance;

    private String fund_direction;

    private String is_allow_sett;

    private String is_complete_sett;

    private String request_no;

    private String bank_trx_no;

    private String trx_type;

    private Integer risk_day;

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

    public BigDecimal getAmount() {
        return amount;
    }

    public void setAmount(BigDecimal amount) {
        this.amount = amount;
    }

    public BigDecimal getBalance() {
        return balance;
    }

    public void setBalance(BigDecimal balance) {
        this.balance = balance;
    }

    public String getFund_direction() {
        return fund_direction;
    }

    public void setFund_direction(String fund_direction) {
        this.fund_direction = fund_direction;
    }

    public String getIs_allow_sett() {
        return is_allow_sett;
    }

    public void setIs_allow_sett(String is_allow_sett) {
        this.is_allow_sett = is_allow_sett;
    }

    public String getIs_complete_sett() {
        return is_complete_sett;
    }

    public void setIs_complete_sett(String is_complete_sett) {
        this.is_complete_sett = is_complete_sett;
    }

    public String getRequest_no() {
        return request_no;
    }

    public void setRequest_no(String request_no) {
        this.request_no = request_no;
    }

    public String getBank_trx_no() {
        return bank_trx_no;
    }

    public void setBank_trx_no(String bank_trx_no) {
        this.bank_trx_no = bank_trx_no;
    }

    public String getTrx_type() {
        return trx_type;
    }

    public void setTrx_type(String trx_type) {
        this.trx_type = trx_type;
    }

    public Integer getRisk_day() {
        return risk_day;
    }

    public void setRisk_day(Integer risk_day) {
        this.risk_day = risk_day;
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
        sb.append(", amount=").append(amount);
        sb.append(", balance=").append(balance);
        sb.append(", fund_direction=").append(fund_direction);
        sb.append(", is_allow_sett=").append(is_allow_sett);
        sb.append(", is_complete_sett=").append(is_complete_sett);
        sb.append(", request_no=").append(request_no);
        sb.append(", bank_trx_no=").append(bank_trx_no);
        sb.append(", trx_type=").append(trx_type);
        sb.append(", risk_day=").append(risk_day);
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
        RpAccountHistory other = (RpAccountHistory) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getCreate_time() == null ? other.getCreate_time() == null : this.getCreate_time().equals(other.getCreate_time()))
            && (this.getEdit_time() == null ? other.getEdit_time() == null : this.getEdit_time().equals(other.getEdit_time()))
            && (this.getVersion() == null ? other.getVersion() == null : this.getVersion().equals(other.getVersion()))
            && (this.getRemark() == null ? other.getRemark() == null : this.getRemark().equals(other.getRemark()))
            && (this.getAccount_no() == null ? other.getAccount_no() == null : this.getAccount_no().equals(other.getAccount_no()))
            && (this.getAmount() == null ? other.getAmount() == null : this.getAmount().equals(other.getAmount()))
            && (this.getBalance() == null ? other.getBalance() == null : this.getBalance().equals(other.getBalance()))
            && (this.getFund_direction() == null ? other.getFund_direction() == null : this.getFund_direction().equals(other.getFund_direction()))
            && (this.getIs_allow_sett() == null ? other.getIs_allow_sett() == null : this.getIs_allow_sett().equals(other.getIs_allow_sett()))
            && (this.getIs_complete_sett() == null ? other.getIs_complete_sett() == null : this.getIs_complete_sett().equals(other.getIs_complete_sett()))
            && (this.getRequest_no() == null ? other.getRequest_no() == null : this.getRequest_no().equals(other.getRequest_no()))
            && (this.getBank_trx_no() == null ? other.getBank_trx_no() == null : this.getBank_trx_no().equals(other.getBank_trx_no()))
            && (this.getTrx_type() == null ? other.getTrx_type() == null : this.getTrx_type().equals(other.getTrx_type()))
            && (this.getRisk_day() == null ? other.getRisk_day() == null : this.getRisk_day().equals(other.getRisk_day()))
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
        result = prime * result + ((getAmount() == null) ? 0 : getAmount().hashCode());
        result = prime * result + ((getBalance() == null) ? 0 : getBalance().hashCode());
        result = prime * result + ((getFund_direction() == null) ? 0 : getFund_direction().hashCode());
        result = prime * result + ((getIs_allow_sett() == null) ? 0 : getIs_allow_sett().hashCode());
        result = prime * result + ((getIs_complete_sett() == null) ? 0 : getIs_complete_sett().hashCode());
        result = prime * result + ((getRequest_no() == null) ? 0 : getRequest_no().hashCode());
        result = prime * result + ((getBank_trx_no() == null) ? 0 : getBank_trx_no().hashCode());
        result = prime * result + ((getTrx_type() == null) ? 0 : getTrx_type().hashCode());
        result = prime * result + ((getRisk_day() == null) ? 0 : getRisk_day().hashCode());
        result = prime * result + ((getUser_no() == null) ? 0 : getUser_no().hashCode());
        return result;
    }
}