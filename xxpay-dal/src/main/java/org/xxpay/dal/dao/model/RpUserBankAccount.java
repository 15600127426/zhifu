package org.xxpay.dal.dao.model;

import java.io.Serializable;
import java.util.Date;

public class RpUserBankAccount implements Serializable {
    private String id;

    private Date create_time;

    private Date edit_time;

    private Long version;

    private String remark;

    private String status;

    private String user_no;

    private String bank_name;

    private String bank_code;

    private String bank_account_name;

    private String bank_account_no;

    private String card_type;

    private String card_no;

    private String mobile_no;

    private String is_default;

    private String province;

    private String city;

    private String areas;

    private String street;

    private String bank_account_type;

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

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getUser_no() {
        return user_no;
    }

    public void setUser_no(String user_no) {
        this.user_no = user_no;
    }

    public String getBank_name() {
        return bank_name;
    }

    public void setBank_name(String bank_name) {
        this.bank_name = bank_name;
    }

    public String getBank_code() {
        return bank_code;
    }

    public void setBank_code(String bank_code) {
        this.bank_code = bank_code;
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

    public String getCard_type() {
        return card_type;
    }

    public void setCard_type(String card_type) {
        this.card_type = card_type;
    }

    public String getCard_no() {
        return card_no;
    }

    public void setCard_no(String card_no) {
        this.card_no = card_no;
    }

    public String getMobile_no() {
        return mobile_no;
    }

    public void setMobile_no(String mobile_no) {
        this.mobile_no = mobile_no;
    }

    public String getIs_default() {
        return is_default;
    }

    public void setIs_default(String is_default) {
        this.is_default = is_default;
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

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getBank_account_type() {
        return bank_account_type;
    }

    public void setBank_account_type(String bank_account_type) {
        this.bank_account_type = bank_account_type;
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
        sb.append(", status=").append(status);
        sb.append(", user_no=").append(user_no);
        sb.append(", bank_name=").append(bank_name);
        sb.append(", bank_code=").append(bank_code);
        sb.append(", bank_account_name=").append(bank_account_name);
        sb.append(", bank_account_no=").append(bank_account_no);
        sb.append(", card_type=").append(card_type);
        sb.append(", card_no=").append(card_no);
        sb.append(", mobile_no=").append(mobile_no);
        sb.append(", is_default=").append(is_default);
        sb.append(", province=").append(province);
        sb.append(", city=").append(city);
        sb.append(", areas=").append(areas);
        sb.append(", street=").append(street);
        sb.append(", bank_account_type=").append(bank_account_type);
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
        RpUserBankAccount other = (RpUserBankAccount) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getCreate_time() == null ? other.getCreate_time() == null : this.getCreate_time().equals(other.getCreate_time()))
            && (this.getEdit_time() == null ? other.getEdit_time() == null : this.getEdit_time().equals(other.getEdit_time()))
            && (this.getVersion() == null ? other.getVersion() == null : this.getVersion().equals(other.getVersion()))
            && (this.getRemark() == null ? other.getRemark() == null : this.getRemark().equals(other.getRemark()))
            && (this.getStatus() == null ? other.getStatus() == null : this.getStatus().equals(other.getStatus()))
            && (this.getUser_no() == null ? other.getUser_no() == null : this.getUser_no().equals(other.getUser_no()))
            && (this.getBank_name() == null ? other.getBank_name() == null : this.getBank_name().equals(other.getBank_name()))
            && (this.getBank_code() == null ? other.getBank_code() == null : this.getBank_code().equals(other.getBank_code()))
            && (this.getBank_account_name() == null ? other.getBank_account_name() == null : this.getBank_account_name().equals(other.getBank_account_name()))
            && (this.getBank_account_no() == null ? other.getBank_account_no() == null : this.getBank_account_no().equals(other.getBank_account_no()))
            && (this.getCard_type() == null ? other.getCard_type() == null : this.getCard_type().equals(other.getCard_type()))
            && (this.getCard_no() == null ? other.getCard_no() == null : this.getCard_no().equals(other.getCard_no()))
            && (this.getMobile_no() == null ? other.getMobile_no() == null : this.getMobile_no().equals(other.getMobile_no()))
            && (this.getIs_default() == null ? other.getIs_default() == null : this.getIs_default().equals(other.getIs_default()))
            && (this.getProvince() == null ? other.getProvince() == null : this.getProvince().equals(other.getProvince()))
            && (this.getCity() == null ? other.getCity() == null : this.getCity().equals(other.getCity()))
            && (this.getAreas() == null ? other.getAreas() == null : this.getAreas().equals(other.getAreas()))
            && (this.getStreet() == null ? other.getStreet() == null : this.getStreet().equals(other.getStreet()))
            && (this.getBank_account_type() == null ? other.getBank_account_type() == null : this.getBank_account_type().equals(other.getBank_account_type()));
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
        result = prime * result + ((getStatus() == null) ? 0 : getStatus().hashCode());
        result = prime * result + ((getUser_no() == null) ? 0 : getUser_no().hashCode());
        result = prime * result + ((getBank_name() == null) ? 0 : getBank_name().hashCode());
        result = prime * result + ((getBank_code() == null) ? 0 : getBank_code().hashCode());
        result = prime * result + ((getBank_account_name() == null) ? 0 : getBank_account_name().hashCode());
        result = prime * result + ((getBank_account_no() == null) ? 0 : getBank_account_no().hashCode());
        result = prime * result + ((getCard_type() == null) ? 0 : getCard_type().hashCode());
        result = prime * result + ((getCard_no() == null) ? 0 : getCard_no().hashCode());
        result = prime * result + ((getMobile_no() == null) ? 0 : getMobile_no().hashCode());
        result = prime * result + ((getIs_default() == null) ? 0 : getIs_default().hashCode());
        result = prime * result + ((getProvince() == null) ? 0 : getProvince().hashCode());
        result = prime * result + ((getCity() == null) ? 0 : getCity().hashCode());
        result = prime * result + ((getAreas() == null) ? 0 : getAreas().hashCode());
        result = prime * result + ((getStreet() == null) ? 0 : getStreet().hashCode());
        result = prime * result + ((getBank_account_type() == null) ? 0 : getBank_account_type().hashCode());
        return result;
    }
}