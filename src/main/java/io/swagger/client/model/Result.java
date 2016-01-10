package io.swagger.client.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;





@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2016-01-10T11:02:18.377+09:00")
public class Result   {
  
  private Integer add = null;
  private Integer subtract = null;

  
  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("add")
  public Integer getAdd() {
    return add;
  }
  public void setAdd(Integer add) {
    this.add = add;
  }

  
  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("subtract")
  public Integer getSubtract() {
    return subtract;
  }
  public void setSubtract(Integer subtract) {
    this.subtract = subtract;
  }

  

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Result result = (Result) o;
    return Objects.equals(add, result.add) &&
        Objects.equals(subtract, result.subtract);
  }

  @Override
  public int hashCode() {
    return Objects.hash(add, subtract);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Result {\n");
    
    sb.append("    add: ").append(toIndentedString(add)).append("\n");
    sb.append("    subtract: ").append(toIndentedString(subtract)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

