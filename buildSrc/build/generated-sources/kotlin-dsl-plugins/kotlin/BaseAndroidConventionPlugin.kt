/**
 * Precompiled [base-android-convention.gradle.kts][Base_android_convention_gradle] script plugin.
 *
 * @see Base_android_convention_gradle
 */
public
class BaseAndroidConventionPlugin : org.gradle.api.Plugin<org.gradle.api.Project> {
    override fun apply(target: org.gradle.api.Project) {
        try {
            Class
                .forName("Base_android_convention_gradle")
                .getDeclaredConstructor(org.gradle.api.Project::class.java, org.gradle.api.Project::class.java)
                .newInstance(target, target)
        } catch (e: java.lang.reflect.InvocationTargetException) {
            throw e.targetException
        }
    }
}
