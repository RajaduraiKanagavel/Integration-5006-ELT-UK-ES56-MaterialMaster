package com.oup.integration.sps.movingaverageprice.sap.pojo;

import java.util.HashMap;
import java.util.Map;

import org.apache.camel.dataformat.bindy.annotation.CsvRecord;

import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import org.apache.camel.dataformat.bindy.annotation.DataField;

@CsvRecord(separator=",")
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
"productISBN",
"shortText",
"impressionNum",
"price",
"prodHierarchy"
})
public class MovingAveragePriceSAP {

/**
* Product ISBN
* <p>
* 
* (Required)
* 
*/
@DataField(pos = 1)
@JsonProperty("productISBN")
private String productISBN = "";
/**
* Material Desc
* <p>
* 
* 
*/
@DataField(pos = 2)
@JsonProperty("shortText")
private String shortText = "";
/**
* Impression Number
* <p>
* 
* (Required)
* 
*/
@DataField(pos = 4)
@JsonProperty("impressionNum")
private String impressionNum = "";
/**
* Moving Average Price/Periodic Unit Price
* <p>
* 
* (Required)
* 
*/
@DataField(pos = 3)
@JsonProperty("price")
private Double price;
/**
* Product hierarchy
* <p>
* 
* (Required)
* 
*/
@DataField(pos = 5)
@JsonProperty("prodHierarchy")
private String prodHierarchy;


/**
* Product ISBN
* <p>
* 
* (Required)
* 
*/
@JsonProperty("productISBN")
public String getProductISBN() {
return productISBN;
}

/**
* Product ISBN
* <p>
* 
* (Required)
* 
*/
@JsonProperty("productISBN")
public void setProductISBN(String productISBN) {
this.productISBN = productISBN;
}

/**
* Material Desc
* <p>
* 
* 
*/
@JsonProperty("shortText")
public String getShortText() {
return shortText;
}

/**
* Material Desc
* <p>
* 
* 
*/
@JsonProperty("shortText")
public void setShortText(String shortText) {
this.shortText = shortText;
}

/**
* Impression Number
* <p>
* 
* (Required)
* 
*/
@JsonProperty("impressionNum")
public String getImpressionNum() {
return impressionNum;
}

/**
* Impression Number
* <p>
* 
* (Required)
* 
*/
@JsonProperty("impressionNum")
public void setImpressionNum(String impressionNum) {
this.impressionNum = impressionNum;
}

/**
* Moving Average Price/Periodic Unit Price
* <p>
* 
* (Required)
* 
*/
@JsonProperty("price")
public Double getPrice() {
return price;
}

/**
* Moving Average Price/Periodic Unit Price
* <p>
* 
* (Required)
* 
*/
@JsonProperty("price")
public void setPrice(Double price) {
this.price = price;
}

/**
* Product hierarchy
* <p>
* 
* (Required)
* 
*/
@JsonProperty("prodHierarchy")
public String getProdHierarchy() {
return prodHierarchy;
}

/**
* Product hierarchy
* <p>
* 
* (Required)
* 
*/
@JsonProperty("prodHierarchy")
public void setProdHierarchy(String prodHierarchy) {
this.prodHierarchy = prodHierarchy;
}


}