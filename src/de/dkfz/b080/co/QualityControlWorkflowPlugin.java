package de.dkfz.b080.co;

import de.dkfz.roddy.plugins.BasePlugin;

/**

 * TODO Recreate class. Put in dependencies to other workflows, descriptions, capabilities (like ui settings, components) etc.
 */
public class QualityControlWorkflowPlugin extends BasePlugin {

	public static final String CURRENT_VERSION_STRING = "1.2.73";
	public static final String CURRENT_VERSION_BUILD_DATE = "Mon Nov 27 15:08:43 CET 2017";

    @Override
    public String getVersionInfo() {
        return "Roddy plugin: " + this.getClass().getName() + ", V " + CURRENT_VERSION_STRING + " built at " + CURRENT_VERSION_BUILD_DATE;
    }
}
