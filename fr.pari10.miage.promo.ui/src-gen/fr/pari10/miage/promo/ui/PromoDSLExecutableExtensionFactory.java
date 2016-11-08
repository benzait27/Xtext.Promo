/*
 * generated by Xtext 2.10.0
 */
package fr.pari10.miage.promo.ui;

import com.google.inject.Injector;
import fr.pari10.miage.promo.ui.internal.PromoActivator;
import org.eclipse.xtext.ui.guice.AbstractGuiceAwareExecutableExtensionFactory;
import org.osgi.framework.Bundle;

/**
 * This class was generated. Customizations should only happen in a newly
 * introduced subclass. 
 */
public class PromoDSLExecutableExtensionFactory extends AbstractGuiceAwareExecutableExtensionFactory {

	@Override
	protected Bundle getBundle() {
		return PromoActivator.getInstance().getBundle();
	}
	
	@Override
	protected Injector getInjector() {
		return PromoActivator.getInstance().getInjector(PromoActivator.FR_PARI10_MIAGE_PROMO_PROMODSL);
	}
	
}
