package co.aospa.android.customization.picker

import android.app.Application;
import com.android.wallpaper.module.InjectorProvider;
import co.aospa.android.customization.module.AospaThemePickerInjector;
import dagger.hilt.android.HiltAndroidApp
import javax.inject.Inject

@HiltAndroidApp(Application::class)
class AospaCustomizationPickerApplication : Hilt_AospaCustomizationPickerApplication() {

  @Inject
  lateinit var injector: AospaCustomizationInjector

    override fun onCreate() {
        super.onCreate()

        InjectorProvider.setInjector(injector);
    }

}
