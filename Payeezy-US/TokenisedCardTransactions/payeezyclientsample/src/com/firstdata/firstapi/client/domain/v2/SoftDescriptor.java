package com.firstdata.firstapi.client.domain.v2;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

import org.codehaus.jackson.annotate.JsonAutoDetect;
import org.codehaus.jackson.annotate.JsonAutoDetect.Visibility;
import org.codehaus.jackson.annotate.JsonProperty;

@JsonInclude(Include.NON_NULL)
@JsonAutoDetect(fieldVisibility = Visibility.ANY, getterVisibility = Visibility.NONE, setterVisibility = Visibility.NONE)
public class SoftDescriptor {

    public SoftDescriptor() {
        // TODO Auto-generated constructor stub
    }

    @JsonProperty("dba_name")
    private String dba_name;

    @JsonProperty("street")
    private String street;

    @JsonProperty("city")
    private String city;

    @JsonProperty("region")
    private String region;

    @JsonProperty("postal_code")
    private String postalCode;

    @JsonInclude(Include.NON_NULL)
    @JsonProperty("mid")
    private String mid;

    @JsonInclude(Include.NON_NULL)
    @JsonProperty("mcc")
    private String mcc;


    @JsonProperty("country_code")
    private String countryCode;

    @JsonProperty("merchant_contact_info")
    private String merchantContactInfo;

    public String getDba_name() {
        return dba_name;
    }

    public void setDba_name(String dba_name) {
        this.dba_name = dba_name;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
    }

    public String getPostalCode() {
        return postalCode;
    }

    public void setPostalCode(String postalCode) {
        this.postalCode = postalCode;
    }

    public String getCountryCode() {
        return countryCode;
    }

    public void setCountryCode(String countryCode) {
        this.countryCode = countryCode;
    }

    public String getMerchantContactInfo() {
        return merchantContactInfo;
    }

    public void setMerchantContactInfo(String merchantContactInfo) {
        this.merchantContactInfo = merchantContactInfo;
    }

    public String getMid() {
        return mid;
    }

    public void setMid(String mid) {
        this.mid = mid;
    }

    public String getMcc() {
        return mcc;
    }

    public void setMcc(String mcc) {
        this.mcc = mcc;
    }

}
