package com.oup.integration.sps.movingaverageprice.biblio.pojo;

import javax.annotation.Generated;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@Generated("org.jsonschema2pojo")
@JsonPropertyOrder({
    "productISBN",
    "shortText",
    "impressionNum",
    "price",
    "prodHierarchy"
})
public class MovingAveragePriceBiblio {

    /**
     * Product ISBN
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("productISBN")
    private String productISBN = "";
    /**
     * Material Desc
     * <p>
     * 
     * 
     */
    @JsonProperty("shortText")
    private String shortText = "";
    /**
     * Impression Number
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("impressionNum")
    private String impressionNum = "";
    /**
     * Moving Average Price/Periodic Unit Price
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("price")
    private double price;
    /**
     * Product hierarchy
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("prodHierarchy")
    private String prodHierarchy;

    /**
     * Product ISBN
     * <p>
     * 
     * (Required)
     * 
     * @return
     *     The productISBN
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
     * @param productISBN
     *     The productISBN
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
     * @return
     *     The shortText
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
     * @param shortText
     *     The shortText
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
     * @return
     *     The impressionNum
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
     * @param impressionNum
     *     The impressionNum
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
     * @return
     *     The price
     */
    @JsonProperty("price")
    public double getPrice() {
        return price;
    }

    /**
     * Moving Average Price/Periodic Unit Price
     * <p>
     * 
     * (Required)
     * 
     * @param price
     *     The price
     */
    @JsonProperty("price")
    public void setPrice(double price) {
        this.price = price;
    }

    /**
     * Product hierarchy
     * <p>
     * 
     * (Required)
     * 
     * @return
     *     The prodHierarchy
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
     * @param prodHierarchy
     *     The prodHierarchy
     */
    @JsonProperty("prodHierarchy")
    public void setProdHierarchy(String prodHierarchy) {
        this.prodHierarchy = prodHierarchy;
    }

    /*public String toString()
    {
    	return " productISBN : "+getProductISBN()+"shortText :"+getShortText()+"impressionNum :"+getImpressionNum()+"price :"+getPrice()+"prodHierarchy :"+getProdHierarchy();
    }*/
}
