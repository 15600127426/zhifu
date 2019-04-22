package org.xxpay.dal.dao.account.entity;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

public class RpSettRecord implements Serializable {
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
     * 结算发起方式(参考settmodetypeenum)
     *
     * @mbggenerated
     */
    private String sett_mode;

    /**
     * 账户编号
     *
     * @mbggenerated
     */
    private String account_no;

    /**
     * 用户编号
     *
     * @mbggenerated
     */
    private String user_no;

    /**
     * 用户姓名
     *
     * @mbggenerated
     */
    private String user_name;

    /**
     * 用户类型
     *
     * @mbggenerated
     */
    private String user_type;

    /**
     * 结算日期
     *
     * @mbggenerated
     */
    private Date sett_date;

    /**
     * 银行编码
     *
     * @mbggenerated
     */
    private String bank_code;

    /**
     * 银行名称
     *
     * @mbggenerated
     */
    private String bank_name;

    /**
     * 开户名
     *
     * @mbggenerated
     */
    private String bank_account_name;

    /**
     * 开户账户
     *
     * @mbggenerated
     */
    private String bank_account_no;

    /**
     * 开户账户
     *
     * @mbggenerated
     */
    private String bank_account_type;

    /**
     * 开户行所在国家
     *
     * @mbggenerated
     */
    private String country;

    /**
     * 开户行所在省份
     *
     * @mbggenerated
     */
    private String province;

    /**
     * 开户行所在城市
     *
     * @mbggenerated
     */
    private String city;

    /**
     * 开户行所在区
     *
     * @mbggenerated
     */
    private String areas;

    /**
     * 开户行全称
     *
     * @mbggenerated
     */
    private String bank_account_address;

    /**
     * 收款人手机号
     *
     * @mbggenerated
     */
    private String mobile_no;

    /**
     * 结算金额
     *
     * @mbggenerated
     */
    private BigDecimal sett_amount;

    /**
     * 结算手续费
     *
     * @mbggenerated
     */
    private BigDecimal sett_fee;

    /**
     * 结算打款金额
     *
     * @mbggenerated
     */
    private BigDecimal remit_amount;

    /**
     * 结算状态(参考枚举:settrecordstatusenum)
     *
     * @mbggenerated
     */
    private String sett_status;

    /**
     * 打款确认时间
     *
     * @mbggenerated
     */
    private Date remit_confirm_time;

    /**
     * 描述
     *
     * @mbggenerated
     */
    private String remark;

    /**
     * 打款备注
     *
     * @mbggenerated
     */
    private String remit_remark;

    /**
     * 操作员登录名
     *
     * @mbggenerated
     */
    private String operator_loginname;

    /**
     * 操作员姓名
     *
     * @mbggenerated
     */
    private String operator_realname;

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

    public String getSett_mode() {
        return sett_mode;
    }

    public void setSett_mode(String sett_mode) {
        this.sett_mode = sett_mode;
    }

    public String getAccount_no() {
        return account_no;
    }

    public void setAccount_no(String account_no) {
        this.account_no = account_no;
    }

    public String getUser_no() {
        return user_no;
    }

    public void setUser_no(String user_no) {
        this.user_no = user_no;
    }

    public String getUser_name() {
        return user_name;
    }

    public void setUser_name(String user_name) {
        this.user_name = user_name;
    }

    public String getUser_type() {
        return user_type;
    }

    public void setUser_type(String user_type) {
        this.user_type = user_type;
    }

    public Date getSett_date() {
        return sett_date;
    }

    public void setSett_date(Date sett_date) {
        this.sett_date = sett_date;
    }

    public String getBank_code() {
        return bank_code;
    }

    public void setBank_code(String bank_code) {
        this.bank_code = bank_code;
    }

    public String getBank_name() {
        return bank_name;
    }

    public void setBank_name(String bank_name) {
        this.bank_name = bank_name;
    }

    public String getBank_account_name() {
        return bank_account_name;
    }

    public void setBank_account_name(String bank_account_name) {
        this.bank_account_name = bank_account_name;
    }

    public String getBank_account_no() {
        return bank_account_no;
    }

    public void setBank_account_no(String bank_account_no) {
        this.bank_account_no = bank_account_no;
    }

    public String getBank_account_type() {
        return bank_account_type;
    }

    public void setBank_account_type(String bank_account_type) {
        this.bank_account_type = bank_account_type;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getProvince() {
        return province;
    }

    public void setProvince(String province) {
        this.province = province;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getAreas() {
        return areas;
    }

    public void setAreas(String areas) {
        this.areas = areas;
    }

    public String getBank_account_address() {
        return bank_account_address;
    }

    public void setBank_account_address(String bank_account_address) {
        this.bank_account_address = bank_account_address;
    }

    public String getMobile_no() {
        return mobile_no;
    }

    public void setMobile_no(String mobile_no) {
        this.mobile_no = mobile_no;
    }

    public BigDecimal getSett_amount() {
        return sett_amount;
    }

    public void setSett_amount(BigDecimal sett_amount) {
        this.sett_amount = sett_amount;
    }

    public BigDecimal getSett_fee() {
        return sett_fee;
    }

    public void setSett_fee(BigDecimal sett_fee) {
        this.sett_fee = sett_fee;
    }

    public BigDecimal getRemit_amount() {
        return remit_amount;
    }

    public void setRemit_amount(BigDecimal remit_amount) {
        this.remit_amount = remit_amount;
    }

    public String getSett_status() {
        return sett_status;
    }

    public void setSett_status(String sett_status) {
        this.sett_status = sett_status;
    }

    public Date getRemit_confirm_time() {
        return remit_confirm_time;
    }

    public void setRemit_confirm_time(Date remit_confirm_time) {
        this.remit_confirm_time = remit_confirm_time;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public String getRemit_remark() {
        return remit_remark;
    }

    public void setRemit_remark(String remit_remark) {
        this.remit_remark = remit_remark;
    }

    public String getOperator_loginname() {
        return operator_loginname;
    }

    public void setOperator_loginname(String operator_loginname) {
        this.operator_loginname = operator_loginname;
    }

    public String getOperator_realname() {
        return operator_realname;
    }

    public void setOperator_realname(String operator_realname) {
        this.operator_realname = operator_realname;
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
        sb.append(", sett_mode=").append(sett_mode);
        sb.append(", account_no=").append(account_no);
        sb.append(", user_no=").append(user_no);
        sb.append(", user_name=").append(user_name);
        sb.append(", user_type=").append(user_type);
        sb.append(", sett_date=").append(sett_date);
        sb.append(", bank_code=").append(bank_code);
        sb.append(", bank_name=").append(bank_name);
        sb.append(", bank_account_name=").append(bank_account_name);
        sb.append(", bank_account_no=").append(bank_account_no);
        sb.append(", bank_account_type=").append(bank_account_type);
        sb.append(", country=").append(country);
        sb.append(", province=").append(province);
        sb.append(", city=").append(city);
        sb.append(", areas=").append(areas);
        sb.append(", bank_account_address=").append(bank_account_address);
        sb.append(", mobile_no=").append(mobile_no);
        sb.append(", sett_amount=").append(sett_amount);
        sb.append(", sett_fee=").append(sett_fee);
        sb.append(", remit_amount=").append(remit_amount);
        sb.append(", sett_status=").append(sett_status);
        sb.append(", remit_confirm_time=").append(remit_confirm_time);
        sb.append(", remark=").append(remark);
        sb.append(", remit_remark=").append(remit_remark);
        sb.append(", operator_loginname=").append(operator_loginname);
        sb.append(", operator_realname=").append(operator_realname);
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
        RpSettRecord other = (RpSettRecord) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getVersion() == null ? other.getVersion() == null : this.getVersion().equals(other.getVersion()))
            && (this.getCreate_time() == null ? other.getCreate_time() == null : this.getCreate_time().equals(other.getCreate_time()))
            && (this.getEdit_time() == null ? other.getEdit_time() == null : this.getEdit_time().equals(other.getEdit_time()))
            && (this.getSett_mode() == null ? other.getSett_mode() == null : this.getSett_mode().equals(other.getSett_mode()))
            && (this.getAccount_no() == null ? other.getAccount_no() == null : this.getAccount_no().equals(other.getAccount_no()))
            && (this.getUser_no() == null ? other.getUser_no() == null : this.getUser_no().equals(other.getUser_no()))
            && (this.getUser_name() == null ? other.getUser_name() == null : this.getUser_name().equals(other.getUser_name()))
            && (this.getUser_type() == null ? other.getUser_type() == null : this.getUser_type().equals(other.getUser_type()))
            && (this.getSett_date() == null ? other.getSett_date() == null : this.getSett_date().equals(other.getSett_date()))
            && (this.getBank_code() == null ? other.getBank_code() == null : this.getBank_code().equals(other.getBank_code()))
            && (this.getBank_name() == null ? other.getBank_name() == null : this.getBank_name().equals(other.getBank_name()))
            && (this.getBank_account_name() == null ? other.getBank_account_name() == null : this.getBank_account_name().equals(other.getBank_account_name()))
            && (this.getBank_account_no() == null ? other.getBank_account_no() == null : this.getBank_account_no().equals(other.getBank_account_no()))
            && (this.getBank_account_type() == null ? other.getBank_account_type() == null : this.getBank_account_type().equals(other.getBank_account_type()))
            && (this.getCountry() == null ? other.getCountry() == null : this.getCountry().equals(other.getCountry()))
            && (this.getProvince() == null ? other.getProvince() == null : this.getProvince().equals(other.getProvince()))
            && (this.getCity() == null ? other.getCity() == null : this.getCity().equals(other.getCity()))
            && (this.getAreas() == null ? other.getAreas() == null : this.getAreas().equals(other.getAreas()))
            && (this.getBank_account_address() == null ? other.getBank_account_address() == null : this.getBank_account_address().equals(other.getBank_account_address()))
            && (this.getMobile_no() == null ? other.getMobile_no() == null : this.getMobile_no().equals(other.getMobile_no()))
            && (this.getSett_amount() == null ? other.getSett_amount() == null : this.getSett_amount().equals(other.getSett_amount()))
            && (this.getSett_fee() == null ? other.getSett_fee() == null : this.getSett_fee().equals(other.getSett_fee()))
            && (this.getRemit_amount() == null ? other.getRemit_amount() == null : this.getRemit_amount().equals(other.getRemit_amount()))
            && (this.getSett_status() == null ? other.getSett_status() == null : this.getSett_status().equals(other.getSett_status()))
            && (this.getRemit_confirm_time() == null ? other.getRemit_confirm_time() == null : this.getRemit_confirm_time().equals(other.getRemit_confirm_time()))
            && (this.getRemark() == null ? other.getRemark() == null : this.getRemark().equals(other.getRemark()))
            && (this.getRemit_remark() == null ? other.getRemit_remark() == null : this.getRemit_remark().equals(other.getRemit_remark()))
            && (this.getOperator_loginname() == null ? other.getOperator_loginname() == null : this.getOperator_loginname().equals(other.getOperator_loginname()))
            && (this.getOperator_realname() == null ? other.getOperator_realname() == null : this.getOperator_realname().equals(other.getOperator_realname()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getVersion() == null) ? 0 : getVersion().hashCode());
        result = prime * result + ((getCreate_time() == null) ? 0 : getCreate_time().hashCode());
        result = prime * result + ((getEdit_time() == null) ? 0 : getEdit_time().hashCode());
        result = prime * result + ((getSett_mode() == null) ? 0 : getSett_mode().hashCode());
        result = prime * result + ((getAccount_no() == null) ? 0 : getAccount_no().hashCode());
        result = prime * result + ((getUser_no() == null) ? 0 : getUser_no().hashCode());
        result = prime * result + ((getUser_name() == null) ? 0 : getUser_name().hashCode());
        result = prime * result + ((getUser_type() == null) ? 0 : getUser_type().hashCode());
        result = prime * result + ((getSett_date() == null) ? 0 : getSett_date().hashCode());
        result = prime * result + ((getBank_code() == null) ? 0 : getBank_code().hashCode());
        result = prime * result + ((getBank_name() == null) ? 0 : getBank_name().hashCode());
        result = prime * result + ((getBank_account_name() == null) ? 0 : getBank_account_name().hashCode());
        result = prime * result + ((getBank_account_no() == null) ? 0 : getBank_account_no().hashCode());
        result = prime * result + ((getBank_account_type() == null) ? 0 : getBank_account_type().hashCode());
        result = prime * result + ((getCountry() == null) ? 0 : getCountry().hashCode());
        result = prime * result + ((getProvince() == null) ? 0 : getProvince().hashCode());
        result = prime * result + ((getCity() == null) ? 0 : getCity().hashCode());
        result = prime * result + ((getAreas() == null) ? 0 : getAreas().hashCode());
        result = prime * result + ((getBank_account_address() == null) ? 0 : getBank_account_address().hashCode());
        result = prime * result + ((getMobile_no() == null) ? 0 : getMobile_no().hashCode());
        result = prime * result + ((getSett_amount() == null) ? 0 : getSett_amount().hashCode());
        result = prime * result + ((getSett_fee() == null) ? 0 : getSett_fee().hashCode());
        result = prime * result + ((getRemit_amount() == null) ? 0 : getRemit_amount().hashCode());
        result = prime * result + ((getSett_status() == null) ? 0 : getSett_status().hashCode());
        result = prime * result + ((getRemit_confirm_time() == null) ? 0 : getRemit_confirm_time().hashCode());
        result = prime * result + ((getRemark() == null) ? 0 : getRemark().hashCode());
        result = prime * result + ((getRemit_remark() == null) ? 0 : getRemit_remark().hashCode());
        result = prime * result + ((getOperator_loginname() == null) ? 0 : getOperator_loginname().hashCode());
        result = prime * result + ((getOperator_realname() == null) ? 0 : getOperator_realname().hashCode());
        return result;
    }
}