/*
 * generated by Xtext 2.10.0
 */
package fr.pari10.miage.promo


/**
 * Initialization support for running Xtext languages without Equinox extension registry.
 */
class PromoDSLStandaloneSetup extends PromoDSLStandaloneSetupGenerated {

	def static void doSetup() {
		new PromoDSLStandaloneSetup().createInjectorAndDoEMFRegistration()
	}
}
