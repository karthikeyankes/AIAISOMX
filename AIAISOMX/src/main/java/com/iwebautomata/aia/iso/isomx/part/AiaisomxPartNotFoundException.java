package com.iwebautomata.aia.iso.isomx.part;

 @SuppressWarnings("serial")
class AiaisomxPartNotFoundException extends RuntimeException {
	AiaisomxPartNotFoundException(Long id) {
	    super("Could not find AiaisomxPart " + id);
	  }
}
