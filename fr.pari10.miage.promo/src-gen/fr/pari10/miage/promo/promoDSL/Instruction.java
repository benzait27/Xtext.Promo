/**
 * generated by Xtext 2.10.0
 */
package fr.pari10.miage.promo.promoDSL;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Instruction</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fr.pari10.miage.promo.promoDSL.Instruction#getNumDuInstruction <em>Num Du Instruction</em>}</li>
 * </ul>
 *
 * @see fr.pari10.miage.promo.promoDSL.PromoDSLPackage#getInstruction()
 * @model
 * @generated
 */
public interface Instruction extends EObject
{
  /**
   * Returns the value of the '<em><b>Num Du Instruction</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Num Du Instruction</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Num Du Instruction</em>' attribute.
   * @see #setNumDuInstruction(String)
   * @see fr.pari10.miage.promo.promoDSL.PromoDSLPackage#getInstruction_NumDuInstruction()
   * @model
   * @generated
   */
  String getNumDuInstruction();

  /**
   * Sets the value of the '{@link fr.pari10.miage.promo.promoDSL.Instruction#getNumDuInstruction <em>Num Du Instruction</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Num Du Instruction</em>' attribute.
   * @see #getNumDuInstruction()
   * @generated
   */
  void setNumDuInstruction(String value);

} // Instruction