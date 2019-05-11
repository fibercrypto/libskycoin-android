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

import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;

@ApiModel(description = "")
public class Apiv1walletsEntries {
  
  @SerializedName("public_key")
  private String publicKey = null;
  @SerializedName("address")
  private String address = null;

  /**
   **/
  @ApiModelProperty(value = "")
  public String getPublicKey() {
    return publicKey;
  }
  public void setPublicKey(String publicKey) {
    this.publicKey = publicKey;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public String getAddress() {
    return address;
  }
  public void setAddress(String address) {
    this.address = address;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Apiv1walletsEntries apiv1walletsEntries = (Apiv1walletsEntries) o;
    return (this.publicKey == null ? apiv1walletsEntries.publicKey == null : this.publicKey.equals(apiv1walletsEntries.publicKey)) &&
        (this.address == null ? apiv1walletsEntries.address == null : this.address.equals(apiv1walletsEntries.address));
  }

  @Override
  public int hashCode() {
    int result = 17;
    result = 31 * result + (this.publicKey == null ? 0: this.publicKey.hashCode());
    result = 31 * result + (this.address == null ? 0: this.address.hashCode());
    return result;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class Apiv1walletsEntries {\n");
    
    sb.append("  publicKey: ").append(publicKey).append("\n");
    sb.append("  address: ").append(address).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
