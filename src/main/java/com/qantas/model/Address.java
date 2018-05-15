package com.qantas.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * Address
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2018-05-15T11:21:49.461Z")

public class Address   {
  @JsonProperty("addressline1")
  private String addressline1 = null;

  @JsonProperty("addressline2")
  private String addressline2 = null;

  @JsonProperty("postcode")
  private String postcode = null;

  @JsonProperty("suburb")
  private String suburb = null;

  /**
   * Gets or Sets type
   */
  public enum TypeEnum {
    HOME("home"),
    
    WORK("work");

    private String value;

    TypeEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static TypeEnum fromValue(String text) {
      for (TypeEnum b : TypeEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }
  }

  @JsonProperty("type")
  private TypeEnum type = null;

  @JsonProperty("email")
  private String email = null;

  public Address addressline1(String addressline1) {
    this.addressline1 = addressline1;
    return this;
  }

  /**
   * Get addressline1
   * @return addressline1
  **/
  @ApiModelProperty(example = "5.01 Level 5 Arch street", required = true, value = "")
  @NotNull


  public String getAddressline1() {
    return addressline1;
  }

  public void setAddressline1(String addressline1) {
    this.addressline1 = addressline1;
  }

  public Address addressline2(String addressline2) {
    this.addressline2 = addressline2;
    return this;
  }

  /**
   * Get addressline2
   * @return addressline2
  **/
  @ApiModelProperty(value = "")


  public String getAddressline2() {
    return addressline2;
  }

  public void setAddressline2(String addressline2) {
    this.addressline2 = addressline2;
  }

  public Address postcode(String postcode) {
    this.postcode = postcode;
    return this;
  }

  /**
   * Get postcode
   * @return postcode
  **/
  @ApiModelProperty(required = true, value = "")
  @NotNull

@Size(min=4,max=4) 
  public String getPostcode() {
    return postcode;
  }

  public void setPostcode(String postcode) {
    this.postcode = postcode;
  }

  public Address suburb(String suburb) {
    this.suburb = suburb;
    return this;
  }

  /**
   * Get suburb
   * @return suburb
  **/
  @ApiModelProperty(required = true, value = "")
  @NotNull


  public String getSuburb() {
    return suburb;
  }

  public void setSuburb(String suburb) {
    this.suburb = suburb;
  }

  public Address type(TypeEnum type) {
    this.type = type;
    return this;
  }

  /**
   * Get type
   * @return type
  **/
  @ApiModelProperty(value = "")


  public TypeEnum getType() {
    return type;
  }

  public void setType(TypeEnum type) {
    this.type = type;
  }

  public Address email(String email) {
    this.email = email;
    return this;
  }

  /**
   * Get email
   * @return email
  **/
  @ApiModelProperty(value = "")


  public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Address address = (Address) o;
    return Objects.equals(this.addressline1, address.addressline1) &&
        Objects.equals(this.addressline2, address.addressline2) &&
        Objects.equals(this.postcode, address.postcode) &&
        Objects.equals(this.suburb, address.suburb) &&
        Objects.equals(this.type, address.type) &&
        Objects.equals(this.email, address.email);
  }

  @Override
  public int hashCode() {
    return Objects.hash(addressline1, addressline2, postcode, suburb, type, email);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Address {\n");
    
    sb.append("    addressline1: ").append(toIndentedString(addressline1)).append("\n");
    sb.append("    addressline2: ").append(toIndentedString(addressline2)).append("\n");
    sb.append("    postcode: ").append(toIndentedString(postcode)).append("\n");
    sb.append("    suburb: ").append(toIndentedString(suburb)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    email: ").append(toIndentedString(email)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

