package com.github.truemped.heritrix;

/**
 * User: daniel
 * Date: 29.09.2010
 * Time: 14:21:29
 */
public class HeritrixSessionInitializationException extends Exception {

    /**
     *
     */
    private static final long serialVersionUID = -3359977796822943992L;

    /**
     * @param msg
     */
    public HeritrixSessionInitializationException(final String msg) {
        super(msg);
    }

    /**
     * @param msg
     * @param cause
     */
    public HeritrixSessionInitializationException(final String msg, final Throwable cause) {
        super(msg, cause);
    }
}
