package com.openblocks.themr;

import android.os.Environment;
import java.io.File;

public class ThemrManager {
    public static String appDataPath = Environment.getDataDirectory().getAbsolutePath();
    public static String appDataThemesPath = appDataPath + "/themes/";

    public static void init() {
        File appDataThemesPathFile = new File(appDataThemesPath);
        if (!appDataThemesPathFile.exists()) appDataThemesPathFile.mkdir();
    }
}