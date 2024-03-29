package presentacion.messages;

import java.beans.Beans;
import java.util.Locale;
import java.util.MissingResourceException;
import java.util.ResourceBundle;

public class MessagesVentanaPrincipal {
    ////////////////////////////////////////////////////////////////////////////
    //
    // Constructor
    //
    ////////////////////////////////////////////////////////////////////////////
    private MessagesVentanaPrincipal() {
        // do not instantiate
    }

    ////////////////////////////////////////////////////////////////////////////
    //
    // Bundle access
    //
    ////////////////////////////////////////////////////////////////////////////
    private static final String BUNDLE_NAME = "presentacion.messages.MessagesVentanaPrincipal"; //$NON-NLS-1$
    private static ResourceBundle RESOURCE_BUNDLE = loadBundle();
    private static Locale locale = new Locale("es");

    private static ResourceBundle loadBundle() {
        return ResourceBundle.getBundle(BUNDLE_NAME);
    }

    ////////////////////////////////////////////////////////////////////////////
    //
    // Strings access
    //
    ////////////////////////////////////////////////////////////////////////////
    public static String getString(String key) {
        try {
            ResourceBundle bundle = Beans.isDesignTime() ? loadBundle()
                    : RESOURCE_BUNDLE;
            return bundle.getString(key);
        } catch (MissingResourceException e) {
            return "!" + key + "!";
        }
    }

    private static Locale getLocale(String appIdioma) {
        locale = new Locale("es");
        if (appIdioma.equals("inglés"))
            locale = new Locale("en");
        return locale;
    }

    public static void setIdioma(String idioma) {
        RESOURCE_BUNDLE = ResourceBundle.getBundle(BUNDLE_NAME,
                getLocale(idioma));
    }

    public static Locale getIdioma() {
        return locale;
    }
}
