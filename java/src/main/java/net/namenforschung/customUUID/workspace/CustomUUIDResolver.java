package net.namenforschung.customUUID.workspace;

import java.util.UUID;

import ro.sync.exml.workspace.api.util.EditorVariablesResolver;

/**
 * @author Cindy Brinkmann
 * @version 1.0
 * @since 2015-02-03
 * Digitales Familiennamenwoerterbuch Deutschlands (DFD)
 * TU Darmstadt, Akademie der Wissenschaften und der Literatur Mainz
 */
public class CustomUUIDResolver extends EditorVariablesResolver {

	/**
	 * creates a custom UUID that starts with a letter
	 * @return UUID starting with a letter
	 */
	public static String createCustomUUID(){
		
		final String uuid = UUID.randomUUID().toString();
		
		if (uuid.charAt(0) >= 'a' && uuid.charAt(0) <= 'z'){
			return uuid;
		}
		else {
			return createCustomUUID();
		}
	}
	
	/**
	 * resolves editor variable ${customUUID} and replaces it with an actual UUID,
	 * creates only one UUID and replaces ALL occurrences of the editor variable
	 * @return String with resolved UUID
	 */
	@Override
	public String resolveEditorVariables(String contentWithEditorVariables, String currentEditedFileURL){		
		
		// replaces all(!) occurrences of the pattern ${customUUID} with the same UUID
		// when 2 occurrences of the editor variable at once this will still produce only one UUID
		return contentWithEditorVariables.replaceAll("\\$\\{customUUID\\}", createCustomUUID().toString());
	  }

}
