package com.iwebautomata.aia.iso.isomx.part;


import java.util.Objects;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class AiaisomxPart {

	  private @Id @GeneratedValue Long id;
	  private String xsdLocation;
	  private String xmlLocation;

	  AiaisomxPart() {}

	  AiaisomxPart(String xsdLocation, String xmlLocation) {

	    this.xsdLocation = xsdLocation;
	    this.xmlLocation = xmlLocation;
	  }

	  public Long getId() {
	    return this.id;
	  }

	  public String getxsdLocation() {
	    return this.xsdLocation;
	  }

	  public String getxmlLocation() {
	    return this.xmlLocation;
	  }

	  public void setId(Long id) {
	    this.id = id;
	  }

	  public void setxsdLocation(String xsdLocation) {
	    this.xsdLocation = xsdLocation;
	  }

	  public void setxmlLocation(String xmlLocation) {
	    this.xmlLocation = xmlLocation;
	  }

	  @Override
	  public boolean equals(Object o) {

	    if (this == o)
	      return true;
	    if (!(o instanceof AiaisomxPart))
	      return false;
	    AiaisomxPart AiaisomxPart = (AiaisomxPart) o;
	    return Objects.equals(this.id, AiaisomxPart.id) && Objects.equals(this.xsdLocation, AiaisomxPart.xsdLocation)
	        && Objects.equals(this.xmlLocation, AiaisomxPart.xmlLocation);
	  }

	  @Override
	  public int hashCode() {
	    return Objects.hash(this.id, this.xsdLocation, this.xmlLocation);
	  }

	  @Override
	  public String toString() {
	    return "AiaisomxPart{" + "id=" + this.id + ", xsdLocation='" + this.xsdLocation + '\'' + ", xmlLocation='" + this.xmlLocation + '\'' + '}';
	  }
	}