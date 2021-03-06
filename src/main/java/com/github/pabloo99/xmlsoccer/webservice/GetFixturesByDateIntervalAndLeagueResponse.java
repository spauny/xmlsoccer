
package com.github.pabloo99.xmlsoccer.webservice;

import com.github.pabloo99.xmlsoccer.model.xml.GetFixturesResultXML;

import javax.xml.bind.annotation.*;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="GetFixturesByDateIntervalAndLeagueResult" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;any/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "getFixturesByDateIntervalAndLeagueResult"
})
@XmlRootElement(name = "GetFixturesByDateIntervalAndLeagueResponse")
public class GetFixturesByDateIntervalAndLeagueResponse {

    @XmlElement(name = "GetFixturesByDateIntervalAndLeagueResult")
    protected GetFixturesByDateIntervalAndLeagueResponse.GetFixturesByDateIntervalAndLeagueResult getFixturesByDateIntervalAndLeagueResult;

    /**
     * Gets the value of the getFixturesByDateIntervalAndLeagueResult property.
     *
     * @return
     *     possible object is
     *     {@link GetFixturesByDateIntervalAndLeagueResponse.GetFixturesByDateIntervalAndLeagueResult }
     *
     */
    public GetFixturesByDateIntervalAndLeagueResponse.GetFixturesByDateIntervalAndLeagueResult getGetFixturesByDateIntervalAndLeagueResult() {
        return getFixturesByDateIntervalAndLeagueResult;
    }

    /**
     * Sets the value of the getFixturesByDateIntervalAndLeagueResult property.
     *
     * @param value
     *     allowed object is
     *     {@link GetFixturesByDateIntervalAndLeagueResponse.GetFixturesByDateIntervalAndLeagueResult }
     *
     */
    public void setGetFixturesByDateIntervalAndLeagueResult(GetFixturesByDateIntervalAndLeagueResponse.GetFixturesByDateIntervalAndLeagueResult value) {
        this.getFixturesByDateIntervalAndLeagueResult = value;
    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;any/>
     *       &lt;/sequence>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */

    public static class GetFixturesByDateIntervalAndLeagueResult {

        @XmlElementRef(name="XMLSOCCER.COM", type=GetFixturesResultXML.class)
        protected GetFixturesResultXML content;

        /**
         * Gets the value of the content property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the content property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getContent().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link Object }
         * {@link String }
         * 
         * 
         */
        public GetFixturesResultXML getContent() {
            if (content == null) {
                content = new GetFixturesResultXML();
            }
            return this.content;
        }

    }

}
