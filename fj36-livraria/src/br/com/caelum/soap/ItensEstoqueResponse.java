
package br.com.caelum.soap;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for itensEstoqueResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="itensEstoqueResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="itemEstoque" type="{http://caelum.com.br/estoquews/v1}itemEstoque" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "itensEstoqueResponse", propOrder = {
    "itemEstoque"
})
public class ItensEstoqueResponse {

    protected List<ItemEstoque> itemEstoque;

    /**
     * Gets the value of the itemEstoque property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the itemEstoque property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getItemEstoque().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ItemEstoque }
     * 
     * 
     */
    public List<ItemEstoque> getItemEstoque() {
        if (itemEstoque == null) {
            itemEstoque = new ArrayList<ItemEstoque>();
        }
        return this.itemEstoque;
    }

}
