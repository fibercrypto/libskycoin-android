/**
 * Skycoin REST API.
 * Skycoin is a next-generation cryptocurrency.
 *
 * OpenAPI spec version: 0.25.1
 * Contact: skycoin.doe@example.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */

package org.openapitools.client.model;

import java.util.*;
import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;

@ApiModel(description = "")
public class Apiv1wallettransactionWallet {
  
  @SerializedName("unspents")
  private List<String> unspents = null;
  @SerializedName("addresses")
  private List<String> addresses = null;
  @SerializedName("password")
  private String password = null;
  @SerializedName("id")
  private String id = null;

  /**
   **/
  @ApiModelProperty(value = "")
  public List<String> getUnspents() {
    return unspents;
  }
  public void setUnspents(List<String> unspents) {
    this.unspents = unspents;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public List<String> getAddresses() {
    return addresses;
  }
  public void setAddresses(List<String> addresses) {
    this.addresses = addresses;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public String getPassword() {
    return password;
  }
  public void setPassword(String password) {
    this.password = password;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public String getId() {
    return id;
  }
  public void setId(String id) {
    this.id = id;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Apiv1wallettransactionWallet apiv1wallettransactionWallet = (Apiv1wallettransactionWallet) o;
    return (this.unspents == null ? apiv1wallettransactionWallet.unspents == null : this.unspents.equals(apiv1wallettransactionWallet.unspents)) &&
        (this.addresses == null ? apiv1wallettransactionWallet.addresses == null : this.addresses.equals(apiv1wallettransactionWallet.addresses)) &&
        (this.password == null ? apiv1wallettransactionWallet.password == null : this.password.equals(apiv1wallettransactionWallet.password)) &&
        (this.id == null ? apiv1wallettransactionWallet.id == null : this.id.equals(apiv1wallettransactionWallet.id));
  }

  @Override
  public int hashCode() {
    int result = 17;
    result = 31 * result + (this.unspents == null ? 0: this.unspents.hashCode());
    result = 31 * result + (this.addresses == null ? 0: this.addresses.hashCode());
    result = 31 * result + (this.password == null ? 0: this.password.hashCode());
    result = 31 * result + (this.id == null ? 0: this.id.hashCode());
    return result;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class Apiv1wallettransactionWallet {\n");
    
    sb.append("  unspents: ").append(unspents).append("\n");
    sb.append("  addresses: ").append(addresses).append("\n");
    sb.append("  password: ").append(password).append("\n");
    sb.append("  id: ").append(id).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
