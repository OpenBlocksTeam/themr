package com.openblocks.themr;

import android.os.Environment;
import java.io.File;
import java.io.FileOutputStream;
import java.io.OutputStream;

public class ThemrManager {
    public static String appDataPath = Environment.getDataDirectory().getAbsolutePath();
    public static String appDataThemesPath = appDataPath + "/themes/";

    public static String appDataDefaultThemePath = appDataThemesPath + "default_light.thmjson";

    public static void init() {
        if (!FileUtil.isDirectoryExists(appDataThemesPath))
            FileUtil.createDirectory(appDataThemesPath);
        if(!FileUtil.isFileExist(appDataDefaultThemePath))
            FileUtil.createFile(appDataDefaultThemePath, "{\"data\":{\"name\":\"Default\",\"description\":\"The default light theme.\",\"version\":\"1.0.0\"},\"theme\":{\"colorPrimary\":\"#2196f3\",\"colorPrimaryDark\":\"#1e88e5\",\"colorAccent\":\"#e91e63\",\"colorControlHighlight\":\"#2ae91e63\",\"colorControlNormal\":\"#e91e63\",\"colorOnPrimary\":\"#ffffff\",\"colorOnAccent\":\"#ffffff\",\"colorOnBackground\":\"#000000\",\"colorBackground\":\"#ffffff\",\"colorBackgroundDialog\":\"#ffffff\",\"isDark\":false},\"engine\":\"themr1\"}");
    }
}