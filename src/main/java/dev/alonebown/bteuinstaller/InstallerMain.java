package dev.alonebown.bteuinstaller;

import com.formdev.flatlaf.intellijthemes.FlatGitHubIJTheme;

import javax.imageio.ImageIO;
import javax.swing.*;
import javax.swing.event.MenuEvent;
import javax.swing.event.MenuListener;
import java.awt.*;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;

public class InstallerMain{
    public static void main(String[] args){
        FlatGitHubIJTheme.install(new FlatGitHubIJTheme()); // Install the theme
        final JFrame frame = new JFrame("BTE Ukraine Installer");
    }
}