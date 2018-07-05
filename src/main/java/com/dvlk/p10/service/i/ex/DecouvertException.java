package com.dvlk.p10.service.i.ex;

/**
 * Erreur sur le decouvert
 */
public class DecouvertException extends FonctionnelleException {
	private static final long serialVersionUID = 1L;

	/**
	 * Constructeur de l'objet.
	 */
	public DecouvertException() {
		super();
	}

	/**
	 * Constructeur de l'objet.
	 *
	 * @param pMessage
	 */
	public DecouvertException(String pMessage) {
		super(pMessage);
	}

	/**
	 * Constructeur de l'objet.
	 *
	 * @param pCause
	 */
	public DecouvertException(Throwable pCause) {
		super(pCause);
	}

	/**
	 * Constructeur de l'objet.
	 *
	 * @param pMessage
	 * @param pCause
	 */
	public DecouvertException(String pMessage, Throwable pCause) {
		super(pMessage, pCause);
	}
}