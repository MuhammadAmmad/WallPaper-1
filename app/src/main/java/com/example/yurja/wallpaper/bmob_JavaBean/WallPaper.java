package com.example.yurja.wallpaper.bmob_JavaBean;

import cn.bmob.v3.BmobObject;
import cn.bmob.v3.datatype.BmobFile;

/**
 * Created by yurja on 2018/3/16.
 */

public class WallPaper extends BmobObject {

    private String name;
    private String cidname;
    private BmobFile wallpaper;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCidname() {
        return cidname;
    }

    public void setCidname(String cidname) {
        this.cidname = cidname;
    }

    public BmobFile getWallpaper() {
        return wallpaper;
    }

    public void setWallpaper(BmobFile wallpaper) {
        this.wallpaper = wallpaper;
    }
}
