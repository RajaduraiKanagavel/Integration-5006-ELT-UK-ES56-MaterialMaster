
package com.oup.integration.sps.materialmaster.cdm.pojo;

import java.util.HashMap;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
"productISBN",
"seriesCode",
"mediaType",
"publicationDate",
"priceIsPrinted",
"shortTitle",
"salesStatus",
"productHierarchy",
"marketSAP",
"packType",
"productTypeSAP",
"authorOrArtist",
"price",
"salesStatusValidFrom",
"purchaseStatus",
"purchaseStatusValidFrom",
"responsibleEditor"
})
public class MaterialMasterCDM {

/**
* Material Number
* <p>
* SAP-PI-->MATNR
* 
*/
@JsonProperty("productISBN")
@JsonPropertyDescription("SAP-PI-->MATNR")
private String productISBN = "";
/**
* Higher-Level Media Product
* <p>
* SAP-PI-->ISMREFMDPROD 
* 
*/
@JsonProperty("seriesCode")
@JsonPropertyDescription("SAP-PI-->ISMREFMDPROD ")
private String seriesCode = "";
/**
* Media type
* <p>
* SAP-PI-->ISMMEDIATYPE
* 
*/
@JsonProperty("mediaType")
@JsonPropertyDescription("SAP-PI-->ISMMEDIATYPE")
private String mediaType = "";
/**
* Publication Date (YYYYMMDD)
* <p>
* SAP-PI-->ISMPUBLDATE
* 
*/
@JsonProperty("publicationDate")
@JsonPropertyDescription("SAP-PI-->ISMPUBLDATE")
private String publicationDate = "";
/**
* Explode BOM & Commodity Code 
* <p>
* SAP-PI-->FLAG1
* 
*/
@JsonProperty("priceIsPrinted")
@JsonPropertyDescription("SAP-PI-->FLAG1")
private String priceIsPrinted = "true";
/**
* Material Description
* <p>
* SAP-PI-->MAKTX 
* 
*/
@JsonProperty("shortTitle")
@JsonPropertyDescription("SAP-PI-->MAKTX ")
private String shortTitle = "";
/**
* Cross-distribution-chain material status
* <p>
* SAP-PI-->MSTAV 
* 
*/
@JsonProperty("salesStatus")
@JsonPropertyDescription("SAP-PI-->MSTAV ")
private String salesStatus = "";
/**
* Product hierarchy
* <p>
* SAP-PI-->PRODH 
* 
*/
@JsonProperty("productHierarchy")
@JsonPropertyDescription("SAP-PI-->PRODH ")
private String productHierarchy = "";
/**
* Market Sector
* <p>
* SAP-PI-->ZMARKET_SECTOR 
* 
*/
@JsonProperty("marketSAP")
@JsonPropertyDescription("SAP-PI-->ZMARKET_SECTOR ")
private String marketSAP = "";
/**
* Pack Information
* <p>
* SAP-PI-->ZPACK_INFO 
* 
*/
@JsonProperty("packType")
@JsonPropertyDescription("SAP-PI-->ZPACK_INFO ")
private String packType = "";
/**
* Product type
* <p>
* SAP-PI-->ZPRODUCT_TYPE 
* 
*/
@JsonProperty("productTypeSAP")
@JsonPropertyDescription("SAP-PI-->ZPRODUCT_TYPE ")
private String productTypeSAP = "";
/**
* Author/Artist
* <p>
* MARA-ISMARTIST
* 
*/
@JsonProperty("authorOrArtist")
@JsonPropertyDescription("MARA-ISMARTIST")
private String authorOrArtist = "";
/**
* Author/Artist
* <p>
* KONP-KBETR
* 
*/
@JsonProperty("price")
@JsonPropertyDescription("KONP-KBETR")
private Double price;
/**
* Sales Status Valid from
* <p>
* MARA-MSTDV
* 
*/
@JsonProperty("salesStatusValidFrom")
@JsonPropertyDescription("MARA-MSTDV")
private String salesStatusValidFrom = "";
/**
* Purchasing Status
* <p>
* MARC-MMSTA
* 
*/
@JsonProperty("purchaseStatus")
@JsonPropertyDescription("MARC-MMSTA")
private String purchaseStatus = "";
/**
* Purchasing Status Valid from
* <p>
* MARC-MMSTD
* 
*/
@JsonProperty("purchaseStatusValidFrom")
@JsonPropertyDescription("MARC-MMSTD")
private String purchaseStatusValidFrom = "";
/**
* Responsible Editor
* <p>
* MARA-ZRESPONSIBLE_EDT
* 
*/
@JsonProperty("responsibleEditor")
@JsonPropertyDescription("MARA-ZRESPONSIBLE_EDT")
private String responsibleEditor = "";
@JsonIgnore
private Map<String, Object> additionalProperties = new HashMap<String, Object>();

/**
* Material Number
* <p>
* SAP-PI-->MATNR
* 
*/
@JsonProperty("productISBN")
public String getProductISBN() {
return productISBN;
}

/**
* Material Number
* <p>
* SAP-PI-->MATNR
* 
*/
@JsonProperty("productISBN")
public void setProductISBN(String productISBN) {
this.productISBN = productISBN;
}

/**
* Higher-Level Media Product
* <p>
* SAP-PI-->ISMREFMDPROD 
* 
*/
@JsonProperty("seriesCode")
public String getSeriesCode() {
return seriesCode;
}

/**
* Higher-Level Media Product
* <p>
* SAP-PI-->ISMREFMDPROD 
* 
*/
@JsonProperty("seriesCode")
public void setSeriesCode(String seriesCode) {
this.seriesCode = seriesCode;
}

/**
* Media type
* <p>
* SAP-PI-->ISMMEDIATYPE
* 
*/
@JsonProperty("mediaType")
public String getMediaType() {
return mediaType;
}

/**
* Media type
* <p>
* SAP-PI-->ISMMEDIATYPE
* 
*/
@JsonProperty("mediaType")
public void setMediaType(String mediaType) {
this.mediaType = mediaType;
}

/**
* Publication Date (YYYYMMDD)
* <p>
* SAP-PI-->ISMPUBLDATE
* 
*/
@JsonProperty("publicationDate")
public String getPublicationDate() {
return publicationDate;
}

/**
* Publication Date (YYYYMMDD)
* <p>
* SAP-PI-->ISMPUBLDATE
* 
*/
@JsonProperty("publicationDate")
public void setPublicationDate(String publicationDate) {
this.publicationDate = publicationDate;
}

/**
* Explode BOM & Commodity Code 
* <p>
* SAP-PI-->FLAG1
* 
*/
@JsonProperty("priceIsPrinted")
public String getPriceIsPrinted() {
return priceIsPrinted;
}

/**
* Explode BOM & Commodity Code 
* <p>
* SAP-PI-->FLAG1
* 
*/
@JsonProperty("priceIsPrinted")
public void setPriceIsPrinted(String priceIsPrinted) {
this.priceIsPrinted = priceIsPrinted;
}

/**
* Material Description
* <p>
* SAP-PI-->MAKTX 
* 
*/
@JsonProperty("shortTitle")
public String getShortTitle() {
return shortTitle;
}

/**
* Material Description
* <p>
* SAP-PI-->MAKTX 
* 
*/
@JsonProperty("shortTitle")
public void setShortTitle(String shortTitle) {
this.shortTitle = shortTitle;
}

/**
* Cross-distribution-chain material status
* <p>
* SAP-PI-->MSTAV 
* 
*/
@JsonProperty("salesStatus")
public String getSalesStatus() {
return salesStatus;
}

/**
* Cross-distribution-chain material status
* <p>
* SAP-PI-->MSTAV 
* 
*/
@JsonProperty("salesStatus")
public void setSalesStatus(String salesStatus) {
this.salesStatus = salesStatus;
}

/**
* Product hierarchy
* <p>
* SAP-PI-->PRODH 
* 
*/
@JsonProperty("productHierarchy")
public String getProductHierarchy() {
return productHierarchy;
}

/**
* Product hierarchy
* <p>
* SAP-PI-->PRODH 
* 
*/
@JsonProperty("productHierarchy")
public void setProductHierarchy(String productHierarchy) {
this.productHierarchy = productHierarchy;
}

/**
* Market Sector
* <p>
* SAP-PI-->ZMARKET_SECTOR 
* 
*/
@JsonProperty("marketSAP")
public String getMarketSAP() {
return marketSAP;
}

/**
* Market Sector
* <p>
* SAP-PI-->ZMARKET_SECTOR 
* 
*/
@JsonProperty("marketSAP")
public void setMarketSAP(String marketSAP) {
this.marketSAP = marketSAP;
}

/**
* Pack Information
* <p>
* SAP-PI-->ZPACK_INFO 
* 
*/
@JsonProperty("packType")
public String getPackType() {
return packType;
}

/**
* Pack Information
* <p>
* SAP-PI-->ZPACK_INFO 
* 
*/
@JsonProperty("packType")
public void setPackType(String packType) {
this.packType = packType;
}

/**
* Product type
* <p>
* SAP-PI-->ZPRODUCT_TYPE 
* 
*/
@JsonProperty("productTypeSAP")
public String getProductTypeSAP() {
return productTypeSAP;
}

/**
* Product type
* <p>
* SAP-PI-->ZPRODUCT_TYPE 
* 
*/
@JsonProperty("productTypeSAP")
public void setProductTypeSAP(String productTypeSAP) {
this.productTypeSAP = productTypeSAP;
}

/**
* Author/Artist
* <p>
* MARA-ISMARTIST
* 
*/
@JsonProperty("authorOrArtist")
public String getAuthorOrArtist() {
return authorOrArtist;
}

/**
* Author/Artist
* <p>
* MARA-ISMARTIST
* 
*/
@JsonProperty("authorOrArtist")
public void setAuthorOrArtist(String authorOrArtist) {
this.authorOrArtist = authorOrArtist;
}

/**
* Author/Artist
* <p>
* KONP-KBETR
* 
*/
@JsonProperty("price")
public Double getPrice() {
return price;
}

/**
* Author/Artist
* <p>
* KONP-KBETR
* 
*/
@JsonProperty("price")
public void setPrice(Double price) {
this.price = price;
}

/**
* Sales Status Valid from
* <p>
* MARA-MSTDV
* 
*/
@JsonProperty("salesStatusValidFrom")
public String getSalesStatusValidFrom() {
return salesStatusValidFrom;
}

/**
* Sales Status Valid from
* <p>
* MARA-MSTDV
* 
*/
@JsonProperty("salesStatusValidFrom")
public void setSalesStatusValidFrom(String salesStatusValidFrom) {
this.salesStatusValidFrom = salesStatusValidFrom;
}

/**
* Purchasing Status
* <p>
* MARC-MMSTA
* 
*/
@JsonProperty("purchaseStatus")
public String getPurchaseStatus() {
return purchaseStatus;
}

/**
* Purchasing Status
* <p>
* MARC-MMSTA
* 
*/
@JsonProperty("purchaseStatus")
public void setPurchaseStatus(String purchaseStatus) {
this.purchaseStatus = purchaseStatus;
}

/**
* Purchasing Status Valid from
* <p>
* MARC-MMSTD
* 
*/
@JsonProperty("purchaseStatusValidFrom")
public String getPurchaseStatusValidFrom() {
return purchaseStatusValidFrom;
}

/**
* Purchasing Status Valid from
* <p>
* MARC-MMSTD
* 
*/
@JsonProperty("purchaseStatusValidFrom")
public void setPurchaseStatusValidFrom(String purchaseStatusValidFrom) {
this.purchaseStatusValidFrom = purchaseStatusValidFrom;
}

/**
* Responsible Editor
* <p>
* MARA-ZRESPONSIBLE_EDT
* 
*/
@JsonProperty("responsibleEditor")
public String getResponsibleEditor() {
return responsibleEditor;
}

/**
* Responsible Editor
* <p>
* MARA-ZRESPONSIBLE_EDT
* 
*/
@JsonProperty("responsibleEditor")
public void setResponsibleEditor(String responsibleEditor) {
this.responsibleEditor = responsibleEditor;
}

@JsonAnyGetter
public Map<String, Object> getAdditionalProperties() {
return this.additionalProperties;
}

@JsonAnySetter
public void setAdditionalProperty(String name, Object value) {
this.additionalProperties.put(name, value);
}

}