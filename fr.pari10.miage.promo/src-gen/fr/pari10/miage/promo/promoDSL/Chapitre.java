/**
 * generated by Xtext 2.10.0
 */
package fr.pari10.miage.promo.promoDSL;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Chapitre</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fr.pari10.miage.promo.promoDSL.Chapitre#getNumDuChapitre <em>Num Du Chapitre</em>}</li>
 *   <li>{@link fr.pari10.miage.promo.promoDSL.Chapitre#getRecette <em>Recette</em>}</li>
 * </ul>
 *
 * @see fr.pari10.miage.promo.promoDSL.PromoDSLPackage#getChapitre()
 * @model
 * @generated
 */
public interface Chapitre extends EObject
{
  /**
   * Returns the value of the '<em><b>Num Du Chapitre</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Num Du Chapitre</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Num Du Chapitre</em>' attribute.
   * @see #setNumDuChapitre(String)
   * @see fr.pari10.miage.promo.promoDSL.PromoDSLPackage#getChapitre_NumDuChapitre()
   * @model
   * @generated
   */
  String getNumDuChapitre();

  /**
   * Sets the value of the '{@link fr.pari10.miage.promo.promoDSL.Chapitre#getNumDuChapitre <em>Num Du Chapitre</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Num Du Chapitre</em>' attribute.
   * @see #getNumDuChapitre()
   * @generated
   */
  void setNumDuChapitre(String value);

  /**
   * Returns the value of the '<em><b>Recette</b></em>' containment reference list.
   * The list contents are of type {@link fr.pari10.miage.promo.promoDSL.Recette}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Recette</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Recette</em>' containment reference list.
   * @see fr.pari10.miage.promo.promoDSL.PromoDSLPackage#getChapitre_Recette()
   * @model containment="true"
   * @generated
   */
  EList<Recette> getRecette();

} // Chapitre
