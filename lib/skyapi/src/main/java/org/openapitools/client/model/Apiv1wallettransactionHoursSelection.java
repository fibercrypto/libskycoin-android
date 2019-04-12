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
public class Apiv1wallettransactionHoursSelection {
  
  @SerializedName("mode")
  private String mode = null;
  @SerializedName("share_factor")
  private String shareFactor = null;
  @SerializedName("type")
  private String type = null;

  /**
   **/
  @ApiModelProperty(value = "")
  public String getMode() {
    return mode;
  }
  public void setMode(String mode) {
    this.mode = mode;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public String getShareFactor() {
    return shareFactor;
  }
  public void setShareFactor(String shareFactor) {
    this.shareFactor = shareFactor;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public String getType() {
    return type;
  }
  public void setType(String type) {
    this.type = type;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Apiv1wallettransactionHoursSelection apiv1wallettransactionHoursSelection = (Apiv1wallettransactionHoursSelection) o;
    return (this.mode == null ? apiv1wallettransactionHoursSelection.mode == null : this.mode.equals(apiv1wallettransactionHoursSelection.mode)) &&
        (this.shareFactor == null ? apiv1wallettransactionHoursSelection.shareFactor == null : this.shareFactor.equals(apiv1wallettransactionHoursSelection.shareFactor)) &&
        (this.type == null ? apiv1wallettransactionHoursSelection.type == null : this.type.equals(apiv1wallettransactionHoursSelection.type));
  }

  @Override
  public int hashCode() {
    int result = 17;
    result = 31 * result + (this.mode == null ? 0: this.mode.hashCode());
    result = 31 * result + (this.shareFactor == null ? 0: this.shareFactor.hashCode());
    result = 31 * result + (this.type == null ? 0: this.type.hashCode());
    return result;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class Apiv1wallettransactionHoursSelection {\n");
    
    sb.append("  mode: ").append(mode).append("\n");
    sb.append("  shareFactor: ").append(shareFactor).append("\n");
    sb.append("  type: ").append(type).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
