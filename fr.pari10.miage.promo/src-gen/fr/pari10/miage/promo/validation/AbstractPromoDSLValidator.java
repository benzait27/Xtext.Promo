/*
 * generated by Xtext 2.10.0
 */
package fr.pari10.miage.promo.validation;

import java.util.ArrayList;
import java.util.List;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.xtext.validation.AbstractDeclarativeValidator;

public abstract class AbstractPromoDSLValidator extends AbstractDeclarativeValidator {
	
	@Override
	protected List<EPackage> getEPackages() {
		List<EPackage> result = new ArrayList<EPackage>();
		result.add(fr.pari10.miage.promo.promoDSL.PromoDSLPackage.eINSTANCE);
		return result;
	}
	
}
