interface IconInfo {
    int ICON_16x16 = 1;
    int ICON_32x32 = 2;

    Image getIcon(int iconType);
}
