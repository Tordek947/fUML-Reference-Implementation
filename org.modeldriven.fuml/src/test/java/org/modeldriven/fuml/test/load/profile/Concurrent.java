package org.modeldriven.fuml.test.load.profile;import org.modeldriven.fuml.repository.ext.Stereotype;import fUML.Syntax.Classes.Kernel.Property;/** *  * Annotates or tags properties as applicable for use within various operations * involving concurrency control. Concurrency control deals with handling * collisions and other issues which arise when allowing multiple users or * processes simultaneous access to shared entities within a data store. */public class Concurrent extends Stereotype {	public static final String BASE__PROPERTY = "base_Property";	/**	 * Specifies the general category of concurrency or concurrency control	 * under which a property participates	 */	public static final String TYPE = "type";	/**	 * Denotes or provides a hint as to the nature of the data instructive to	 * vaious checks and operations under a particular concurrency control type	 * or category.	 */	public static final String DATA_FLAVOR = "dataFlavor";	private Property base_Property;	/**	 * Specifies the general category of concurrency or concurrency control	 * under which a property participates	 */	private ConcurrencyType type;	/**	 * Denotes or provides a hint as to the nature of the data instructive to	 * vaious checks and operations under a particular concurrency control type	 * or category.	 */	private ConcurrentDataFlavor dataFlavor;	public Property getBase_Property() {		return this.base_Property;	}	public void setBase_Property(Property value) {		this.base_Property = value;	}	public ConcurrencyType getType() {		return this.type;	}	public void setType(ConcurrencyType value) {		this.type = value;	}	public ConcurrentDataFlavor getDataFlavor() {		return this.dataFlavor;	}	public void setDataFlavor(ConcurrentDataFlavor value) {		this.dataFlavor = value;	}}